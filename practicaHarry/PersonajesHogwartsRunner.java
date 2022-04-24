package practicaHarry;

public class PersonajesHogwartsRunner {

    public static void main(String[] args) {
      PersonajeHogwarts harryPotter= new PersonajeHogwarts("Harry Potter", "Masculino","Gryffindor", "Dementor", "Ciervo"  ),
                siriusBlack=new PersonajeHogwarts("Sirius Black", "Masculino","Gryffindor","Desconocido","Perro"),
                albusDumbledore=new PersonajeHogwarts("Albus Dumbledore","Masculino","Gryffindor", "Cuerpo de Ariana", "Fénix"),
                ronWeasly=new PersonajeHogwarts("Ron Weasly", "Masculino", "Gryffindor","Acromántula","Jack Russel Terrier"),
                hermioneGranger=new PersonajeHogwarts("Hermione Granger","Femenino", "Gryffindro", "McGonagall", "Nutria");

        System.out.println(harryPotter);
        System.out.println(siriusBlack);
        System.out.println(albusDumbledore);
        System.out.println(ronWeasly);
        System.out.println(hermioneGranger);


    }
}
