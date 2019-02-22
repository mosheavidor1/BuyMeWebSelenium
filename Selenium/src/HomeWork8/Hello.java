package HomeWork8;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hello {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\moshe\\Documents\\1.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } finally {
            br.close();
        }


    }


        public static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
            File configXmlFile = new File("C:\\Users\\moshe\\Documents\\config.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(configXmlFile);

            if (doc != null) {
                doc.getDocumentElement().normalize();
            }
            assert doc != null;
            return doc.getElementsByTagName(keyName).item(0).getTextContent();
        }



    }
