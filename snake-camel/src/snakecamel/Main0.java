package snakecamel;

public class Main0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				SnakeCamelUtil sc = new SnakeCamelUtil();
				System.out.println(sc.capitalize(""));
				System.out.println(sc.capitalize("a"));
				System.out.println(sc.capitalize("xyz"));
				System.out.println(sc.uncapitalize(""));
				System.out.println(sc.uncapitalize("A"));
				System.out.println(sc.uncapitalize("Xyz"));
				System.out.println(sc.snakeToCamelcase("abc"));
				System.out.println(sc.snakeToCamelcase("abc_def"));
				System.out.println(sc.snakeToCamelcase("abc_def_gh"));
				System.out.println(sc.snakeToCamelcase("abc__def___gh"));
				System.out.println(sc.snakeToCamelcase("_abc_def__"));
				System.out.println(sc.camelToSnakecase("Abc"));
				System.out.println(sc.camelToSnakecase("AbcDef"));
				System.out.println(sc.camelToSnakecase("AbcDefGh"));

	}

}
