package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.u */
/* loaded from: classes.dex */
public final class C1103u {

    /* renamed from: androidx.core.view.u$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m5208a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m5209b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m5210c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m5211d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m5212e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.resolveLayoutDirection(i10);
        }

        /* renamed from: f */
        static void m5213f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setLayoutDirection(i10);
        }

        /* renamed from: g */
        static void m5214g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginEnd(i10);
        }

        /* renamed from: h */
        static void m5215h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginStart(i10);
        }
    }

    /* renamed from: a */
    public static int m5206a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m5209b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m5207b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m5210c(marginLayoutParams);
    }
}
