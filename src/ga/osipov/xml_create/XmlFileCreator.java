package ga.osipov.xml_create;

import java.lang.reflect.Field;
import java.text.MessageFormat;
//массив ключ+значение
import java.util.*;
//открытие файла
import java.awt.Desktop;
import java.awt.geom.Area;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.swing.plaf.IconUIResource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import XML.MP_v06.DCity;
import XML.MP_v06.DDistrict;
import XML.MP_v06.DInhabitedLocalities;
import XML.MP_v06.DLocationLevel1Type;
import XML.MP_v06.DStreets;
import XML.MP_v06.MP;
import XML.MP_v06.TArea;
import XML.MP_v06.TAreaNew;
import XML.MP_v06.MP.GeneralCadastralWorks;
import XML.MP_v06.MP.InputData;
import XML.MP_v06.MP.InputData.SubParcels;
import XML.MP_v06.MP.NodalPointSchemes;
import XML.MP_v06.MP.Package;
import XML.MP_v06.MP.Package.FormParcels;
import XML.MP_v06.MP.Survey;
import XML.MP_v06.TAppendix;
import XML.MP_v06.TAppendix.AppliedFiles;
import XML.MP_v06.TAppliedFile;
import XML.MP_v06.TAppliedFilePDF;
import XML.MP_v06.TNewParcel.Address;
import XML.MP_v06.TNewSubParcel;
import XML.MP_v06.TCadastralNumbersInp;
import XML.MP_v06.TCategoryDoc;
import XML.MP_v06.TCity;
import XML.MP_v06.TCoordSystems;
import XML.MP_v06.TDistrict;
import XML.MP_v06.TLevel1;
import XML.MP_v06.TLocality;
import XML.MP_v06.TNewParcel;
import XML.MP_v06.TObjectRealty;
import XML.MP_v06.TProvidingPassCadastralNumbers;
import XML.MP_v06.TStreet;

import javax.xml.datatype.DatatypeConfigurationException;
//календарь
import javax.xml.datatype.DatatypeFactory;

public class XmlFileCreator {
	//группировка вставляемых значений классов в родительском классе MP в доступный массив
	public String[][] arr_mp={
			{"Name","Kind"},
			{"Name","Kind"},
			{"Name","Kind"},
			{"Name","Kind"}
	};
	//группировка вставляемых значений классов в родительском классе Appendix в доступный массив
	public String[][][] arr_Appendix={		
	{
		{"1"},
		{"text"},
		{"Kind","Name"}
	},
	{
		{"1"},
		{"text"},
		{"Kind","Name"}
	},
	{
		{"1"},
		{"text"},
		{"Kind","Name"}
	}
	};
	static DATA_Values vs=new DATA_Values();	
	
	//открытие файла
	public static void open_xml(String fileName) {
		Desktop desktop = null;
		if (Desktop.isDesktopSupported()) {
		    desktop = Desktop.getDesktop();
		}
		try {
		    desktop.open(new File(fileName));
		} catch (IOException ioe) {
		    ioe.printStackTrace();
		}
	}
	public TAppendix fun_node_Appendix() {
		TAppendix v=new TAppendix();
		
		for (int i=0;i<arr_Appendix.length;i++) {
			AppliedFiles afs=new AppliedFiles();
			
			BigInteger bi=BigInteger.valueOf(Long.parseLong(arr_Appendix[i][0][0]));
			afs.setNumberAppendix(bi);	
			
			afs.setNameAppendix(arr_Appendix[i][1][0]);	
			
			TAppliedFile af=new TAppliedFile();
			af.setKind(arr_Appendix[i][2][0]+i);
			af.setName(arr_Appendix[i][2][1]+i);
			afs.setAppliedFile(af);
			
			v.getAppliedFiles().add(afs);
		}
		return v;
	}
	public void fun_node_MP(MP v) throws DatatypeConfigurationException {
		v.setPackage(vs.p);
		
		GeneralCadastralWorks v1=new GeneralCadastralWorks();
		GregorianCalendar gcal = new GregorianCalendar();
		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		v1.setDateCadastral(xgcal);
		v.setGeneralCadastralWorks(v1);
		
		TCoordSystems v2=new TCoordSystems();
		v.setCoordSystems(v2);
		
		InputData v3=new InputData();
		v.setInputData(v3);
		
		Survey v4=new Survey();
		v.setSurvey(v4); 
		
		String v5=vs.Conclusion;
		v.setConclusion(v5);
		
		TAppliedFilePDF x=new TAppliedFilePDF();
		for (int i=0;i<arr_mp.length;i++) {		
		    x.setName(arr_mp[i][0]+i); 
		    x.setKind(arr_mp[i][1]+i); 
		    switch (i) {
			case 0:v.setSchemeGeodesicPlotting(x);break;
			case 1:v.setSchemeDisposition(x);break;
			case 2:v.setDiagramParcelsSubParcels(x);break;
			case 3:v.setAgreementDocument(x);break;
			default:
				break;
			} 
		}
			
		NodalPointSchemes v11=new NodalPointSchemes();
		v.setNodalPointSchemes(v11);
		
		v.setAppendix(fun_node_Appendix());
	}
	
