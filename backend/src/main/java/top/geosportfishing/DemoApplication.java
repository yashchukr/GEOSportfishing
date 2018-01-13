package top.geosportfishing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.Transactional;
import top.geosportfishing.auth.model.Role;
import top.geosportfishing.auth.model.User;
import top.geosportfishing.auth.repository.RoleRepository;
import top.geosportfishing.auth.repository.UserRepository;

import javax.sql.DataSource;
import java.util.stream.Stream;

import static java.lang.System.exit;

@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class DemoApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Transactional(readOnly = true)
    @Override
    public void run(String... args) throws Exception {

        System.out.println("DATASOURCE = " + dataSource);

        System.out.println("\n1.findAll()...");
        for (User user : userRepository.findAll()) {
            System.out.println(user.getUsername());
        }

        System.out.println("\n2.findByUsername(String username)...");
        User user= userRepository.findByUsername("yashchuk");
            System.out.println(user.getRoles().size());



        // For Stream, need @Transactional
        System.out.println("\n4.findByEmailReturnStream(@Param(\"email\") String email)...");
        try (Stream<Role> stream = roleRepository.findByCreator("ROD").stream()) {
            stream.forEach(x -> System.out.println(x.getName() + " = "+x.getUsers().size()));
        }

        System.out.println("Done!");

       // exit(0);
    }

}
