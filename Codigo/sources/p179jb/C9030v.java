package p179jb;

import com.google.crypto.tink.internal.C5937i;
import com.google.crypto.tink.internal.C5943o;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p366tb.C11234a;
import p400vb.C11790c0;
import p400vb.EnumC11802i0;
import p400vb.EnumC11822z;
import p419wb.C12139k;

/* renamed from: jb.v */
/* loaded from: classes2.dex */
public final class C9030v<P> {

    /* renamed from: a */
    private final ConcurrentMap<d, List<c<P>>> f21635a;

    /* renamed from: b */
    private c<P> f21636b;

    /* renamed from: c */
    private final Class<P> f21637c;

    /* renamed from: d */
    private final C11234a f21638d;

    /* renamed from: e */
    private final boolean f21639e;

    /* renamed from: jb.v$b */
    /* loaded from: classes2.dex */
    public static class b<P> {

        /* renamed from: a */
        private final Class<P> f21640a;

        /* renamed from: b */
        private ConcurrentMap<d, List<c<P>>> f21641b;

        /* renamed from: c */
        private c<P> f21642c;

        /* renamed from: d */
        private C11234a f21643d;

        private b(Class<P> cls) {
            this.f21641b = new ConcurrentHashMap();
            this.f21640a = cls;
            this.f21643d = C11234a.f29147b;
        }

        /* renamed from: c */
        private b<P> m26507c(P p10, P p11, C11790c0.c cVar, boolean z10) {
            if (this.f21641b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (p10 == null && p11 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.m37353d0() != EnumC11822z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> m26498b = C9030v.m26498b(p10, p11, cVar, this.f21641b);
            if (z10) {
                if (this.f21642c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f21642c = m26498b;
            }
            return this;
        }

        /* renamed from: a */
        public b<P> m26508a(P p10, P p11, C11790c0.c cVar) {
            return m26507c(p10, p11, cVar, false);
        }

        /* renamed from: b */
        public b<P> m26509b(P p10, P p11, C11790c0.c cVar) {
            return m26507c(p10, p11, cVar, true);
        }

        /* renamed from: d */
        public C9030v<P> m26510d() {
            ConcurrentMap<d, List<c<P>>> concurrentMap = this.f21641b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            C9030v<P> c9030v = new C9030v<>(concurrentMap, this.f21642c, this.f21643d, this.f21640a);
            this.f21641b = null;
            return c9030v;
        }

        /* renamed from: e */
        public b<P> m26511e(C11234a c11234a) {
            if (this.f21641b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f21643d = c11234a;
            return this;
        }
    }

    /* renamed from: jb.v$c */
    /* loaded from: classes2.dex */
    public static final class c<P> {

        /* renamed from: a */
        private final P f21644a;

        /* renamed from: b */
        private final P f21645b;

        /* renamed from: c */
        private final byte[] f21646c;

        /* renamed from: d */
        private final EnumC11822z f21647d;

        /* renamed from: e */
        private final EnumC11802i0 f21648e;

        /* renamed from: f */
        private final int f21649f;

        /* renamed from: g */
        private final String f21650g;

        /* renamed from: h */
        private final AbstractC9015g f21651h;

        c(P p10, P p11, byte[] bArr, EnumC11822z enumC11822z, EnumC11802i0 enumC11802i0, int i10, String str, AbstractC9015g abstractC9015g) {
            this.f21644a = p10;
            this.f21645b = p11;
            this.f21646c = Arrays.copyOf(bArr, bArr.length);
            this.f21647d = enumC11822z;
            this.f21648e = enumC11802i0;
            this.f21649f = i10;
            this.f21650g = str;
            this.f21651h = abstractC9015g;
        }

        /* renamed from: a */
        public P m26512a() {
            return this.f21644a;
        }

        /* renamed from: b */
        public final byte[] m26513b() {
            byte[] bArr = this.f21646c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        /* renamed from: c */
        public AbstractC9015g m26514c() {
            return this.f21651h;
        }

        /* renamed from: d */
        public int m26515d() {
            return this.f21649f;
        }

        /* renamed from: e */
        public String m26516e() {
            return this.f21650g;
        }

        /* renamed from: f */
        public EnumC11802i0 m26517f() {
            return this.f21648e;
        }

        /* renamed from: g */
        public P m26518g() {
            return this.f21645b;
        }

        /* renamed from: h */
        public EnumC11822z m26519h() {
            return this.f21647d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jb.v$d */
    /* loaded from: classes2.dex */
    public static class d implements Comparable<d> {

        /* renamed from: a */
        private final byte[] f21652a;

        private d(byte[] bArr) {
            this.f21652a = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.f21652a;
            int length = bArr.length;
            byte[] bArr2 = dVar.f21652a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.f21652a;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = dVar.f21652a[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f21652a, ((d) obj).f21652a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f21652a);
        }

        public String toString() {
            return C12139k.m38899b(this.f21652a);
        }
    }

    private C9030v(ConcurrentMap<d, List<c<P>>> concurrentMap, c<P> cVar, C11234a c11234a, Class<P> cls) {
        this.f21635a = concurrentMap;
        this.f21636b = cVar;
        this.f21637c = cls;
        this.f21638d = c11234a;
        this.f21639e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static <P> c<P> m26498b(P p10, P p11, C11790c0.c cVar, ConcurrentMap<d, List<c<P>>> concurrentMap) {
        Integer valueOf = Integer.valueOf(cVar.m37351b0());
        if (cVar.m37352c0() == EnumC11802i0.RAW) {
            valueOf = null;
        }
        c<P> cVar2 = new c<>(p10, p11, C9012d.m26430a(cVar), cVar.m37353d0(), cVar.m37352c0(), cVar.m37351b0(), cVar.m37350a0().m37657b0(), C5937i.m15233a().m15236d(C5943o.m15264b(cVar.m37350a0().m37657b0(), cVar.m37350a0().m37658c0(), cVar.m37350a0().m37656a0(), cVar.m37352c0(), valueOf), C9014f.m26433a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.m26513b());
        List<c<P>> put = concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    /* renamed from: j */
    public static <P> b<P> m26499j(Class<P> cls) {
        return new b<>(cls);
    }

    /* renamed from: c */
    public Collection<List<c<P>>> m26500c() {
        return this.f21635a.values();
    }

    /* renamed from: d */
    public C11234a m26501d() {
        return this.f21638d;
    }

    /* renamed from: e */
    public c<P> m26502e() {
        return this.f21636b;
    }

    /* renamed from: f */
    public List<c<P>> m26503f(byte[] bArr) {
        List<c<P>> list = this.f21635a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: g */
    public Class<P> m26504g() {
        return this.f21637c;
    }

    /* renamed from: h */
    public List<c<P>> m26505h() {
        return m26503f(C9012d.f21610a);
    }

    /* renamed from: i */
    public boolean m26506i() {
        return !this.f21638d.m35111b().isEmpty();
    }
}
