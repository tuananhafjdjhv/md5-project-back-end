package ra.securities.dto.requset;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpForm {
    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String avatar;
    private Set<String> roles;
}
