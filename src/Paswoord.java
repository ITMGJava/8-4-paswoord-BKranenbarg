import java.util.Scanner;

public class Paswoord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String userGuess;
        String passWordGuess;
        String vraag1 = "Wat is je gebruikersnaam?";
        String vraag2 = "Wat is je wachtwoord?";
        String onjuist = " is niet het juiste wachtwoord.";
        String inlog = "Je bent ingelogd.";

        //array met 5 gebruikersnamen (moet nog op private)
        String[] user = new String[5];
        user[0] = "william";
        user[1] = "bas";
        user[2] = "petra";
        user[3] = "corinne";
        user[4] = "ahmet";

        //array met 5 wachtwoorden (moet nog op private)
        String[] password = new String[5];
        password[0] = "makkelijk";
        password[1] = "easy";
        password[2] = "makkie";
        password[3] = "123";
        password[4] = "321";

        boolean check = false;

        do {
            System.out.println(vraag1);
            userGuess = s.nextLine();
            //lus creëren voor de waarden 0 t/m 4 uit de array
            for (int i = 0; i < 5; i++)
            if (user[i].equals(userGuess)) {
                System.out.println(vraag2);
                passWordGuess = s.nextLine();
                if (passWordGuess.equals(password[i])) {
                    System.out.println(inlog);
                    check= true;
                } else {
                    System.out.println(passWordGuess + onjuist);
                }
            }
        }
        //blijven doorlopen terwijl check false is
        while (!check);
    }

}
