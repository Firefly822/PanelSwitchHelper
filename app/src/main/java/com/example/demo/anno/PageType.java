package com.example.demo.anno;


import android.support.annotation.IntDef;

import static com.example.demo.anno.PageType.DEFAULT;
import static com.example.demo.anno.PageType.COLOR_STATUS_BAR;
import static com.example.demo.anno.PageType.TOOLBAR;
import static com.example.demo.anno.PageType.TRANSPARENT_STATUS_BAR;
import static com.example.demo.anno.PageType.TRANSPARENT_STATUS_BAR_DRAW_UNDER;
import static com.example.demo.anno.PageType.CUS_TOOLBAR;

@IntDef({DEFAULT, TOOLBAR, COLOR_STATUS_BAR, CUS_TOOLBAR, TRANSPARENT_STATUS_BAR, TRANSPARENT_STATUS_BAR_DRAW_UNDER})
public @interface PageType {
    int DEFAULT = 0;
    int TOOLBAR = 1;
    int CUS_TOOLBAR = 2;
    int COLOR_STATUS_BAR = 3;
    int TRANSPARENT_STATUS_BAR = 4;
    int TRANSPARENT_STATUS_BAR_DRAW_UNDER = 5;
}
