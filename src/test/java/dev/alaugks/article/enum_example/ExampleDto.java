package dev.alaugks.article.enum_example;

class ExampleDto {
	@MapItems(map = Maps.STRING_VALUE_MAP)
	public String myStringField;

	@MapItems(map = Maps.BOOLEAN_VALUE_MAP)
	private Boolean myBooleanField;
}
