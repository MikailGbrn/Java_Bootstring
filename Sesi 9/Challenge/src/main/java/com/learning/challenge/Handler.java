package com.learning.challenge;

import java.security.KeyStore.Entry.Attribute;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {
    private List<User> users = new ArrayList<>();
    private User user;

    private boolean bfn = false;
    private boolean bln = false;

    @Override
    public void startElement(String url, String localName,
            String qName, Attributes attributes) throws SAXException{
                if ("user".equals(qName)) {
                    
                    user = new User();

                    int id = Integer.valueOf(attributes.getValue("id"));
                    user.setId(id);
                }

                switch (qName) {
                    case "firstname":
                        bfn = true;
                        break;
                    
                    case "lastname":
                        bln = true;
                        break;
                
                    default:
                        break;
                }
            }

            @Override
            public void characters(char[] ch, int start, int length) {
                if (bfn) {
                    user.setFirstname(new String(ch, start, length));
                    bfn = false;
                } else if (bln) {
                    user.setLastname(new String(ch, start, length));
                    bln = false;
                }
            }

            @Override
            public void endElement(String url, String localName, String qName) throws SAXException {
                if ("user".equals(qName)) {
                    users.add(user);
                }
            }

            public List<User> getUsers(){
                return users;
            }
}
