public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String Ofname, String oFemail, char oFgender) {

        name = Ofname;
        email = oFemail;
        gender = oFgender;

    }
    public String toString() {

        return String.format("Author[name=%s email=%s gender=%c]", name, email, gender);
    }

}
