package com.arun.springseurityjpa;

import com.arun.springseurityjpa.models.MyUserDetails;
import com.arun.springseurityjpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MyUserDetailsService  implements UserDetailsService {

    @Autowired
    UserRepository userrepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Optional<User> user= userrepo.findByUserName(username);

            user.orElseThrow(() ->new UsernameNotFoundException("Not found: " + username));
            return  user.map(MyUserDetails::new).get();
    }
}
