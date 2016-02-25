package com.dbyl.libarary.pageAction;


/**
 * @see testPg();
 * @author 700sfriend
 *  规定了一个方法。
 */
public class act {
	static String path;
	
	/**
	 * @author 700sfriend
	 * 打印：当前系统路径+当前代码路径+当前类的Tag+文件名.xml
	 * @return 
	 */
	public String testPg() {
		// TODO Auto-generated method stub
		path = System.getProperty("user.dir")
				+ "/src/com/dbyl/libarary/pageAction/"
				+ this.getClass().getSimpleName() + ".xml";
		System.out.println(path);
		return path;
	}
	

}
