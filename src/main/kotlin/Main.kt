package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

//    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    println(doc.title())

//    println(doc.select("#mp-itn b a"))
    println(doc.select(".cOOA-do .bzpNIu").text())

}

//Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
//log(doc.title());
//Elements newsHeadlines = doc.select("#mp-itn b a");
//for (Element headline : newsHeadlines) {
//    log("%s\n\t%s",
//        headline.attr("title"), headline.absUrl("href"));
//}