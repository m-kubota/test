package page

class InsideHomePage {
	
	// pages can define their location, either absolutely or relative to a base
	static url = "http://www.test.inside-games.jp/"

	// “at checkers” allow verifying that the browser is at the expected page
	static at = { title == "最速ゲームニュースや新作情報、レビュー | インサイド" }

//	static content = {
//		// include the previously defined module
//		search { module GoogleSearchModule, buttonValue: "Google Search" }
//	}

}
