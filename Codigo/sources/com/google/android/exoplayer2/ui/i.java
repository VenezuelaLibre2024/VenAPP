package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import eb.p;
import g8.b;

/* loaded from: classes.dex */
final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof k8.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(b.C0262b c0262b) {
        c0262b.b();
        if (c0262b.e() instanceof Spanned) {
            if (!(c0262b.e() instanceof Spannable)) {
                c0262b.o(SpannableString.valueOf(c0262b.e()));
            }
            g((Spannable) t8.a.e(c0262b.e()), new p() { // from class: com.google.android.exoplayer2.ui.h
                @Override // eb.p
                public final boolean apply(Object obj) {
                    boolean c10;
                    c10 = i.c(obj);
                    return c10;
                }
            });
        }
        f(c0262b);
    }

    public static void f(b.C0262b c0262b) {
        c0262b.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0262b.e() instanceof Spanned) {
            if (!(c0262b.e() instanceof Spannable)) {
                c0262b.o(SpannableString.valueOf(c0262b.e()));
            }
            g((Spannable) t8.a.e(c0262b.e()), new p() { // from class: com.google.android.exoplayer2.ui.g
                @Override // eb.p
                public final boolean apply(Object obj) {
                    boolean d10;
                    d10 = i.d(obj);
                    return d10;
                }
            });
        }
    }

    private static void g(Spannable spannable, p<Object> pVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (pVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
