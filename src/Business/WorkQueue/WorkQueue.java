/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Shesh Narayan
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequests;
    }
}