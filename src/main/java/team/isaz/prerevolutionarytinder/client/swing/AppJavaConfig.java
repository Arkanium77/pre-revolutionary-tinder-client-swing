package team.isaz.prerevolutionarytinder.client.swing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import team.isaz.prerevolutionarytinder.client.swing.domain.URLRepository;
import team.isaz.prerevolutionarytinder.client.swing.services.CommandHandlerService;
import team.isaz.prerevolutionarytinder.client.swing.services.CommandStatusService;
import team.isaz.prerevolutionarytinder.client.swing.services.RequestResponseService;
import team.isaz.prerevolutionarytinder.client.swing.services.helper.ViewGenerator;

@Configuration
public class AppJavaConfig {
    @Value("${remote.server.link}")
    private String serverLink;

    @Bean
    CommandHandlerService commandHandlerService() {
        return new CommandHandlerService(profileView(), requestResponseService());
    }

    @Bean
    RequestResponseService requestResponseService() {
        return new RequestResponseService(restTemplate(), urlRepository());
    }

    @Bean
    ViewGenerator profileView() {
        return new ViewGenerator();
    }

    @Bean
    CommandStatusService commandStatusService() {
        return new CommandStatusService();
    }

    @Bean
    URLRepository urlRepository() {
        return new URLRepository(serverLink);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .rootUri(serverLink)
                .uriTemplateHandler(new DefaultUriBuilderFactory(serverLink))
                .build();
    }
}
