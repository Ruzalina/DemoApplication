package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext cxt = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) cxt.getBean("myController");

        FakeDataSource fakeDataSource=(FakeDataSource) cxt.getBean(FakeDataSource.class);
System.out.println(fakeDataSource.getUser());
    }

}
