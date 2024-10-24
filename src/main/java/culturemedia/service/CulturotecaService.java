package culturemedia.service;

import culturemedia.model.Video;

import java.util.List;

public interface CulturotecaService {
    void addVideo(Video video);
    List<Video> getAllVideos();
    Video getVideoById(int id);
    void deleteVideo(int id);
}
