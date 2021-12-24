package com.epam.gourianova;

import com.epam.gourianova.model.PassengerPlane;
import com.epam.gourianova.repo.PlaneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AircompanyWebStart {

    public static void main ( String[] args )
    {
        SpringApplication.run(AircompanyWebStart.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner ( PlaneRepository planeRepository ) {
        return args -> {
            PassengerPlane plane = new PassengerPlane(
                    "Boeing-737", 900, 12000, 60500, 164
            );
            planeRepository.save(plane);
        };
    }
    AircompanyRun aircompanyRun=new AircompanyRun();
}
