/**
 * Created by chowdan on 30-04-2018.
 */
public class User {
    private String name;

    public boolean getMarks() {
        if (this.marks < 60) {
            return false;
        } else {
            return true;
        }
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    private String certificationName;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
