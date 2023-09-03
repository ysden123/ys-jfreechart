/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.examle

import com.stulsoft.jfreechart.data.YSCategoryDataset
import org.jfree.chart.plot.PlotOrientation
import org.jfree.chart.{ChartFactory, ChartPanel, JFreeChart}
import org.jfree.data.category.CategoryDataset

import java.awt.Dimension
import scala.swing.*

class MyPanel() extends Panel:
  private val lineChart: JFreeChart = ChartFactory.createLineChart(
    "The chart title",
    "Years",
    "Number of schools",
    buildData(),
    PlotOrientation.VERTICAL,
    true,
    true,
    false
  )

  private val chartPanel = new ChartPanel(lineChart)
  chartPanel.setPreferredSize(Dimension(560, 367))
  chartPanel.setBounds(0, 0, 560, 367)


  private def buildData(): CategoryDataset =
    //    val dataset = new DefaultCategoryDataset()
    val dataset = new YSCategoryDataset
    dataset.addValue(15.0, "schools", 1970)
    dataset.addValue(30.0, "schools", 1980)
    dataset.addValue(35.0, "schools", 1982)
    dataset.addValue(40.0, "schools", 1983)
    dataset.addValue(45.0, "schools", 1990)
    dataset.dataset()

  override def paint(g: Graphics2D): Unit =
    chartPanel.setBounds(bounds.x, bounds.y, bounds.width, bounds.height)
    chartPanel.paintComponent(g)

object LineChartEx01 extends SimpleSwingApplication:

  override def top: Frame = new MainFrame:
    contents = MyPanel()
    size = new Dimension(600, 500)
    centerOnScreen()