package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.f1 */
/* loaded from: classes2.dex */
final class C5871f1 {
    /* renamed from: a */
    public static <E> Comparator<? super E> m14869a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? AbstractC5898r0.m15040c() : comparator;
    }

    /* renamed from: b */
    public static boolean m14870b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C7159o.m21312o(comparator);
        C7159o.m21312o(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m14869a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof InterfaceC5868e1)) {
                return false;
            }
            comparator2 = ((InterfaceC5868e1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
