import java.time.LocalDate;

public class TarefaSimples implements Tarefa {

    private String title;
    private String description;
    private LocalDate dueDate;

    public TarefaSimples(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    @Override
    public void mostrarDetalhes(String indent) {
        System.out.println(indent + "- Tarefa: " + title);
        System.out.println(indent + "  Prazo: " + dueDate);
        System.out.println(indent + "  Descricao: " + description);
    }
}