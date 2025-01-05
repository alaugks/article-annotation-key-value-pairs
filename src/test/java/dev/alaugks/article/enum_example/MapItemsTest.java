package dev.alaugks.article.enum_example;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class MapItemsTest {

	@Test
	void testEnumConstants() throws NoSuchFieldException {
		Field field = ExampleDto.class.getDeclaredField("myStringField");
		field.setAccessible(true);

		MapItems annotation = field.getAnnotation(MapItems.class);

		assertSame(Maps.STRING_VALUE_MAP.getMap(), annotation.map().getMap());
	}
}

