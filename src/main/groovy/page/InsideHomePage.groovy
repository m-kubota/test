package page

class InsideHomePage {
	
	// pages can define their location, either absolutely or relative to a base
	static url = "http://www.test.inside-games.jp/"

	// �gat checkers�h allow verifying that the browser is at the expected page
	static at = { title == "�ő��Q�[���j���[�X��V����A���r���[ | �C���T�C�h" }

//	static content = {
//		// include the previously defined module
//		search { module GoogleSearchModule, buttonValue: "Google Search" }
//	}

}
