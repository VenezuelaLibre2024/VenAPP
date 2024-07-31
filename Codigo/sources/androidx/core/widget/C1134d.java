package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.d */
/* loaded from: classes.dex */
public final class C1134d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m5553a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    /* loaded from: classes.dex */
    private static class b {
        /* renamed from: a */
        public static EdgeEffect m5554a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m5555b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m5556c(EdgeEffect edgeEffect, float f10, float f11) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f10, f11);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m5549a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.m5554a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m5550b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m5555b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m5551c(EdgeEffect edgeEffect, float f10, float f11) {
        a.m5553a(edgeEffect, f10, f11);
    }

    /* renamed from: d */
    public static float m5552d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m5556c(edgeEffect, f10, f11);
        }
        m5551c(edgeEffect, f10, f11);
        return f10;
    }
}
