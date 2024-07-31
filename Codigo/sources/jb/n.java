package jb;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jb.v;
import vb.c0;
import vb.d0;
import vb.i0;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final c0 f19846a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f19847b;

    /* renamed from: c, reason: collision with root package name */
    private final tb.a f19848c = tb.a.f26851b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19849a;

        static {
            int[] iArr = new int[vb.z.values().length];
            f19849a = iArr;
            try {
                iArr[vb.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19849a[vb.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19849a[vb.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final g f19850a;

        /* renamed from: b, reason: collision with root package name */
        private final k f19851b;

        /* renamed from: c, reason: collision with root package name */
        private final int f19852c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f19853d;

        private b(g gVar, k kVar, int i10, boolean z10) {
            this.f19850a = gVar;
            this.f19851b = kVar;
            this.f19852c = i10;
            this.f19853d = z10;
        }

        /* synthetic */ b(g gVar, k kVar, int i10, boolean z10, a aVar) {
            this(gVar, kVar, i10, z10);
        }

        public g a() {
            return this.f19850a;
        }
    }

    private n(c0 c0Var, List<b> list) {
        this.f19846a = c0Var;
        this.f19847b = list;
    }

    private static void a(vb.t tVar) {
        if (tVar == null || tVar.Y().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void b(c0 c0Var) {
        if (c0Var == null || c0Var.b0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(vb.t tVar, jb.a aVar, byte[] bArr) {
        try {
            c0 g02 = c0.g0(aVar.b(tVar.Y().w(), bArr), com.google.crypto.tink.shaded.protobuf.p.b());
            b(g02);
            return g02;
        } catch (b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static vb.t d(c0 c0Var, jb.a aVar, byte[] bArr) {
        byte[] a10 = aVar.a(c0Var.h(), bArr);
        try {
            if (c0.g0(aVar.b(a10, bArr), com.google.crypto.tink.shaded.protobuf.p.b()).equals(c0Var)) {
                return vb.t.Z().A(com.google.crypto.tink.shaded.protobuf.h.k(a10)).B(z.b(c0Var)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final n e(c0 c0Var) {
        b(c0Var);
        return new n(c0Var, f(c0Var));
    }

    private static List<b> f(c0 c0Var) {
        ArrayList arrayList = new ArrayList(c0Var.b0());
        for (c0.c cVar : c0Var.c0()) {
            int b02 = cVar.b0();
            try {
                arrayList.add(new b(com.google.crypto.tink.internal.i.a().d(q(cVar), f.a()), m(cVar.d0()), b02, b02 == c0Var.d0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private <B> B g(g gVar, Class<B> cls) {
        try {
            return (B) x.c(gVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B j(c0.c cVar, Class<B> cls) {
        try {
            return (B) x.g(cVar.a0(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <B, P> P l(Class<P> cls, Class<B> cls2) {
        z.d(this.f19846a);
        v.b j10 = v.j(cls2);
        j10.e(this.f19848c);
        for (int i10 = 0; i10 < p(); i10++) {
            c0.c a02 = this.f19846a.a0(i10);
            if (a02.d0().equals(vb.z.ENABLED)) {
                Object j11 = j(a02, cls2);
                Object g10 = this.f19847b.get(i10) != null ? g(this.f19847b.get(i10).a(), cls2) : null;
                if (a02.b0() == this.f19846a.d0()) {
                    j10.b(g10, j11, a02);
                } else {
                    j10.a(g10, j11, a02);
                }
            }
        }
        return (P) x.o(j10.d(), cls);
    }

    private static k m(vb.z zVar) {
        int i10 = a.f19849a[zVar.ordinal()];
        if (i10 == 1) {
            return k.f19839b;
        }
        if (i10 == 2) {
            return k.f19840c;
        }
        if (i10 == 3) {
            return k.f19841d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final n n(p pVar, jb.a aVar) {
        return o(pVar, aVar, new byte[0]);
    }

    public static final n o(p pVar, jb.a aVar, byte[] bArr) {
        vb.t a10 = pVar.a();
        a(a10);
        return e(c(a10, aVar, bArr));
    }

    private static com.google.crypto.tink.internal.o q(c0.c cVar) {
        try {
            return com.google.crypto.tink.internal.o.b(cVar.a0().b0(), cVar.a0().c0(), cVar.a0().a0(), cVar.c0(), cVar.c0() == i0.RAW ? null : Integer.valueOf(cVar.b0()));
        } catch (GeneralSecurityException e10) {
            throw new com.google.crypto.tink.internal.s("Creating a protokey serialization failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 h() {
        return this.f19846a;
    }

    public d0 i() {
        return z.b(this.f19846a);
    }

    public <P> P k(Class<P> cls) {
        Class<?> d10 = x.d(cls);
        if (d10 != null) {
            return (P) l(cls, d10);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public int p() {
        return this.f19846a.b0();
    }

    public void r(q qVar, jb.a aVar) {
        s(qVar, aVar, new byte[0]);
    }

    public void s(q qVar, jb.a aVar, byte[] bArr) {
        qVar.a(d(this.f19846a, aVar, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
