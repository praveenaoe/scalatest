package com.praveen.datatest

import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]): Unit = {
    val mission = SparkSession.builder.appName("Simple Application").master("local").getOrCreate()
    val data = mission.read.option("header","true").csv("file:///home/praveen/dev/housedata/test.csv")
    data.show()
    mission.stop()
  }

}
