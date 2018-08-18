package ga.osipov.xml_create;
//массив ключ+значение
import java.util.*;
//открытие файла
import java.awt.Desktop;
import java.io.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import XML.MP_v06.MP;
import XML.MP_v06.MP.Package;
import XML.MP_v06.MP.Package.FormParcels;
import XML.MP_v06.TCadastralNumbersInp;
import XML.MP_v06.TNewParcel;

public class XmlFileCreator {
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
		Map<String,String> vs=new HashMap<String,String>();
		vs.put("CadastralBlock", "test");
		vs.put("CadastralNumber", "test");
		
		//автомотическое определение расположение файла в проекте
		String fileName = new File(".").getAbsolutePath()+"/MP_01.xml";

		MP Mplan = new MP();
		Mplan.setGUID("29fd5fa8-4334-4dbe-b027-294cc2505bbd");
		Mplan.setVersion("06");
		Mplan.setNameSoftware("Полигон: Межевой план");
		Mplan.setVersionSoftware("7.6.7");
		
		Package p = new Package();
		Mplan.setPackage(p);
		//Образование участков
		FormParcels fp = new FormParcels();
		fp.setMethod("3");
		p.setFormParcels(fp);
		
		TNewParcel NP = new TNewParcel();
		NP.setDefinition(NewParcel);
		fp.getNewParcel().add(NP);
		NP.setCadastralBlock(vs.get("CadastralBlock"));
		
		TCadastralNumbersInp cni=new TCadastralNumbersInp();
		cni.getCadastralNumber().add(vs.get("CadastralNumber"));
		NP.setPrevCadastralNumbers(cni);
		
		
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
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				//TODO Сделать шапку нормальную!!!
				marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

				// маршаллинг объекта в файл
				File f=new File(filePath);
				marshaller.marshal(Mplan,f);
				
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	

	}

