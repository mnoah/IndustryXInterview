import org.junit.Test;
import static junit.framework.TestCase.*;

public class PencilTest {

    @Test
    public void PencilWritesOnPaper(){
        Pencil write = new Pencil();

        String  results = write.writeText("the is a test string");

        assertEquals("this is a test string", results);
    }

    @Test
    public void PencilAppendsPaper(){
        Pencil write = new Pencil();

        String  results = write.writeText("this");
        String  results2 = write.writeText(" is" );
        
        assertEquals("this is", results2);
    }

    @Test
    public void PencilDegradeAfterMaxCharactersWritten(){
        Pencil write = new Pencil();

        String results = write.writeText("this is a");

        assertEquals("this is ", results);
    }
}