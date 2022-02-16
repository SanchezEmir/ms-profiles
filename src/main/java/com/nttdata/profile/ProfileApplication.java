package com.nttdata.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProfileApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProfileApplication.class, args);
  }

  // Define todo los detalles que tendra la API
  /*
   * private ApiInfo apiInfo() { return new
   * ApiInfoBuilder().title("API de perfiles para clientes") .description(
   * "La API servira para listar, eliminar, actualizar perfiles de clientes")
   * .termsOfServiceUrl("http://emirsanchez.com") .contact(new
   * Contact("Emir Sanchez", "", "emir2104@gmail.com"))
   * .license("Emir Sanchez").licenseUrl("http://emirsanchez.com")
   * .version("1.0.0.").build(); }
   */

  // Define la configuración para swagger
  /*
   * @Bean public Docket petApi() { return new
   * Docket(DocumentationType.SWAGGER_2).groupName("Bootcamp")
   * .apiInfo(apiInfo()).select()
   * .apis(RequestHandlerSelectors.basePackage("com.nttdata.profile"))
   * .paths(PathSelectors.any()).build() .tags(new Tag("Profile API",
   * "Mostrar todas las APIS"));
   * 
   * }
   */

}
