package dev.alaugks.article.enum_example;

import java.util.Map;

public enum Maps {

	STRING_VALUE_MAP(Map.of("1", "MALE", "2", "FEMALE", "6", "DIVERS")),
	BOOLEAN_VALUE_MAP(Map.of("1", true, "2", false));

	private final Map<String, Object> map;

	Maps(Map<String, Object> map) {
		this.map = map;
	}

	public Map<String, Object> getMap() {
		return this.map;
	}
}
