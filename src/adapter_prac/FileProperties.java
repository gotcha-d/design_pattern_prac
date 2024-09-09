package adapter_prac;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class FileProperties  extends Properties implements FileIO {
    
    @Override
    public void readFromFile(String fileName) throws IOException {
        Reader reader = new FileReader("src/adapter_prac/file.txt");
        load(reader);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        Writer writer = new FileWriter(fileName);
        store(writer, "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
