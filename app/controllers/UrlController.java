package controllers;

import models.Url;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;

/**
 * An example of form processing.
 *
 * https://playframework.com/documentation/latest/JavaForms
 */
@Singleton
public class UrlController extends Controller {

    private final Form<UrlData> form;
    private MessagesApi messagesApi;
    private final List<Url> urls;

    private final Logger logger = LoggerFactory.getLogger(getClass()) ;

    @Inject
    public UrlController(FormFactory formFactory, MessagesApi messagesApi) {
        this.form = formFactory.form(UrlData.class);
        this.messagesApi = messagesApi;
        this.urls = com.google.common.collect.Lists.newArrayList(
                new Url("http://google.com", "Google!", "http://link1.com"),
                new Url("http://yahoo.com", "Yahoo!", "http://link2.com\nhttp://link3.com"),
                new Url("http://msn.com", "MSN!", "no links")
        );
    }

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result listUrls(Http.Request request) {
        return ok(views.html.listUrls.render(asScala(urls), form, request, messagesApi.preferred(request)));
    }

    public Result createUrl(Http.Request request) {
        final Form<UrlData> boundForm = form.bindFromRequest(request);

        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.listUrls.render(asScala(urls), boundForm, request, messagesApi.preferred(request)));
        } else {
            UrlData data = boundForm.get();
            
            urls.add(new Url(data.getUrl(), data.getTitle(), data.getLinks()));
            return redirect(routes.UrlController.listUrls())
                .flashing("info", "URL added!");
        }
    }
}
