package parent;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
public class MakergraphApplication {

    public static void main(String... args) {
        new SpringApplicationBuilder()
                .sources(MakergraphApplication.class)
                .showBanner(false)
                .run(args);
    }

}