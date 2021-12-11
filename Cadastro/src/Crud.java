import java.util.ArrayList;
import java.util.List;

public class Crud {

    List<Pessoa> list = new ArrayList<Pessoa>();

    Pessoa pessoa = new Pessoa();

    //adicionar a lista
    public void addPessoa(Pessoa p) {
        list.add(p);
    }

    public void imprimeList() {

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Nome:" + list.get(i).getNome());
            System.out.println("Endereço:" + list.get(i).getEndereco());
            System.out.println("Email:" + list.get(i).getEmail());
            System.out.println();
        }
    }

    public void imprimePessoa(Pessoa pessoa) {

        System.out.println("Nome:" + pessoa.getNome());
        System.out.println("Endereço:" + pessoa.getEndereco());
        System.out.println("Email:" + pessoa.getEmail());
        System.out.println();
    }

    public boolean removePessoa(Pessoa pessoa) {

        for (int i = 0; i < list.size(); i++) {
            if (list.contains(pessoa)) {
                list.remove(pessoa);
                return true;
            }
        }
        return false;
    }

    public Pessoa buscarPessoa(Pessoa pessoa) {

        for (int i = 0; i < list.size(); i++) {
            if (list.contains(pessoa)) {
                System.out.println("Pessoa encontrada...");
                imprimePessoa(pessoa);
                return pessoa;
            }
            return null; //se não encontrar o bolo procurado retorna nulo
        }
        return null;
    }

    public Pessoa atualizarPessoa(Pessoa pessoa) {
        Pessoa p = buscarPessoa(pessoa);
        if (p != null) {
            p.setNome(pessoa.getNome());
            p.setEndereco(pessoa.getEndereco());
            p.setEmail(pessoa.getEmail());
        }
        return null;
    }
}
