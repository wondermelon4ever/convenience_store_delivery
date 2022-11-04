package conveniencestoredelivery.common;


import conveniencestoredelivery.MyParcelApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MyParcelApplication.class })
public class CucumberSpingConfiguration {
    
}
