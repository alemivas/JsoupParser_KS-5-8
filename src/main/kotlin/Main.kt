package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/" +
            "avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()

    val quotes: Elements = doc.select(".bzpNIu")

    println("Цитаты из произведения \"Автостопом по галактике\" Дугласа Адамса:\n")

    for (quote: Element in quotes)
        println("${quote.text()}\n")

}