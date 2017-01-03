package test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入第一个参数");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(num);
		System.out.print("请输入第二个参数");
		InputStream input2 = System.in;
		BufferedInputStream buffer = new BufferedInputStream(input2);
		buffer.toString();
		
	}
	@Test
	public void test(){
		Pattern pattern = Pattern.compile("^\\d.*");
		Matcher matcher = pattern.matcher("3222f");
		System.out.println(matcher.matches());
	}

}
