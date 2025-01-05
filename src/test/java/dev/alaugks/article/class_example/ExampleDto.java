package dev.alaugks.article.class_example;

class ExampleDto {
	@MapItems(mapClass = StringValueMap.class)
	public String myStringFiled;

	@MapItems(mapClass = BooleanValueMap.class)
	private Boolean myBooleanField;
}
