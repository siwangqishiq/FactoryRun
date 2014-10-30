package com.xinlan.factoryrun.task;

abstract public class Task
{
    protected String name;
    private int runTime;
    
    public Task(int runTime){
        this.runTime = runTime;
    }
}//end class
