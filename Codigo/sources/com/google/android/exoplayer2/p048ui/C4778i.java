package com.google.android.exoplayer2.p048ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p082eb.InterfaceC7160p;
import p120g8.C7484b;
import p198k8.InterfaceC9207b;
import p363t8.C11137a;

/* renamed from: com.google.android.exoplayer2.ui.i */
/* loaded from: classes.dex */
final class C4778i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ boolean m12319c(Object obj) {
        return !(obj instanceof InterfaceC9207b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ boolean m12320d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* renamed from: e */
    public static void m12321e(C7484b.b bVar) {
        bVar.m22765b();
        if (bVar.m22768e() instanceof Spanned) {
            if (!(bVar.m22768e() instanceof Spannable)) {
                bVar.m22778o(SpannableString.valueOf(bVar.m22768e()));
            }
            m12323g((Spannable) C11137a.m34603e(bVar.m22768e()), new InterfaceC7160p() { // from class: com.google.android.exoplayer2.ui.h
                @Override // p082eb.InterfaceC7160p
                public final boolean apply(Object obj) {
                    boolean m12319c;
                    m12319c = C4778i.m12319c(obj);
                    return m12319c;
                }
            });
        }
        m12322f(bVar);
    }

    /* renamed from: f */
    public static void m12322f(C7484b.b bVar) {
        bVar.m22780q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.m22768e() instanceof Spanned) {
            if (!(bVar.m22768e() instanceof Spannable)) {
                bVar.m22778o(SpannableString.valueOf(bVar.m22768e()));
            }
            m12323g((Spannable) C11137a.m34603e(bVar.m22768e()), new InterfaceC7160p() { // from class: com.google.android.exoplayer2.ui.g
                @Override // p082eb.InterfaceC7160p
                public final boolean apply(Object obj) {
                    boolean m12320d;
                    m12320d = C4778i.m12320d(obj);
                    return m12320d;
                }
            });
        }
    }

    /* renamed from: g */
    private static void m12323g(Spannable spannable, InterfaceC7160p<Object> interfaceC7160p) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (interfaceC7160p.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* renamed from: h */
    public static float m12324h(int i10, float f10, int i11, int i12) {
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
