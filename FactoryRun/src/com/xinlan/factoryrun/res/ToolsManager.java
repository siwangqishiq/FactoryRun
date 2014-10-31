package com.xinlan.factoryrun.res;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Դ������
 * 
 * @author panyi
 * 
 */
public class ToolsManager
{
    private List<AssembleTool> mAssembleToolList = new ArrayList<AssembleTool>();// װ���
    private List<CNCTool> mCNCToollList = new ArrayList<CNCTool>();// CNC 3
    private List<DigbedTool> mDigbedToollList = new ArrayList<DigbedTool>();// �괲��
    private List<ForcebedTool> mForcebedToolList = new ArrayList<ForcebedTool>();// ĥ����
    private List<PersonTool> mPersonToolList = new ArrayList<PersonTool>();// ��ҵ��Ա
                                                                           // 2
    private List<StrongbedTool> mStrongbedToolList = new ArrayList<StrongbedTool>();// �ֿ��
    private List<WashbedTool> mWashbedToolList = new ArrayList<WashbedTool>();// ϳ����
    private List<WashTool> mWashToolList = new ArrayList<WashTool>();// ��ϴ��

    private static ToolsManager instance;

    public static ToolsManager getInstantce()
    {
        if (instance == null)
        {
            instance = new ToolsManager();
        }
        return instance;
    }

    private ToolsManager()
    {
        setup();
    }

    private void setup()
    {
        mAssembleToolList.add(new AssembleTool(1));

        mCNCToollList.add(new CNCTool(1, "1��"));
        mCNCToollList.add(new CNCTool(2, "2��"));
        mCNCToollList.add(new CNCTool(3, "3��"));

        mDigbedToollList.add(new DigbedTool(1));
        mForcebedToolList.add(new ForcebedTool(1));

        mPersonToolList.add(new PersonTool(1, "1����Ա"));
        mPersonToolList.add(new PersonTool(2, "2����Ա"));

        mStrongbedToolList.add(new StrongbedTool(1));
        mWashbedToolList.add(new WashbedTool(1));
        mWashToolList.add(new WashTool(1));
    }

    public PersonTool findPerson(){
        return getMinEndRes(mPersonToolList);
    }
    
    public CNCTool findCNC(){
        return getMinEndRes(mCNCToollList);
    }
    
    public AssembleTool findAssembleTool(){
        return getMinEndRes(mAssembleToolList);
    }
    
    public DigbedTool findDigbedTool(){
        return getMinEndRes(mDigbedToollList);
    }
    
    public ForcebedTool findForcebedTool(){
        return getMinEndRes(mForcebedToolList);
    }
    
    public StrongbedTool findStrongbedTool(){
        return getMinEndRes(mStrongbedToolList);
    }
    
    public WashbedTool findWashbedTool(){
        return getMinEndRes(mWashbedToolList);
    }
    
    public WashTool findWashTool(){
        return getMinEndRes(mWashToolList);
    }
    
    /**
     * @param resList
     * @return
     */
    private static <T extends Res> T getMinEndRes(List<T> resList)
    {
        T ret = resList.get(0);
        for (int i = 0, size = resList.size(); i < size; i++)
        {
            T curRes = resList.get(i);
            if (curRes.end < ret.end)
            {
                ret = curRes;
            }// end if
        }// end for i
        return ret;
    }

    public List<AssembleTool> getmAssembleToolList()
    {
        return mAssembleToolList;
    }

    public void setmAssembleToolList(List<AssembleTool> mAssembleToolList)
    {
        this.mAssembleToolList = mAssembleToolList;
    }

    public List<CNCTool> getmCNCToollList()
    {
        return mCNCToollList;
    }

    public void setmCNCToollList(List<CNCTool> mCNCToollList)
    {
        this.mCNCToollList = mCNCToollList;
    }

    public List<DigbedTool> getmDigbedToollList()
    {
        return mDigbedToollList;
    }

    public void setmDigbedToollList(List<DigbedTool> mDigbedToollList)
    {
        this.mDigbedToollList = mDigbedToollList;
    }

    public List<ForcebedTool> getmForcebedToolList()
    {
        return mForcebedToolList;
    }

    public void setmForcebedToolList(List<ForcebedTool> mForcebedToolList)
    {
        this.mForcebedToolList = mForcebedToolList;
    }

    public List<PersonTool> getmPersonToolList()
    {
        return mPersonToolList;
    }

    public void setmPersonToolList(List<PersonTool> mPersonToolList)
    {
        this.mPersonToolList = mPersonToolList;
    }

    public List<StrongbedTool> getmStrongbedToolList()
    {
        return mStrongbedToolList;
    }

    public void setmStrongbedToolList(List<StrongbedTool> mStrongbedToolList)
    {
        this.mStrongbedToolList = mStrongbedToolList;
    }

    public List<WashbedTool> getmWashbedToolList()
    {
        return mWashbedToolList;
    }

    public void setmWashbedToolList(List<WashbedTool> mWashbedToolList)
    {
        this.mWashbedToolList = mWashbedToolList;
    }

    public List<WashTool> getmWashToolList()
    {
        return mWashToolList;
    }

    public void setmWashToolList(List<WashTool> mWashToolList)
    {
        this.mWashToolList = mWashToolList;
    }
}// end class
