package pb;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jb.e;
import jb.l;
import jb.x;
import vb.p;
import vb.q;
import vb.y;
import wb.r;

/* loaded from: classes2.dex */
public final class a extends d<p> {

    /* renamed from: pb.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0377a extends m<e, p> {
        C0377a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(p pVar) {
            return new wb.d(pVar.Y().w());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0170a<q>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new d.a.C0170a(q.Y().A(64).build(), l.b.TINK));
            hashMap.put("AES256_SIV_RAW", new d.a.C0170a(q.Y().A(64).build(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return p.a0().A(h.k(wb.p.c(qVar.X()))).B(a.this.k()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(h hVar) {
            return q.Z(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) {
            if (qVar.X() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.X() + ". Valid keys must have 64 bytes.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        super(p.class, new C0377a(e.class));
    }

    public static void m(boolean z10) {
        x.l(new a(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, p> f() {
        return new b(q.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public p h(h hVar) {
        return p.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) {
        r.c(pVar.Z(), k());
        if (pVar.Y().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.Y().size() + ". Valid keys must have 64 bytes.");
    }
}
