/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author shamkh
 */
public class Inputs {

    double ConvertInput(String s) {
        String res2 = "", res1 = "";
        double num1, num2, ans = 0;
        if (s.contains("/")) {
            for (int i = 0; i < s.indexOf("/"); i++) {
                res1 += s.charAt(i);
            }
            for (int i = s.indexOf("/") + 1; i < s.length(); i++) {
                res2 += s.charAt(i);
            }
            num1 = Double.parseDouble(res1);
            num2 = Double.parseDouble(res2);
            ans = num1 / num2;
        } else if (s.contains(".")) {
            for (int i = 0; i < s.indexOf("."); i++) {
                res1 += s.charAt(i);
            }
            for (int i = s.indexOf(".") + 1; i < s.length(); i++) {
                res2 += s.charAt(i);
            }
            num1 = Double.parseDouble(res1);
            num2 = Double.parseDouble(res2);
            double sum = 1;
            for (int i = 0; i < res2.length(); i++) {
                sum *= 10;
            }
            ans = num1 + (num2 / sum);
        }
        return ans;
    }
    
}
