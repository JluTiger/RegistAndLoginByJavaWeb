package com.imooc.utils;
import java.util.UUID;
/*
 * �ļ��ϴ��Ĺ�����
 * */
public class UploadUtils {

	/*
	 * ����Ψһ���ļ���
	 * */
	public static String getUUIDFileName(String fileName) {
		// ���ļ���ǰ��Ĳ��ֽ�ȡ xx.jpg���� .jpg
		int idx=fileName.lastIndexOf(".");
		String extention=fileName.substring(idx);
		String uuidFileName=UUID.randomUUID().toString().replace("-", "")+extention;
		return uuidFileName;
	}
}
