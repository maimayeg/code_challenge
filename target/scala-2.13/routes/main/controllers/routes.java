// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sal/Desktop/play-samples/play-java-forms-example/conf/routes
// @DATE:Tue Oct 20 01:11:54 BST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseUrlController UrlController = new controllers.ReverseUrlController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWidgetController WidgetController = new controllers.ReverseWidgetController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseUrlController UrlController = new controllers.javascript.ReverseUrlController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWidgetController WidgetController = new controllers.javascript.ReverseWidgetController(RoutesPrefix.byNamePrefix());
  }

}
