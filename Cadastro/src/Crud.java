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

    public boolean removePessoa(Pessoa pessoa) {

        for (int i = 0; i < list.size(); i++) {
            if (list.contains(pessoa)) {
                list.remove(pessoa);
                return true;
            }
        }
        return false;
    }


}
