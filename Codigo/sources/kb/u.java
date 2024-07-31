package kb;

import com.google.crypto.tink.internal.d;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import jb.l;
import vb.y;

/* loaded from: classes2.dex */
public final class u extends com.google.crypto.tink.internal.d<vb.n> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.n> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.n nVar) {
            return new mb.a(nVar.Y().w());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.o, vb.n> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<vb.o>> c() {
            HashMap hashMap = new HashMap();
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_GCM_SIV", u.m(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", u.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.n a(vb.o oVar) {
            return vb.n.a0().A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(oVar.X()))).B(u.this.n()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public vb.o d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.o.Z(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(vb.o oVar) {
            wb.r.a(oVar.X());
        }
    }

    public u() {
        super(vb.n.class, new a(jb.a.class));
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static d.a.C0170a<vb.o> m(int i10, l.b bVar) {
        return new d.a.C0170a<>(vb.o.Y().A(i10).build(), bVar);
    }

    public static void p(boolean z10) {
        if (l()) {
            jb.x.l(new u(), z10);
            x.c();
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.n> f() {
        return new b(vb.o.class);
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
    public vb.n h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.n.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q */
    public void j(vb.n nVar) {
        wb.r.c(nVar.Z(), n());
        wb.r.a(nVar.Y().size());
    }
}
