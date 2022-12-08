package io.GuiWEspinola.poc1.entities.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomerUpdateRequestDTO {

    private String name;

    private String email;

    private Integer mobileNumber;
}
