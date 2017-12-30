/*
File�ೣ��������
1��������
	boolean createNewFile()����ָ��λ�ô����ļ���������ļ��Ѿ����ڣ��򲻴���������false��
							���������һ�������������һ���������ļ������ļ��Ѿ�������ᱻ���ǡ�
	boolean mkdir():�����ļ��С�(ֻ������һ���ļ���)
	boolean mkdirs():�����༶�ļ��С�
	
2��ɾ����
	boolean delete();�ڳ������쳣ʱ��ɾ����ʧ�ܡ�
	void deleteOnExit(); �ڳ����˳�ʱɾ��ָ���ļ���

3���жϡ�
	boolean exists()���ļ��Ƿ���ڡ�
	isFile();
	isDirectory();
	isHidden();
	isAbsolute();

4����ȡ��Ϣ��
	getName():
	getPath():
	getParent()://��ȡ��Ŀ¼

	getAbsolutePath() //��ȡ����·��
	lastModified() //���һ���޸�ʱ��  ���ص���long����
	length()  //���ص���long����
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
		sop("parent:"+f.getParent()); //�÷������ص��Ǿ���·���еĸ�Ŀ¼��
									//�����ȡ�������·��������null��������·��������һ��Ŀ¼����ô��Ŀ¼���Ƿ��ؽ����
	}
	public static void method_3()
	{
		File f = new File("file.txt");
		f.mkdir();

		sop("exists:"+f.exists());
		//��ס�����ж��ļ������Ƿ����ļ�����Ŀ¼ʱ������Ҫ���жϸö����װ�������Ƿ���ڡ�
		//ͨ��xitsts�жϡ�
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());

		sop(f.isAbsolute());//�ж��Ƿ�Ϊ����·��
	}
	public static void method_2()
	{
		File f = new File("file.txt");

		sop("execute:"+f.canExecute());
		//�����ļ���
		File dir = new File("abc\\wzx\\xml");
//		sop("delete:"+dir.delete());
		sop("mkdir:"+dir.mkdirs());
	}
	
	public static void method_1() throws IOException
	{
		File f = new File("file.txt");
		f.deleteOnExit();

		sop("create:"+f.createNewFile());//�����ļ�
		sop("delete:"+f.delete());
		sop("exists:"+f.exists());//�ж��ļ��Ƿ����

		
	}
















	//����File����
	public static void consMethod()
	{
		//��a.txt��װ��file���󡣿��Խ����еĺ�Ϊ���ֵ��ļ������ļ��з�װ�ɶ���
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
