public class Player {
    private String firstName;
    private String lastName;

    public Player () {
        firstName = "unknown";
        lastName = "unknown";
    }

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
