package chess.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private String name;
    private Color color;
}
