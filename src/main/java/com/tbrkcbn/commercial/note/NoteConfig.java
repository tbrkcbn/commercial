package com.tbrkcbn.commercial.note;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class NoteConfig {

    @Bean
    CommandLineRunner commandLineRunner(NoteRepository repository){
        return args -> {
//            Note n1 = new Note(
//                    "Dünya Kadınlar Günü",
//                    "Lorem ipsum",
//                    LocalDate.of(2021,3,8)
//            );
//            Note n2 = new Note(
//                    "İkinci not",
//                    "Lorem ipsum",
//                    LocalDate.now()
//            );
//
//            repository.saveAll(List.of(n1,n2));
        };
    }
}
