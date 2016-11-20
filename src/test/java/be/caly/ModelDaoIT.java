package be.caly;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) 
@SpringBootTest
public class ModelDaoIT {
	
	private EmbeddedDatabase db;
	  
	@Before
    public void setUp() {
          	db = new EmbeddedDatabaseBuilder()
    		.setType(EmbeddedDatabaseType.HSQL)
    		.addScript("sql/create-db.sql")
    		.addScript("sql/insert-data.sql")
    		.build();
    }
	
	/** 
	 * 
	 * A model client representing the data fetched from SDS
	 */
    @Test
    public void testLoadClientFromSDS() {
    	System.out.println("test OK");

    }

    @After
    public void tearDown() {
        db.shutdown();
    }

}
