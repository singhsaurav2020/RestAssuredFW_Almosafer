package com.qa.api.almosafer.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//public class ReadFileData {
//
//	public void getData() {
//		File file = new File("/src/main/java/com/qa/api/almosafer/testdata/datafile.properties");
//
//		FileInputStream fileInput = null;
//		try {
//			fileInput = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		Properties prop = new Properties();
//
//		// load properties file
//		try {
//			prop.load(fileInput);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}

public class PropertyHandler {

	private static Properties setting;
	private static Properties data;
	private static FileInputStream dataFile = null;
	

	private static String environment = null;
	private static FileInputStream settingFile = null;

	public static String getSetting(String key) {

		if (setting == null) {
			loadSetting();
		}
		return setting.getProperty(key);
	}
	
	public static String getData(String key) {
		if (data == null) {
			loadData();
		}
		return data.getProperty(key);
	}

	private static void loadData() {
		data = new Properties();
		dataFile = null;
		try {
			dataFile = new FileInputStream(new File("src/main/java/com/qa/api/almosafer/testdata/datafile.properties"));
			data.load(dataFile);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dataFile != null) {
				try {
					dataFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static void loadSetting() {
		setting = new Properties();
		settingFile = null;
		try {
			settingFile = new FileInputStream(new File("src/main/java/com/qa/api/almosafer/testdata/datafile.properties"));
			setting.load(settingFile);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (settingFile != null) {
				try {
					settingFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
