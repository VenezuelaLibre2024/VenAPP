package kb;

import com.google.crypto.tink.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jb.l;
import ob.b;
import vb.y;

/* loaded from: classes2.dex */
public final class e extends com.google.crypto.tink.internal.d<vb.d> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.d> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.d dVar) {
            return new wb.h((wb.l) new f().e(dVar.Z(), wb.l.class), (jb.t) new rb.k().e(dVar.a0(), jb.t.class), dVar.a0().b0().a0());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.e, vb.d> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<vb.e>> c() {
            HashMap hashMap = new HashMap();
            vb.u uVar = vb.u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", e.l(16, 16, 32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", e.l(16, 16, 32, 16, uVar, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", e.l(32, 16, 32, 32, uVar, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", e.l(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.d a(vb.e eVar) {
            vb.f a10 = new f().f().a(eVar.Y());
            return vb.d.c0().A(a10).B(new rb.k().f().a(eVar.Z())).C(e.this.n()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public vb.e d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.e.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(vb.e eVar) {
            new f().f().e(eVar.Y());
            new rb.k().f().e(eVar.Z());
            wb.r.a(eVar.Y().Z());
        }
    }

    public e() {
        super(vb.d.class, new a(jb.a.class));
    }

    public static d.a.C0170a<vb.e> l(int i10, int i11, int i12, int i13, vb.u uVar, l.b bVar) {
        return new d.a.C0170a<>(m(i10, i11, i12, i13, uVar), bVar);
    }

    private static vb.e m(int i10, int i11, int i12, int i13, vb.u uVar) {
        vb.g build = vb.g.b0().B(vb.h.Z().A(i11).build()).A(i10).build();
        return vb.e.a0().A(build).B(vb.w.b0().B(vb.x.b0().A(uVar).B(i13).build()).A(i12).build()).build();
    }

    public static void p(boolean z10) {
        jb.x.l(new e(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public b.EnumC0370b a() {
        return b.EnumC0370b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.d> f() {
        return new b(vb.e.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: o */
    public vb.d h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.d.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q */
    public void j(vb.d dVar) {
        wb.r.c(dVar.b0(), n());
        new f().j(dVar.Z());
        new rb.k().j(dVar.a0());
    }
}
