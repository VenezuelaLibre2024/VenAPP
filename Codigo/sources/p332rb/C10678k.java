package p332rb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5940l;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.internal.C5936h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import p179jb.AbstractC9015g;
import p179jb.C9020l;
import p179jb.C9032x;
import p179jb.InterfaceC9028t;
import p271ob.C9830b;
import p400vb.C11818v;
import p400vb.C11819w;
import p400vb.C11820x;
import p400vb.C11821y;
import p400vb.EnumC11817u;
import p419wb.C12142n;
import p419wb.C12143o;
import p419wb.C12144p;
import p419wb.C12146r;
import sb.C10882c;

/* renamed from: rb.k */
/* loaded from: classes2.dex */
public final class C10678k extends AbstractC5932d<C11818v> {

    /* renamed from: d */
    private static final AbstractC5940l<C10676i, InterfaceC10674g> f27002d = AbstractC5940l.m15247b(new AbstractC5940l.b() { // from class: rb.j
        @Override // com.google.crypto.tink.internal.AbstractC5940l.b
        /* renamed from: a */
        public final Object mo15251a(AbstractC9015g abstractC9015g) {
            return new C10882c((C10676i) abstractC9015g);
        }
    }, C10676i.class, InterfaceC10674g.class);

    /* renamed from: rb.k$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9028t, C11818v> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9028t mo15252a(C11818v c11818v) {
            EnumC11817u m37643Z = c11818v.m37619b0().m37643Z();
            SecretKeySpec secretKeySpec = new SecretKeySpec(c11818v.m37618a0().m15502w(), "HMAC");
            int m37644a0 = c11818v.m37619b0().m37644a0();
            int i10 = c.f27004a[m37643Z.ordinal()];
            if (i10 == 1) {
                return new C12143o(new C12142n("HMACSHA1", secretKeySpec), m37644a0);
            }
            if (i10 == 2) {
                return new C12143o(new C12142n("HMACSHA224", secretKeySpec), m37644a0);
            }
            if (i10 == 3) {
                return new C12143o(new C12142n("HMACSHA256", secretKeySpec), m37644a0);
            }
            if (i10 == 4) {
                return new C12143o(new C12142n("HMACSHA384", secretKeySpec), m37644a0);
            }
            if (i10 == 5) {
                return new C12143o(new C12142n("HMACSHA512", secretKeySpec), m37644a0);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rb.k$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractC5932d.a<C11819w, C11818v> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11819w>> mo15215c() {
            HashMap hashMap = new HashMap();
            EnumC11817u enumC11817u = EnumC11817u.SHA256;
            C9020l.b bVar = C9020l.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", C10678k.m32505m(32, 16, enumC11817u, bVar));
            C9020l.b bVar2 = C9020l.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", C10678k.m32505m(32, 16, enumC11817u, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", C10678k.m32505m(32, 32, enumC11817u, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", C10678k.m32505m(32, 32, enumC11817u, bVar2));
            EnumC11817u enumC11817u2 = EnumC11817u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", C10678k.m32505m(64, 16, enumC11817u2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", C10678k.m32505m(64, 16, enumC11817u2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", C10678k.m32505m(64, 32, enumC11817u2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", C10678k.m32505m(64, 32, enumC11817u2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", C10678k.m32505m(64, 64, enumC11817u2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", C10678k.m32505m(64, 64, enumC11817u2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11818v mo15213a(C11819w c11819w) {
            return C11818v.m37613d0().m37623C(C10678k.this.m32508n()).m37622B(c11819w.m37633a0()).m37621A(AbstractC5970h.m15486k(C12144p.m38907c(c11819w.m37632Z()))).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11819w mo15216d(AbstractC5970h abstractC5970h) {
            return C11819w.m37629c0(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11819w c11819w) {
            if (c11819w.m37632Z() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            C10678k.m32507r(c11819w.m37633a0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rb.k$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f27004a;

        static {
            int[] iArr = new int[EnumC11817u.values().length];
            f27004a = iArr;
            try {
                iArr[EnumC11817u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27004a[EnumC11817u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27004a[EnumC11817u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27004a[EnumC11817u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27004a[EnumC11817u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C10678k() {
        super(C11818v.class, new a(InterfaceC9028t.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static AbstractC5932d.a.C13195a<C11819w> m32505m(int i10, int i11, EnumC11817u enumC11817u, C9020l.b bVar) {
        return new AbstractC5932d.a.C13195a<>(C11819w.m37628b0().m37635B(C11820x.m37640b0().m37645A(enumC11817u).m37646B(i11).build()).m37634A(i10).build(), bVar);
    }

    /* renamed from: p */
    public static void m32506p(boolean z10) {
        C9032x.m26535l(new C10678k(), z10);
        C10681n.m32530c();
        C5936h.m15227c().m15230d(f27002d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m32507r(C11820x c11820x) {
        if (c11820x.m37644a0() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.f27004a[c11820x.m37643Z().ordinal()];
        if (i10 == 1) {
            if (c11820x.m37644a0() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (c11820x.m37644a0() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (c11820x.m37644a0() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (c11820x.m37644a0() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (c11820x.m37644a0() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: a */
    public C9830b.b mo15203a() {
        return C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11818v> mo15208f() {
        return new b(C11819w.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: n */
    public int m32508n() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C11818v mo15210h(AbstractC5970h abstractC5970h) {
        return C11818v.m37614e0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11818v c11818v) {
        C12146r.m38913c(c11818v.m37620c0(), m32508n());
        if (c11818v.m37618a0().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m32507r(c11818v.m37619b0());
    }
}
