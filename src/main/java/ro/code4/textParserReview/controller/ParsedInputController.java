package ro.code4.textParserReview.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.code4.textParserReview.service.ParsedInputService;
import ro.code4.textParserReview.transferObjects.ParsedInputTO;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/parsedInput")
public class ParsedInputController {

	@Autowired
	private ParsedInputService parsedInputService;

	@ApiIgnore
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String hello(HttpServletRequest request) {
		return "Greetings from parsedTextReviewer!";
	}

	@RequestMapping(path = "/accept", method = RequestMethod.POST)
	public @ResponseBody String acceptParsedText(@RequestBody ParsedInputTO input) {
		parsedInputService.acceptTextParsing(input);

		return "accepted!";
	}

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public @ResponseBody List<ParsedInputTO> list() {
		return parsedInputService.list();
	}
}
