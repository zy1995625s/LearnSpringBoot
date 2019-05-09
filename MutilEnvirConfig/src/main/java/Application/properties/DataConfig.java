package Application.properties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "com.exam")
public class DataConfig {
    private String type;

    @Override
    public String toString() {
        return "DataConfig{" +
                "type='" + type + '\'' +
                '}';
    }
}
