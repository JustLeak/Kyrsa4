package by.grsu.services;

import by.grsu.repositories.UsersRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(@NonNull String login) throws UsernameNotFoundException {
        return usersRepository.findOneByLogin(login).
                orElseThrow(() -> new UsernameNotFoundException("user " + login + " was not found!"));
    }
}
