package UI.factory;

import UI.dataprovider.ConfigDataProvider;
import UI.dataprovider.ExcelDataProvider;

public class DataProviderFactory {

	public static ConfigDataProvider getConfig() {
		ConfigDataProvider config = new ConfigDataProvider();
		return config;
	}

	public static ExcelDataProvider getExcel() {
		ExcelDataProvider excelData = new ExcelDataProvider();
		return excelData;
	}

}
