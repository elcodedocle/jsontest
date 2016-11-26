package com.elcodedocle.jsontest;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {

	private final static Logger log = LoggerFactory.getLogger(JsonTest.class);
	
	public static App buildAppInfo(String category, String title, String description, String developer,
			String packageName, String iconImageUrl, String bgImageUrl) {
		App app = new App();
		app.setId(App.getCount());
		App.incCount();
		app.setTitle(title);
		app.setDescription(description);
		app.setDeveloper(developer);
		app.setCategory(category);
		app.setIconImageUrl(iconImageUrl);
		app.setBgImageUrl(bgImageUrl);
		app.setPackageName(packageName);
		return app;
	}

	public static JSONArray parseJsonFromUrl(String uri) throws IOException, JSONException {
		JSONArray array = null;
		try (Scanner sn = new Scanner(new URL(uri).openStream(), "UTF-8")) {
			array = new JSONArray(sn.useDelimiter("\\A").next());
		}
		return array;
	}

	public static List<App> getAppList(JSONArray array) {
		List<App> appList = new ArrayList<>();
		for (int i = 0; i < array.length(); i++) {
			JSONObject object = array.getJSONObject(i);
			appList.add(buildAppInfo(object.getString("category"), object.getString("title"), object.getString("description"),
					object.getString("developer"), object.getString("packageName"), object.getString("iconImageUrl"),
					object.getString("bgImageUrl")));
		}
		return appList;
	}

	public static void main(String[] args) throws JSONException, IOException {
		List<App> list = JsonTest.getAppList(JsonTest.parseJsonFromUrl("http://localhost:8080/apps"));
		ObjectMapper mapper = new ObjectMapper();
		for (int i=0;i<list.size();i++){ 
			log.debug(mapper.writeValueAsString(list.get(i)));
		}
	}

}
