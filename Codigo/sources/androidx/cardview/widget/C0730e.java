package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.e */
/* loaded from: classes.dex */
class C0730e extends Drawable {

    /* renamed from: a */
    private static final double f3174a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m3648a(float f10, float f11, boolean z10) {
        return z10 ? (float) (f10 + ((1.0d - f3174a) * f11)) : f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m3649b(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        return z10 ? (float) (f12 + ((1.0d - f3174a) * f11)) : f12;
    }
}
