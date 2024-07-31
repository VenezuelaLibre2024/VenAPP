package com.google.common.collect;

import p082eb.C7159o;

/* renamed from: com.google.common.collect.i */
/* loaded from: classes2.dex */
final class C5878i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m14882a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m14883b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m14884c(boolean z10) {
        C7159o.m21319v(z10, "no calls to next() since the last call to remove()");
    }
}
