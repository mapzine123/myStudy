package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {
    // 시간에 대해 자동으로 넣어줌
    // 영속 데이터의 변화를 감지
    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("un");
    }
}
