package com.cs;

import com.cs.dao.Utilisateur;
import com.cs.dao.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cs.dao.repository")
public class ReportingApplication implements CommandLineRunner {
    @Autowired //injection des dependances
    private UtilisateurRepository utilisateurRepository;

    public static void main(String[] args) {
        ApplicationContext applicationContexte = SpringApplication.run(ReportingApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedHeaders("*").allowedMethods("*");
            }
        };
    }

    @Override
    public void run(String... args) throws Exception {
    utilisateurRepository.save(new Utilisateur("Premaillon","Bertrant","111","Directeur","mmm@gmail.com"));

        List<Utilisateur> ListUtilisateurs = utilisateurRepository.findAll();

       for(Utilisateur u:ListUtilisateurs){
           System.out.println("Nom " +u.getNom());
           System.out.println("Prenom "+u.getPrenom());
            System.out.println("Role "+u.getRole());
           System.out.println("login "+u.getLogin());
       }

    }
}
