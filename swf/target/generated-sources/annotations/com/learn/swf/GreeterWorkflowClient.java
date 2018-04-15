/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.learn.swf;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

/**
 * Generated from {@link com.learn.swf.GreeterWorkflow}. 
 * Used to invoke child workflows asynchronously from parent workflow code.
 * Created through {@link GreeterWorkflowClientFactory#getClient}.
 * <p>
 * When running outside of the scope of a workflow use {@link GreeterWorkflowClientExternal} instead.
 */
public interface GreeterWorkflowClient extends WorkflowClient
{

    /**
     * Generated from {@link com.learn.swf.GreeterWorkflow#greet}
     */
    Promise<Void> greet();

    /**
     * Generated from {@link com.learn.swf.GreeterWorkflow#greet}
     */
    Promise<Void> greet(Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterWorkflow#greet}
     */
    Promise<Void> greet(StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

}