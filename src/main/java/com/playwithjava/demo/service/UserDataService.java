package com.playwithjava.demo.service;

import com.playwithjava.demo.DTO.request.UserDataRequest;
import com.playwithjava.demo.DTO.response.UserDataResponse;

import java.util.List;

public interface UserDataService {

    public UserDataResponse addUser(UserDataRequest request);
    public UserDataResponse getUserByUserId(Long userId);
    public List<UserDataResponse> getAllUsers();
}
