package com.imooc.utils;
import java.util.UUID;
/*
 * 文件上传的工具类
 * */
public class UploadUtils {

	/*
	 * 生成唯一的文件名
	 * */
	public static String getUUIDFileName(String fileName) {
		// 将文件名前面的部分截取 xx.jpg—— .jpg
		int idx=fileName.lastIndexOf(".");
		String extention=fileName.substring(idx);
		String uuidFileName=UUID.randomUUID().toString().replace("-", "")+extention;
		return uuidFileName;
	}
}
