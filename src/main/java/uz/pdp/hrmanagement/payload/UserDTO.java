package uz.pdp.hrmanagement.payload;

import lombok.*;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Email
    private String email;

    @NotNull
    private double salary;

    @NotNull
    private String region;

    @NotNull
    private String city;

    @NotNull
    private String district;

}
