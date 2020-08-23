package com.leanperiod.userservice;

import com.leanperiod.userservice.domain.User;
import com.leanperiod.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class BootstrapDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;

    public BootstrapDataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        userRepository.save(new User("Tony", "Visconti", LocalDate.of(1955, 6,10)));
        userRepository.save(new User("George", "Martin", LocalDate.of(1930, 1,21)));
        userRepository.save(new User("Stephen", "Street", LocalDate.of(1960, 4,7)));
        userRepository.save(new User("Gregg", "Penny", LocalDate.of(1961, 7,30)));
        log.info("Loaded Test Data - saved {} records ", userRepository.count());
    }


}
