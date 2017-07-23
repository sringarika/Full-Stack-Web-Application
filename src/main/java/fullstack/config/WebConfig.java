/**
 * 
 */
package fullstack.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author sringarikapandey
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan({"fullstack"})
public class WebConfig {

}
