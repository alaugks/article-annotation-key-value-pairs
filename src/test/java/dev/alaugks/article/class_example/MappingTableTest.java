package dev.alaugks.article.class_example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MappingTableTest {

	@Test
	void testMapClass() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Field field = ExampleDto.class.getDeclaredField("myStringFiled");
		field.setAccessible(true);

		MappingTable annotation = field.getAnnotation(MappingTable.class);

		assertEquals(
				new StringValueMap().getMap(),
				annotation.mapClass()
						.getDeclaredConstructor()
						.newInstance()
						.getMap()
		);
	}
}

