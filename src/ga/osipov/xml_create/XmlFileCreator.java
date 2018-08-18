package ga.osipov.xml_create;
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

import XML.MP_v06.DCity;
import XML.MP_v06.DDistrict;
import XML.MP_v06.DInhabitedLocalities;
import XML.MP_v06.DLocationLevel1Type;
import XML.MP_v06.DStreets;
import XML.MP_v06.MP;
import XML.MP_v06.TArea;
import XML.MP_v06.TAreaNew;
import XML.MP_v06.MP.Package;
import XML.MP_v06.MP.Package.FormParcels;
import XML.MP_v06.TNewParcel.Address;
import XML.MP_v06.TCadastralNumbersInp;
import XML.MP_v06.TCity;
import XML.MP_v06.TDistrict;
import XML.MP_v06.TLevel1;
import XML.MP_v06.TLocality;
import XML.MP_v06.TNewParcel;
import XML.MP_v06.TObjectRealty;
import XML.MP_v06.TProvidingPassCadastralNumbers;
import XML.MP_v06.TStreet;
enum prop {
	CadastralBlock, 
	CadastralNumber,
	other,
}

public class XmlFileCreator {
	
	public static class DATA_Values implements Serializable { 
		String CadastralBlock="test";
		String CadastralNumber="test";
		String other="test";
		String CadastralNumbersInp="test";
		String Area="33";
		String unit="1";
		String Inaccuracy="1";
		String OKATO="test";
		String KLADR="test";
		String Region="test";
		String City="test";
		String Locality="test";
		String Street="test";
		String Level1="test";
		String Distric="test";
		
		Package p = new Package();
		FormParcels fp = new FormParcels();
		TNewParcel NP = new TNewParcel();
		TProvidingPassCadastralNumbers ppcn=new TProvidingPassCadastralNumbers();
		TCadastralNumbersInp cni=new TCadastralNumbersInp();
		TObjectRealty objr=new TObjectRealty();
		TCadastralNumbersInp icni=new TCadastralNumbersInp();
		TAreaNew a=new TAreaNew();
		
		Address adr=new Address();
		TCity c=new TCity();
		DCity dc=DCity.ВОЛОСТЬ;
		TLocality loc=new TLocality();
		TDistrict ds=new TDistrict();
		TStreet st=new TStreet(); 
		TLevel1 lv1=new TLevel1();
		//(prop.CadastralBlock).ordinal;
		}
	
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
	
	public static void create (String NewParcel) 
	//обработка исключений для открытия файла xml
	//throws IOException 
	{
		//массив ключ-значение
		//Map<String,String> vs=new HashMap<String,String>();
		//vs.put("CadastralBlock", "test");
		//vs.put("CadastralNumber", "test");
		//ArrayList<String> vs = new ArrayList<String>(); 
		
		//автомотическое определение расположение файла в проекте
		DATA_Values vs=new DATA_Values();
		String fileName = new File(".").getAbsolutePath()+"/MP_01.xml";

		MP Mplan = new MP();
		Mplan.setGUID("29fd5fa8-4334-4dbe-b027-294cc2505bbd");
		Mplan.setVersion("06");
		Mplan.setNameSoftware("Полигон: Межевой план");
		Mplan.setVersionSoftware("7.6.7");
		
		Mplan.setPackage(vs.p);
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
		vs.a.setArea(BigInteger.valueOf(Long.parseLong(vs.Area)));
		vs.a.setUnit(vs.unit);
		vs.a.setInaccuracy(BigDecimal.valueOf(Long.parseLong(vs.Inaccuracy)));
		vs.NP.setArea(vs.a);
		//Address
		vs.adr.setOKATO(vs.OKATO);
		vs.adr.setKLADR(vs.KLADR);
		vs.adr.setRegion(vs.Region);
		//Distric
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
		vs.lv1.setValue(vs.Level1);
		vs.lv1.setType(DLocationLevel1Type.БОКС);
		vs.adr.setLevel1(vs.lv1);
		
		vs.NP.setAddress(vs.adr);
		
		
		convertObjectToXml(Mplan, fileName);
		open_xml(fileName);
		//ProcessBuilder pb = new ProcessBuilder("Notepad.exe", fileName);
		//pb.start();
	}
	
		// сохраняем объект в XML файл
		private static void convertObjectToXml(MP Mplan, String filePath) {
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

