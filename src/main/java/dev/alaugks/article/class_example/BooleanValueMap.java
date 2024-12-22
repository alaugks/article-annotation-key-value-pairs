package dev.alaugks.article.class_example;

import java.util.Map;

public class BooleanValueMap implements MapInterface {

	@Override
	public Map<String, Object> getMap() {

		return Map.of(
				"1", true,
				"2", false
		);
	}
}
