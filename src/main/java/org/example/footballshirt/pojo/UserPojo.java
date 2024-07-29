package org.example.footballshirt.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class UserPojo {
        private Integer user_id;
    

    @NotEmpty(message = "name is required")
    private String userName;

    @NotEmpty(message = "email is required")
    private String emailAddress;

    @NotEmpty(message = "password is required")
    private String password;

    @NotNull(message = "contact is required")
    private Integer contact;
}
