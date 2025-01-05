package dev.alaugks.article.class_example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapItemsTest {

	@Test
	void testMapClass() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Field field = ExampleDto.class.getDeclaredField("myStringFiled");
		field.setAccessible(true);

		MapItems annotation = field.getAnnotation(MapItems.class);

		assertEquals(
				new StringValueMap().getMap(),
				annotation.mapClass()
						.getDeclaredConstructor()
						.newInstance()
						.getMap()
		);
	}
}

