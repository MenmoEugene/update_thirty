/*
File类常见方法：
1，创建。
	boolean createNewFile()：在指定位置创建文件，如果该文件已经存在，则不创建，返回false。
							和输出流不一样，输出流对象一建立创建文件，当文件已经存在则会被覆盖。
	boolean mkdir():创建文件夹。(只允许创建一级文件夹)
	boolean mkdirs():创建多级文件夹。
	
2，删除。
	boolean delete();在程序发生异常时，删除会失败。
	void deleteOnExit(); 在程序退出时删除指定文件。

3，判断。
	boolean exists()：文件是否存在。
	isFile();
	isDirectory();
	isHidden();
	isAbsolute();

4，获取信息。
	getName():
	getPath():
	getParent()://获取父目录

	getAbsolutePath() //获取绝对路径
	lastModified() //最后一次修改时间  返回的是long类型
	length()  //返回的是long类型
*/

import java.io.*;
class FileDemo 
{
	public static void main(String[] args) throws IOException
	{
//		consMethod();
//		method_1();
//		method_2();
//		method_3();
//		method_4();
		method_5();
	}
	public static void method_5()
	{
		File f1 = new File("E:\\Ziliao\\Java\\practice\\haha.java");
		File f2 = new File("E:\\Ziliao\\Java\\practice\\a\\heheda.txt");

		sop("rename:"+f1.renameTo(f2));
	}
	public static void method_4()
	{
		File f = new File("a.txt");

		sop("path:"+f.getPath());
		sop("abspath:"+f.getAbsolutePath());
		sop("parent:"+f.getParent()); //该方法返回的是绝对路径中的父目录。
									//如果获取的是相对路径，返回null。如果相对路径中有上一层目录，那么该目录就是返回结果。
	}
	public static void method_3()
	{
		File f = new File("file.txt");
		f.mkdir();

		sop("exists:"+f.exists());
		//记住：在判断文件对象是否是文件或者目录时，必须要先判断该对象封装的内容是否存在。
		//通过xitsts判断。
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());

		sop(f.isAbsolute());//判断是否为绝对路径
	}
	public static void method_2()
	{
		File f = new File("file.txt");

		sop("execute:"+f.canExecute());
		//创建文件夹
		File dir = new File("abc\\wzx\\xml");
//		sop("delete:"+dir.delete());
		sop("mkdir:"+dir.mkdirs());
	}
	
	public static void method_1() throws IOException
	{
		File f = new File("file.txt");
		f.deleteOnExit();

		sop("create:"+f.createNewFile());//创建文件
		sop("delete:"+f.delete());
		sop("exists:"+f.exists());//判断文件是否存在

		
	}
















	//创建File对象。
	public static void consMethod()
	{
		//将a.txt封装成file对象。可以将已有的和为出现的文件或者文件夹封装成对象。
		File f1 = new File("a.txt");

		File f2 = new File("e:\\abc","b.txt");

		File d = new File("e:\\abc");
		File f3 = new File(d,"c.txt");
		File f4 = new File("c:"+File.separator+"abc"+File.separator+"a.txt");

		sop("f1:"+f1);
		sop("f2:"+f2);
		sop("f3:"+f3);
		sop("f4:"+f4);

	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
