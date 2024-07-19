package com.user.modules.profile.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRequest {
    private  Integer id;
    private String name ;

    private String phoneNo ;

    private String email;

}
