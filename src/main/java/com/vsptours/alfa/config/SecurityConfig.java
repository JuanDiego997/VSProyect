// package com.vsptours.alfa.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .authorizeHttpRequests(auth -> auth
//                         .requestMatchers("/intranet").authenticated() // Solo accesible con login
//                         .anyRequest().permitAll() // Todas las demás rutas son públicas
//                 )
//                 .formLogin(form -> form
//                         .loginPage("/auth/login") // Página de login personalizada
//                         .defaultSuccessUrl("/intranet") // Redirigir aquí después del login
//                         .permitAll())
//                 .logout(logout -> logout
//                         .logoutSuccessUrl("/") // Redirigir a inicio después de logout
//                         .permitAll());
//         return http.build();
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
// }






package com.vsptours.alfa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import
org.springframework.security.config.annotation.web.builders.HttpSecurity;
import
org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
Exception {
http
.csrf(csrf -> csrf.disable()) // Deshabilitar CSRF temporalmente
.authorizeHttpRequests(auth -> auth
.anyRequest().permitAll() // Todas las rutas son públicas
);

return http.build();
}

@Bean
public PasswordEncoder passwordEncoder() {
return new BCryptPasswordEncoder();
}
}






// package com.vsptours.alfa.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import
// org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import
// org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

// @Bean
// public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
// Exception {
// http
// .authorizeHttpRequests(auth -> auth
// .requestMatchers("/intranet").authenticated() // Solo accesible con login
// .anyRequest().permitAll() // Todas las demás rutas son públicas
// )
// .formLogin(form -> form
// .loginPage("/authlogin") // Página de login personalizada
// .defaultSuccessUrl("/intranet") // Redirigir aquí después del login
// .permitAll()
// )
// .logout(logout -> logout
// .logoutSuccessUrl("/") // Redirigir a inicio después de logout
// .permitAll()
// );
// return http.build();
// }

// @Bean
// public PasswordEncoder passwordEncoder() {
// return new BCryptPasswordEncoder();
// }
// }
