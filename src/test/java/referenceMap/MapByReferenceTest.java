package referenceMap;

import com.sun.javafx.binding.StringFormatter;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class MapByReferenceTest {

  @Test
  public void testMapByReference(){

    Map<String, Object> mapa = new HashMap<>();
    Mascota kadia = this.crearKadia();
    mapa.put(kadia.getNombre(), kadia);

    Mascota nacho = this.crearNacho();
    mapa.put(nacho.getNombre(), nacho);


    System.out.println("Animal sin cambiar---------");

    kadia.print();

    System.out.println("Animal cambiado---------");

    this.cambiarKadia(mapa);
    Mascota k = (Mascota) mapa.get("Kadia");
    k.print();
}

  private void cambiarKadia(Map<String, Object> mapa) {
    Mascota k = (Mascota) mapa.get("Kadia");
    k.setEdad(20);
    k.getAnimal().setTipo("Perro pastor");
  }

  private Mascota crearKadia() {
  Animal animal = new Animal().setColor("Negro y amarillo").setTamanio("grande").setTipo("Perro");
  Mascota kadia = new Mascota().setAnimal(animal).setEdad(14).setNombre("Kadia");
  return kadia;
  }

  private Mascota crearNacho() {
    Animal animal = new Animal().setColor("Blanco, gris y negro").setTamanio("chonky").setTipo("Gato");
    Mascota nacho = new Mascota().setAnimal(animal).setEdad(2).setNombre("Nacho");
    return nacho;
  }


public static class Mascota{
    private int edad;
    private String nombre;
    private Animal animal;

  public int getEdad() {
    return edad;
  }

  public Mascota setEdad(int edad) {
    this.edad = edad;
    return this;
  }

  public String getNombre() {
    return nombre;
  }

  public Mascota setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public Animal getAnimal() {
    return animal;
  }

  public Mascota setAnimal(Animal animal) {
    this.animal = animal;
    return this;
  }

  public void print(){
    System.out.printf("->%s\n ->%d\n %s", this.nombre, this.edad, this.animal.print());
  }

}

public static class Animal {
    private String tipo;
    private String color;
    private String tamanio;

  public String getTipo() {
    return tipo;
  }

  public Animal setTipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  public String getColor() {
    return color;
  }

  public Animal setColor(String color) {
    this.color = color;
    return this;
  }

  public String getTamanio() {
    return tamanio;
  }

  public Animal setTamanio(String tamanio) {
    this.tamanio = tamanio;
    return this;
  }

  public String print(){
    return String.format("->%s \n ->%s\n ->%s\n",this.tipo, this.tamanio, this.color);
  }

}

}
