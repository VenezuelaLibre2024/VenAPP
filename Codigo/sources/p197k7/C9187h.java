package p197k7;

import java.nio.ByteBuffer;
import p363t8.C11137a;
import p414w6.C12082g;

/* renamed from: k7.h */
/* loaded from: classes.dex */
final class C9187h extends C12082g {

    /* renamed from: t */
    private long f22220t;

    /* renamed from: u */
    private int f22221u;

    /* renamed from: v */
    private int f22222v;

    public C9187h() {
        super(2);
        this.f22222v = 32;
    }

    /* renamed from: E */
    private boolean m27242E(C12082g c12082g) {
        ByteBuffer byteBuffer;
        if (!m27247I()) {
            return true;
        }
        if (this.f22221u >= this.f22222v || c12082g.m38793r() != m38793r()) {
            return false;
        }
        ByteBuffer byteBuffer2 = c12082g.f32142c;
        return byteBuffer2 == null || (byteBuffer = this.f32142c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    /* renamed from: D */
    public boolean m27243D(C12082g c12082g) {
        C11137a.m34599a(!c12082g.m38809A());
        C11137a.m34599a(!c12082g.m38792q());
        C11137a.m34599a(!c12082g.m38794s());
        if (!m27242E(c12082g)) {
            return false;
        }
        int i10 = this.f22221u;
        this.f22221u = i10 + 1;
        if (i10 == 0) {
            this.f32144e = c12082g.f32144e;
            if (c12082g.m38796u()) {
                m38798w(1);
            }
        }
        if (c12082g.m38793r()) {
            m38798w(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = c12082g.f32142c;
        if (byteBuffer != null) {
            m38811y(byteBuffer.remaining());
            this.f32142c.put(byteBuffer);
        }
        this.f22220t = c12082g.f32144e;
        return true;
    }

    /* renamed from: F */
    public long m27244F() {
        return this.f32144e;
    }

    /* renamed from: G */
    public long m27245G() {
        return this.f22220t;
    }

    /* renamed from: H */
    public int m27246H() {
        return this.f22221u;
    }

    /* renamed from: I */
    public boolean m27247I() {
        return this.f22221u > 0;
    }

    /* renamed from: J */
    public void m27248J(int i10) {
        C11137a.m34599a(i10 > 0);
        this.f22222v = i10;
    }

    @Override // p414w6.C12082g, p414w6.AbstractC12076a
    /* renamed from: n */
    public void mo22818n() {
        super.mo22818n();
        this.f22221u = 0;
    }
}
