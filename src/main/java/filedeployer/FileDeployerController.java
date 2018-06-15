package filedeployer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import filedeployer.services.S3Services;
import filedeployer.services.S3ServicesImpl;

@RestController
public class FileDeployerController {

  @Autowired
  S3Services s3Services;

    @RequestMapping("/deploy/{name}")
    public void deployFiles(@PathVariable("name") String name) {
         s3Services.downloadFile(name);
        return;
    }
}
