package com.learning.CobaSAX;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

public class MyRunner {
    private SAXParser createSAXParser() {
        SAXParser saxParser = null;

        try {
            
            SAXParserFactory factory = SAXParserFactory.newInstance();
            saxParser = factory.newSAXParser();
            
        } catch (ParserConfigurationException | SAXException e) {
            Logger lgr = Logger.getLogger(MyRunner.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
        }

        return saxParser;
    }

    public List<User> parseUsers() {
        MyHandler handelr = new MyHandler();
        String fileName = "src/main/resources/users.xml";
        File xmlDocument = Paths.get(fileName).toFile();

        try {
            
            SAXParser parser = createSAXParser();
            parser.parse(xmlDocument, handelr);

        } catch (SAXException | IOException e) {
            //TODO: handle exception
            Logger lgr = Logger.getLogger(MyRunner.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
        }

        return handelr.getUsers();
    }
}
