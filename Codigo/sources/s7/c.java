package s7;

import java.nio.ByteBuffer;
import l7.a;
import t8.d0;
import t8.e0;
import t8.n0;

/* loaded from: classes.dex */
public final class c extends l7.g {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f25150a = new e0();

    /* renamed from: b, reason: collision with root package name */
    private final d0 f25151b = new d0();

    /* renamed from: c, reason: collision with root package name */
    private n0 f25152c;

    @Override // l7.g
    protected l7.a b(l7.d dVar, ByteBuffer byteBuffer) {
        n0 n0Var = this.f25152c;
        if (n0Var == null || dVar.f20984t != n0Var.e()) {
            n0 n0Var2 = new n0(dVar.f29681e);
            this.f25152c = n0Var2;
            n0Var2.a(dVar.f29681e - dVar.f20984t);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f25150a.S(array, limit);
        this.f25151b.o(array, limit);
        this.f25151b.r(39);
        long h10 = (this.f25151b.h(1) << 32) | this.f25151b.h(32);
        this.f25151b.r(20);
        int h11 = this.f25151b.h(12);
        int h12 = this.f25151b.h(8);
        this.f25150a.V(14);
        a.b a10 = h12 != 0 ? h12 != 255 ? h12 != 4 ? h12 != 5 ? h12 != 6 ? null : g.a(this.f25150a, h10, this.f25152c) : d.a(this.f25150a, h10, this.f25152c) : f.a(this.f25150a) : a.a(this.f25150a, h11, h10) : new e();
        return a10 == null ? new l7.a(new a.b[0]) : new l7.a(a10);
    }
}
