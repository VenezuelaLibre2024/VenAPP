package kb;

import com.google.crypto.tink.internal.d;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jb.l;
import vb.y;

/* loaded from: classes2.dex */
public class z extends com.google.crypto.tink.internal.d<vb.r> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.r> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.r rVar) {
            return new wb.g(rVar.Y().w());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.s, vb.r> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<vb.s>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new d.a.C0170a(vb.s.W(), l.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new d.a.C0170a(vb.s.W(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.r a(vb.s sVar) {
            return vb.r.a0().B(z.this.k()).A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(32))).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public vb.s d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.s.X(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(vb.s sVar) {
        }
    }

    public z() {
        super(vb.r.class, new a(jb.a.class));
    }

    public static void m(boolean z10) {
        jb.x.l(new z(), z10);
        c0.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.r> f() {
        return new b(vb.s.class);
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
    public vb.r h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.r.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n */
    public void j(vb.r rVar) {
        wb.r.c(rVar.Z(), k());
        if (rVar.Y().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
