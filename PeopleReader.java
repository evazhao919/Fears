import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PeopleReader {
    private final String filename;

    public PeopleReader(String filename) {
        this.filename = filename;
    }

    public List<Person> getAllPeople() throws IOException {
        List<Person> people = new ArrayList<>();

        List<String> lines = Files.readAllLines(Path.of(filename));
        for (String line : lines) {
            String[] parts= line.split(" ");
            String fName = parts[0];
            // String lName = parts[1] + parts[2] + parts [3];
           String lName = parts[1];
        int age;
        String mName;
        String fear;
        int counter;
        // if parts [2]is a number, save it as an int
        // if parts [2] is a String, parts [1] is middle, parts[2] is last, parts[3] is int
       try{
         age = Integer.parseInt(parts[2]);
         mName = "";
         counter = 3;
       }catch(NumberFormatException nfe){
        mName = parts[1];
        lName = parts[2];
        age = Integer.parseInt(parts[3]);
        counter = 4;
       }

       if (parts.length - counter == 1){
        fear = parts[counter];
       }else{
         fear = parts[counter] + " " + parts[counter+1];
       }

            people.add(new Person(fName,mName,lName,age,fear));
        }

        return people;
    }
}