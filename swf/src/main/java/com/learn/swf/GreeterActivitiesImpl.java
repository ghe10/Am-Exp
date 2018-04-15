package com.learn.swf;

public class GreeterActivitiesImpl implements GreeterActivities {

    public String getName() {
        return "World";
    }

    public String getGreeting(String name) {
        return "Hello " + name;
    }

    public void say(String what) {
        System.out.println(what);
    }
}
