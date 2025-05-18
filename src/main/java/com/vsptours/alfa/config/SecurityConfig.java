// package com.vsptours.alfa.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConfig {
//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         http
//             .authorizeHttpRequests(auth -> auth
//                 .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()
//                 .requestMatchers("/auth/**", "/public/**").permitAll()
//                 .anyRequest().authenticated()
//             )
//             .formLogin(form -> form
//                 .loginPage("/auth/login")
//                 .defaultSuccessUrl("/public/")
//             )
//             .logout(logout -> logout
//                 .logoutSuccessUrl("/public/")
//             );
        
//         return http.build();
//     }
// }
// This configuration allows public access to static resources and specific paths, while securing all other endpoints.