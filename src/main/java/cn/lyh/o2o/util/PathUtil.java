package cn.lyh.o2o.util;

import java.io.File;

public class PathUtil {
	private static 	String seperator =File.separator;
	public static String getImgBasePath() {
		String os=System.getProperty("os.name");
		String basePath="";
		if(os.toLowerCase().startsWith("win")) {
			basePath="D:/projectdev/image/";
		}else {
			basePath="/home/lyh/image/";
		}
		 basePath = basePath.replace("/", seperator);
		 return basePath;
	}
	
	public static String getShopImagePath(long shopId) {
		String imagePath ="upload/item/shop/"+shopId+"/";
		return imagePath.replace("/", seperator); 
	}
}
