package com.example.template.mapper;
import com.example.template.dto.UserRequest;
import com.example.template.dto.UserResponse;
import com.example.template.entity.User;
import org.mapstruct.*;
@Mapper(componentModel="spring")
public interface UserMapper {
 User toEntity(UserRequest request);
 UserResponse toResponse(User entity);
 void updateEntityFromRequest(UserRequest request, @MappingTarget User entity);
}