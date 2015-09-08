import geb.spock.GebReportingSpec

class InsideMainTest extends GebReportingSpec {
	
	def "Insideでテスト"() {
		given: 'insideを開く'
		go "http://www.test.inside-games.jp/"
		
		when:
		//def title = $("title")
		def url = $("link", rel: "canonical").attr("href")
		
		then:
		//title == "最速ゲームニュースや新作情報、レビュー | インサイド"
		url == "http://www.inside-games.jp/"

	}

}
