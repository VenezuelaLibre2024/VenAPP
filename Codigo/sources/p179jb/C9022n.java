package p179jb;

import com.google.crypto.tink.internal.C5937i;
import com.google.crypto.tink.internal.C5943o;
import com.google.crypto.tink.internal.C5947s;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5953b0;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p179jb.C9030v;
import p366tb.C11234a;
import p400vb.C11790c0;
import p400vb.C11792d0;
import p400vb.C11816t;
import p400vb.EnumC11802i0;
import p400vb.EnumC11822z;

/* renamed from: jb.n */
/* loaded from: classes2.dex */
public final class C9022n {

    /* renamed from: a */
    private final C11790c0 f21625a;

    /* renamed from: b */
    private final List<b> f21626b;

    /* renamed from: c */
    private final C11234a f21627c = C11234a.f29147b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jb.n$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21628a;

        static {
            int[] iArr = new int[EnumC11822z.values().length];
            f21628a = iArr;
            try {
                iArr[EnumC11822z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21628a[EnumC11822z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21628a[EnumC11822z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: jb.n$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final AbstractC9015g f21629a;

        /* renamed from: b */
        private final C9019k f21630b;

        /* renamed from: c */
        private final int f21631c;

        /* renamed from: d */
        private final boolean f21632d;

        private b(AbstractC9015g abstractC9015g, C9019k c9019k, int i10, boolean z10) {
            this.f21629a = abstractC9015g;
            this.f21630b = c9019k;
            this.f21631c = i10;
            this.f21632d = z10;
        }

        /* synthetic */ b(AbstractC9015g abstractC9015g, C9019k c9019k, int i10, boolean z10, a aVar) {
            this(abstractC9015g, c9019k, i10, z10);
        }

        /* renamed from: a */
        public AbstractC9015g m26479a() {
            return this.f21629a;
        }
    }

    private C9022n(C11790c0 c11790c0, List<b> list) {
        this.f21625a = c11790c0;
        this.f21626b = list;
    }

    /* renamed from: a */
    private static void m26460a(C11816t c11816t) {
        if (c11816t == null || c11816t.m37603Y().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    private static void m26461b(C11790c0 c11790c0) {
        if (c11790c0 == null || c11790c0.m37332b0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: c */
    private static C11790c0 m26462c(C11816t c11816t, InterfaceC9009a interfaceC9009a, byte[] bArr) {
        try {
            C11790c0 m37329g0 = C11790c0.m37329g0(interfaceC9009a.mo26425b(c11816t.m37603Y().m15502w(), bArr), C5994p.m15932b());
            m26461b(m37329g0);
            return m37329g0;
        } catch (C5953b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: d */
    private static C11816t m26463d(C11790c0 c11790c0, InterfaceC9009a interfaceC9009a, byte[] bArr) {
        byte[] mo26424a = interfaceC9009a.mo26424a(c11790c0.mo15293h(), bArr);
        try {
            if (C11790c0.m37329g0(interfaceC9009a.mo26425b(mo26424a, bArr), C5994p.m15932b()).equals(c11790c0)) {
                return C11816t.m37599Z().m37604A(AbstractC5970h.m15486k(mo26424a)).m37605B(C9034z.m26542b(c11790c0)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (C5953b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static final C9022n m26464e(C11790c0 c11790c0) {
        m26461b(c11790c0);
        return new C9022n(c11790c0, m26465f(c11790c0));
    }

    /* renamed from: f */
    private static List<b> m26465f(C11790c0 c11790c0) {
        ArrayList arrayList = new ArrayList(c11790c0.m37332b0());
        for (C11790c0.c cVar : c11790c0.m37333c0()) {
            int m37351b0 = cVar.m37351b0();
            try {
                arrayList.add(new b(C5937i.m15233a().m15236d(m26472q(cVar), C9014f.m26433a()), m26469m(cVar.m37353d0()), m37351b0, m37351b0 == c11790c0.m37334d0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private <B> B m26466g(AbstractC9015g abstractC9015g, Class<B> cls) {
        try {
            return (B) C9032x.m26526c(abstractC9015g, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static <B> B m26467j(C11790c0.c cVar, Class<B> cls) {
        try {
            return (B) C9032x.m26530g(cVar.m37350a0(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    private <B, P> P m26468l(Class<P> cls, Class<B> cls2) {
        C9034z.m26544d(this.f21625a);
        C9030v.b m26499j = C9030v.m26499j(cls2);
        m26499j.m26511e(this.f21627c);
        for (int i10 = 0; i10 < m26476p(); i10++) {
            C11790c0.c m37331a0 = this.f21625a.m37331a0(i10);
            if (m37331a0.m37353d0().equals(EnumC11822z.ENABLED)) {
                Object m26467j = m26467j(m37331a0, cls2);
                Object m26466g = this.f21626b.get(i10) != null ? m26466g(this.f21626b.get(i10).m26479a(), cls2) : null;
                if (m37331a0.m37351b0() == this.f21625a.m37334d0()) {
                    m26499j.m26509b(m26466g, m26467j, m37331a0);
                } else {
                    m26499j.m26508a(m26466g, m26467j, m37331a0);
                }
            }
        }
        return (P) C9032x.m26538o(m26499j.m26510d(), cls);
    }

    /* renamed from: m */
    private static C9019k m26469m(EnumC11822z enumC11822z) {
        int i10 = a.f21628a[enumC11822z.ordinal()];
        if (i10 == 1) {
            return C9019k.f21618b;
        }
        if (i10 == 2) {
            return C9019k.f21619c;
        }
        if (i10 == 3) {
            return C9019k.f21620d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    /* renamed from: n */
    public static final C9022n m26470n(InterfaceC9024p interfaceC9024p, InterfaceC9009a interfaceC9009a) {
        return m26471o(interfaceC9024p, interfaceC9009a, new byte[0]);
    }

    /* renamed from: o */
    public static final C9022n m26471o(InterfaceC9024p interfaceC9024p, InterfaceC9009a interfaceC9009a, byte[] bArr) {
        C11816t mo26427a = interfaceC9024p.mo26427a();
        m26460a(mo26427a);
        return m26464e(m26462c(mo26427a, interfaceC9009a, bArr));
    }

    /* renamed from: q */
    private static C5943o m26472q(C11790c0.c cVar) {
        try {
            return C5943o.m15264b(cVar.m37350a0().m37657b0(), cVar.m37350a0().m37658c0(), cVar.m37350a0().m37656a0(), cVar.m37352c0(), cVar.m37352c0() == EnumC11802i0.RAW ? null : Integer.valueOf(cVar.m37351b0()));
        } catch (GeneralSecurityException e10) {
            throw new C5947s("Creating a protokey serialization failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C11790c0 m26473h() {
        return this.f21625a;
    }

    /* renamed from: i */
    public C11792d0 m26474i() {
        return C9034z.m26542b(this.f21625a);
    }

    /* renamed from: k */
    public <P> P m26475k(Class<P> cls) {
        Class<?> m26527d = C9032x.m26527d(cls);
        if (m26527d != null) {
            return (P) m26468l(cls, m26527d);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* renamed from: p */
    public int m26476p() {
        return this.f21625a.m37332b0();
    }

    /* renamed from: r */
    public void m26477r(InterfaceC9025q interfaceC9025q, InterfaceC9009a interfaceC9009a) {
        m26478s(interfaceC9025q, interfaceC9009a, new byte[0]);
    }

    /* renamed from: s */
    public void m26478s(InterfaceC9025q interfaceC9025q, InterfaceC9009a interfaceC9009a, byte[] bArr) {
        interfaceC9025q.mo26490a(m26463d(this.f21625a, interfaceC9009a, bArr));
    }

    public String toString() {
        return m26474i().toString();
    }
}
