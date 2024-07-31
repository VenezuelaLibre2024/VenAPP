package kb;

import com.google.crypto.tink.internal.d;
import java.security.GeneralSecurityException;
import vb.y;

/* loaded from: classes2.dex */
public class f extends com.google.crypto.tink.internal.d<vb.f> {

    /* loaded from: classes2.dex */
    class a extends com.google.crypto.tink.internal.m<wb.l, vb.f> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public wb.l a(vb.f fVar) {
            return new wb.a(fVar.a0().w(), fVar.b0().Y());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends d.a<vb.g, vb.f> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public vb.f a(vb.g gVar) {
            return vb.f.d0().B(gVar.a0()).A(com.google.crypto.tink.shaded.protobuf.h.k(wb.p.c(gVar.Z()))).C(f.this.l()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public vb.g d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.g.c0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(vb.g gVar) {
            wb.r.a(gVar.Z());
            f.this.o(gVar.a0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        super(vb.f.class, new a(wb.l.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(vb.h hVar) {
        if (hVar.Y() < 12 || hVar.Y() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.f> f() {
        return new b(vb.g.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public vb.f h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.f.e0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(vb.f fVar) {
        wb.r.c(fVar.c0(), l());
        wb.r.a(fVar.a0().size());
        o(fVar.b0());
    }
}
