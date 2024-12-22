package dev.alaugks.article.class_example;

import java.util.Map;

public class StringValueMap implements MapInterface {

	@Override
	public Map<String, Object> getMap() {

		return Map.of(
				"1", "MALE",
				"2", "FEMALE",
				"6", "DIVERS"
		);
	}
}
