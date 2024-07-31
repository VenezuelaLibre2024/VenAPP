package p350s7;

import java.nio.ByteBuffer;
import p216l7.AbstractC9406g;
import p216l7.C9400a;
import p216l7.C9403d;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11164n0;

/* renamed from: s7.c */
/* loaded from: classes.dex */
public final class C10804c extends AbstractC9406g {

    /* renamed from: a */
    private final C11146e0 f27269a = new C11146e0();

    /* renamed from: b */
    private final C11144d0 f27270b = new C11144d0();

    /* renamed from: c */
    private C11164n0 f27271c;

    @Override // p216l7.AbstractC9406g
    /* renamed from: b */
    protected C9400a mo28014b(C9403d c9403d, ByteBuffer byteBuffer) {
        C11164n0 c11164n0 = this.f27271c;
        if (c11164n0 == null || c9403d.f22806t != c11164n0.m34828e()) {
            C11164n0 c11164n02 = new C11164n0(c9403d.f32144e);
            this.f27271c = c11164n02;
            c11164n02.m34824a(c9403d.f32144e - c9403d.f22806t);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f27269a.m34675S(array, limit);
        this.f27270b.m34639o(array, limit);
        this.f27270b.m34642r(39);
        long m34632h = (this.f27270b.m34632h(1) << 32) | this.f27270b.m34632h(32);
        this.f27270b.m34642r(20);
        int m34632h2 = this.f27270b.m34632h(12);
        int m34632h3 = this.f27270b.m34632h(8);
        this.f27269a.m34678V(14);
        C9400a.b m32937a = m34632h3 != 0 ? m34632h3 != 255 ? m34632h3 != 4 ? m34632h3 != 5 ? m34632h3 != 6 ? null : C10808g.m32937a(this.f27269a, m34632h, this.f27271c) : C10805d.m32917a(this.f27269a, m34632h, this.f27271c) : C10807f.m32924a(this.f27269a) : C10802a.m32914a(this.f27269a, m34632h2, m34632h) : new C10806e();
        return m32937a == null ? new C9400a(new C9400a.b[0]) : new C9400a(m32937a);
    }
}
