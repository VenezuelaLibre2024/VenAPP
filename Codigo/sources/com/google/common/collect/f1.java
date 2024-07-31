package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
final class f1 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? r0.c() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        eb.o.o(comparator);
        eb.o.o(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof e1)) {
                return false;
            }
            comparator2 = ((e1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
