/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myatoi;

/**
 *
 * @author amanp
 */
public class MyAtoi {
public int myAtoi(String s) {
        s = s.trim();

        if(s.length() == 0){
            return 0;
        }

        int sign = 1;
        int startPos = 0;

        if (s.charAt(0) == '-'){
            sign = -1;
            startPos = 1;
        }
        else if (s.charAt(0) == '+'){
            startPos = 1;
        }

        long result = 0;
        for (int i = startPos; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            result = result * 10 + (s.charAt(i) - '0');
            
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        
        return (int) (sign * result);        
    }
}
