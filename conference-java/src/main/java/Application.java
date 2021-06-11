import com.prasad.learning.service.SpeakerService;
import com.prasad.learning.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        SpeakerService service1 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service1.findAll().get(0).getFirstName());
    }
}
