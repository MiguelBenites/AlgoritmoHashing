package agenda.com.br;
public class AgendaApp
{
    public static void main(String args[])
    {
        String nomes[] = {"Marco", "Ana", "Patricia", "Zulmira", "Sandra",
                          "Mário", "Marcelo", "Maria", "Márcia", "Márcio", 
                          "Mônica", "Márcia", "Mariana", "Madalena", "Miriam",
                          "Adriana", "Bianca" };
        System.out.println("Agenda");
        Agenda a = new Agenda();
        for (String s : nomes) {
            a.add(s);
        }
        System.out.println(a);
    }
}