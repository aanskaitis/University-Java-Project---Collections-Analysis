public class Entry {
    String Surname;
    String Initials;
    String TelephoneExtension;

    public Entry(String Surname, String Initials, String TelephoneExtension){
        this.Surname = Surname;
        this.Initials = Initials;
        this.TelephoneExtension = TelephoneExtension;
    }
    public String toString() {
        return this.Surname + " " + this.Initials + " " + this.TelephoneExtension;
    }
}
