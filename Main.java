import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Tarefa task1 = new TarefaSimples(
            "Criar layout",
            "Desenvolver layout da tela inicial",
            LocalDate.of(2026, 4, 20)
        );

        Tarefa task2 = new TarefaSimples(
            "Implementar API",
            "Criar endpoints rest",
            LocalDate.of(2026, 4, 32)
        );

        Tarefa task3 = new TarefaSimples(
            "Testes",
            "Testar funcionalidades principais",
            LocalDate.of(2026, 5, 20)
        );

        TarefaComposta projeto = new TarefaComposta("Projeto Sistema");

        TarefaComposta desenvolvimento = new TarefaComposta("Desenvolvimento");

        desenvolvimento.adicionarTarefa(task1);
        desenvolvimento.adicionarTarefa(task2);

        projeto.adicionarTarefa(desenvolvimento);
        projeto.adicionarTarefa(task3);

        projeto.mostrarDetalhes("");
    }
}