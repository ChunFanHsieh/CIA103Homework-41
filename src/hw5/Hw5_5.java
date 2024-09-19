package hw5;

import java.util.Random;

public class Hw5_5 {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
//	public static String Charators = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//	public static int codeLength = 8;
//
//	public static String genAuthCode() {
//		Random r = new Random();
//		StringBuilder authCode = new StringBuilder();
//		for (int i = 0; i < codeLength; i++) {
//			int randomIndex = r.nextInt(Charators.length());
//			authCode.append(Charators.charAt(randomIndex));
//		}
//		return authCode.toString();
//
//	}
//
//	public static void main(String[] args) {
//		String outPutCode = genAuthCode();
//		System.out.println(outPutCode);
//
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：" + genAuthCode());
		
	}	
	
	public static String genAuthCode() {
		
	char [] alphabet = new char[52];
	int[] number = new int[10];
	
	char x ='A';
	char y ='a';
//	設置A-Z
	for (int i = 0; x <= 'Z'; i++) {
		alphabet[i] = x++;
	} 
//	設置a-z
	for(int j = 26 ; y <= 'z' ; j++) {
		alphabet[j]= y++;
	}
//	設置0-9
	
	for(int n = 0; n < number.length ; n++) {
		number[n]=n;
	}
//	集合字母及數字
	StringBuilder sb = new StringBuilder();
	for (char c : alphabet) {
		sb.append(c);
	}
	for (int num : number) {
		sb.append(num);
	}
	String chars = sb.toString();
	
//	加入亂數裡面
	Random r = new Random();
	StringBuilder code = new StringBuilder();
	for (int i = 0 ; i < 8 ;i++) {
		int rdn = r.nextInt(chars.length());
		code.append(chars.charAt(rdn));
		}
	
//	回傳結果
	return code.toString();
	}

}
