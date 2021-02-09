package com.engeto.examples.graduationresults;

public class Objects {
    private String objectsName;
    private byte score;


    public Objects(String objectsName) {
        this.objectsName = objectsName;

    }

    public String getObjectsName() {
        return objectsName;
    }

    public void setObjectsName(String objectsName) {
        this.objectsName = objectsName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(byte score) {
        this.score = score;
    }
}
