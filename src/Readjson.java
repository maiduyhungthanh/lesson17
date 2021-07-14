import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Readjson {
    public void getData() {

        List<Textbook> list;
        try {
            FileReader reader = new FileReader("src/TextBook.json");

            Type objectType = new TypeToken<List<Textbook>>() {
            }.getType();
            list = new Gson().fromJson(reader, objectType);

            for (Textbook textbook : list) {

                System.out.println(textbook);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getProject() {

        List<Project> list;
        try {
            FileReader reader = new FileReader("src/Project.json");

            Type objectType = new TypeToken<List<Project>>() {
            }.getType();
            list = new Gson().fromJson(reader, objectType);

            for (Project project : list) {
                System.out.println(project);
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getElectronic() {
        
        List <Electronic> list;
        try {
            FileReader reader = new FileReader("src/Electronic.json");

            Type objectType = new TypeToken<List<Electronic>>(){}.getType();
            list = new Gson().fromJson(reader,objectType);

         for (Electronic electronic : list) {
             System.out.println(electronic);
         }
         }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

