package kb;

import com.google.crypto.tink.internal.d;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jb.l;
import vb.y;

/* loaded from: classes2.dex */
public final class h extends com.google.crypto.tink.internal.d<vb.i> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.i> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.i iVar) {
            return new wb.b(iVar.Z().w(), iVar.a0().Y());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.j, vb.i> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<vb.j>> c() {
            HashMap hashMap = new HashMap();
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_EAX", h.l(16, 16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_EAX_RAW", h.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", h.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.i a(vb.j jVar) {
            return vb.i.c0().A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(jVar.Y()))).B(jVar.Z()).C(h.this.m()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public vb.j d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.j.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(vb.j jVar) {
            wb.r.a(jVar.Y());
            if (jVar.Z().Y() != 12 && jVar.Z().Y() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public h() {
        super(vb.i.class, new a(jb.a.class));
    }

    public static d.a.C0170a<vb.j> l(int i10, int i11, l.b bVar) {
        return new d.a.C0170a<>(vb.j.a0().A(i10).B(vb.k.Z().A(i11).build()).build(), bVar);
    }

    public static void o(boolean z10) {
        jb.x.l(new h(), z10);
        n.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.i> f() {
        return new b(vb.j.class);
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
    public vb.i h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.i.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p */
    public void j(vb.i iVar) {
        wb.r.c(iVar.b0(), m());
        wb.r.a(iVar.Z().size());
        if (iVar.a0().Y() != 12 && iVar.a0().Y() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
