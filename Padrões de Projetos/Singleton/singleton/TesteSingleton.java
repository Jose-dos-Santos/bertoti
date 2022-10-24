package singleton;

public class TesteSingleton {

	public static void main(String[] args) {

		ConfiguracaoBancoDados configuraBanco = new ConfiguracaoBancoDados("20/10/2022", "//.bd/com",
				"Tentativa de conexão com banco de dados", 2);

		configuraBanco.conectarBanco("1213212ghgh");
		
		Usuario usuario = new Usuario(1,"José Maria" , 5, "20/10/2022");
		
		usuario.acessarFuncionalidades(1);

	}

}
