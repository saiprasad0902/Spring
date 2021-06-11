import com.prasad.learning.repository.HibernateSpeakerRepositoryImpl;
import com.prasad.learning.repository.SpeakerRepository;
import com.prasad.learning.service.SpeakerService;
import com.prasad.learning.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.prasad.learning"})
public class AppConfig {

/*    //@Bean(name="speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
         //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }*/

/*    //@Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }*/
}
