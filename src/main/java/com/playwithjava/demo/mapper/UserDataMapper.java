package com.playwithjava.demo.mapper;

import com.playwithjava.demo.DTO.request.UserDataRequest;
import com.playwithjava.demo.DTO.response.UserDataResponse;
import com.playwithjava.demo.entity.UserDataEntity;

public interface UserDataMapper {
    UserDataEntity mapRequestToEntity(UserDataRequest request);
    UserDataResponse mapEntityToResponse(UserDataEntity entity);
}
