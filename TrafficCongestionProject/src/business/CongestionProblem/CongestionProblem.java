/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CongestionProblem;

public class CongestionProblem implements Comparable<CongestionProblem>{
    private String problemName;
    private int problemCongestionCount=0;
    private static int problemOccurrence=0;
    
    public void incrementProblemCongestionCount(){
        problemCongestionCount++;
    }

    public int getProblemCongestionCount() {
        return problemCongestionCount;
    }

    public void setProblemCongestionCount(int probConCount) {
        this.problemCongestionCount = probConCount;
    }

    public CongestionProblem() {
        problemOccurrence++;
    } 

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public int getProblemOccurrence() {
        return problemOccurrence;
    }

    public void incrementProblemOccurrence() {
        problemOccurrence++;
    }

    @Override
    public String toString() {
        return problemName;
    }

    @Override
    public int compareTo(CongestionProblem t) {
        int qty=((CongestionProblem)t).getProblemCongestionCount();
        return qty-this.getProblemCongestionCount();
    }
    
    

}
