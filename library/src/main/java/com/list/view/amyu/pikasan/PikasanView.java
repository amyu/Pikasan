/*
 * Copyright (C) 2015 Yuki Mima @amyu_san
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.list.view.amyu.pikasan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class PikasanView extends View {

  private Path mPath;

  private Paint mPaint;

  private float mWidth = 0;

  public PikasanView(Context context) {
    this(context, null, 0);
  }

  public PikasanView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public PikasanView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    initView();
  }

  @Override protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    mWidth = w;
    initPoint();
    super.onSizeChanged(w, h, oldw, oldh);
  }

  private void initView() {
    initPath();
    initPaint();
  }

  private void initPath() {
    mPath = new Path();
  }


  private void initPaint() {
    mPaint = new Paint();
    mPaint.setColor(0xffF8C92C);
    mPaint.setStyle(Paint.Style.FILL);
  }

  private void initPoint() {
    mPath.moveTo(0.231f * mWidth, 0.318f * mWidth);
    mPath.cubicTo(
        0.227f * mWidth, 0.148f * mWidth,
        0.302f * mWidth, 0.068f * mWidth,
        0.302f * mWidth, 0.068f * mWidth
    );
    mPath.cubicTo(
        0.302f * mWidth, 0.068f * mWidth,
        0.325f * mWidth, 0.152f * mWidth,
        0.282f * mWidth, 0.281f * mWidth
    );
    mPath.cubicTo(
        0.282f * mWidth, 0.281f * mWidth,
        0.356f * mWidth, 0.248f * mWidth,
        0.43f * mWidth, 0.289f * mWidth
    );
    mPath.cubicTo(
        0.43f * mWidth, 0.289f * mWidth,
        0.553f * mWidth, 0.182f * mWidth,
        0.701f * mWidth, 0.206f * mWidth
    );
    mPath.cubicTo(
        0.701f * mWidth, 0.206f * mWidth,
        0.652f * mWidth, 0.304f * mWidth,
        0.489f * mWidth, 0.34f * mWidth
    );
    mPath.cubicTo(
        0.489f * mWidth, 0.34f * mWidth,
        0.505f * mWidth, 0.374f * mWidth,
        0.508f * mWidth, 0.419f * mWidth
    );
    mPath.cubicTo(
        0.515f * mWidth, 0.511f * mWidth,
        0.64f * mWidth, 0.631f * mWidth,
        0.648f * mWidth, 0.673f * mWidth
    );
    mPath.cubicTo(
        0.648f * mWidth, 0.673f * mWidth,
        0.673f * mWidth, 0.658f * mWidth,
        0.673f * mWidth, 0.658f * mWidth
    );
    mPath.cubicTo(
        0.673f * mWidth, 0.658f * mWidth,
        0.617f * mWidth, 0.593f * mWidth,
        0.617f * mWidth, 0.593f * mWidth
    );
    mPath.cubicTo(
        0.617f * mWidth, 0.593f * mWidth,
        0.681f * mWidth, 0.539f * mWidth,
        0.681f * mWidth, 0.539f * mWidth
    );
    mPath.cubicTo(
        0.681f * mWidth, 0.539f * mWidth,
        0.632f * mWidth, 0.408f * mWidth,
        0.632f * mWidth, 0.408f * mWidth
    );
    mPath.cubicTo(
        0.632f * mWidth, 0.408f * mWidth,
        0.711f * mWidth, 0.278f * mWidth,
        0.843f * mWidth, 0.167f * mWidth
    );
    mPath.cubicTo(
        0.843f * mWidth, 0.167f * mWidth,
        0.879f * mWidth, 0.295f * mWidth,
        0.875f * mWidth, 0.36f * mWidth
    );
    mPath.cubicTo(
        0.875f * mWidth, 0.36f * mWidth,
        0.727f * mWidth, 0.468f * mWidth,
        0.727f * mWidth, 0.468f * mWidth
    );
    mPath.cubicTo(
        0.727f * mWidth, 0.468f * mWidth,
        0.738f * mWidth, 0.56f * mWidth,
        0.738f * mWidth, 0.56f * mWidth
    );
    mPath.cubicTo(
        0.738f * mWidth, 0.56f * mWidth,
        0.683f * mWidth, 0.614f * mWidth,
        0.683f * mWidth, 0.614f * mWidth
    );
    mPath.cubicTo(
        0.683f * mWidth, 0.614f * mWidth,
        0.726f * mWidth, 0.677f * mWidth,
        0.726f * mWidth, 0.677f * mWidth
    );
    mPath.cubicTo(
        0.726f * mWidth, 0.677f * mWidth,
        0.661f * mWidth, 0.71f * mWidth,
        0.661f * mWidth, 0.71f * mWidth
    );
    mPath.cubicTo(
        0.661f * mWidth, 0.71f * mWidth,
        0.692f * mWidth, 0.744f * mWidth,
        0.692f * mWidth, 0.744f * mWidth
    );
    mPath.cubicTo(
        0.692f * mWidth, 0.744f * mWidth,
        0.67f * mWidth, 0.749f * mWidth,
        0.67f * mWidth, 0.749f * mWidth
    );
    mPath.cubicTo(
        0.665f * mWidth, 0.815f * mWidth,
        0.651f * mWidth, 0.827f * mWidth,
        0.651f * mWidth, 0.827f * mWidth
    );
    mPath.cubicTo(
        0.647f * mWidth, 0.875f * mWidth,
        0.66f * mWidth, 0.92f * mWidth,
        0.656f * mWidth, 0.921f * mWidth
    );
    mPath.cubicTo(
        0.654f * mWidth, 0.921f * mWidth,
        0.651f * mWidth, 0.918f * mWidth,
        0.651f * mWidth, 0.918f * mWidth
    );
    mPath.cubicTo(
        0.651f * mWidth, 0.918f * mWidth,
        0.652f * mWidth, 0.927f * mWidth,
        0.651f * mWidth, 0.931f * mWidth
    );
    mPath.cubicTo(
        0.65f * mWidth, 0.934f * mWidth,
        0.641f * mWidth, 0.92f * mWidth,
        0.641f * mWidth, 0.92f * mWidth
    );
    mPath.cubicTo(
        0.641f * mWidth, 0.92f * mWidth,
        0.641f * mWidth, 0.924f * mWidth,
        0.638f * mWidth, 0.924f * mWidth
    );
    mPath.cubicTo(
        0.626f * mWidth, 0.923f * mWidth,
        0.616f * mWidth, 0.887f * mWidth,
        0.61f * mWidth, 0.857f * mWidth
    );
    mPath.cubicTo(
        0.61f * mWidth, 0.857f * mWidth,
        0.595f * mWidth, 0.871f * mWidth,
        0.485f * mWidth, 0.827f * mWidth
    );
    mPath.cubicTo(
        0.485f * mWidth, 0.827f * mWidth,
        0.441f * mWidth, 0.839f * mWidth,
        0.423f * mWidth, 0.849f * mWidth
    );
    mPath.cubicTo(
        0.423f * mWidth, 0.849f * mWidth,
        0.418f * mWidth, 0.9f * mWidth,
        0.413f * mWidth, 0.908f * mWidth
    );
    mPath.cubicTo(
        0.412f * mWidth, 0.911f * mWidth,
        0.408f * mWidth, 0.901f * mWidth,
        0.407f * mWidth, 0.904f * mWidth
    );
    mPath.cubicTo(
        0.406f * mWidth, 0.907f * mWidth,
        0.407f * mWidth, 0.912f * mWidth,
        0.405f * mWidth, 0.912f * mWidth
    );
    mPath.cubicTo(
        0.404f * mWidth, 0.912f * mWidth,
        0.4f * mWidth, 0.908f * mWidth,
        0.399f * mWidth, 0.905f * mWidth
    );
    mPath.cubicTo(
        0.398f * mWidth, 0.903f * mWidth,
        0.396f * mWidth, 0.91f * mWidth,
        0.394f * mWidth, 0.909f * mWidth
    );
    mPath.cubicTo(
        0.384f * mWidth, 0.898f * mWidth,
        0.381f * mWidth, 0.858f * mWidth,
        0.381f * mWidth, 0.858f * mWidth
    );
    mPath.cubicTo(
        0.293f * mWidth, 0.841f * mWidth,
        0.321f * mWidth, 0.75f * mWidth,
        0.307f * mWidth, 0.674f * mWidth
    );
    mPath.cubicTo(
        0.307f * mWidth, 0.674f * mWidth,
        0.216f * mWidth, 0.676f * mWidth,
        0.151f * mWidth, 0.643f * mWidth
    );
    mPath.cubicTo(
        0.151f * mWidth, 0.643f * mWidth,
        0.135f * mWidth, 0.643f * mWidth,
        0.135f * mWidth, 0.643f * mWidth
    );
    mPath.cubicTo(
        0.135f * mWidth, 0.643f * mWidth,
        0.139f * mWidth, 0.63f * mWidth,
        0.139f * mWidth, 0.63f * mWidth
    );
    mPath.cubicTo(
        0.139f * mWidth, 0.63f * mWidth,
        0.129f * mWidth, 0.623f * mWidth,
        0.129f * mWidth, 0.623f * mWidth
    );
    mPath.cubicTo(
        0.129f * mWidth, 0.623f * mWidth,
        0.135f * mWidth, 0.613f * mWidth,
        0.135f * mWidth, 0.613f * mWidth
    );
    mPath.cubicTo(
        0.135f * mWidth, 0.613f * mWidth,
        0.124f * mWidth, 0.599f * mWidth,
        0.124f * mWidth, 0.599f * mWidth
    );
    mPath.cubicTo(
        0.124f * mWidth, 0.599f * mWidth,
        0.139f * mWidth, 0.589f * mWidth,
        0.139f * mWidth, 0.589f * mWidth
    );
    mPath.cubicTo(
        0.139f * mWidth, 0.589f * mWidth,
        0.132f * mWidth, 0.572f * mWidth,
        0.132f * mWidth, 0.572f * mWidth
    );
    mPath.cubicTo(
        0.132f * mWidth, 0.572f * mWidth,
        0.145f * mWidth, 0.575f * mWidth,
        0.149f * mWidth, 0.572f * mWidth
    );
    mPath.cubicTo(
        0.173f * mWidth, 0.555f * mWidth,
        0.219f * mWidth, 0.538f * mWidth,
        0.231f * mWidth, 0.538f * mWidth
    );
    mPath.cubicTo(
        0.231f * mWidth, 0.538f * mWidth,
        0.188f * mWidth, 0.495f * mWidth,
        0.185f * mWidth, 0.455f * mWidth
    );
    mPath.cubicTo(
        0.184f * mWidth, 0.436f * mWidth,
        0.195f * mWidth, 0.429f * mWidth,
        0.205f * mWidth, 0.396f * mWidth
    );
    mPath.cubicTo(
        0.211f * mWidth, 0.378f * mWidth,
        0.208f * mWidth, 0.367f * mWidth,
        0.215f * mWidth, 0.349f * mWidth
    );
    mPath.cubicTo(
        0.219f * mWidth, 0.335f * mWidth,
        0.228f * mWidth, 0.321f * mWidth,
        0.231f * mWidth, 0.318f * mWidth
    );
  }

  @Override protected void onDraw(Canvas canvas) {
    canvas.drawPath(mPath,mPaint);
  }
}
