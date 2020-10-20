// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sal/Desktop/play-samples/play-java-forms-example/conf/routes
// @DATE:Tue Oct 20 01:11:54 BST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:12
  class ReverseUrlController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def listUrls(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "urls")
    }
  
    // @LINE:13
    def createUrl(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "urls")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseWidgetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def createWidget(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "widgets")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def listWidgets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "widgets")
    }
  
  }


}
