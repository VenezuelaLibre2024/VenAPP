package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0876a;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.g1 */
/* loaded from: classes.dex */
public class C0334g1 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1748a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1749b = {-16842910};

    /* renamed from: c */
    static final int[] f1750c = {R.attr.state_focused};

    /* renamed from: d */
    static final int[] f1751d = {R.attr.state_activated};

    /* renamed from: e */
    static final int[] f1752e = {R.attr.state_pressed};

    /* renamed from: f */
    static final int[] f1753f = {R.attr.state_checked};

    /* renamed from: g */
    static final int[] f1754g = {R.attr.state_selected};

    /* renamed from: h */
    static final int[] f1755h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1756i = new int[0];

    /* renamed from: j */
    private static final int[] f1757j = new int[1];

    /* renamed from: a */
    public static void m1731a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7386j.f17100y0);
        try {
            if (!obtainStyledAttributes.hasValue(C7386j.f16888D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1732b(Context context, int i10) {
        ColorStateList m1735e = m1735e(context, i10);
        if (m1735e != null && m1735e.isStateful()) {
            return m1735e.getColorForState(f1749b, m1735e.getDefaultColor());
        }
        TypedValue m1736f = m1736f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m1736f, true);
        return m1734d(context, i10, m1736f.getFloat());
    }

    /* renamed from: c */
    public static int m1733c(Context context, int i10) {
        int[] iArr = f1757j;
        iArr[0] = i10;
        C0349l1 m1844t = C0349l1.m1844t(context, null, iArr);
        try {
            return m1844t.m1847b(0, 0);
        } finally {
            m1844t.m1864v();
        }
    }

    /* renamed from: d */
    static int m1734d(Context context, int i10, float f10) {
        return C0876a.m4492f(m1733c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    /* renamed from: e */
    public static ColorStateList m1735e(Context context, int i10) {
        int[] iArr = f1757j;
        iArr[0] = i10;
        C0349l1 m1844t = C0349l1.m1844t(context, null, iArr);
        try {
            return m1844t.m1848c(0);
        } finally {
            m1844t.m1864v();
        }
    }

    /* renamed from: f */
    private static TypedValue m1736f() {
        ThreadLocal<TypedValue> threadLocal = f1748a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
