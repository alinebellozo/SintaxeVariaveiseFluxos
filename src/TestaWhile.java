
public class TestaWhile {

	public static void main(String[] args) {
		
		int contador = 0; // inicialização de variáveis, ou seja, variáveis que são locais, temporárias não têm valor fixo/padrão, então preciso dar um valor inicial para ela nesse caso
		while (contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1;
			// contador += 1;
			contador++;
		}
		System.out.println(contador);
		
	}
}