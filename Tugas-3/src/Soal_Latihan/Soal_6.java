package Soal_Latihan;

public class Soal_6 {
	public static void main(String[] args) {
		String kalimat = "aku belajar pemrograman";
        int a,b,c,d,e;
        a=0; b=0; c=0; d=0; e=0;
 
        for(int i=0; i<kalimat.length();i++){
            if(kalimat.charAt(i)=='a'){
                a++;
            }
            if(kalimat.charAt(i)=='i'){
                b++;
            }
            if(kalimat.charAt(i)=='u'){
                c++;
            }
            if(kalimat.charAt(i)=='e'){
                d++;
            }
            if(kalimat.charAt(i)=='o'){
                e++;
            }
        }
        System.out.println("a = "+ a);
        System.out.println("i = "+ b);
        System.out.println("u = "+ c);
        System.out.println("e = "+ d);
        System.out.println("o = "+ e);
    }
}
