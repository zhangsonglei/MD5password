package com.md5.convert;

import java.util.Scanner;

import com.nkl.common.util.Md5;
/*
 * �û������м���jar��
 */
public class Encryption {
	
	public static void main(String[] args) {
		String password = null;
		String md5 = null;
		String confirm = null;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("��Ҫ�������ݼ�����y/n?����");
		confirm = scanner.next();	
		
		while(confirm == "Y"||confirm == "y")
		{
			System.out.println("������Ҫ���ܵ����ݣ�");
			password = scanner.next();
			
			md5 = Md5.makeMd5(password);
			System.out.println("�����ǣ�"+md5);
			
			System.out.println("��Ҫ�������ݼ�����y/n?����");
			confirm = scanner.next();	
		}
		
		System.out.println("ллʹ�ã�");
	}
}
