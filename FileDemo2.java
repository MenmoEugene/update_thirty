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
		File f = new File("c:\\");//����list������file��������Ƿ�װ��һ��Ŀ¼����Ŀ¼��������ڣ�����������ֿ�ָ���쳣��

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

//��ϰ����Ҫһ��ֻ��ʾ.java�ļ��������ļ�����Ҫ��

}
