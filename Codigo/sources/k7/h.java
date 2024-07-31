package k7;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class h extends w6.g {

    /* renamed from: t, reason: collision with root package name */
    private long f20438t;

    /* renamed from: u, reason: collision with root package name */
    private int f20439u;

    /* renamed from: v, reason: collision with root package name */
    private int f20440v;

    public h() {
        super(2);
        this.f20440v = 32;
    }

    private boolean E(w6.g gVar) {
        ByteBuffer byteBuffer;
        if (!I()) {
            return true;
        }
        if (this.f20439u >= this.f20440v || gVar.r() != r()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f29679c;
        return byteBuffer2 == null || (byteBuffer = this.f29679c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean D(w6.g gVar) {
        t8.a.a(!gVar.A());
        t8.a.a(!gVar.q());
        t8.a.a(!gVar.s());
        if (!E(gVar)) {
            return false;
        }
        int i10 = this.f20439u;
        this.f20439u = i10 + 1;
        if (i10 == 0) {
            this.f29681e = gVar.f29681e;
            if (gVar.u()) {
                w(1);
            }
        }
        if (gVar.r()) {
            w(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f29679c;
        if (byteBuffer != null) {
            y(byteBuffer.remaining());
            this.f29679c.put(byteBuffer);
        }
        this.f20438t = gVar.f29681e;
        return true;
    }

    public long F() {
        return this.f29681e;
    }

    public long G() {
        return this.f20438t;
    }

    public int H() {
        return this.f20439u;
    }

    public boolean I() {
        return this.f20439u > 0;
    }

    public void J(int i10) {
        t8.a.a(i10 > 0);
        this.f20440v = i10;
    }

    @Override // w6.g, w6.a
    public void n() {
        super.n();
        this.f20439u = 0;
    }
}
