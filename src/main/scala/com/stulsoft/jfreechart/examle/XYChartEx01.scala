/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.examle

import com.stulsoft.jfreechart.data.{YSXYSeries, YSXYSeriesCollection}
import com.stulsoft.jfreechart.panel.XYSeriesPanel
import org.jfree.data.xy.XYDataset

import java.awt.Dimension
import scala.swing.{Frame, MainFrame, SimpleSwingApplication}

object XYChartEx01 extends SimpleSwingApplication:

  private def buildData(): XYDataset =
    val firefox = YSXYSeries("Firefox")
    firefox.add(1.0, 1.0)
    firefox.add(2.0, 4.0)
    firefox.add(3.0, 3.0)

    val chrome = YSXYSeries("Chrome")
    chrome.add(1.0, 4.0)
    chrome.add(2.0, 5.0)
    chrome.add(3.0, 6.0)

    val ieexplorer = YSXYSeries("InternetExplorer")
    ieexplorer.add(3.0, 4.0)
    ieexplorer.add(4.0, 5.0)
    ieexplorer.add(5.0, 6.0)

    val collection = YSXYSeriesCollection()
    collection.addSeries(chrome)
    collection.addSeries(firefox)
    collection.addSeries(ieexplorer)
    collection.dataset()

  override def top: Frame = new MainFrame:
    title = "XYChartEx01"
    contents = XYSeriesPanel(
      "Browser Usage Statistics",
      "Category",
      "Score",
      buildData()
    )
    size = new Dimension(600, 500)
    centerOnScreen()
end XYChartEx01


