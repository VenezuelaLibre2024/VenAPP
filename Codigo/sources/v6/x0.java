package v6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import v6.i;

/* loaded from: classes.dex */
public final class x0 implements i {

    /* renamed from: b, reason: collision with root package name */
    private int f28205b;

    /* renamed from: c, reason: collision with root package name */
    private float f28206c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f28207d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private i.a f28208e;

    /* renamed from: f, reason: collision with root package name */
    private i.a f28209f;

    /* renamed from: g, reason: collision with root package name */
    private i.a f28210g;

    /* renamed from: h, reason: collision with root package name */
    private i.a f28211h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28212i;

    /* renamed from: j, reason: collision with root package name */
    private w0 f28213j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f28214k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f28215l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f28216m;

    /* renamed from: n, reason: collision with root package name */
    private long f28217n;

    /* renamed from: o, reason: collision with root package name */
    private long f28218o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28219p;

    public x0() {
        i.a aVar = i.a.f28060e;
        this.f28208e = aVar;
        this.f28209f = aVar;
        this.f28210g = aVar;
        this.f28211h = aVar;
        ByteBuffer byteBuffer = i.f28059a;
        this.f28214k = byteBuffer;
        this.f28215l = byteBuffer.asShortBuffer();
        this.f28216m = byteBuffer;
        this.f28205b = -1;
    }

    @Override // v6.i
    public boolean a() {
        return this.f28209f.f28061a != -1 && (Math.abs(this.f28206c - 1.0f) >= 1.0E-4f || Math.abs(this.f28207d - 1.0f) >= 1.0E-4f || this.f28209f.f28061a != this.f28208e.f28061a);
    }

    @Override // v6.i
    public ByteBuffer b() {
        int k10;
        w0 w0Var = this.f28213j;
        if (w0Var != null && (k10 = w0Var.k()) > 0) {
            if (this.f28214k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f28214k = order;
                this.f28215l = order.asShortBuffer();
            } else {
                this.f28214k.clear();
                this.f28215l.clear();
            }
            w0Var.j(this.f28215l);
            this.f28218o += k10;
            this.f28214k.limit(k10);
            this.f28216m = this.f28214k;
        }
        ByteBuffer byteBuffer = this.f28216m;
        this.f28216m = i.f28059a;
        return byteBuffer;
    }

    @Override // v6.i
    public i.a c(i.a aVar) {
        if (aVar.f28063c != 2) {
            throw new i.b(aVar);
        }
        int i10 = this.f28205b;
        if (i10 == -1) {
            i10 = aVar.f28061a;
        }
        this.f28208e = aVar;
        i.a aVar2 = new i.a(i10, aVar.f28062b, 2);
        this.f28209f = aVar2;
        this.f28212i = true;
        return aVar2;
    }

    @Override // v6.i
    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            w0 w0Var = (w0) t8.a.e(this.f28213j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f28217n += remaining;
            w0Var.t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // v6.i
    public boolean e() {
        w0 w0Var;
        return this.f28219p && ((w0Var = this.f28213j) == null || w0Var.k() == 0);
    }

    @Override // v6.i
    public void f() {
        w0 w0Var = this.f28213j;
        if (w0Var != null) {
            w0Var.s();
        }
        this.f28219p = true;
    }

    @Override // v6.i
    public void flush() {
        if (a()) {
            i.a aVar = this.f28208e;
            this.f28210g = aVar;
            i.a aVar2 = this.f28209f;
            this.f28211h = aVar2;
            if (this.f28212i) {
                this.f28213j = new w0(aVar.f28061a, aVar.f28062b, this.f28206c, this.f28207d, aVar2.f28061a);
            } else {
                w0 w0Var = this.f28213j;
                if (w0Var != null) {
                    w0Var.i();
                }
            }
        }
        this.f28216m = i.f28059a;
        this.f28217n = 0L;
        this.f28218o = 0L;
        this.f28219p = false;
    }

    public long g(long j10) {
        if (this.f28218o < 1024) {
            return (long) (this.f28206c * j10);
        }
        long l10 = this.f28217n - ((w0) t8.a.e(this.f28213j)).l();
        int i10 = this.f28211h.f28061a;
        int i11 = this.f28210g.f28061a;
        return i10 == i11 ? t8.r0.O0(j10, l10, this.f28218o) : t8.r0.O0(j10, l10 * i10, this.f28218o * i11);
    }

    public void h(float f10) {
        if (this.f28207d != f10) {
            this.f28207d = f10;
            this.f28212i = true;
        }
    }

    public void i(float f10) {
        if (this.f28206c != f10) {
            this.f28206c = f10;
            this.f28212i = true;
        }
    }

    @Override // v6.i
    public void reset() {
        this.f28206c = 1.0f;
        this.f28207d = 1.0f;
        i.a aVar = i.a.f28060e;
        this.f28208e = aVar;
        this.f28209f = aVar;
        this.f28210g = aVar;
        this.f28211h = aVar;
        ByteBuffer byteBuffer = i.f28059a;
        this.f28214k = byteBuffer;
        this.f28215l = byteBuffer.asShortBuffer();
        this.f28216m = byteBuffer;
        this.f28205b = -1;
        this.f28212i = false;
        this.f28213j = null;
        this.f28217n = 0L;
        this.f28218o = 0L;
        this.f28219p = false;
    }
}
