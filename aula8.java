import java.util.*;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");    

       //tente imprimir os alunos usando foreach
    }
}
import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //1) adicione alguns alunos

        //2) imprima o tamanho da colecao

        //3) tente adicionar um aluno que existe

        //4) imprima novamente o tamanho da colecao
    }
}
public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}
Collection<Integer> numeros = new HashSet<>();
