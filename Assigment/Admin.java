import java.util.HashMap;
import java.util.List;
public class Admin{
    public static HashMap<Key, prob1.Student> processStudents(List<prob1.Student> students) {
        HashMap<Key, prob1.Student> map = new HashMap<>();
        for (prob1.Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            map.put(key, student);
        }
        return map;
    }

    public static double computeAverageGPA(HashMap<Key, prob1.Student> maps) {
        double sum = 0.0;
        for (prob1.Student student : maps.values()) {
            sum += student.getGpa();
        }
        return sum / maps.size();
    }
}