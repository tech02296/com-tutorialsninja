package resources.testdata;

import org.testng.annotations.DataProvider;

public class testdata {
    @DataProvider(name = "Credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow","5 Miles","30000","50000","Per annum","permenant","Permanent Tester jobs in Harrow"},
                {"Automation Tester","Central London","2 Miles","40000","60000","Per annum","Contract","Contract Automation Tester jobs in Central London"},
                {"Developer","Manchester","1 Miles","3500","4000","Per month","temporary","Temporary Developer jobs in Manchester"},
                {"Developer","Wembley, Greater London","7 Miles","20000","40000","Per annum","Part Time","Part Time Developer jobs in Wembley"},
                {"nurse","Birmingham","1 Miles","20000","40000","Per annum","Contract","Contract Nurse jobs in Birmingham"},
                {"QA","Edgware","2 Miles","30000","50000","Per month","Part Time","Part Time Qa jobs"}
        };
        return data;
    }

}
