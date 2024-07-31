package androidx.window.layout;

import android.view.DisplayCutout;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        int safeInsetBottom;
        n.e(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        int safeInsetLeft;
        n.e(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        int safeInsetRight;
        n.e(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        int safeInsetTop;
        n.e(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
