/**
 * Created by hgoscenski on 5/7/17.
 */
import com.google.gson.*;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {

    public static void main(String args[]) {

        Gson gson = new Gson();

        File child = new File("/Users/hgoscenski/Desktop/2.json");

        try {

            JsonObject intake = gson.fromJson(new InputStreamReader(new FileInputStream(child), "UTF-8"), JsonObject.class);
            System.out.println(intake.has("hits"));
            JsonArray jsonArray = intake.getAsJsonArray("hits");


            gson.fromJson(jsonArray, testClass.class)
            intake.getClass();
            System.out.println(jsonArray);

        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
