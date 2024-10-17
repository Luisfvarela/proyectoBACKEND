package culturemedia.service;

import culturemedia.model.Video;
import java.util.ArrayList;
import java.util.List;

public abstract class CulturotecaServiceImpl implements CulturotecaService {

    // Lista para almacenar videos
    private List<Video> videoList = new ArrayList<>();

    // Implementación del método para agregar un video
    @Override
    public void addVideo(Video video) {
        videoList.add(video);
    }

    // Implementación del método para obtener todos los videos
    @Override
    public List<Video> getAllVideos() {
        return videoList;
    }

    // Implementación del método para obtener un video por su ID
    @Override
    public Video getVideoById(int id) {
        for (Video video : videoList) {
            if (video.getId() == id) {
                return video;
            }
        }
        return null; // Retorna null si no se encuentra el video
    }
}
