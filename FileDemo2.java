import java.io.*;

class FileDemo2 
{
	public static void main(String[] args) 
	{
//		listRootsDemo();
//		listDemo();
		File dir = new File("c:\\");
		File[] files = dir.listFiles();

		for (File f : files)
		{
			System.out.println(f.getName()+"::"+f.length());
		}

	}
	public static void listDemo2()
	{
		File dir = new File("E:\\Ziliao\\Java\\practice");

		String[] arr = dir.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name) 
			{
//				System.out.println("dir:"+dir+"...name:"+name);
				
//				return true;
				return name.endsWith(".mp3");
			}
		});

		System.out.println("len:"+arr.length);
		for (String name : arr)
		{
			System.out.println(name);
		}
	}
	public static void listDemo()
	{
		File f = new File("c:\\");//调用list方法的file对象必须是封装了一个目录，该目录还必须存在，否则编译会出现空指针异常。

		String[] names = f.list();
		for(String name : names)
		{
			System.out.println(name);
		}

	}
	public static void listRootsDemo()
	{
		File[] files = File.listRoots();

		for(File f : files)
		{
			System.out.println(f);
		}
	}

//练习：就要一个只显示.java文件，其他文件都不要。

}
