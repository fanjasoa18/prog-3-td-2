package app.foot.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UpdatePlayerResponse {

    private Integer id;
    private String name;
    private boolean guardian;

}
