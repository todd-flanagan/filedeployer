package filedeployer.storage;

import org.springframework.core.io.Resource;

import java.io.InputStream;

public interface StorageService {

    void init();

    void store(InputStream stream, String filename);

    void deleteAll();

}
