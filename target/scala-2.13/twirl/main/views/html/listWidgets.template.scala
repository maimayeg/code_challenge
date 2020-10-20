
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

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Widget],Form[WidgetData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(widgets: Seq[Widget], form: Form[WidgetData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
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
            <tr><th>URL</th><th>Visits</th>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(w <- widgets) yield /*18.27*/ {_display_(Seq[Any](format.raw/*18.29*/("""
            """),format.raw/*19.13*/("""<tr><td>"""),_display_(/*19.22*/w/*19.23*/.name),format.raw/*19.28*/("""</td><td>"""),_display_(/*19.38*/w/*19.39*/.price),format.raw/*19.45*/("""</td></tr>
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

    """),_display_(/*35.6*/helper/*35.12*/.form(routes.WidgetController.createWidget)/*35.55*/ {_display_(Seq[Any](format.raw/*35.57*/("""
        """),_display_(/*36.10*/helper/*36.16*/.CSRF.formField),format.raw/*36.31*/("""

        """),_display_(/*38.10*/helper/*38.16*/.inputText(form("url"))),format.raw/*38.39*/("""

        """),_display_(/*40.10*/helper/*40.16*/.inputText(form("name"))),format.raw/*40.40*/("""

        """),_display_(/*42.10*/helper/*42.16*/.inputText(form("price"))),format.raw/*42.41*/("""

        """),format.raw/*44.9*/("""<button type="submit">Send</button>
    """)))}),format.raw/*45.6*/("""

""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[Widget],form:Form[WidgetData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form)(request,messages)

  def f:((Seq[Widget],Form[WidgetData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form) => (request,messages) => apply(widgets,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-20T01:14:47.726923
                  SOURCE: /Users/sal/Desktop/play-samples/play-java-forms-example/app/views/listWidgets.scala.html
                  HASH: c18586dc6b0591dec8205454b59d689fb44db628
                  MATRIX: 610->1|998->31|1195->135|1222->137|1250->157|1289->159|1321->165|1368->220|1399->226|1414->233|1447->258|1508->282|1540->287|1580->300|1605->304|1635->307|1661->312|1703->324|1736->330|1873->440|1906->457|1946->459|1987->472|2023->481|2033->482|2059->487|2096->497|2106->498|2133->504|2184->524|2220->533|2286->632|2318->638|2351->662|2391->664|2428->674|2441->678|2475->703|2562->752|2603->765|2653->788|2667->793|2692->797|2722->800|2736->805|2765->813|2806->826|2853->842|2889->848|2922->855|2937->861|2989->904|3029->906|3066->916|3081->922|3117->937|3155->948|3170->954|3214->977|3252->988|3267->994|3312->1018|3350->1029|3365->1035|3411->1060|3448->1070|3519->1111|3552->1114
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|36->6|38->8|39->9|39->9|39->9|39->9|40->10|40->10|40->10|40->10|40->10|41->11|43->13|48->18|48->18|48->18|49->19|49->19|49->19|49->19|49->19|49->19|49->19|50->20|51->21|56->26|57->27|57->27|57->27|58->28|58->28|58->28|58->28|59->29|60->30|60->30|60->30|60->30|60->30|60->30|61->31|62->32|63->33|65->35|65->35|65->35|65->35|66->36|66->36|66->36|68->38|68->38|68->38|70->40|70->40|70->40|72->42|72->42|72->42|74->44|75->45|77->47
                  -- GENERATED --
              */
          