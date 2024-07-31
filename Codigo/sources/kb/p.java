package kb;

import com.google.crypto.tink.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jb.l;
import ob.b;
import vb.y;

/* loaded from: classes2.dex */
public final class p extends com.google.crypto.tink.internal.d<vb.l> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.l> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.l lVar) {
            return new wb.c(lVar.Y().w());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.m, vb.l> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<vb.m>> c() {
            HashMap hashMap = new HashMap();
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_GCM", p.l(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_RAW", p.l(16, bVar2));
            hashMap.put("AES256_GCM", p.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.l a(vb.m mVar) {
            return vb.l.a0().A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(mVar.X()))).B(p.this.m()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public vb.m d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.m.Z(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(vb.m mVar) {
            wb.r.a(mVar.X());
        }
    }

    public p() {
        super(vb.l.class, new a(jb.a.class));
    }

    public static d.a.C0170a<vb.m> l(int i10, l.b bVar) {
        return new d.a.C0170a<>(vb.m.Y().A(i10).build(), bVar);
    }

    public static void o(boolean z10) {
        jb.x.l(new p(), z10);
        s.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public b.EnumC0370b a() {
        return b.EnumC0370b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.l> f() {
        return new b(vb.m.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n */
    public vb.l h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.l.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p */
    public void j(vb.l lVar) {
        wb.r.c(lVar.Z(), m());
        wb.r.a(lVar.Y().size());
    }
}
