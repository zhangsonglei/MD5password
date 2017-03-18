package com.md5.convert;

import java.util.Scanner;

import com.nkl.common.util.Md5;
/*
 * 用户请自行加入jar包
 * By 张松磊
 */
public class Encryption {
	
	public static void main(String[] args) {
		String password = null;
		String md5 = null;
		String confirm = null;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("将要进行数据加密吗（y/n?）：");
		confirm = scanner.next();	
		
		while(confirm.equals("Y")||confirm.equals("y"))
		{
			System.out.println("请输入要加密的数据：");
			password = scanner.next();
			
			md5 = Md5.makeMd5(password);
			System.out.println("密文是："+md5);
			
			System.out.println("将要进行数据加密吗（y/n?）：");
			confirm = scanner.next();	
		}
		
		System.out.println("Thanks！");
	}
}
