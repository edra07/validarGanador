import java.util.Scanner;
public class Puntuacion{
	private Scanner nombre = new Scanner(System.in);
	private Scanner puntaje = new Scanner(System.in);
	public int []puntajeAlumno = new int [3];
	public String []areas = new String[3];
	public String nombreAlumno;	
	public int i;

public Puntuacion(){
	puntajeAlumno[0] = 0;//Algebra
	puntajeAlumno[1] = 0;//Geometria
	puntajeAlumno[2] = 0;//Conta
	areas[0] = "algebra";
	areas[1] = "geometria";
	areas[2] = "conteo";
	nombreAlumno = "";
	i=0;
	}
public void registro(){
	int calif=0;
	System.out.print("\n\n Ingrese nombre del alumno: \t");
	nombreAlumno=nombre.nextLine();
	for (int i=0; i<=2; i++) {
		System.out.print("Ingrese Calificacion de "+areas[i]+" ");
	    puntajeAlumno[i]=puntaje.nextInt();
	}
 }
 public void mostrarPuntaje(){
 	System.out.print("\n\n nombre:"+nombreAlumno);
 	for (int i=0;i<=2; i++) {
 		System.out.print("\nCalificacion\t"+areas[i]+"\t puntaje  "+puntajeAlumno[i]);
 	}
 }
}