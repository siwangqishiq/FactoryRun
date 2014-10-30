package com.xinlan.factoryrun.task;

import java.util.HashSet;

public class Order
{
    private String id;
    private int deadLine;
    private HashSet<Task> taskList =new HashSet<Task>();
    
    public Order(String id,int deadLine){
        this.id = id;
        this.deadLine = deadLine;
    }
    
    public void submit(Task task){
        taskList.add(task);
    }
    
    
}//end class
