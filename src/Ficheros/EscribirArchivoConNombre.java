package Ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirArchivoConNombre {
    public static void main(String[] args) {

    FileWriter archivo=null;
    PrintWriter impresor=null;

    String nombre=null;
    Scanner sc =new Scanner(System.in);

    System.out.println("Nombre del proyecto");
    nombre=sc.nextLine();
    try {
        archivo=new FileWriter("C:\\Users\\Yoel Rey Vidal\\eclipse-workspace\\tercera\\src\\"+nombre+".txt");
        impresor=new PrintWriter(archivo);
        for(int i=0;i<10;i++) {
            System.out.println("estamos imprimiendo");
            impresor.println("con nombre" +i);
            
        }
        

    }catch (Exception e) {
        e.printStackTrace();
    }finally {
        try {
            if(archivo!=null)
                archivo.close();
        }catch (Exception e2) {
            e2.printStackTrace();
        }
    }
    
    
}

}
