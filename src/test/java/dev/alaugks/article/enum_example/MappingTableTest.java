package dev.alaugks.article.enum_example;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class MappingTableTest {

	@Test
	void testEnumConstants() throws NoSuchFieldException {
		Field field = ExampleDto.class.getDeclaredField("myStringField");
		field.setAccessible(true);

		MappingTable annotation = field.getAnnotation(MappingTable.class);

		assertSame(Maps.STRING_VALUE_MAP.getMap(), annotation.map().getMap());
	}
}

