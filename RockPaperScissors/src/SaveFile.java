import java.io.*;

public class SaveFile {

    public boolean PlayerAlreadyExists(String name) throws IOException {
        File f = new File("C://Users//ASUS//Desktop//RockPaper.txt");
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String s;
        while ((s = freader.readLine()) != null) {
            String[] st = s.split(" ");
            String n = st[0];
            if (name.equals(n)) {
                return (true);
                //System.out.println(name);

            }
        }

        return false;
    }

    public String GetHighestScore(String name) throws IOException {
        File f = new File("C://Users//ASUS//Desktop//RockPaper.txt");
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String s;
        while ((s = freader.readLine()) != null) {
            String[] st = s.split(" ");
            String n = st[0];
            String Highscore = st[1];
            if (name.equals(n)) {
                return (Highscore);
                //System.out.println(name);
            }

        }
        return null;
    }
    public String saveplayer(String name, int score) throws IOException {
        String path ="C://Users//ASUS//Desktop//RockPaper.txt";
        File obj = new File(path);
        FileWriter fwobj = new FileWriter(obj,true);
        boolean s = PlayerAlreadyExists(name);
        if(s == true){
            System.out.println("Player already exists");
        }
        else{
            fwobj.write("\n");
            fwobj.write(name + ": " + score);
        }
        fwobj.close();

        return null;
    }

}