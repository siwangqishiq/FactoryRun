package com.xinlan.factoryrun.res;

import java.util.ArrayList;
import java.util.List;

import com.xinlan.factoryrun.task.Order;

abstract class Res
{
    protected String name;
    protected String nickName;
    protected int id;
    protected int start;
    protected int end;
    private List<Record> recordList = new ArrayList<Record>();

    /**
     * use it tools
     * 
     * @param time
     */
    public void use(Order order, int time)
    {
        Record record = new Record();
        record.order = order;
        record.orderStartTime = end;
        record.orderEndTime = end + time;
        recordList.add(record);
        
        end += time;
    }

    public void clear()
    {
        recordList.clear();
    }
    
    private final class Record
    {
        Order order;
        int orderStartTime;
        int orderEndTime;
    }// end inner class
}// end class
