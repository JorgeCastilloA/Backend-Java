package practicaHarry;


public class PersonajeHogwarts {
     private String nombre;
     private String genero;
     private String casa;
     private String boggart;
     private String patronus;

     public PersonajeHogwarts (String nombre, String genero, String casa, String boggart, String patronus){
         this.nombre=nombre;
         this.genero=genero;
         this.casa=casa;
         this.boggart=boggart;
         this.patronus=patronus;

  }/*
//getters & setters
     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getGenero() {
         return genero;
     }

     public void setGenero(String genero) {
         this.genero = genero;
     }

     public String getBoggart() {
         return boggart;
     }

     public void setBoggart(String boggart) {
         this.boggart = boggart;
     }

     public String getPatronus() {
         return patronus;
     }

     public void setPatronus(String patronus) {
         this.patronus = patronus;
     }

     public String getCasa() {
         return casa;
     }

     public void setCasa(String casa) {
         this.casa = casa;
     }
     */
     public String toString(){
         return String.format("Nombre: %s, \nGénero: %s,\nCasa: %s,\nBoggart: %s,\nPatronus: %s \n", nombre,  genero, casa, boggart, patronus);
     }

}