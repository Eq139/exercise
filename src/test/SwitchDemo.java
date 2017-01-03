package test;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row_num=5;//行数
		for (int i = row_num;i>0;i-- ) {
			for(int j=0;j<row_num-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=5;i++){
			for(int j=row_num-i;j>0;j--){
				System.out.print(" ");
			}
			int a = i;
			while(a>0){
				System.out.print("* ");
				a--;
			}
			System.out.println();
		}
		int space_num;
		int star_num;
		int row_num2=8;
		for(int i=1;i<=row_num2;i++){
			space_num = row_num2-i;
			while(space_num>0){
				System.out.print(" ");
				space_num--;
			}
			star_num = 2*i-1;
			while(star_num>0){
				System.out.print("*");
				star_num--;
			}
			System.out.println();
		}
		
		for(int i=row_num2;i>0;i--){
			space_num = row_num2-i;
			while(space_num>0){
				System.out.print(" ");
				space_num--;
			}
			star_num = 2*i-1;
			while(star_num>0){
				System.out.print("*");
				star_num--;
			}
			System.out.println();
		}
		
	}

}
