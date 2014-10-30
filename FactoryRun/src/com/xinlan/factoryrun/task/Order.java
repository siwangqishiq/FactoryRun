package com.xinlan.factoryrun.task;

import java.util.HashSet;

public class Order
{
    private String id;
    private int hashCode;
    private HashSet<Task> taskList =new HashSet<Task>();
    public Order(String id){
        this.id = id;
        hashCode = id.hashCode();
    }
    public void submit(Task task){
        taskList.add(task);
    }
}//end class
