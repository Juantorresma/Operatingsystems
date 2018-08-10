import java.util.Scanner;

public class letraRepetida {

	public void Repetido(String string, long inicio) {
		int a=0;
		char sub = Character.MIN_VALUE;
		if(string.length()==1) {System.out.println("Solo hay una letra");}
		else{
			for (int i =0;i<string.length()-1;i++) {
				a=0;
				sub =string.charAt(i); 
				for (int j =0;j<string.length();j++) {
					if(sub==string.charAt(j)) {
						a++;
					}
				}
				if (a==1) {
					System.out.println("La primer letra que no se repite es "+sub);
					System.out.println("Time elapsed = "+ (System.currentTimeMillis()-inicio)+" miliseconds");
					System.exit(0);
				}
			}
			System.out.println("Todas las letras se repiten");
		}
	}
	public static void main(String[] args) {
		long inicio =System.currentTimeMillis();
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe la palabra que quieras checar");
		String string= leer.next();
		letraRepetida ejercicio = new letraRepetida();
		ejercicio.Repetido(string,inicio);
		leer.close();
		System.out.println("Time elapsed = "+ (System.currentTimeMillis()-inicio)+" miliseconds");
	}
}
