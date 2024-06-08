/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author VV
 */
public class ClientsManager {
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    private String No, Name, CPassword, CGender, CDateofbirth;

    public String getNo() {
        return No;
    }

    public void setNo(String No) {
        this.No = No;
    }


    public String getCPassword() {
        return CPassword;
    }

    public void setCPassword(String CPassword) {
        this.CPassword = CPassword;
    }

    public String getCGender() {
        return CGender;
    }

    public void setCGender(String CGender) {
        this.CGender = CGender;
    }

    public String getCDateofbirth() {
        return CDateofbirth;
    }

    public void setCDateofbirth(String CDateofbirth) {
        this.CDateofbirth = CDateofbirth;
    }

}
