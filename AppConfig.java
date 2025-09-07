@Configuration
public class AppConfig {

@Bean
  public PasswordService passwordService()
{
  return new BCryptPasswordService();
}

@Bean
public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception 

{
    http.csrf().disable()
    .authorizeHttpRequests(auth -> auth
    .requestMatchers(“/apps/register”).permitAll() // allows access for public registration
    .anyRequest().authenticated())      // requires login
    .httpBasic();   // enable HTTP authentication

    return http.build();

  }

}
