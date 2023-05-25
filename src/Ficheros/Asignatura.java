package Ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Asignatura implements Serializable {

int codigo;
String nombre;
int credito;

public Asignatura(int codigo, String nombre, int credito) {
this.codigo = codigo;
this.nombre = nombre;
this.credito = credito;
}

@Override
public String toString() {
return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", credito=" + credito + "]";
}
void escribirAsignatura() {
try {
FileOutputStream archivo = new FileOutputStream ("asignatura.dat");
ObjectOutputStream salida = new ObjectOutputStream(archivo);
salida.writeObject(this);
salida.close();
} catch (Exception e) {
System.out.println("No se puede escibrir en el archivo");
}
}
void leerAsignatura() {
try {
FileInputStream archivo = new FileInputStream("asignatura.dat");
ObjectInputStream entrada = new ObjectInputStream(archivo);
Asignatura asignatura = (Asignatura) entrada.readObject();
asignatura.toString();
entrada.close();
} catch (FileNotFoundException e) {
System.out.println("no se puede leer el archivo ");
}
catch (IOException e) {
System.out.println("Error de entrada/salida");
}catch (Exception e) {
System.out.println("Error al leer el archivo ");
}
}

}
