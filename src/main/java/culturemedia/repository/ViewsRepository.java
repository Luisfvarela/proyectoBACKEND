package culturemedia.repository;

import culturemedia.model.VideoView;

import java.util.List;

public interface ViewsRepository {

    void addView(VideoView view);

    List<VideoView> getAllViews();

    List<VideoView> getViewsByUserId(String userId);
}

