package conveniencestoredelivery.common;


import conveniencestoredelivery.WarehouseApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { WarehouseApplication.class })
public class CucumberSpingConfiguration {
    
}
