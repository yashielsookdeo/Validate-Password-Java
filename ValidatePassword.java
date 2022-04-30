/**
 * @author <21002357>
 */
package validate.password;

import javax.swing.JOptionPane;

public class ValidatePassword {

    public static void main(String[] args) {
        boolean valid = false;
        
        while (valid == false) {            
            String str = JOptionPane.showInputDialog(null, "Enter a valid password"), 
                    temp1 = "", temp2 = "", temp3 = "";
            int upper = 0, lower = 0, number = 0, special = 0;
 
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    upper++;
                else if (ch >= 'a' && ch <= 'z')
                    lower++;
                else if (ch >= '0' && ch <= '9')
                    number++;
            }
            
            if (upper >= 2 && lower >= 3 && number >=1) {
                valid = true;
            } else {
                valid = false;
                if (upper < 2) {
                    temp1 = upper + " uppercase characters instead of 2";                    
                }
                if (lower < 3) {
                    temp2 = lower + " lowercase characers instead of 3";                    
                }
                if (number < 1) {
                    temp3 = number + " numeric characters instead of 1";
                    
                }
                JOptionPane.showMessageDialog(null, "The password is invalid as it has " + temp1 + ", " + temp2 + " and " + temp3);
            } 
        }
        JOptionPane.showMessageDialog(null, "Password is valid");
    }
}

