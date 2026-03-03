/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

/**
 *
 * @author ASUS
 */
public class calculator {
    public int calculate(int a, int b, int type){
        if(type == 1){
            return a + b;
        }
        else if(type == 2){
            return a - b;
        }
        else if(type == 3){
            return a * b;
        }
        else if(type == 4){
            return a / b;
        }
        return 0;
    }
}
