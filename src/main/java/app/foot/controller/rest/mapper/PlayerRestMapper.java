package app.foot.controller.rest.mapper;

import app.foot.controller.response.UpdatePlayerResponse;
import app.foot.controller.rest.Player;
import app.foot.repository.entity.PlayerEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerRestMapper {
    public Player toRest(app.foot.model.Player domain) {
        return Player.builder()
                .id(domain.getId())
                .name(domain.getName())
                .isGuardian(domain.getIsGuardian())
                .teamName(domain.getTeamName())
                .build();
    }

    public app.foot.model.Player toDomain(Player rest) {
        return app.foot.model.Player.builder()
                .id(rest.getId())
                .isGuardian(rest.getIsGuardian())
                .name(rest.getName())
                .teamName(rest.getTeamName())
                .build();
    }

    public app.foot.model.Player toEntity(UpdatePlayerResponse rest) {
        return app.foot.model.Player.builder()
                .id(rest.getId())
                .name(rest.getName())
                .isGuardian(rest.isGuardian())
                .build();
    }
}
