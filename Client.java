
public class Client{
    
    private String name;
    private int id;
    private String country;
    private int phone;
    private String direction;
    private String birthdate;
    private String password;
    private String document_type;
    private String sex;
    private int points;

    public Client (String name, int id, String country, int phone, 
            String direction, String password, String document_type, String sex,
            int points){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public int getPhone() {
        return phone;
    }

    public String getDirection() {
        return direction;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPassword() {
        return password;
    }

    public String getDocument_type() {
        return document_type;
    }

    public String getSex() {
        return sex;
    }

    public int getPoints() {
        return points;
    }
}