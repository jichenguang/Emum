import java.io.File;

public class makefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		 String path = "/tmp";
		 String name = "test.xml";
		 File file = new File(path,name);//创建文件流
		 file.mkdir();//真正创建一个目录或者一个文件

			if (!file.exists()) {
				System.out.println("Can't find " + path+name);
			}else{
				System.out.println("Success!");
			}
	}

}
