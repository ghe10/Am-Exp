/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.learn.swf;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

/**
 * Generated from {@link com.learn.swf.GreeterActivities}. 
 * Used to invoke activities asynchronously from workflow code.
 */
public interface GreeterActivitiesClient extends ActivitiesClient
{

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getName}
     */
    Promise<String> getName();

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getName}
     */
    Promise<String> getName(Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getName}
     */
    Promise<String> getName(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getGreeting}
     */
    Promise<String> getGreeting(String name);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getGreeting}
     */
    Promise<String> getGreeting(String name, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getGreeting}
     */
    Promise<String> getGreeting(String name, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getGreeting}
     */
    Promise<String> getGreeting(Promise<String> name);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getGreeting}
     */
    Promise<String> getGreeting(Promise<String> name, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#getGreeting}
     */
    Promise<String> getGreeting(Promise<String> name, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#say}
     */
    Promise<Void> say(String what);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#say}
     */
    Promise<Void> say(String what, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#say}
     */
    Promise<Void> say(String what, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#say}
     */
    Promise<Void> say(Promise<String> what);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#say}
     */
    Promise<Void> say(Promise<String> what, Promise<?>... waitFor);

    /**
     * Generated from {@link com.learn.swf.GreeterActivities#say}
     */
    Promise<Void> say(Promise<String> what, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

}