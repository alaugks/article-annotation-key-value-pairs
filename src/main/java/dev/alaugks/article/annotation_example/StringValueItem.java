package dev.alaugks.article.annotation_example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface StringValueItem {
	String key();

	String value();
}
