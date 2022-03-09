package midtermreviewcodeforpartc;

/**
 *
 * @author Bonita
 */
public class PasswordValidator extends UnoOnline{
    int specialCharCount=0;
    boolean validPassword=false;
    String password;
    
    public PasswordValidator(){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public boolean getValidPassword(){
        return this.validPassword;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public void setValidPassword(boolean validPassword){
        this.validPassword = validPassword;
    }
    
    while(!validPassword){
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++){
                if(!(Character.isLetterOrDigit(password.charAt(i)))){
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7){
                validPassword=true;
            }
        }//loop only ends when password is valid so now we create the User
  
}



