package com.ChallengeSpring.HelloImTheDoctor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.ResponseBody;
//j'ai commenté ces 2 imports car le @RestController inclut le COntrollet et le ResponseBody

@RestController
public class DoctorController {

  @GetMapping("/doctor/1")
  public String getFirstDoctor() {
    return "William Hartnell";
  }

  @GetMapping("/doctor/2")
  public String getSecondDoctor() {
    return "David Tennant";
  }

  @GetMapping("/doctor/3")
  public String getThirdDoctor() {
    return "Jodie Whittaker";
  }
}