package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cs.dao.repository")
public class ReportingApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContexte = SpringApplication.run(ReportingApplication.class, args);

         /* ProjetRepository projetRepository = applicationContexte.getBean(ProjetRepository.class);
        Projet p1 = new Projet("projet 1","client1",new SimpleDateFormat("02/04/2020"),new SimpleDateFormat("12/08/2021"),
                new Utilisateur("123","miriam","bouali","developpeuse"));

        projetRepository.save(p1);*/

//        UtilisateurRepository userRepository = applicationContexte.getBean(UtilisateurRepository.class);
//        Utilisateur collaborateur = new Utilisateur("Bouali", "Miriam", "123", "Collaborateur");
//        userRepository.save(collaborateur);


//        List<Utilisateur> ListUtilisateurs = userRepository.findAll();
//
//        for(Utilisateur u:ListUtilisateurs){
//            System.out.println("Nom " +u.getNom());
//            System.out.println("Prenom "+u.getPrenom());
//            System.out.println("Role "+u.getRole());
//        }
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }

}
