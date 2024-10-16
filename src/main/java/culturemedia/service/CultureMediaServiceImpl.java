package culturemedia.service;

import culturemedia.model.Video;

import java.util.ArrayList;
import java.util.List;

public class CultureMediaServiceImpl implements CultureMediaService {
    private final List<Video> videos = new ArrayList<>();

    @Override
    public void addVideo(Video video) {
        videos.add(video);
    }

    @Override
    public List<Video> getAllVideos() {
        return new ArrayList<>(videos); // Return a copy of the list to prevent modification outside the class
    }

    @Override
    public Video getVideoById(int id) {
        for (Video video : videos) {
            if (video.getId() == id) {
                return video;
            }
        }
        return null; // Return null if video not found
    }

    @Override
    public void deleteVideo(int id) {
        videos.removeIf(video -> video.getId() == id);
    }
}

