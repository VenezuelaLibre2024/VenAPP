package p201kb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.GeneralSecurityException;
import p400vb.C11795f;
import p400vb.C11797g;
import p400vb.C11799h;
import p400vb.C11821y;
import p419wb.C12129a;
import p419wb.C12144p;
import p419wb.C12146r;
import p419wb.InterfaceC12140l;

/* renamed from: kb.f */
/* loaded from: classes2.dex */
public class C9225f extends AbstractC5932d<C11795f> {

    /* renamed from: kb.f$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC12140l, C11795f> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC12140l mo15252a(C11795f c11795f) {
            return new C12129a(c11795f.m37431a0().m15502w(), c11795f.m37432b0().m37469Y());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb.f$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractC5932d.a<C11797g, C11795f> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11795f mo15213a(C11797g c11797g) {
            return C11795f.m37426d0().m37435B(c11797g.m37450a0()).m37434A(AbstractC5970h.m15486k(C12144p.m38907c(c11797g.m37449Z()))).m37436C(C9225f.this.m27437l()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11797g mo15216d(AbstractC5970h abstractC5970h) {
            return C11797g.m37446c0(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11797g c11797g) {
            C12146r.m38911a(c11797g.m37449Z());
            C9225f.this.m27436o(c11797g.m37450a0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9225f() {
        super(C11795f.class, new a(InterfaceC12140l.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m27436o(C11799h c11799h) {
        if (c11799h.m37469Y() < 12 || c11799h.m37469Y() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11795f> mo15208f() {
        return new b(C11797g.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: l */
    public int m27437l() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C11795f mo15210h(AbstractC5970h abstractC5970h) {
        return C11795f.m37427e0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11795f c11795f) {
        C12146r.m38913c(c11795f.m37433c0(), m27437l());
        C12146r.m38911a(c11795f.m37431a0().size());
        m27436o(c11795f.m37432b0());
    }
}
