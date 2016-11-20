package be.caly;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import be.caly.conf.EnvelopeProperties;



@RunWith(SpringRunner.class) 
@SpringBootTest
public class CalyApplicationTests {
	
	@Autowired
	public EnvelopeProperties  envProperties;
	
	@Value("${envelope.outputFolder}")
	public String someProperty; 
	
	@Test
	public void contextLoads() {
	}
	
    @Test
	public void testLoadingOfEnvelopeProperties() {
		assertThat(envProperties.getBrcCtl(), hasItems("ET-TECH", "ET-FUNC"));
		assertThat(envProperties.getInput(), allOf(hasEntry("input1", "C:Users:input1"),
	                hasEntry("input2", "C:Users:input2")));
	}
    
    @Test
   	public void testPlaceHolderInPropetries() {
    	System.out.println("The app name is the following " +someProperty );
   	}
    
    @Test
    public void testEdenResponse(){
    	
    	/*RestTemplate restTemplate = new RestTemplate();
    	restTemplate.getMessageConverters().add(new ByteArrayHttpMessageConverter());    
    	HttpHeaders headers = new HttpHeaders();
    	headers.setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM));
    	HttpEntity<String> entity = new HttpEntity<String>(headers);

    	ResponseEntity<byte[]> response = restTemplate.exchange(URI, HttpMethod.GET, entity, byte[].class, "1");

    	if(response.getStatusCode().equals(HttpStatus.OK))
    	        {       
    	                FileOutputStream output = new FileOutputStream(new File("filename.jar"));
    	                IOUtils.write(response.getBody(), output);

    	        }*/
    
    }
       
    
    
    
    

}
