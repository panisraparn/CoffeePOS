package ku.cs.models;
import java.sql.Blob;

public class Member {

    private String memberId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private byte[] faceImage;

    // Constructor, Getter, Setter

    public Member(String memberId, String firstName, String lastName, String phoneNumber, byte[] faceImage) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.faceImage = faceImage;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaceImage(byte[] faceImage) {
        this.faceImage = faceImage;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public byte[] getFaceImage() {
        return faceImage;
    }
}