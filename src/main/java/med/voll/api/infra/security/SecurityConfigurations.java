package med.voll.api.infra.security;

<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
>>>>>>> 01f8cb49072e367739a1abb7428e521a7011166e
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
<<<<<<< HEAD
=======
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
>>>>>>> 01f8cb49072e367739a1abb7428e521a7011166e

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {
<<<<<<< HEAD
=======

    @Autowired
    private SecurityFilter securityFilter;

>>>>>>> 01f8cb49072e367739a1abb7428e521a7011166e
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
<<<<<<< HEAD
                .and().build();
    }
    @Bean //Serve para exportar uma classe, ensinando o spring a injetar dependencias
=======
                .and().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .anyRequest().authenticated()
                .and().addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
>>>>>>> 01f8cb49072e367739a1abb7428e521a7011166e
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
<<<<<<< HEAD
    public PasswordEncoder passwordEncoder () {
        return new BCryptPasswordEncoder();
    }
=======
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


>>>>>>> 01f8cb49072e367739a1abb7428e521a7011166e
}
