package fi.ykkirjanpitosovellus.test;

import fi.ykkirjanpitosovellus.logic.AccountingYear;
import fi.ykkirjanpitosovellus.logic.Entry;
import fi.ykkirjanpitosovellus.data.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;


public class AccountingYearTest {
    
    AccountingYear testyear;
    AccountingYear testyear2;
    Entry testentry1;
    Entry testentry2;
    Entry testentry3;
    
    public AccountingYearTest() {
    }
    
    @Before
    public void setUp() {
        testyear = new AccountingYear("Testimiehen tilikausi");
        int[] startdate = {01, 01, 2018};
        int[] enddate = {31, 12, 2018};
        testyear.setStartDate(startdate);
        testyear.setEndDate(enddate);
        int[] date1 = {01, 02, 2018};
        testentry1 = new Entry("Testikirjaus", date1, 300, "Income");
        testyear.addEntry(testentry1);
        int[] date2 = {01, 03, 2018};
        testentry2 = new Entry("Testikirjaus", date2 , -200, "Expense");
        int[] date3 = {13, 04, 2018};
        testyear.addEntry(testentry2);
        testentry3 = new Entry("Testikirjaus", date3 , 350, "Rental income");
        testyear.addEntry(testentry3);
        testyear2 = new AccountingYear("Testimiehen tilikausi");
        testyear2.addEntry(testentry1);
;
    }
    
    @Test
    public void indexingLogicWorks() {
        assertEquals(testyear.getEntry(1).getId(), 1);
        assertEquals(testyear.getEntry(2).getId(), 2);
        assertEquals(testyear.getEntry(3).getId(), 3);
    }
    
    @Test 
    public void yearInfoToStringWorks() {
        String[] compare = {"Testimiehen tilikausi", "1", "1", "2018", "31", "12", "2018"};
        assertEquals(testyear.yearInfoToString(), compare);
    }

    @Test
    public void csvReadWorks() {
        //Data in test.csv: ID: 1; Name: Testikirjaus; Date: 1.1.2018; Amount: 300; Type: Tulo;
        AccountingYear testYearCsv = new AccountingYear("Testivuosi");
        try {
        testYearCsv = AccountingData.readCsvFile("test.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löydy");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        
        assertEquals(testYearCsv.getEntry(1).getAmount(), 300);
    }
        @Test
    public void allEntriesToStringWorks() {
        String test2 = " ID: "  + "1" + " Nimi: " + "Testikirjaus" +
        " Pvm: " + "1.2.2018" + " Summa: " + "300" + " Tyyppi: " + "Income";
        assertEquals(test2, testyear2.allEntriesToString()[0]);
    }
}
