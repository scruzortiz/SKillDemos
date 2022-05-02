import static org.junit.Assert.*; //imports junit Assert

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

import org.junit.*; //imports junit 
public class SkillDemoTest { //creates class for testing 
    
    @Test
    public void testgetitaly(){
        Path fileName = Path.of("test-file.md");
        try{
            String content = Files.readString(fileName);
            assertEquals(List.of("image.jpg"), SkillDemo.getPicture(content));
        }catch(IOException e){

        }
    }
}
