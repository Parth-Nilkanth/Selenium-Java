package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import base.BaseTests;


public class DropdownTests  extends BaseTests{

        @Test 
        public void testSelecteOption()
        {
            var dropDownPage = homePage.clickDropDown();
            String option = "Option 1";
            dropDownPage.selectFromDropDowm(option);
            var selectedOptions =dropDownPage.getSelectedOptions();
            assertEquals(selectedOptions.size() ,1 , "Incorrect number of selections");
            assertTrue(selectedOptions.contains(option),"Option not selected");
            

        }

}
