
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 58;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("O número de acompanhantes é " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja-bem vindo!");
		} else {
			System.out.println("Que pena, você não pode entrar :(");
		}

	}
}
