package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.core.util.C0980d;

/* renamed from: androidx.core.graphics.h */
/* loaded from: classes.dex */
public final class C0902h {

    /* renamed from: a */
    private static final ThreadLocal<C0980d<Rect, Rect>> f4396a = new ThreadLocal<>();

    /* renamed from: androidx.core.graphics.h$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m4593a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m4592a(Paint paint, String str) {
        return a.m4593a(paint, str);
    }
}
