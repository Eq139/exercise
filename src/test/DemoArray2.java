package test;

import java.util.Arrays;

public class DemoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrays = {"fish","category","cup"};
		Arrays.sort(arrays);
		System.out.println(Arrays.toString(arrays));
		for (String string : arrays) {
			System.out.println(string);
		}
	}

}
