
public class promedio {

    public static void main(String[] args) {


        double [] cal=new double[5];
        cal[0]=92.5;
        cal[1]=95;
        cal[2]=72.5;
        cal[3]=87.5;
        cal[4]=85;
        double prom;
        System.out.println("Nombre del estudiante: David Arturo ");
        System.out.println("");
        System.out.println("La primera calificación del alumno es de: "+cal[0]);
        System.out.println("La segunda calificación del alumno es de: "+cal[1]);
        System.out.println("La tercera calificación del alumno es de: "+cal[2]);
        System.out.println("La cuarta calificación del alumno es de: "+cal[3]);
        System.out.println("La quinta calificación del alumno es de: "+cal[4]);

        prom = (cal[0]+cal[1]+cal[2]+cal[3]+cal[4])/5;

        System.out.println("");
        System.out.println("El promedio del alumno es: "+ prom);
        System.out.println("");

        if (prom <= 50) {
            System.out.println("Sacó de calificación: F");
        } else if ((prom <= 60) && (prom >= 51)) {
            System.out.println("Sacó de calificación: E");
        } else if ((prom <= 70) && (prom >= 61)) {
            System.out.println("Sacó de calificación: D");
        } else if ((prom <= 80) && (prom >= 71)) {
            System.out.println("Sacó de calificación: C");
        } else if ((prom <= 90) && (prom >= 81)) {
            System.out.println("Sacó de calificación: B");
        } else if ((prom <= 100) && (prom >= 91)) {
            System.out.println("Sacó de calificación: A");
        }
    }
}
