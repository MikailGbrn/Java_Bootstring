package com.learning.cobaDOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ParseKnownXMLStructure {

    public static void main(String[] args) throws Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
    
        Document document = builder.parse(new File("src/main/resources/employee.xml"));
    
        document.getDocumentElement().normalize();
    
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        NodeList nList = document.getElementsByTagName("employee");
        System.out.println("====================================");

        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            System.out.println("");
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element Elemento = (Element) node;
                System.out.println("Employee id : " + Elemento.getAttribute("id"));
                System.out.println("First Name : " + Elemento.getElementsByTagName("firstName").item(0).getTextContent());
                System.out.println("Last Name : " + Elemento.getElementsByTagName("lastName").item(0).getTextContent());
                System.out.println("Location : " + Elemento.getElementsByTagName("location").item(0).getTextContent());
            }
        }
        
    }

    


}
