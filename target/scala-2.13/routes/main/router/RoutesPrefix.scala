// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sal/Desktop/play-samples/play-java-forms-example/conf/routes
// @DATE:Tue Oct 20 01:11:54 BST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
