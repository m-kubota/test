import geb.spock.GebReportingSpec

class InsideMainTest extends GebReportingSpec {
	
	def "Inside�Ńe�X�g"() {
		given: 'inside���J��'
		go "http://www.test.inside-games.jp/"
		
		when:
		//def title = $("title")
		def url = $("link", rel: "canonical").attr("href")
		
		then:
		//title == "�ő��Q�[���j���[�X��V����A���r���[ | �C���T�C�h"
		url == "http://www.inside-games.jp/"

	}

}
