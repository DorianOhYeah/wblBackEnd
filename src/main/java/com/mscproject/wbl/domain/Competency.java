package com.mscproject.wbl.domain;

public class Competency {
    int studentid;
    int status;
    int assignmentid;
    int cid;

    public int getStudentid() {
        return studentid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }



    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAssignmentid() {
        return assignmentid;
    }

    public void setAssignmentid(int assignmentid) {
        this.assignmentid = assignmentid;
    }


}
