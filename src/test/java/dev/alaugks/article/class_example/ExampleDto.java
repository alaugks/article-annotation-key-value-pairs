package dev.alaugks.article.class_example;

class ExampleDto {
	@MappingTable(mapClass = StringValueMap.class)
	public String myStringFiled;

	@MappingTable(mapClass = BooleanValueMap.class)
	private Boolean myBooleanField;
}
