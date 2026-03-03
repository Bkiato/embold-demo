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
    public int calculate(int a, int b, int type) {

        int unusedVariable = 100; // unused variable

        if(type == 1){
            if(a > 0){
                if(b > 0){
                    return a + b;
                } else {
                    return a + b;
                }
            } else {
                return a + b;
            }
        }
        else if(type == 2){
            if(a > 0){
                if(b > 0){
                    return a - b;
                } else {
                    return a - b;
                }
            } else {
                return a - b;
            }
        }
        else if(type == 3){
            if(a > 0){
                if(b > 0){
                    return a * b;
                } else {
                    return a * b;
                }
            } else {
                return a * b;
            }
        }
        else if(type == 4){
            if(b == 0){
                System.out.println("Error");
                return 0;
            }
            return a / b;
        }
        else if(type == 5){
            return a % b;
        }
        else if(type == 6){
            return (a + b) * (a - b);
        }
        else if(type == 7){
            return (a * b) + (a / (b == 0 ? 1 : b));
        }
        else {
            System.out.println("Invalid type");
            return 0;
        }
    }

    public void veryLongMethod() {
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 50; j++){
                if(i % 2 == 0){
                    System.out.println(i + " " + j);
                } else {
                    System.out.println(j + " " + i);
                }
            }
        }
    }
}
