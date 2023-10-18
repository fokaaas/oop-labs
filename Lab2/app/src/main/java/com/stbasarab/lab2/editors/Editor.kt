package com.stbasarab.lab2.editors

import android.graphics.Canvas
import com.stbasarab.lab2.shapes.Shape

abstract class Editor {

  abstract fun drawLayout(canvas: Canvas, startX: Float, startY: Float, endX: Float, endY: Float)
  abstract fun getShape(canvas: Canvas, startX: Float, startY: Float, endX: Float, endY: Float): Shape

}