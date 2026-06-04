// @SpringBootApplication
// public class EmsBackendApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(EmsBackendApplication.class, args);
//     }

//     @Bean
//     public CorsFilter corsFilter() {
//         CorsConfiguration config = new CorsConfiguration();
//         config.setAllowCredentials(true);
//         config.addAllowedOrigin("https://chic-yeot-a0e1bc.netlify.app");
//         config.addAllowedHeader("*");
//         config.addAllowedMethod("*");

//         UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//         source.registerCorsConfiguration("/**", config);
//         return new CorsFilter(source);
//     }
// }





package net.javaguides.ems_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsBackendApplication.class, args);
	}

}
