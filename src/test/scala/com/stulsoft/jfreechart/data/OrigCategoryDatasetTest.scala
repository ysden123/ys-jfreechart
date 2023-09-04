/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.data

import org.jfree.data.category.DefaultCategoryDataset
import org.scalatest.flatspec.AnyFlatSpec

import scala.runtime.RichDouble


class OrigCategoryDatasetTest extends AnyFlatSpec:
  "CategoryDataset" should "create CategoryDataset" in {
    val dataset = new DefaultCategoryDataset()
    dataset.addValue(15.0, "schools", 1970)
    dataset.addValue(30.0, "schools", 1980)
    dataset.addValue(35.0, "schools", 1982)
    dataset.addValue(40.0, "schools", 1983)
    dataset.addValue(45.0, "schools", 1990)

    println(s"""dataset.getColumnCount=${dataset.getColumnCount}""")
    println(s"""dataset.getRowCount=${dataset.getRowCount}""")
    println(s"""dataset.getValue("schools", 1980)=${dataset.getValue("schools", 1980)}""")

    val ysDataset = new YSCategoryDataset[String, Double]

    ysDataset.addValue(15.0, "schools", 1970)
    ysDataset.addValue(30.0, "schools", 1980)
    ysDataset.addValue(35.0, "schools", 1982)
    ysDataset.addValue(40.0, "schools", 1983)
    ysDataset.addValue(45.0, "schools", 1990)

    val ysDataSetClone = ysDataset.dataset()
    println(s"""ysDataSetClone.getColumnCount=${ysDataSetClone.getColumnCount}""")
    println(s"""ysDataSetClone.getRowCount=${ysDataSetClone.getRowCount}""")
    println(s"""ysDataSetClone.getValue("schools", 1980.0)=${ysDataSetClone.getValue("schools", RichDouble(1980.0))}""")
  }
