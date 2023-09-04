/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.examle

import com.stulsoft.jfreechart.data.YSCategoryDataset
import com.stulsoft.jfreechart.panel.CategoryPanel

import java.awt.Dimension
import scala.swing.*

object LineChartEx02 extends SimpleSwingApplication:
  private def buildData(): YSCategoryDataset[Int, Int] =
    val dataset = new YSCategoryDataset[Int, Int]
    dataset.addValue(15.0, 1, 1970)
    dataset.addValue(30.0, 1, 1980)
    dataset.addValue(35.0, 1, 1982)
    dataset.addValue(40.0, 1, 1983)
    dataset.addValue(45.0, 1, 1990)
    dataset

  override def top: Frame = new MainFrame:
    contents = CategoryPanel[Int, Int](
      "The chart title",
      "Years",
      "Number2",
      buildData()
    )
    size = new Dimension(600, 500)
    centerOnScreen()