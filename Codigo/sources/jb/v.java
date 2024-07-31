package jb;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vb.c0;
import vb.i0;

/* loaded from: classes2.dex */
public final class v<P> {

    /* renamed from: a */
    private final ConcurrentMap<d, List<c<P>>> f19856a;

    /* renamed from: b */
    private c<P> f19857b;

    /* renamed from: c */
    private final Class<P> f19858c;

    /* renamed from: d */
    private final tb.a f19859d;

    /* renamed from: e */
    private final boolean f19860e;

    /* loaded from: classes2.dex */
    public static class b<P> {

        /* renamed from: a */
        private final Class<P> f19861a;

        /* renamed from: b */
        private ConcurrentMap<d, List<c<P>>> f19862b;

        /* renamed from: c */
        private c<P> f19863c;

        /* renamed from: d */
        private tb.a f19864d;

        private b(Class<P> cls) {
            this.f19862b = new ConcurrentHashMap();
            this.f19861a = cls;
            this.f19864d = tb.a.f26851b;
        }

        /* synthetic */ b(Class cls, a aVar) {
            this(cls);
        }

        private b<P> c(P p10, P p11, c0.c cVar, boolean z10) {
            if (this.f19862b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (p10 == null && p11 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.d0() != vb.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> b10 = v.b(p10, p11, cVar, this.f19862b);
            if (z10) {
                if (this.f19863c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f19863c = b10;
            }
            return this;
        }

        public b<P> a(P p10, P p11, c0.c cVar) {
            return c(p10, p11, cVar, false);
        }

        public b<P> b(P p10, P p11, c0.c cVar) {
            return c(p10, p11, cVar, true);
        }

        public v<P> d() {
            ConcurrentMap<d, List<c<P>>> concurrentMap = this.f19862b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            v<P> vVar = new v<>(concurrentMap, this.f19863c, this.f19864d, this.f19861a);
            this.f19862b = null;
            return vVar;
        }

        public b<P> e(tb.a aVar) {
            if (this.f19862b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f19864d = aVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<P> {

        /* renamed from: a */
        private final P f19865a;

        /* renamed from: b */
        private final P f19866b;

        /* renamed from: c */
        private final byte[] f19867c;

        /* renamed from: d */
        private final vb.z f19868d;

        /* renamed from: e */
        private final i0 f19869e;

        /* renamed from: f */
        private final int f19870f;

        /* renamed from: g */
        private final String f19871g;

        /* renamed from: h */
        private final g f19872h;

        c(P p10, P p11, byte[] bArr, vb.z zVar, i0 i0Var, int i10, String str, g gVar) {
            this.f19865a = p10;
            this.f19866b = p11;
            this.f19867c = Arrays.copyOf(bArr, bArr.length);
            this.f19868d = zVar;
            this.f19869e = i0Var;
            this.f19870f = i10;
            this.f19871g = str;
            this.f19872h = gVar;
        }

        public P a() {
            return this.f19865a;
        }

        public final byte[] b() {
            byte[] bArr = this.f19867c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public g c() {
            return this.f19872h;
        }

        public int d() {
            return this.f19870f;
        }

        public String e() {
            return this.f19871g;
        }

        public i0 f() {
            return this.f19869e;
        }

        public P g() {
            return this.f19866b;
        }

        public vb.z h() {
            return this.f19868d;
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Comparable<d> {

        /* renamed from: a */
        private final byte[] f19873a;

        private d(byte[] bArr) {
            this.f19873a = Arrays.copyOf(bArr, bArr.length);
        }

        /* synthetic */ d(byte[] bArr, a aVar) {
            this(bArr);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            byte[] bArr = this.f19873a;
            int length = bArr.length;
            byte[] bArr2 = dVar.f19873a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.f19873a;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = dVar.f19873a[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f19873a, ((d) obj).f19873a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f19873a);
        }

        public String toString() {
            return wb.k.b(this.f19873a);
        }
    }

    private v(ConcurrentMap<d, List<c<P>>> concurrentMap, c<P> cVar, tb.a aVar, Class<P> cls) {
        this.f19856a = concurrentMap;
        this.f19857b = cVar;
        this.f19858c = cls;
        this.f19859d = aVar;
        this.f19860e = false;
    }

    /* synthetic */ v(ConcurrentMap concurrentMap, c cVar, tb.a aVar, Class cls, a aVar2) {
        this(concurrentMap, cVar, aVar, cls);
    }

    public static <P> c<P> b(P p10, P p11, c0.c cVar, ConcurrentMap<d, List<c<P>>> concurrentMap) {
        Integer valueOf = Integer.valueOf(cVar.b0());
        if (cVar.c0() == i0.RAW) {
            valueOf = null;
        }
        c<P> cVar2 = new c<>(p10, p11, jb.d.a(cVar), cVar.d0(), cVar.c0(), cVar.b0(), cVar.a0().b0(), com.google.crypto.tink.internal.i.a().d(com.google.crypto.tink.internal.o.b(cVar.a0().b0(), cVar.a0().c0(), cVar.a0().a0(), cVar.c0(), valueOf), f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List<c<P>> put = concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static <P> b<P> j(Class<P> cls) {
        return new b<>(cls);
    }

    public Collection<List<c<P>>> c() {
        return this.f19856a.values();
    }

    public tb.a d() {
        return this.f19859d;
    }

    public c<P> e() {
        return this.f19857b;
    }

    public List<c<P>> f(byte[] bArr) {
        List<c<P>> list = this.f19856a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> g() {
        return this.f19858c;
    }

    public List<c<P>> h() {
        return f(jb.d.f19831a);
    }

    public boolean i() {
        return !this.f19859d.b().isEmpty();
    }
}
