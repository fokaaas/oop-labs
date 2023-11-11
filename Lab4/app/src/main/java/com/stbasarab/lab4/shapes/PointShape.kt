package com.stbasarab.lab4.shapes

import android.graphics.Canvas

class PointShape(borderColor: Int, fillColor: Int): Shape(borderColor, fillColor) {
  override fun draw(canvas: Canvas) {
    setStrokeStyle()
    canvas.drawPoint(endX, endY, paint)
  }

  override fun drawFrame(canvas: Canvas) {
    setFrameMode()
  }
}