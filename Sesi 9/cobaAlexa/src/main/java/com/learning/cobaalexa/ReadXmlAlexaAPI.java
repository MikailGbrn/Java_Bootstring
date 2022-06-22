package com.learning.cobaalexa;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXmlAlexaAPI {

    private static final String ALEXA_API = "https://data.alexa.com/data?cli=10&url=";
    private final DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();

    public static void main(String[] args) {
        ReadXmlAlexaAPI obj = new ReadXmlAlexaAPI();
        int alexaRanking = obj.getAlexaRanking("https://bcafinance.co.id/");
        System.out.println("Ranking : " + alexaRanking);
    }

    public int getAlexaRanking(String domain) {
        int result = 0;
        String url = ALEXA_API + domain;

        try {
            URLConnection conn = new URL(url).openConnection();
            try (InputStream is = conn.getInputStream()) {

                DocumentBuilder dBuilder = dbf.newDocumentBuilder();
                Document doc = dBuilder.parse(is);
                Element element = doc.getDocumentElement();

                NodeList nodelist = element.getElementsByTagName("POUPLARITY");

                if(nodelist.getLength() > 0){
                    Element elementAttribute = (Element) nodelist.item(0);
                    String ranking = elementAttribute.getAttribute("TEXT");
                    if (!"".equals(ranking)) {
                        result = Integer.parseInt(ranking);
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                throw new IllegalArgumentException("Invalid request for domain : " + domain);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    
}
