import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        PeopleReader reader = new PeopleReader("people.txt");
        List<Person> people = reader.getAllPeople();
        Map<String,List<Person>> groups = new HashMap<>();

    
        for (Person p : people) {
            String fear = p.getfear();
            if (groups.containsKey(fear)){
                groups.get(fear).add(p);
            }else{
                groups.put(fear,new ArrayList<>());
                groups.get(fear).add(p);
            }
        }
        for(Map.Entry<String,List<Person>> entry : groups.entrySet()){
            System.out.println(entry.getKey());
          for(Person p : entry.getValue()){
            System.out.println(p);
          }
        }
    }
}