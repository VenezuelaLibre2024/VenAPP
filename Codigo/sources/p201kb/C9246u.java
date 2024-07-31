package p201kb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p179jb.C9020l;
import p179jb.C9032x;
import p179jb.InterfaceC9009a;
import p238mb.C9563a;
import p400vb.C11810n;
import p400vb.C11811o;
import p400vb.C11821y;
import p419wb.C12144p;
import p419wb.C12146r;

/* renamed from: kb.u */
/* loaded from: classes2.dex */
public final class C9246u extends AbstractC5932d<C11810n> {

    /* renamed from: kb.u$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11810n> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11810n c11810n) {
            return new C9563a(c11810n.m37553Y().m15502w());
        }
    }

    /* renamed from: kb.u$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11811o, C11810n> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11811o>> mo15215c() {
            HashMap hashMap = new HashMap();
            C9020l.b bVar = C9020l.b.TINK;
            hashMap.put("AES128_GCM_SIV", C9246u.m27541m(16, bVar));
            C9020l.b bVar2 = C9020l.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", C9246u.m27541m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", C9246u.m27541m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", C9246u.m27541m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11810n mo15213a(C11811o c11811o) {
            return C11810n.m37549a0().m37555A(AbstractC5970h.m15486k(C12144p.m38907c(c11811o.m37562X()))).m37556B(C9246u.this.m27543n()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11811o mo15216d(AbstractC5970h abstractC5970h) {
            return C11811o.m37560Z(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11811o c11811o) {
            C12146r.m38911a(c11811o.m37562X());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9246u() {
        super(C11810n.class, new a(InterfaceC9009a.class));
    }

    /* renamed from: l */
    private static boolean m27540l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static AbstractC5932d.a.C13195a<C11811o> m27541m(int i10, C9020l.b bVar) {
        return new AbstractC5932d.a.C13195a<>(C11811o.m37559Y().m37563A(i10).build(), bVar);
    }

    /* renamed from: p */
    public static void m27542p(boolean z10) {
        if (m27540l()) {
            C9032x.m26535l(new C9246u(), z10);
            C9249x.m27559c();
        }
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11810n> mo15208f() {
        return new b(C11811o.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: n */
    public int m27543n() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C11810n mo15210h(AbstractC5970h abstractC5970h) {
        return C11810n.m37550b0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11810n c11810n) {
        C12146r.m38913c(c11810n.m37554Z(), m27543n());
        C12146r.m38911a(c11810n.m37553Y().size());
    }
}
