package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    //예제 5.2
    //http://localhost:8080/api/v1/get-api/hello
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String getHello(){
//        return "Hello World";

    //예제 5.3
    //http://localhost:8080/api/v1/get-api/name
//    @GetMapping(value ="/name")
//    public String getName(){
//        return "Flature";

    //예제 5.4
    //http://localhost:8080/api/v1/get-api/variable1/{String 값}
//    @GetMapping(value = "/variable1/{variable}")
//    public String getVariable1(@PathVariable String variable){
//        return variable;

    //예제 5.5
    //http://localhost:8080/api/v1/get-api/variable2/{String 값}
//    @GetMapping(value = "/variable2/{variable}")
//    public String getVariable2(@PathVariable("variable")String var){
//        return var;

    //예제 5.6
    //http://localhost:8080/api/v1/get-api/request1?name=value1&email=value2&organization=value3
//    @GetMapping(value = "/request1")
//    public String getRequestParam1(
//            @RequestParam String name,
//            @RequestParam String email,
//            @RequestParam String organization){
//        return name+" "+email+" "+organization;

    //예제 5.7
    //http://localhost:8080/api/v1/get-api/request2?key1=value1&key2=value2
//    @GetMapping(value = "/request2")
//    public String getRequestParam2(@RequestParam Map<String, String> param) {
//        StringBuilder sb = new StringBuilder();
//        param.entrySet().forEach(map -> {
//            sb.append(map.getKey() + ":" + map.getValue() + "\n");
//        });
//        return sb.toString();
//    }
//}

    //예제 5.9
    // http://localhost:8080/api/v1/get-api/request3?name=value1&email=value2&organization=value3
    @GetMapping(value="/request3")
    public String getRequestParam3(MemberDto memberDto) {
        //return memberDto.getName()+ " " + memberDto.getEmail()+ " " + memberDto.getOrganization();
        return memberDto.toString();
    }
}