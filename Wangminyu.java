package com.demo01;

import java.util.Scanner;

//ʵ��ѧԱ��Ϣ�Ĺ���
public class StudentMgr {
 String[] names=new String[30];//ѧԱ��������
 //����ѧ������������name����Ҫ��ӵ�ѧԱ����
 public void addName(String name){
	 for(int i=0;i<=name.length();i++){
		 if(names[1]==null){
			 names[i]=name;
			 break;
		 }
	 }
 }
 
 
 //��һ�������ڲ���ĳ��ѧ��
 //start��ʼ����λ��  end��������λ��  ����ѧ������name
 public boolean searchName(int start, int end,String name){
	
	 boolean flag=false;//��ʶ�Ƿ���ҵ��ض�ѧԱ��falseû�в鵽 true�鵽��
	 for(int i=start-1;i<end;i++){
		 if(names[i].equals(name)){
			 flag =true;
			 break;
		 }
	 }
	 return flag;
 }
 
 //��ʾѧԱ����
 public void showNames(){
	 System.out.print("ѧԱ�б�");
	 for(int i=0;i<names.length;i++){
		 if(names[i]!=null){
			 System.out.print(names[i]+"\t");
		 }
	 }
 }
 public static void main(String[] args) {
	StudentMgr st=new StudentMgr();
	Scanner input=new Scanner(System.in);
	//������5��ѧ��������
	for(int i=0;i<5;i++){
		System.out.print("������ѧԱ������");
		String newName=input.next();
		st.addName(newName);
	}
	//��ʾѧԱ������Ϣ
	st.showNames();
	//���ض���������ض�ѧԱ
	System.out.print("�����뿪ʼ���ҵ�λ�ã�");
	int start=input.nextInt();
	System.out.print("������������ҵ�λ�ã�");
	int end=input.nextInt();
	System.out.print("��������ҵ�������");
	String name=input.next();
	System.out.println("*********���ҽ��*********");
	st.searchName(start, end, name);
	boolean flag=false;
	if(flag){
		System.out.println("�ҵ���");
	}else{
		System.out.println("û���ҵ�");
	}
}
}
����һ������
