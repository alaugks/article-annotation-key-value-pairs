package dev.alaugks.article.annotation_example;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MappingTableTest {

	@Test
	void testMappingTableStringValue() throws NoSuchFieldException {
		Field field = ExampleDto.class.getDeclaredField("myStringFiled");
		field.setAccessible(true);

		MappingTableStringValue annotation = field.getAnnotation(MappingTableStringValue.class);

		Map<String, String> map = Arrays.stream(annotation.items()).collect(
				Collectors.toMap(
						StringValueItem::key,
						StringValueItem::value
				)
		);

		assertEquals(
				new HashMap<>() {{
					put("1", "MALE");
					put("2", "FEMALE");
					put("6", "DIVERS");
				}},
				map
		);
	}

	@Test
	void testMappingTableBooleanValue() throws NoSuchFieldException {
		Field field = ExampleDto.class.getDeclaredField("myBooleanField");
		field.setAccessible(true);

		MappingTableBooleanValue annotation = field.getAnnotation(MappingTableBooleanValue.class);

		Map<String, Boolean> map = Arrays.stream(annotation.items()).collect(
				Collectors.toMap(
						BooleanValueItem::key,
						BooleanValueItem::value
				)
		);

		assertEquals(
				new HashMap<>() {{
					put("1", true);
					put("2", false);
				}},
				map
		);
	}
}

