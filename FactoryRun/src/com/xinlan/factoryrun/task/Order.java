package com.xinlan.factoryrun.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.xinlan.factoryrun.res.ToolsManager;
import com.xinlan.factoryrun.task.office.DrawTask;
import com.xinlan.factoryrun.task.office.ProgramTask;
import com.xinlan.factoryrun.task.workshop.AssembleTask;
import com.xinlan.factoryrun.task.workshop.CNCTask;
import com.xinlan.factoryrun.task.workshop.DigbedTask;
import com.xinlan.factoryrun.task.workshop.EvenwashTask;
import com.xinlan.factoryrun.task.workshop.SidewashTask;
import com.xinlan.factoryrun.task.workshop.SmoothTask;
import com.xinlan.factoryrun.task.workshop.SmoothWashTask;
import com.xinlan.factoryrun.task.workshop.StrongboundTask;

public class Order
{
    private String id;
    private int deadLine;
    private List<Task> taskList = new ArrayList<Task>();

    private Task[] officeTaskList = new Task[] { new DrawTask(0),
            new ProgramTask(0) };
    private Task[] preWorkList = new Task[] { new EvenwashTask(0),
            new SidewashTask(0), new StrongboundTask(0), new SmoothTask(0),
            new SmoothWashTask(0) };
    private Task[] finalWorkList = new Task[] { new CNCTask(0),
            new DigbedTask(0), new AssembleTask(0) };
    
    public Order(String id, int deadLine)
    {
        this.id = id;
        this.deadLine = deadLine;
    }
    
    public void work(){
        
    }
}// end class
