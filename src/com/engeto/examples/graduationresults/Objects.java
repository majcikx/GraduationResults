package com.engeto.examples.graduationresults;

public class Objects {
    String objectsName;
    int score;


    public Objects(String objectsName) {
        this.objectsName = objectsName;
        score = 0;
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

    public void setScore(int score) {
        this.score = score;
    }
}
