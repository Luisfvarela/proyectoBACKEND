package culturemedia.model;

public class Video {

    private int id;          // Atributo privado para el ID
    private String title;
    private String description;

    // Constructor
    public Video(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Método getter para obtener el ID
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
