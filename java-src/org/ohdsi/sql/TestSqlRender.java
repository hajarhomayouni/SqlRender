package org.ohdsi.sql;

public class TestSqlRender {

	public static void main(String[] args) {
		String sql = "{TRUE & (FALSE | 1 IN (1,2,3))} ? {correct} : {not correct}";
		sql = SqlRender.renderSql(sql, new String[]{}, new String[]{});
		System.out.println(sql);	
//		String path = "inst/csv/replacementPatterns.csv";
//		String sql = "SELECT @c1 INTO table FROM @c2 WHERE a = 1;";
//		sql = SqlTranslate.translateSql(sql, "sql server", "pdw", null, null, path);
//		System.out.println(sql);		
	}
}
