package Ficheros;

import java.io.File;

public class LeerCarpeta {
 public static void main(String[] args) {
    

    File Directorio= new File("C:\\Users\\Yoel Rey Vidal\\eclipse-workspace\\tercera\\src");

    String []archivos=Directorio.list();
    for(int i=0;i<archivos.length;i++){
System.out.println("Archivo: "+archivos[i]);
    }
}

}
