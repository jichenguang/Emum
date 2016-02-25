package com.dbyl.libarary.pageAction;

import java.io.File;
import java.io.IOException;

public class makeFiles {

	
	/**
	 * @author 700sfriend
	 * 使用路径创建文件
	 */
	
	
	public void makefiles(String path) throws IOException{

		File file = new File(path);
		
		if (!file.exists()) {
			System.out.println("Can't find " + path);
		}else{
			System.out.println("Success!");
		}
	}
	
}
