package culturemedia.model;

import java.time.LocalDateTime;

public record VideoView(String userFullName, LocalDateTime starPlayingTime,Integer age,Video video) {
}