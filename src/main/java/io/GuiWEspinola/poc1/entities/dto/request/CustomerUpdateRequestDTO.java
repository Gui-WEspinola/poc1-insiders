package io.GuiWEspinola.poc1.entities.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomerUpdateRequestDTO {

    @NotBlank(message = "Name is a required field.")
    @Pattern(regexp = "^([a-zA-Z]*)(\\s([a-zA-Z]*))*$")
    private String name;

    @Email(message = "Please enter a valid e-mail.")
    private String email;

    @NotNull(message = "Mobile number is a required field.")
    private Integer mobileNumber;
}
