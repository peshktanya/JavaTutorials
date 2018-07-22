package Lesson6;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SelectionTests {

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }


    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }


    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
            // do nothing the url is fine
        }else{
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if(url.startsWith("http")){
            // do nothing the url is fine
        }else{
            if(!url.startsWith("www")){
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }


    @Test
    public void ifElseNestedAddHttpReformatted(){
        String url = "seleniumsimplified.com";
        if(url.startsWith("http"))
        {
            // do nothing the url is fine
        }else
        {
            if(!url.startsWith("www"))
            {
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

}