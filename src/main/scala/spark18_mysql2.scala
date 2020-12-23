package com.atguigu.bigdata.spark.core.wc.wc.spark

import org.apache.spark.sql.SparkSession

class spark18_mysql2 {
	def spark_sql(gender:String, genres:String): Unit = {
//		val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")
//		val spark = new SparkContext(config)
//		Logger.getLogger("org").setLevel(Level.ERROR)
		val Array(first, two) = args
		val spark = SparkSession.builder().appName("MysqlQueryDemo").master("local").getOrCreate()
		val sql = "select article,username from article where article_id > 10"
		val jdbcDF = spark.read.format("jdbc").
				option("url", "jdbc:mysql://127.0.0.1:3306/movie?serverTimezone=GMT").//?useUnicode=true&characterEncoding=utf-8
				option("driver", "com.mysql.jdbc.Driver").
				option("user", "etroot").
				option("password", "etroot123")

		val movies_item = jdbcDF.option("dbtable","movie").load()
		val rating_item = jdbcDF.option("dbtable","rating").load()
		val users_item = jdbcDF.option("dbtable","users").load()


		movies_item.createTempView("movie")
		rating_item.createTempView("rating")
		users_item.createTempView("users")
		var sql_string = "select movie.genres,users.gender,rating.rating " +
				"from movie,users,rating " +
				s"where users.gender = $gender " +
				s"and movie.genres like '%$genres%'" +
				"and users.userId = rating.userId " +
				"and movie.movieId = rating.movieId"
		spark.sql(sql_string).show()
//		sql_string.foreach(print)
//		spark.sql("select movies.genres from movies").show()
//		jdbcDF.show()
	}
}
