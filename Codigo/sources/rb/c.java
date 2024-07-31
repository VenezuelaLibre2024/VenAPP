package rb;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.l;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jb.l;
import jb.t;
import jb.x;
import vb.y;

/* loaded from: classes2.dex */
public final class c extends com.google.crypto.tink.internal.d<vb.a> {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.l<rb.a, g> f24858d = com.google.crypto.tink.internal.l.b(new l.b() { // from class: rb.b
        @Override // com.google.crypto.tink.internal.l.b
        public final Object a(jb.g gVar) {
            return new sb.b((a) gVar);
        }
    }, rb.a.class, g.class);

    /* loaded from: classes2.dex */
    class a extends com.google.crypto.tink.internal.m<t, vb.a> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(vb.a aVar) {
            return new wb.o(new wb.m(aVar.Z().w()), aVar.a0().Y());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.b, vb.a> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<vb.b>> c() {
            HashMap hashMap = new HashMap();
            vb.b build = vb.b.a0().A(32).B(vb.c.Z().A(16).build()).build();
            l.b bVar = l.b.TINK;
            hashMap.put("AES_CMAC", new d.a.C0170a(build, bVar));
            hashMap.put("AES256_CMAC", new d.a.C0170a(vb.b.a0().A(32).B(vb.c.Z().A(16).build()).build(), bVar));
            hashMap.put("AES256_CMAC_RAW", new d.a.C0170a(vb.b.a0().A(32).B(vb.c.Z().A(16).build()).build(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public vb.a a(vb.b bVar) {
            return vb.a.c0().C(0).A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(bVar.Y()))).B(bVar.Z()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public vb.b d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.b.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(vb.b bVar) {
            c.q(bVar.Z());
            c.r(bVar.Y());
        }
    }

    c() {
        super(vb.a.class, new a(t.class));
    }

    public static void o(boolean z10) {
        x.l(new c(), z10);
        f.c();
        com.google.crypto.tink.internal.h.c().d(f24858d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(vb.c cVar) {
        if (cVar.Y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (cVar.Y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.a> f() {
        return new b(vb.b.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public vb.a h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.a.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(vb.a aVar) {
        wb.r.c(aVar.b0(), m());
        r(aVar.Z().size());
        q(aVar.a0());
    }
}
