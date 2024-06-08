/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;
import com.toedter.calendar.JDateChooser;
/**
 *
 * @author Group1
 */
public class SellerManager implements Supermarket{

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    private String Id, Name, SPassword, SGender,SDateofbirth,STelephone;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }


    public String getSPassword() {
        return SPassword;
    }

    public void setSPassword(String SPassword) {
        this.SPassword = SPassword;
    }

    public String getSGender() {
        return SGender;
    }

    public void setSGender(String SGender) {
        this.SGender = SGender;
    }

    public String getSDateofbirth() {
        return SDateofbirth;
    }

    public void setSDateofbirth(String SDateofbirth) {
        this.SDateofbirth = SDateofbirth;
    }
    public String getSTelephone() {
        return STelephone;
    }

    public void setSTelephone(String STelephone) {
        this.STelephone = STelephone;
    }
}
