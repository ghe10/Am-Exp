import javax.inject.Inject;

public class NoInterfaceClass {
    private int id;
    FakeTask task;

    @Inject
    private NoInterfaceClass(FakeTask task) {
        this.task = task;
    }

    public void showTask() {

        System.out.println("show task " + task.getName());
    }
}
