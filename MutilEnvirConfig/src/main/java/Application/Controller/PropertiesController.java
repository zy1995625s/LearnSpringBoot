package Application.Controller;

import Application.properties.DataConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class PropertiesController {
    private final DataConfig dataConfig;

    @Autowired
    public PropertiesController(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    @RequestMapping("/1")
    public String toShowDataConfig(){
        return dataConfig.toString();
    }
}
