package rb;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.l;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import jb.l;
import jb.t;
import ob.b;
import vb.u;
import vb.v;
import vb.w;
import vb.x;
import vb.y;

/* loaded from: classes2.dex */
public final class k extends com.google.crypto.tink.internal.d<v> {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.l<i, g> f24886d = com.google.crypto.tink.internal.l.b(new l.b() { // from class: rb.j
        @Override // com.google.crypto.tink.internal.l.b
        public final Object a(jb.g gVar) {
            return new sb.c((i) gVar);
        }
    }, i.class, g.class);

    /* loaded from: classes2.dex */
    class a extends com.google.crypto.tink.internal.m<t, v> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(v vVar) {
            u Z = vVar.b0().Z();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.a0().w(), "HMAC");
            int a02 = vVar.b0().a0();
            int i10 = c.f24888a[Z.ordinal()];
            if (i10 == 1) {
                return new wb.o(new wb.n("HMACSHA1", secretKeySpec), a02);
            }
            if (i10 == 2) {
                return new wb.o(new wb.n("HMACSHA224", secretKeySpec), a02);
            }
            if (i10 == 3) {
                return new wb.o(new wb.n("HMACSHA256", secretKeySpec), a02);
            }
            if (i10 == 4) {
                return new wb.o(new wb.n("HMACSHA384", secretKeySpec), a02);
            }
            if (i10 == 5) {
                return new wb.o(new wb.n("HMACSHA512", secretKeySpec), a02);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends d.a<w, v> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<w>> c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", k.m(32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", k.m(32, 16, uVar, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", k.m(32, 32, uVar, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", k.m(64, 16, uVar2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", k.m(64, 16, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", k.m(64, 32, uVar2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", k.m(64, 32, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", k.m(64, 64, uVar2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return v.d0().C(k.this.n()).B(wVar.a0()).A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(wVar.Z()))).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return w.c0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) {
            if (wVar.Z() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            k.r(wVar.a0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24888a;

        static {
            int[] iArr = new int[u.values().length];
            f24888a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24888a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24888a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24888a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24888a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        super(v.class, new a(t.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0170a<w> m(int i10, int i11, u uVar, l.b bVar) {
        return new d.a.C0170a<>(w.b0().B(x.b0().A(uVar).B(i11).build()).A(i10).build(), bVar);
    }

    public static void p(boolean z10) {
        jb.x.l(new k(), z10);
        n.c();
        com.google.crypto.tink.internal.h.c().d(f24886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(x xVar) {
        if (xVar.a0() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.f24888a[xVar.Z().ordinal()];
        if (i10 == 1) {
            if (xVar.a0() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (xVar.a0() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (xVar.a0() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (xVar.a0() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.a0() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public b.EnumC0370b a() {
        return b.EnumC0370b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, v> f() {
        return new b(w.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public v h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return v.e0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) {
        wb.r.c(vVar.c0(), n());
        if (vVar.a0().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.b0());
    }
}
