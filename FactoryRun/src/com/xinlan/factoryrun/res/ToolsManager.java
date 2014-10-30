package com.xinlan.factoryrun.res;

import java.util.ArrayList;
import java.util.List;

/**
 * 资源管理类
 * @author panyi
 *
 */
public class ToolsManager
{
    private List<AssembleTool> mAssembleToolList=new ArrayList<AssembleTool>();
    private List<CNCTool> mCNCToollList=new ArrayList<CNCTool>();
    //DigbedTool
    //ForcebedTool
    //PersonTool
    //StrongbedTool
    //WashbedTool
    //WashTool
    
    public ToolsManager(){
        setup();
    }
    
    private void setup(){
        
    }
    
}//end class
