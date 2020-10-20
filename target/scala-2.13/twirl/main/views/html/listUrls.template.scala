
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import play.mvc.Http.Request

object listUrls extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Url],Form[UrlData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(urls: Seq[Url], form: Form[UrlData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Url Analysis")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""

    """),format.raw/*6.5*/("""<h1>URLS:</h1>

    """),format.raw/*8.40*/("""
    """),_display_(/*9.6*/request/*9.13*/.flash.asScala().data.map/*9.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*9.62*/("""
    """),format.raw/*10.5*/("""<div class=""""),_display_(/*10.18*/name),format.raw/*10.22*/("""">"""),_display_(/*10.25*/value),format.raw/*10.30*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<table>
        <thead>
            <tr><th>URL</th><th>Title</th><th>Links</th>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(w <- urls) yield /*18.24*/ {_display_(Seq[Any](format.raw/*18.26*/("""
            """),format.raw/*19.13*/("""<tr><td>"""),_display_(/*19.22*/w/*19.23*/.url),format.raw/*19.27*/("""</td><td>"""),_display_(/*19.37*/w/*19.38*/.title),format.raw/*19.44*/("""</td><td>"""),_display_(/*19.54*/w/*19.55*/.links),format.raw/*19.61*/("""</td></tr>
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*26.66*/("""
    """),_display_(/*27.6*/if(form.hasGlobalErrors)/*27.30*/ {_display_(Seq[Any](format.raw/*27.32*/("""
        """),_display_(/*28.10*/form/*28.14*/.globalErrors.asScala.map/*28.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*28.88*/("""
            """),format.raw/*29.13*/("""<div>
                """),_display_(/*30.18*/error/*30.23*/.key),format.raw/*30.27*/(""": """),_display_(/*30.30*/error/*30.35*/.message),format.raw/*30.43*/("""
            """),format.raw/*31.13*/("""</div>
        """)))}),format.raw/*32.10*/("""
    """)))}),format.raw/*33.6*/("""

    """),_display_(/*35.6*/helper/*35.12*/.form(routes.UrlController.createUrl)/*35.49*/ {_display_(Seq[Any](format.raw/*35.51*/("""
        """),_display_(/*36.10*/helper/*36.16*/.CSRF.formField),format.raw/*36.31*/("""

        """),_display_(/*38.10*/helper/*38.16*/.inputText(form("url"))),format.raw/*38.39*/("""

        """),format.raw/*40.9*/("""<button type="submit">Send</button>
    """)))}),format.raw/*41.6*/("""

""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(urls:Seq[Url],form:Form[UrlData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(urls,form)(request,messages)

  def f:((Seq[Url],Form[UrlData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (urls,form) => (request,messages) => apply(urls,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-20T11:34:46.300951
                  SOURCE: /home/mai/git/repository/Scout24_code_challenge/app/views/listUrls.scala.html
                  HASH: 283e688c2d0f31ff3982d767081a41355e45bb70
                  MATRIX: 610->1|989->31|1177->126|1204->128|1232->148|1271->150|1303->156|1350->211|1381->217|1396->224|1429->249|1490->273|1522->278|1562->291|1587->295|1617->298|1643->303|1685->315|1718->321|1868->444|1898->458|1938->460|1979->473|2015->482|2025->483|2050->487|2087->497|2097->498|2124->504|2161->514|2171->515|2198->521|2249->541|2285->550|2351->649|2383->655|2416->679|2456->681|2493->691|2506->695|2540->720|2627->769|2668->782|2718->805|2732->810|2757->814|2787->817|2801->822|2830->830|2871->843|2918->859|2954->865|2987->872|3002->878|3048->915|3088->917|3125->927|3140->933|3176->948|3214->959|3229->965|3273->988|3310->998|3381->1039|3414->1042
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|36->6|38->8|39->9|39->9|39->9|39->9|40->10|40->10|40->10|40->10|40->10|41->11|43->13|48->18|48->18|48->18|49->19|49->19|49->19|49->19|49->19|49->19|49->19|49->19|49->19|49->19|50->20|51->21|56->26|57->27|57->27|57->27|58->28|58->28|58->28|58->28|59->29|60->30|60->30|60->30|60->30|60->30|60->30|61->31|62->32|63->33|65->35|65->35|65->35|65->35|66->36|66->36|66->36|68->38|68->38|68->38|70->40|71->41|73->43
                  -- GENERATED --
              */
          