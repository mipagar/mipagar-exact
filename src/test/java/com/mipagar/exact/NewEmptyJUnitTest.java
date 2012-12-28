/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mipagar.exact;

import java.io.StringWriter;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author duncan
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void test() throws JAXBException, DatatypeConfigurationException {
        EExact eExact = new EExact();
        Invoices invoices = new com.mipagar.exact.Invoices();
        
        GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();
        XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        com.mipagar.exact.Invoice i = new com.mipagar.exact.Invoice(new Journal("70"),xgcal, new TypeAccount("1901165"), new TypeAccount("1901165"));
        invoices.getInvoice().add(i);
        JAXBContext jaxbc = JAXBContext.newInstance(EExact.class);
        StringWriter stringWriter = new StringWriter();
        eExact.setInvoices(invoices);
        jaxbc.createMarshaller().marshal(eExact, stringWriter);
        Logger.getLogger(NewEmptyJUnitTest.class.getName()).log(Level.INFO, "{0}", stringWriter);
    }
}
