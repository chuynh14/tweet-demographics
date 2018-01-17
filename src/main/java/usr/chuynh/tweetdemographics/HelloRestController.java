package usr.chuynh.tweetdemographics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@RequestMapping("/index")
	public String index(){
		return "Initialization";
  }
}
