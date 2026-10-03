package hover;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import base.BaseTests;

public class HoverTests extends BaseTests {
    
    @Test 
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertEquals(caption.getTitle(), "name: user1", "Caption Title incorrect");
        assertEquals(caption.getLinkText(), "View profile" ,"Caption link text incorrect" );
    //    instead of pasting full url just paste the relative url
        assertTrue(caption.getLink().endsWith("/users/1") , "Link URL is incorrect");
        
    }
}
