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

        crudPessoa.addPessoa(pessoa);
        crudPessoa.addPessoa(pessoa1);

        crudPessoa.imprimeList();
        crudPessoa.removePessoa(pessoa);

        System.out.println();
        System.out.println("Apagando....");
        crudPessoa.imprimeList();

    }
}
