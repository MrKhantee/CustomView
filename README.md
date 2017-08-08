# CustomView
## How to draw a circle in Android (onDraw method in View)

By Alvin Alexander. 
Last updated: July 9 2017
### Android FAQ: How do I draw a circle in Android?

To draw a circle in Android you just need to create your own View class and then use that in your Activity. For example, the following CustomView shows how to extend a View and draw a circle in the onDraw method:

```package com.alvinalexander.circledemo;

    import android.content.Context;
    import android.graphics.Canvas;
    import android.graphics.Color;
    import android.graphics.Paint;
    import android.view.View;

    public class CustomView extends View {
    
        private Paint paint;

        public CustomView(Context context) {
        super(context);

        // create the Paint and set its color        
        paint = new Paint();
        paint.setColor(Color.GRAY);
        }

        @Override
        protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLUE);
        canvas.drawCircle(200, 200, 100, paint);
        }

}
```
Now all you have to do is use this CustomView in your Activity:

''' package com.alvinalexander.circledemo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CustomView(this));
    }

}
'''
If you set this as the main Activity of your Android application and then run it in an emulator, it should look like this:

![](https://github.com/MrKhantee/customview/blob/project/2017_08_08_12.34.12.jpg)

In summary, if you wanted to see how to draw a circle in Android, I hope this example is helpful.
