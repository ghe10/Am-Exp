import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * This class connects the interface and implementation in Guice and provide binding
 * for these classes
 */
public class DeploymentModel extends AbstractModule {
    /**
     * This function is working on the following tasks:
     * When Guice sees dependency on Service, it will satisfy it with DeploymentService,
     * same for Task class.
     */
    @Override
    protected void configure() {
        bind(Service.class).to(DeploymentService.class);
        bind(Task.class).annotatedWith(FakeTaskAnnotation.class).to(FakeTask.class);
        //bind(Task.class).to(DeploymentTask.class);
    }

    /**
     * This func provides a specific way of creating object of Task through injection.
     * Note that we can only use one of : bind in configure or getTask in @Provides
     * We can define both, guice will throw an exception if both are defined
     * @return Task object
     */
    @Provides
    Task getTask() {
        Task task = new DeploymentTask();
        ((DeploymentTask)task).setName("This task is named by getTask with @Provides");
        return task;
    }
}
