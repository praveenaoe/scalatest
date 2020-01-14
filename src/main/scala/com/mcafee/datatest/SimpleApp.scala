package com.mcafee.datatest

import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]): Unit = {
    val mysession = SparkSession.builder.appName("Simple Application").getOrCreate()
    val data = mysession.read.csv("file:///home/praveen/dev/housedata/test.csv")
    data.show()

    mysession.stop()
  }

}
