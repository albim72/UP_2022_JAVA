import java.io.FileWriter;
import java.io.IOException;

public class FWriter {
    public FWriter() {
    }
    FileWriter fw = null;
    public void mfWrite() throws IOException {
        fw = new FileWriter("c:\\Temp\\daneFitness.txt");
    }
}
