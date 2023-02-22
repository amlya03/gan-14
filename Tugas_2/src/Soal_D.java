/**
 * 
 */

/**
 * @author Amalia
 *
 */
public class Soal_D {
	
    public static void main(String[] args){
        int n = 9;
        int k = (n * 2) - 1;	
		
		for (int i = 1 ; i <= k; i += 2 ) 
		{
			for (int j = 1 ; j <= k; j += 2 ) 
			{
				if(j == i || j == k - i + 1) 
				{
					System.out.print(i);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
    }
}