package controllers;

import java.io.IOException; 
import play.data.validation.Constraints;
import org.jsoup.Connection.Method.*;
import org.jsoup.Connection.Response;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document; 
import org.jsoup.nodes.Element; 
import org.jsoup.select.Elements; 

public class UrlData {

    @Constraints.Required
    private String url;

    private String title;
    private Document doc;
    private String links;


    public UrlData() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    //URL is passed from from and then used Jsoup to connect it and set the title as well
    public void callUrl(String url) {
        try {
            this.doc = Jsoup.connect(url).get();
            setTitle(this.doc.title());
            getLinks();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

    //We check if it's not resolved, still doesn't work perfectly
    public String callLink(String url) {
        try {
            Document link = new Document("");
            if(url.startsWith("/")) {
                link = Jsoup.connect(this.url + url).get();
                System.out.println("************");
                System.out.println(this.url + url);
            } else {
                link = Jsoup.connect(url).get();
            }
        } catch (IOException e) {
            System.out.println("ERROR");
        }
        return "*RESOLVED*";
    }

    public String getTitle() {
        callUrl(this.url);
        return this.title;
    }

    //get all links from the loaded documents and return then as one text and check also if they're resolved or not
    public String getLinks() {
        Elements links = this.doc.select("a[href]");
        int length = links.size();
        String urls = "";

        for (int i = 0; i < length+1; i++) {
            String linkHref = links.eq(i).attr("href");
            String status = "*UNRESOLVABLE!*";
            if (linkHref.startsWith("http")) {
                urls += linkHref + callLink(linkHref) + "\n";
            } else {
                urls += linkHref + " " + status + "\n" ;
            }
        }
        this.links = urls;
        return urls;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLinks(String links) {
        this.links = links;
    }

}
