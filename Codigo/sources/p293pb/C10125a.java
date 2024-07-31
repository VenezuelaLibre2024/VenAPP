package p293pb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p179jb.C9020l;
import p179jb.C9032x;
import p179jb.InterfaceC9013e;
import p400vb.C11812p;
import p400vb.C11813q;
import p400vb.C11821y;
import p419wb.C12132d;
import p419wb.C12144p;
import p419wb.C12146r;

/* renamed from: pb.a */
/* loaded from: classes2.dex */
public final class C10125a extends AbstractC5932d<C11812p> {

    /* renamed from: pb.a$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9013e, C11812p> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9013e mo15252a(C11812p c11812p) {
            return new C12132d(c11812p.m37571Y().m15502w());
        }
    }

    /* renamed from: pb.a$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11813q, C11812p> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11813q>> mo15215c() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new AbstractC5932d.a.C13195a(C11813q.m37577Y().m37581A(64).build(), C9020l.b.TINK));
            hashMap.put("AES256_SIV_RAW", new AbstractC5932d.a.C13195a(C11813q.m37577Y().m37581A(64).build(), C9020l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11812p mo15213a(C11813q c11813q) {
            return C11812p.m37567a0().m37573A(AbstractC5970h.m15486k(C12144p.m38907c(c11813q.m37580X()))).m37574B(C10125a.this.m30244k()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11813q mo15216d(AbstractC5970h abstractC5970h) {
            return C11813q.m37578Z(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11813q c11813q) {
            if (c11813q.m37580X() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + c11813q.m37580X() + ". Valid keys must have 64 bytes.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10125a() {
        super(C11812p.class, new a(InterfaceC9013e.class));
    }

    /* renamed from: m */
    public static void m30243m(boolean z10) {
        C9032x.m26535l(new C10125a(), z10);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11812p> mo15208f() {
        return new b(C11813q.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m30244k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C11812p mo15210h(AbstractC5970h abstractC5970h) {
        return C11812p.m37568b0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11812p c11812p) {
        C12146r.m38913c(c11812p.m37572Z(), m30244k());
        if (c11812p.m37571Y().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + c11812p.m37571Y().size() + ". Valid keys must have 64 bytes.");
    }
}
