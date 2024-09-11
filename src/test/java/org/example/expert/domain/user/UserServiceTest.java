package org.example.expert.domain.user;

import org.example.expert.config.PasswordEncoder;
import org.example.expert.domain.user.dto.request.UserChangePasswordRequest;
import org.example.expert.domain.user.entity.User;
import org.example.expert.domain.user.repository.UserRepository;
import org.example.expert.domain.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

public class UserServiceTest {

    @Spy
    private PasswordEncoder passwordEncoder;

    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void changePassword_비밀번호_변경_검증(){
        // given
        long userId = 1L;
        User user = new User("test@a.com", passwordEncoder.encode("Asd12345"));
        UserChangePasswordRequest userChangePasswordRequest = new UserChangePasswordRequest();

        given(userRepository)

    }
}
