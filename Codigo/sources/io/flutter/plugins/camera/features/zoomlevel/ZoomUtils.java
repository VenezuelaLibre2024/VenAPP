package io.flutter.plugins.camera.features.zoomlevel;

import android.graphics.Rect;
import s0.a;

/* loaded from: classes3.dex */
final class ZoomUtils {
    ZoomUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Float computeZoomRatio(float f10, float f11, float f12) {
        return Float.valueOf(a.b(f10, f11, f12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect computeZoomRect(float f10, Rect rect, float f11, float f12) {
        float floatValue = computeZoomRatio(f10, f11, f12).floatValue();
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((rect.width() * 0.5f) / floatValue);
        int height2 = (int) ((rect.height() * 0.5f) / floatValue);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }
}
