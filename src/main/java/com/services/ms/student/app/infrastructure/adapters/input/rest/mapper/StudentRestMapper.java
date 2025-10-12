package com.services.ms.student.app.infrastructure.adapters.input.rest.mapper;

import com.services.ms.student.app.domain.model.Student;
import com.services.ms.student.app.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.services.ms.student.app.infrastructure.adapters.input.rest.model.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper {
    // recibes datos del cliente (por ejemplo, en un POST)
    Student toStudent(StudentCreateRequest student);

    // enviar respuestas al cliente
    StudentResponse toStudentResponse(Student student);

    List<StudentResponse> toStundentResponseList(List<Student> studentList);

}
