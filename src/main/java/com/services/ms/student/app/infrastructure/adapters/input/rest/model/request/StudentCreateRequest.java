package com.services.ms.student.app.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentCreateRequest {

    @NotEmpty(message = "Field first name cannot be empty or null.")
    private String firstname;
    @NotEmpty(message = "Field lastname cannot be empty or null.")
    private String lastname;
    @NotEmpty(message = "Field age cannot be null.")
    private Integer age;
    @NotEmpty(message = "Field address cannot be empty or null.")
    private String address;
}
