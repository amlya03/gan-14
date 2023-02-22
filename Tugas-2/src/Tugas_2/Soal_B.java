package Tugas_2;

public class Soal_B {
	public static void main(String[] args) {
		int n = 9; //jika nilai n atau barisnya	9
//		int n = 5; //jika nilai n atau barisnya 5
		
		for (int i = 1 ; i < n + 1; i++ ) 
		{
			for (int j = 1 ; j < n + 1; j++ ) 
			{
				if(j == i || i + j == n + 1) 
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
