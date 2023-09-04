/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.examle

import com.stulsoft.jfreechart.data.YSCategoryDataset
import com.stulsoft.jfreechart.panel.CategoryPanel

import java.awt.Dimension
import scala.swing.*

object LineChartEx01_01 extends SimpleSwingApplication:
  private def buildData(): YSCategoryDataset[String, Double] =
    //    val dataset = new DefaultCategoryDataset()
    val dataset = new YSCategoryDataset[String, Double]()
    dataset.addValue(15.0, "schools", 1970)
    dataset.addValue(35.0, "schools", 1982)
    dataset.addValue(40.0, "schools", 1983)
    dataset.addValue(30.0, "schools", 1980)
    dataset.addValue(45.0, "schools", 1990)
    dataset

  override def top: Frame = new MainFrame:
    contents = CategoryPanel[String, Double](
      "The chart title",
      "Years",
      "Number of schools",
      buildData()
    )
    size = new Dimension(600, 500)
    centerOnScreen()