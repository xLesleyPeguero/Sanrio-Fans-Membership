
package Clases;

/**
 *
 * @author Lesley Peguero
 */
public class Usuarios {
    
    private String Name;
    private String LastName;
    private String Email;
    private String Password;
    private String FavChar;
    private String PhoneNum;

    
    public Usuarios(){
    
    }
    
    public Usuarios(String Name, String LastName, String Email, String Password, String FavChar, String PhoneNum) {
        this.Name = Name;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.FavChar = FavChar;
        this.PhoneNum = PhoneNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFavChar() {
        return FavChar;
    }

    public void setFavChar(String FavChar) {
        this.FavChar = FavChar;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }
    
    
    
    
}
