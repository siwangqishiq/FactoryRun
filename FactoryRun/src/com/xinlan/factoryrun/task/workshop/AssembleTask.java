package com.xinlan.factoryrun.task.workshop;

import com.xinlan.factoryrun.task.Task;

/**
 * 组装
 * @author panyi
 *
 */
public class AssembleTask extends Task
{

    public AssembleTask(int runTime)
    {
        super(runTime);
        this.name = "组装";
    }
}//end class
