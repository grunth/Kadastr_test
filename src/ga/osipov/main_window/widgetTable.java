package ga.osipov.main_window;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class widgetTable {
	
	private final static String SIGNMENT_CONTUR = "!Обозначение контура";
	private final static String ACCOUNTED_CONTOUR_NUMBER = "! Учетный номер контура";
	
	JTable table = new JTable();
	
	
	public void setTable() {
		
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
				},
				new String[] {
						SIGNMENT_CONTUR, ACCOUNTED_CONTOUR_NUMBER
				}
			));
	}
	
	
	
	

}
