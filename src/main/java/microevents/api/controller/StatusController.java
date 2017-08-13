package microevents.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusController {

	public static final String FORMAT = "yyyy-MM-dd HH:mm";
	
	@Value("${application.name}")
	private String applicationName;

	@Value("${build.version}")
	private String buildVersion;

	@Value("${build.timestamp}")
	private String buildTimestamp;

	private String startTimestamp;
	
	@PostConstruct
	public void init() {
		
		SimpleDateFormat format = new SimpleDateFormat(FORMAT);
		this.startTimestamp = format.format(new Date());
		
	}
	
	@RequestMapping("/status")
	public @ResponseBody Status status(Model model) {
		return Status.newInstance()
				.setStatus("UP")
				.setVersion(buildVersion)
				.setBuildTimestamp(buildTimestamp)
				.setStartTimestamp(startTimestamp);
	}

	
	
}