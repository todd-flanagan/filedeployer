package filedeployer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import filedeployer.services.S3Services;
import filedeployer.services.S3ServicesImpl;

@RestController
public class FileDeployerController {

  @Autowired
  S3Services s3Services;

    @RequestMapping("/deploy")
    public void deployFiles(@RequestParam(value="name", defaultValue="World") String name) {
         s3Services.downloadFile("foo.mltbx");
        return;
    }
}
