public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Crud crudPessoa = new Crud();

        pessoa.setEmail("joaozinho@gmail.com");
        pessoa.setEndereco("Tangamandapio");
        pessoa.setNome("joaozinho");

        pessoa1.setEmail("joao@gmail.com");
        pessoa1.setEndereco("Tangamandapio");
        pessoa1.setNome("joao");

        pessoa2.setEmail("marcello@gmail.com");
        pessoa2.setEndereco("Vianoa");
        pessoa2.setNome("marcello");

        crudPessoa.addPessoa(pessoa);
        crudPessoa.addPessoa(pessoa1);
        crudPessoa.addPessoa(pessoa2);

        crudPessoa.imprimeList();
        crudPessoa.removePessoa(pessoa);

        System.out.println();
        System.out.println("Apagando....");
        crudPessoa.imprimeList();

        System.out.println();
        System.out.println("Buscando pessoas....\n");
        crudPessoa.buscarPessoa(pessoa1);

        System.out.println();
        System.out.println("Atualizando pessoa....\n");

        Pessoa pessoaNova = crudPessoa.buscarPessoa(pessoa1);
        pessoaNova.setNome("Marcia");
        pessoaNova.setEndereco("Vila montano");

        crudPessoa.atualizarPessoa(pessoaNova);


    }
}
