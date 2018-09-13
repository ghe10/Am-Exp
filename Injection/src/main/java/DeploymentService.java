import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class DeploymentService implements Service {
    private final Task task;
    private int serviceId;
    private boolean isDryRun;

    @Inject
    DeploymentService(Task task) {
        this.task = task;
    }

//    @Inject
//    DeploymentService(@FakeTaskAnnotation Task task) {
//        this.task = task;
//    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setDryRun(boolean isDryRun) {
        this.isDryRun = isDryRun;
    }

    public boolean execute() {
        System.out.println("************** Executing task  ***************");
        System.out.println(String.format("service id : %s", serviceId));
        System.out.println(String.format("Is dryrun : %s",isDryRun));
        System.out.println(task.getName());
        System.out.println("************** Execution ended ***************");
        return true;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DeploymentModel());
        DeploymentService deploymentService = injector.getInstance(DeploymentService.class);
//        deploymentService.setDryRun(true);
//        deploymentService.setServiceId(100);
//        deploymentService.execute();

        NoInterfaceClass noInterfaceClass = injector.getInstance(NoInterfaceClass.class);
        noInterfaceClass.showTask();
    }
}
