/**
 * 
 */
package read.write.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Amalia
 *
 */
public class ReadWriteBarang {

	public static void main(String[] args) {
		
        Barang b1 = new Barang("Oreo", 6000, 3);
        Barang b2 = new Barang("Tanggo", 5000, 4);
        Barang b3 = new Barang("Buavita", 7000, 2);
        Barang b4 = new Barang("Aqua", 3000, 5);
	
		
		try {
			// Creating file
            File file = new File("file.txt");
            if (file.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.err.println("File already exists!");
            }
            
            // Write objects to file
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);

			o.writeObject(b1);
			o.writeObject(b2);
			o.writeObject(b3);
			o.writeObject(b4);

			o.close();
			f.close();
			
			// Print objects to file
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects from file
			Barang br1 = (Barang) oi.readObject();
			Barang br2 = (Barang) oi.readObject();
			Barang br3 = (Barang) oi.readObject();
			Barang br4 = (Barang) oi.readObject();

			System.out.println(br1.toString());
			System.out.println(br2.toString());
			System.out.println(br3.toString());
			System.out.println(br4.toString());

			oi.close();
			fi.close();

		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		} 
		catch (IOException e) {
			System.out.println("Error initializing stream");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
