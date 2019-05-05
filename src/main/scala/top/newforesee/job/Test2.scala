package top.newforesee.job

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, Dataset, Row, SparkSession}

/**
  * xxx
  * creat by newforesee 2019-01-29
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setAppName("wholeTextFiles").setMaster("local[*]")
    val context = new SparkContext(conf)
    val rdd: RDD[String] = context.textFile("/Users/newforesee/Intellij Project/DMP/src/main/resources/score.txt")
    val rddtuple: RDD[(String, Int)] = rdd.map((x: String) => {
      val strings: Array[String] = x.split(" ")
      (strings(0), strings(1).toInt)
    })
    val grouped: RDD[(String, Iterable[Int])] = rddtuple.groupByKey()
    grouped.map((x: (String, Iterable[Int])) =>{
      
    })


  }

}
