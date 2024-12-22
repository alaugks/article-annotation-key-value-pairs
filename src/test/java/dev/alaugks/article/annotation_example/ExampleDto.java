package dev.alaugks.article.annotation_example;

class ExampleDto {
	@MappingTableStringValue(items = {
			@StringValueItem(key = "1", value = "MALE"),
			@StringValueItem(key = "2", value = "FEMALE"),
			@StringValueItem(key = "6", value = "DIVERS")
	})
	public String myStringFiled;

	@MappingTableBooleanValue(items = {
			@BooleanValueItem(key = "1", value = true),
			@BooleanValueItem(key = "2", value = false),
	})
	private Boolean myBooleanField;
}
