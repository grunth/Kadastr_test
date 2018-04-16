package ga.osipov.xml_create;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import XML.MP_v06.MP;

public class XmlFileCreator {

	public static void main(String[] args) {

		String fileName = "D:/eclipse-workspace/kadastr/students.xml";

		MP Mplan = new MP();
		Mplan.setGUID("29fd5fa8-4334-4dbe-b027-294cc2505bbd");
		Mplan.setVersion("06");
		Mplan.setNameSoftware("Полигон: Межевой план");
		Mplan.setVersionSoftware("7.6.7");
		
		
		
		convertObjectToXml(Mplan, fileName);
		
		
	}	
		
		// сохраняем объект в XML файл
		private static void convertObjectToXml(MP Mplan, String filePath) {
			try {
				JAXBContext context = JAXBContext.newInstance(MP.class);
				Marshaller marshaller = context.createMarshaller();
				// устанавливаем флаг для читабельного вывода XML в JAXB
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

				// маршаллинг объекта в файл
				marshaller.marshal(Mplan, new File(filePath));
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	

	}

