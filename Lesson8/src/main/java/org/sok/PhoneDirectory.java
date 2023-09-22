import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private String[] Names;
    private List<String>[] phoneNumbers;

    public PhoneDirectory() {
        Names = new String[1000];
        phoneNumbers = new ArrayList[1000];
    }

    public void add(String Name, String phoneNumber) {
        for (int i = 0; i < Names.length; i++) {
            if (Names[i] == null) {
                Names[i] = Name;
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = new ArrayList<>();
                }
                phoneNumbers[i].add(phoneNumber);
                return;
            }
            if (Names[i].equals(Name)) {
                phoneNumbers[i].add(phoneNumber);
                return;
            }
        }
    }

    public List<String> get(String Name) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Names.length; i++) {
            if (Names[i] != null && Names[i].equals(Name)) {
                result.addAll(phoneNumbers[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Sokol", "888777666");
        directory.add("Solovey", "888555444");
        directory.add("Sokol", "888999000");

        System.out.println("Телефоны для Sokol: " + directory.get("Sokol"));
        System.out.println("Телефоны для Solovey: " + directory.get("Solovey"));
    }
}