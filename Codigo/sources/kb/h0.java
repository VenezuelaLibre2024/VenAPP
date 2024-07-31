package kb;

import com.google.crypto.tink.internal.d;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jb.l;
import vb.l0;
import vb.y;

/* loaded from: classes2.dex */
public class h0 extends com.google.crypto.tink.internal.d<vb.k0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.k0> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.k0 k0Var) {
            return new wb.s(k0Var.Y().w());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<l0, vb.k0> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<l0>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new d.a.C0170a(l0.W(), l.b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new d.a.C0170a(l0.W(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.k0 a(l0 l0Var) {
            return vb.k0.a0().B(h0.this.k()).A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(32))).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public l0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return l0.X(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(l0 l0Var) {
        }
    }

    public h0() {
        super(vb.k0.class, new a(jb.a.class));
    }

    public static void m(boolean z10) {
        jb.x.l(new h0(), z10);
        k0.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.k0> f() {
        return new b(l0.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: l */
    public vb.k0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.k0.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n */
    public void j(vb.k0 k0Var) {
        wb.r.c(k0Var.Z(), k());
        if (k0Var.Y().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
