package site.cyberpage.cyberpagekorea;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("스프링 어플리케이션 빌더 작동");
		return application.sources(CyberpagekorApplication.class);
	}

}
