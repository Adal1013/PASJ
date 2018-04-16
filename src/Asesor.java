public class Asesor extends Persona{
     private String username;

    public Asesor(int id, String firsname, String lastname, String homephone, String celphone, String username) {
        super(id, firsname, lastname, homephone, celphone);
        this.username = username;
    }
}
