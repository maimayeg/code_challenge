package models;

/**
 * Presentation object used for displaying data in a template.
 *
 * Note that it's a good practice to keep the presentation DTO,
 * which are used for reads, distinct from the form processing DTO,
 * which are used for writes.
 */
public class Url {
    public String url;
    public String title;
    public String links;

    public Url(String url, String title, String links) {
        this.url = url;
        this.title = title;
        this.links = links;
    }
}
