/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;
import java.util.*;
/**
 *
 * @author UNAL
 */

public class Calification {

    private float score;
    
    public Calification(float score){
        this.setScore(score);
    }
    
    public float getScore() {
        return this.score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
