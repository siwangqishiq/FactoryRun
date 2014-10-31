package com.xinlan.factoryrun.task;

abstract public class Task
{
    protected String name;
    private int runTime;
    protected boolean isused = false;
    
    public Task(int runTime){
        this.runTime = runTime;
    }
}//end class
