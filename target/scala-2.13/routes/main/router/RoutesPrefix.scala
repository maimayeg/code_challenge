// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mai/git/repository/Scout24_code_challenge/conf/routes
// @DATE:Tue Oct 20 11:34:46 CEST 2020


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
