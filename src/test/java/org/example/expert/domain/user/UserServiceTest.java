package org.example.expert.domain.user;

import org.example.expert.config.PasswordEncoder;
import org.example.expert.domain.common.exception.InvalidRequestException;
import org.example.expert.domain.user.dto.request.UserChangePasswordRequest;
import org.example.expert.domain.user.entity.User;
import org.example.expert.domain.user.enums.UserRole;
import org.example.expert.domain.user.repository.UserRepository;
import org.example.expert.domain.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Spy
    private PasswordEncoder passwordEncoder;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void changePassword_비밀번호_변경_검증(){
        // given
        long userId = 1L;
        User user = new User("test@a.com" , passwordEncoder.encode("Asd12345") , UserRole.ADMIN);
        UserChangePasswordRequest userChangePasswordRequest = new UserChangePasswordRequest("Asd12345" , "Asd12345");

        given(userRepository.findById(anyLong())).willReturn(Optional.of(user));

        // when
        InvalidRequestException exception = assertThrows(InvalidRequestException.class, () -> userService.changePassword(userId , userChangePasswordRequest));

        // then
        assertEquals("새 비밀번호는 기존 비밀번호와 같을 수 없습니다." , exception.getMessage());
    }

}
