package filedeployer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDeployerController {



    @RequestMapping("/deploy")
    public String deployFiles(@RequestParam(value="name", defaultValue="World") String name) {
        return "foo";
    }
}
