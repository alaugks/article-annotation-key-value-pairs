package dev.alaugks.article.enum_example;

class ExampleDto {
	@MappingTable(map = Maps.STRING_VALUE_MAP)
	public String myStringField;

	@MappingTable(map = Maps.BOOLEAN_VALUE_MAP)
	private Boolean myBooleanField;
}
