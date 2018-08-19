package ga.osipov.xml_create;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import XML.MP_v06.*;
import XML.MP_v06.MP.InputData.SubParcels;
import XML.MP_v06.MP.Package;
import XML.MP_v06.MP.Package.*;
import XML.MP_v06.TNewParcel.*;

public class DATA_Values implements Serializable { 
	String CadastralBlock="test";
	String CadastralNumber="test";
	String other="test";
	String CadastralNumbersInp="test";
	String OKATO="test";
	String KLADR="test";
	String Region="test";
	String City="test";
	String Locality="test";
	String Street="test";
	String Level1="test";
	String Distric="test";
	String Category="test";
	String ByDoc="test";
	
	Package p = new Package();
	FormParcels fp = new FormParcels();
	TNewParcel NP = new TNewParcel();
	TProvidingPassCadastralNumbers ppcn=new TProvidingPassCadastralNumbers();
	TCadastralNumbersInp cni=new TCadastralNumbersInp();
	TObjectRealty objr=new TObjectRealty();
	TCadastralNumbersInp icni=new TCadastralNumbersInp();
	
	//area
	public static TAreaNew fun_AreaNew(String Area,String unit,String Inaccuracy) {
		TAreaNew a_new=new TAreaNew();
		a_new.setArea(BigInteger.valueOf(Long.parseLong(Area)));
		a_new.setUnit(unit);
		a_new.setInaccuracy(BigDecimal.valueOf(Long.parseLong(Inaccuracy)));
		
		return a_new;
	}
	public static TArea fun_Area(String Area,String unit,String Inaccuracy) {
		TArea a_new=new TArea();
		a_new.setArea(BigInteger.valueOf(Long.parseLong(Area)));
		a_new.setUnit(unit);
		a_new.setInaccuracy(BigDecimal.valueOf(Long.parseLong(Inaccuracy)));
		
		return a_new;
	}
	
	Address adr=new Address();
	TCity c=new TCity();
	DCity dc=DCity.ВОЛОСТЬ;
	TLocality loc=new TLocality();
	TDistrict ds=new TDistrict();
	TStreet st=new TStreet(); 
	TLevel1 lv1=new TLevel1();
	TCategoryDoc catDoc=new TCategoryDoc();
	TUtilizationDoc utilDoc=new TUtilizationDoc();
	
	XML.MP_v06.TNewParcel.SubParcels sps=new XML.MP_v06.TNewParcel.SubParcels();
	XML.MP_v06.TNewSubParcel sp=new XML.MP_v06.TNewSubParcel();
	String Definition="test";
	public String Conclusion="test";
	//(prop.CadastralBlock).ordinal;


	public static void logProperties(Object obj,ArrayList<String>fixTypes) 
			throws IllegalArgumentException, IllegalAccessException 
	{
		String test="";
		
		  Class<?> aClass = obj.getClass();
		  Field[] declaredFields = aClass.getDeclaredFields();
		  //Map<String, String> logEntries = new HashMap<>();

		  for (Field field : declaredFields) {
		    field.setAccessible(true);
		    
		    String fType=field.getType().getSimpleName();
		    //if (fixTypes.indexOf(fType)!=-1) continue;
		    
			try {
				if (field. getType().isInstance(test)==false) {
					
					String fType1=field.getType().getName();
					
					try {
						Class sub_class = Class.forName(field.getType().getName());
						Object fobject = null;
						fobject = sub_class.newInstance();
						logProperties(fobject,fixTypes);
						field.set(obj, fobject);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//try {
						//sub_class = Class.forName(field.getType());
					//} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					//}
				} else {
					field.set(obj, "test");
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    

		    Object[] arguments = new Object[]{field.getName(),field.getType().getSimpleName(),String.valueOf(field.get(obj))};

		    //String template = "- Property: {0} (Type: {1}, Value: {2})";
		    //String logMessage = System.getProperty("line.separator")+ MessageFormat.format(template, arguments);
		    //logEntries.put(field.getName(), logMessage);
		  }

		  //SortedSet<String> sortedLog = new TreeSet<>(logEntries.keySet());
		  //StringBuilder sb = new StringBuilder("Class properties:");
		  //Iterator<String> it = sortedLog.iterator();
		  //while (it.hasNext()) {
		  //  String key = it.next();
		  //  sb.append(logEntries.get(key));
		  //}
		  //System.out.println(sb.toString());
		}
	
	public static void test_abstract_fun() {
		ArrayList<String> fixTypes=new ArrayList<String>();
		//fixTypes.add("String");
		fixTypes.add("List");
		
		MP Mplan = new MP();
		Mplan.setGUID("29fd5fa8-4334-4dbe-b027-294cc2505bbd");
		Mplan.setVersion("06");
		Mplan.setNameSoftware("Полигон: Межевой план");
		Mplan.setVersionSoftware("7.6.7");
		
		Package p=new Package();
		try {
			logProperties(p,fixTypes);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Mplan.setPackage(p);
		String fileName = new File(".").getAbsolutePath()+"/MP_01.xml";
		//convertObjectToXml(Mplan, fileName);
		//open_xml(fileName);
	}
}
