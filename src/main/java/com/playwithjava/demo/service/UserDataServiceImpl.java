package com.playwithjava.demo.service;

import com.playwithjava.demo.DTO.request.UserDataRequest;
import com.playwithjava.demo.DTO.response.UserDataResponse;
import com.playwithjava.demo.entity.UserDataEntity;
import com.playwithjava.demo.exception.ApiException;
import com.playwithjava.demo.mapper.UserDataMapper;
import com.playwithjava.demo.mapper.UserDataMapperImpl;
import com.playwithjava.demo.repository.UserDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserDataServiceImpl implements UserDataService{

    @Autowired
    UserDataRepository userDataRepository;

    @Autowired
    ModelMapper mapper;

    @Autowired
    UserDataMapper userDataMapper;

    @Override
    public UserDataResponse addUser(UserDataRequest request) {
        log.info("## calling addUser method");
        UserDataEntity response=userDataRepository.save(userDataMapper.mapRequestToEntity(request));
        UserDataResponse userDataResponse=userDataMapper.mapEntityToResponse(response);
        return userDataResponse;
    }

    @Override
    public UserDataResponse getUserByUserId(Long userId) {
        Optional<UserDataEntity> data= userDataRepository.findById(userId);
       if (!data.isPresent())
            throw new ApiException(404,"Entity not found");
        return userDataMapper.mapEntityToResponse(data.get());
    }

    @Override
    public List<UserDataResponse> getAllUsers() {
       return userDataRepository.findAll().parallelStream()
               .map(userDataMapper::mapEntityToResponse)
               .sorted(Comparator.comparing(UserDataResponse::getName))
               .collect(Collectors.toList());
    }
}
