package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p082eb.C7159o;
import p082eb.InterfaceC7160p;

/* renamed from: com.google.common.collect.e0 */
/* loaded from: classes2.dex */
public final class C5867e0 {
    /* renamed from: a */
    public static <T> boolean m14835a(Iterable<T> iterable, InterfaceC7160p<? super T> interfaceC7160p) {
        return C5870f0.m14851b(iterable.iterator(), interfaceC7160p);
    }

    /* renamed from: b */
    private static <E> Collection<E> m14836b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C5876h0.m14880i(iterable.iterator());
    }

    /* renamed from: c */
    public static <T> T m14837c(Iterable<? extends T> iterable, T t10) {
        return (T) C5870f0.m14862m(iterable.iterator(), t10);
    }

    /* renamed from: d */
    public static <T> T m14838d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) C5870f0.m14860k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) m14840f(list);
    }

    /* renamed from: e */
    public static <T> T m14839e(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) m14840f(C5876h0.m14872a(iterable));
            }
        }
        return (T) C5870f0.m14861l(iterable.iterator(), t10);
    }

    /* renamed from: f */
    private static <T> T m14840f(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: g */
    public static <T> boolean m14841g(Iterable<T> iterable, InterfaceC7160p<? super T> interfaceC7160p) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? m14842h((List) iterable, (InterfaceC7160p) C7159o.m21312o(interfaceC7160p)) : C5870f0.m14866q(iterable.iterator(), interfaceC7160p);
    }

    /* renamed from: h */
    private static <T> boolean m14842h(List<T> list, InterfaceC7160p<? super T> interfaceC7160p) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!interfaceC7160p.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        m14843i(list, interfaceC7160p, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m14843i(list, interfaceC7160p, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    /* renamed from: i */
    private static <T> void m14843i(List<T> list, InterfaceC7160p<? super T> interfaceC7160p, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (interfaceC7160p.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Object[] m14844j(Iterable<?> iterable) {
        return m14836b(iterable).toArray();
    }
}
