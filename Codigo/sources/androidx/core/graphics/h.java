package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<androidx.core.util.d<Rect, Rect>> f3724a = new ThreadLocal<>();

    /* loaded from: classes.dex */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
