class Juego{
	
	public static void main(String[] args) {
	Puntuacion participanteUno = new Puntuacion();
	Puntuacion participanteDos = new Puntuacion();
	String p1,p2,ar,ar2;
	participanteUno.registro();
	participanteDos.registro();
	int x,y,r1=0,r2=0,res=0;
	int i=0;
	p1=participanteUno.nombreAlumno;//nombreParticipante
	p2=participanteDos.nombreAlumno;
	ar=participanteUno.areas[i];
	
	while (i<3) {//Puntuación
	x=participanteUno.puntajeAlumno[i];//Puntaje
	y=participanteDos.puntajeAlumno[i];
	System.out.print("\n"+participanteUno.areas[i]+" ");
	 	if (x>y) {
			   System.out.print("Punto para \t"+p1);
			   r1=r1+1;
			} else if (x<y) {
				System.out.print("Punto para \t"+p2);
				r2=r2+1;
			} else if (x==y) {
				System.out.print("Empate, punto para ambos");
				r1=r1+1;
				r2=r2+1;
			}
		else {System.out.print("\n Sin Valores");
			}
		i++;
	 } //Cierrre While
	 if (r1>r2) {//Ganador
	 	System.out.print("\n Gana El Alumno  "+p1);
	 }else if (r1<r2) {
	 		System.out.print("\n Gana El Alumno  "+p2);
	 	}else if (r1==r2) {
	 		System.out.print("\n Hay Empate  ");
	 	}
	 else{
	 	System.out.print("\n No hay ganador"+p2);
	 }
	}//Main
}//Class