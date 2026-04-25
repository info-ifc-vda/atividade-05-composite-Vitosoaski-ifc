import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa {

    private String title;
    private List<Tarefa> tasks = new ArrayList<>();

    public TarefaComposta(String title) {
        this.title = title;
    }

    public void adicionarTarefa(Tarefa task) {
        tasks.add(task);
    }

    public void removerTarefa(Tarefa task) {
        tasks.remove(task);
    }

    @Override
    public void mostrarDetalhes(String indent) {
        System.out.println(indent + "+ Grupo: " + title);

        for (Tarefa task : tasks) {
            task.mostrarDetalhes(indent + "   ");
        }
    }
}