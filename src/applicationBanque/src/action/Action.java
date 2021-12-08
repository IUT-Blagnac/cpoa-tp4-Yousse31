package action;

public interface Action<E> {
    String message();
    String stringCode();
    void execute(ActionContext<E> ac);
}
