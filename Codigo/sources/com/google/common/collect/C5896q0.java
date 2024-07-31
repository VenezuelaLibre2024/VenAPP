package com.google.common.collect;

import p082eb.C7159o;

/* renamed from: com.google.common.collect.q0 */
/* loaded from: classes2.dex */
public final class C5896q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m15031a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object[] m15032b(Object... objArr) {
        m15033c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Object[] m15033c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m15031a(objArr[i11], i11);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m15034d(T[] tArr, int i10) {
        return (T[]) C5900s0.m15045b(tArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T> T[] m15035e(Object[] objArr, int i10, int i11, T[] tArr) {
        C7159o.m21317t(i10, i10 + i11, objArr.length);
        if (tArr.length < i11) {
            tArr = (T[]) m15034d(tArr, i11);
        } else if (tArr.length > i11) {
            tArr[i11] = null;
        }
        System.arraycopy(objArr, i10, tArr, 0, i11);
        return tArr;
    }
}
