
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
	
		char valor = 66; //na tabela de unicode, 65 é a letra A
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
	
}
