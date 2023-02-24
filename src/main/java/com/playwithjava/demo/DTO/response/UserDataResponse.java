package com.playwithjava.demo.DTO.response;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ToString
public class UserDataResponse {

    private String name;
    private String email;
}
