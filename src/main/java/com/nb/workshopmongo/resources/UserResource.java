package com.nb.workshopmongo.resources;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nb.workshopmongo.domain.User;
import com.nb.workshopmongo.dto.UserDto;
import com.nb.workshopmongo.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<UserDto>> findAll(){

        List<User> list = userService.findAll();
        List<UserDto> listDto = list.stream().map(x-> new UserDto(x)).collect(Collectors.toList());

        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value= "/{id}",method=RequestMethod.GET)
    public ResponseEntity<UserDto> findById(@PathVariable String id){
        User obj = userService.findById(id);
        return ResponseEntity.ok().body(new UserDto(obj));
    }
}
