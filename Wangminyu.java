package com.demo01;

import java.util.Scanner;

//实现学员信息的管理
public class StudentMgr {
 String[] names=new String[30];//学员姓名数组
 //增加学生姓名，参数name：需要添加的学员姓名
 public void addName(String name){
	 for(int i=0;i<=name.length();i++){
		 if(names[1]==null){
			 names[i]=name;
			 break;
		 }
	 }
 }
 
 
 //在一定区间内查找某个学生
 //start开始查找位置  end结束查找位置  查找学生姓名name
 public boolean searchName(int start, int end,String name){
	
	 boolean flag=false;//标识是否查找到特定学员，false没有查到 true查到了
	 for(int i=start-1;i<end;i++){
		 if(names[i].equals(name)){
			 flag =true;
			 break;
		 }
	 }
	 return flag;
 }
 
 //显示学员姓名
 public void showNames(){
	 System.out.print("学员列表：");
	 for(int i=0;i<names.length;i++){
		 if(names[i]!=null){
			 System.out.print(names[i]+"\t");
		 }
	 }
 }
 public static void main(String[] args) {
	StudentMgr st=new StudentMgr();
	Scanner input=new Scanner(System.in);
	//插入了5名学生的姓名
	for(int i=0;i<5;i++){
		System.out.print("请输入学员姓名：");
		String newName=input.next();
		st.addName(newName);
	}
	//显示学员姓名信息
	st.showNames();
	//在特定区间查找特定学员
	System.out.print("请输入开始查找的位置：");
	int start=input.nextInt();
	System.out.print("请输入结束查找的位置：");
	int end=input.nextInt();
	System.out.print("请输入查找的姓名：");
	String name=input.next();
	System.out.println("*********查找结果*********");
	st.searchName(start, end, name);
	boolean flag=false;
	if(flag){
		System.out.println("找到了");
	}else{
		System.out.println("没有找到");
	}
}
}
这是一个例子
