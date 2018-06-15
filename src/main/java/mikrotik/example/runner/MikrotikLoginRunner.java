package mikrotik.example.runner;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import me.legrange.mikrotik.ApiConnection;

@Component
@Order(1)
@Slf4j
public class MikrotikLoginRunner extends AbstractMikrotikRunner {

    @Override
    public void run(String... args) throws Exception {
        ApiConnection apiConnection = connect();
        apiConnection.close();
    }
}
