package com.datadriven.woodland;

import java.util.ArrayList;

public class TestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> data = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader(
					"C:\\Raghuveer M H-216320\\eclipse-workspace\\Java_test\\src\\com\\datadriven\\woodland\\WoodLandTestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <=reader.getRowCount("Products"); rowNum++) {
			String firstProduct = reader.getCellData("Products", "productName", rowNum);

			Object ob[] = { firstProduct };
			data.add(ob);
		}
		return data;
	}

}
