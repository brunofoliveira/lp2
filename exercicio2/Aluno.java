public class Aluno {
	String nome, numeroMatricula;
	int idade;

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome + " - Idade: "+ this.idade + " - Numero Matricula: " + this.numeroMatricula);
	}	


	public static void main(String [] args){
		Aluno a1 = new Aluno();
 		Aluno a2 = new Aluno();
    Aluno a3 = new Aluno();
    Aluno a4 = new Aluno();
 		
    a1.nome="José";
  	a1.idade=17;
  	a1.numeroMatricula="201318110001";

    a2.nome="João";
  	a2.idade=18;
  	a2.numeroMatricula="201318110002";

    a3.nome="Chico";
  	a3.idade=16;
  	a3.numeroMatricula="201318110003";

    a4.nome="Airton";
    a4.idade=19;
    a4.numeroMatricula="201318110004";

    a1.imprimirDadosCadastrais();	
    a2.imprimirDadosCadastrais();
    a3.imprimirDadosCadastrais();
    a4.imprimirDadosCadastrais();

	}
}
