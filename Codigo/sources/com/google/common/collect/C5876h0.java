package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p082eb.C7155k;
import p082eb.C7159o;
import p137hb.C7690e;

/* renamed from: com.google.common.collect.h0 */
/* loaded from: classes2.dex */
public final class C5876h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> List<T> m14872a(Iterable<T> iterable) {
        return (List) iterable;
    }

    /* renamed from: b */
    static int m14873b(int i10) {
        C5878i.m14883b(i10, "arraySize");
        return C7690e.m23420k(i10 + 5 + (i10 / 10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m14874c(List<?> list, Object obj) {
        if (obj == C7159o.m21312o(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C5870f0.m14854e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!C7155k.m21289a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m14875d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m14876e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C7155k.m21289a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m14876e(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m14877f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m14878g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C7155k.m21289a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static int m14878g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static <E> ArrayList<E> m14879h() {
        return new ArrayList<>();
    }

    /* renamed from: i */
    public static <E> ArrayList<E> m14880i(Iterator<? extends E> it) {
        ArrayList<E> m14879h = m14879h();
        C5870f0.m14850a(m14879h, it);
        return m14879h;
    }

    @SafeVarargs
    /* renamed from: j */
    public static <E> ArrayList<E> m14881j(E... eArr) {
        C7159o.m21312o(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m14873b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
