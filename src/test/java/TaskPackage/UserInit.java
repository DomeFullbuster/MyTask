package TaskPackage;

//Here we initialize all the users

public class UserInit {

    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;

    public UserInit(String firstName,
                    String lastName,
                    String userName,
                    String email,
                    String password,
                    String confirmPassword) {

        this.firstName = firstName;
        this.secondName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public UserInit(Builder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.phoneNumber = builder.phoneNumber;
        this.userName = builder.username;
        this.email = builder.email;
        this.password = builder.password;
        this.confirmPassword = builder.confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName)  {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getConfirmPassword(){
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }


    public String[] toDataArray() {
        return new String[] {
                getFirstName(),
                getSecondName(),
                getPhoneNumber(),
                getUserName(),
                getEmail(),
                getPassword(),
                getConfirmPassword()
        };
    }

    // Builder pattern
    public static class Builder {

        private String firstName;
        private String secondName;
        private String phoneNumber;
        private String username;
        private String email;
        private String password;
        private String confirmPassword;

        public Builder() {
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder userName(String userName) {
            this.username = userName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder confirmPassword(String confirmPassword){
            this.confirmPassword = confirmPassword;
            return this;

        }

        public UserInit build() {
            return new UserInit(this);
        }
    }
}
