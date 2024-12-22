package dev.alaugks.article.annotation_example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface BooleanValueItem {
	String key();

	boolean value();
}