	public void create (String NewParcel) 
	//обработка исключений для открытия файла xml
	//throws IOException 
	{
		//test_abstract_fun();
		//массив ключ-значение
		//Map<String,String> vs=new HashMap<String,String>();
		//vs.put("CadastralBlock", "test");
		//vs.put("CadastralNumber", "test");
		//ArrayList<String> vs = new ArrayList<String>(); 
		
		//автомотическое определение расположение файла в проекте
		String fileName = new File(".").getAbsolutePath()+"/MP_01.xml";

		MP Mplan = new MP();
		
		Mplan.setGUID("29fd5fa8-4334-4dbe-b027-294cc2505bbd");
		Mplan.setVersion("06");
		Mplan.setNameSoftware("Полигон: Межевой план");
		Mplan.setVersionSoftware("7.6.7");
		
		try {
			fun_node_MP(Mplan);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Образование участков
		
		vs.fp.setMethod("3");
		vs.p.setFormParcels(vs.fp);
		
		vs.NP.setDefinition(NewParcel);
		vs.fp.getNewParcel().add(vs.NP);
		vs.NP.setCadastralBlock("test");
		
		vs.cni.getCadastralNumber().add(vs.CadastralNumber);
		vs.NP.setPrevCadastralNumbers(vs.cni);
		
		vs.ppcn.setOther(vs.other);
		vs.NP.setProvidingPassCadastralNumbers(vs.ppcn);
		
		vs.icni.getCadastralNumber().add(vs.CadastralNumbersInp);
		vs.objr.setInnerCadastralNumbers(vs.icni);
		vs.NP.setObjectRealty(vs.objr);
		//Area
		vs.NP.setArea(vs.fun_AreaNew("1", "1", "1"));
		//Address
		vs.adr.setOKATO(vs.OKATO);
		vs.adr.setKLADR(vs.KLADR);
		vs.adr.setRegion(vs.Region);
		//District
		vs.ds.setType(DDistrict.АО);
		vs.ds.setName(vs.Distric);
		vs.adr.setDistrict(vs.ds);
		//City
		vs.c.setName(vs.City);
		vs.c.setType(vs.dc);
		vs.adr.setCity(vs.c);
		//Locality
		vs.loc.setType(DInhabitedLocalities.ААЛ);
		vs.loc.setName(vs.Locality);
		vs.adr.setLocality(vs.loc);
		//Street
		vs.st.setType(DStreets.А_Я);
		vs.st.setName(vs.Street);
		vs.adr.setStreet(vs.st);
		//Level1
		vs.lv1.setType(DLocationLevel1Type.БОКС);
		vs.lv1.setValue(vs.Level1);
		vs.adr.setLevel1(vs.lv1);
		
		vs.NP.setAddress(vs.adr);
		vs.catDoc.setCategory(vs.Category);
		vs.NP.setCategory(vs.catDoc);
		
		vs.utilDoc.setByDoc(vs.ByDoc);
		vs.NP.setUtilization(vs.utilDoc);
		//SubParcels
		vs.sp.setDefinition(vs.Definition);
		
		vs.sp.setArea(DATA_Values.fun_Area("1", "1", "1"));
		
		vs.sps.getNewSubParcel().add(vs.sp);
		vs.NP.setSubParcels(vs.sps);
		
		convertObjectToXml(Mplan, fileName);
		open_xml(fileName);
		//ProcessBuilder pb = new ProcessBuilder("Notepad.exe", fileName);
		//pb.start();
	}
	
		// сохраняем объект в XML файл
		private static void convertObjectToXml(MP Mplan, String filePath) {
			Class<?> c=Mplan.getClass();
			
			try {
				JAXBContext context = JAXBContext.newInstance(MP.class);
				Marshaller marshaller = context.createMarshaller();
				// устанавливаем флаг для читабельного вывода XML в JAXB
				//TODO Сделать шапку нормальную!!!
				String encoding="utf-8";
				marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
				marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				// маршаллинг объекта в файл
				File f=new File(filePath);
				marshaller.marshal(Mplan,f);
				
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	

	}

