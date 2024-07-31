package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p082eb.C7155k;
import p082eb.C7159o;
import p082eb.InterfaceC7160p;

/* renamed from: com.google.common.collect.f0 */
/* loaded from: classes2.dex */
public final class C5870f0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.f0$a */
    /* loaded from: classes2.dex */
    class a<T> extends AbstractC5857b<T> {

        /* renamed from: c */
        final /* synthetic */ Iterator f12306c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC7160p f12307d;

        a(Iterator it, InterfaceC7160p interfaceC7160p) {
            this.f12306c = it;
            this.f12307d = interfaceC7160p;
        }

        @Override // com.google.common.collect.AbstractC5857b
        /* renamed from: a */
        protected T mo14729a() {
            while (this.f12306c.hasNext()) {
                T t10 = (T) this.f12306c.next();
                if (this.f12307d.apply(t10)) {
                    return t10;
                }
            }
            return m14730c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.f0$b */
    /* loaded from: classes2.dex */
    public class b<T> extends AbstractC5877h1<T> {

        /* renamed from: a */
        boolean f12308a;

        /* renamed from: b */
        final /* synthetic */ Object f12309b;

        b(Object obj) {
            this.f12309b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f12308a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f12308a) {
                throw new NoSuchElementException();
            }
            this.f12308a = true;
            return (T) this.f12309b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.f0$c */
    /* loaded from: classes2.dex */
    public static final class c<T> extends AbstractC5854a<T> {

        /* renamed from: e */
        static final AbstractC5880i1<Object> f12310e = new c(new Object[0], 0, 0, 0);

        /* renamed from: c */
        private final T[] f12311c;

        /* renamed from: d */
        private final int f12312d;

        c(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f12311c = tArr;
            this.f12312d = i10;
        }

        @Override // com.google.common.collect.AbstractC5854a
        /* renamed from: a */
        protected T mo14705a(int i10) {
            return this.f12311c[this.f12312d + i10];
        }
    }

    /* renamed from: com.google.common.collect.f0$d */
    /* loaded from: classes2.dex */
    private enum d implements Iterator<Object> {
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
            C5878i.m14884c(false);
        }
    }

    /* renamed from: a */
    public static <T> boolean m14850a(Collection<T> collection, Iterator<? extends T> it) {
        C7159o.m21312o(collection);
        C7159o.m21312o(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    /* renamed from: b */
    public static <T> boolean m14851b(Iterator<T> it, InterfaceC7160p<? super T> interfaceC7160p) {
        return m14863n(it, interfaceC7160p) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m14852c(Iterator<?> it) {
        C7159o.m21312o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r2.hasNext() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r3.equals(r2.next()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0001, code lost:
    
        if (r3 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.hasNext() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2.next() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        return true;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m14853d(java.util.Iterator<?> r2, java.lang.Object r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C5870f0.m14853d(java.util.Iterator, java.lang.Object):boolean");
    }

    /* renamed from: e */
    public static boolean m14854e(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C7155k.m21289a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T> AbstractC5877h1<T> m14855f() {
        return m14856g();
    }

    /* renamed from: g */
    static <T> AbstractC5880i1<T> m14856g() {
        return (AbstractC5880i1<T>) c.f12310e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static <T> Iterator<T> m14857h() {
        return d.INSTANCE;
    }

    /* renamed from: i */
    public static <T> AbstractC5877h1<T> m14858i(Iterator<T> it, InterfaceC7160p<? super T> interfaceC7160p) {
        C7159o.m21312o(it);
        C7159o.m21312o(interfaceC7160p);
        return new a(it, interfaceC7160p);
    }

    /* renamed from: j */
    public static <T> T m14859j(Iterator<T> it, InterfaceC7160p<? super T> interfaceC7160p) {
        C7159o.m21312o(it);
        C7159o.m21312o(interfaceC7160p);
        while (it.hasNext()) {
            T next = it.next();
            if (interfaceC7160p.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: k */
    public static <T> T m14860k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: l */
    public static <T> T m14861l(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) m14860k(it) : t10;
    }

    /* renamed from: m */
    public static <T> T m14862m(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    /* renamed from: n */
    public static <T> int m14863n(Iterator<T> it, InterfaceC7160p<? super T> interfaceC7160p) {
        C7159o.m21313p(interfaceC7160p, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (interfaceC7160p.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <T> T m14864o(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: p */
    public static boolean m14865p(Iterator<?> it, Collection<?> collection) {
        C7159o.m21312o(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: q */
    public static <T> boolean m14866q(Iterator<T> it, InterfaceC7160p<? super T> interfaceC7160p) {
        C7159o.m21312o(interfaceC7160p);
        boolean z10 = false;
        while (it.hasNext()) {
            if (interfaceC7160p.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: r */
    public static <T> AbstractC5877h1<T> m14867r(T t10) {
        return new b(t10);
    }
}
