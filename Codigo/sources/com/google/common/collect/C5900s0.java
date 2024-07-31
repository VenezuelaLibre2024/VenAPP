package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.s0 */
/* loaded from: classes2.dex */
public final class C5900s0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T[] m15044a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T[] m15045b(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <K, V> Map<K, V> m15046c(int i10) {
        return C5883k.m14936x(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <E> Set<E> m15047d() {
        return C5885l.m14971l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <K, V> Map<K, V> m15048e() {
        return C5883k.m14935s();
    }
}
