package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a<T> extends com.google.common.collect.b<T> {

        /* renamed from: c */
        final /* synthetic */ Iterator f11091c;

        /* renamed from: d */
        final /* synthetic */ eb.p f11092d;

        a(Iterator it, eb.p pVar) {
            this.f11091c = it;
            this.f11092d = pVar;
        }

        @Override // com.google.common.collect.b
        protected T a() {
            while (this.f11091c.hasNext()) {
                T t10 = (T) this.f11091c.next();
                if (this.f11092d.apply(t10)) {
                    return t10;
                }
            }
            return c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b<T> extends h1<T> {

        /* renamed from: a */
        boolean f11093a;

        /* renamed from: b */
        final /* synthetic */ Object f11094b;

        b(Object obj) {
            this.f11094b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f11093a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f11093a) {
                throw new NoSuchElementException();
            }
            this.f11093a = true;
            return (T) this.f11094b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends com.google.common.collect.a<T> {

        /* renamed from: e */
        static final i1<Object> f11095e = new c(new Object[0], 0, 0, 0);

        /* renamed from: c */
        private final T[] f11096c;

        /* renamed from: d */
        private final int f11097d;

        c(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f11096c = tArr;
            this.f11097d = i10;
        }

        @Override // com.google.common.collect.a
        protected T a(int i10) {
            return this.f11096c[this.f11097d + i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum d implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            i.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        eb.o.o(collection);
        eb.o.o(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(Iterator<T> it, eb.p<? super T> pVar) {
        return n(it, pVar) != -1;
    }

    public static void c(Iterator<?> it) {
        eb.o.o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r2.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r3.equals(r2.next()) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0001, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2.next() != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.util.Iterator<?> r2, java.lang.Object r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L10
        L3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            if (r3 != 0) goto L3
            return r0
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L10
            return r0
        L21:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.f0.d(java.util.Iterator, java.lang.Object):boolean");
    }

    public static boolean e(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !eb.k.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> h1<T> f() {
        return g();
    }

    static <T> i1<T> g() {
        return (i1<T>) c.f11095e;
    }

    public static <T> Iterator<T> h() {
        return d.INSTANCE;
    }

    public static <T> h1<T> i(Iterator<T> it, eb.p<? super T> pVar) {
        eb.o.o(it);
        eb.o.o(pVar);
        return new a(it, pVar);
    }

    public static <T> T j(Iterator<T> it, eb.p<? super T> pVar) {
        eb.o.o(it);
        eb.o.o(pVar);
        while (it.hasNext()) {
            T next = it.next();
            if (pVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T l(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) k(it) : t10;
    }

    public static <T> T m(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> int n(Iterator<T> it, eb.p<? super T> pVar) {
        eb.o.p(pVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (pVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> T o(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean p(Iterator<?> it, Collection<?> collection) {
        eb.o.o(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean q(Iterator<T> it, eb.p<? super T> pVar) {
        eb.o.o(pVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (pVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> h1<T> r(T t10) {
        return new b(t10);
    }
}
