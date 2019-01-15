/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CongestionProblem;

import java.util.ArrayList;


public class CongestionProblemDirectory {
    private ArrayList<CongestionProblem> congestionProblemList;
    
    public CongestionProblemDirectory()
    {
        congestionProblemList=new ArrayList<>();
    }

    public ArrayList<CongestionProblem> getCongestionProblemList() {
        return congestionProblemList;
    }

    public void setCongestionProblemList(ArrayList<CongestionProblem> congestionProblemList) {
        this.congestionProblemList = congestionProblemList;
    }
    
    public CongestionProblem addCongestionProblem()
    {
        CongestionProblem congestionProblem=new CongestionProblem();
        congestionProblemList.add(congestionProblem);
        return congestionProblem;
    }
    
}
