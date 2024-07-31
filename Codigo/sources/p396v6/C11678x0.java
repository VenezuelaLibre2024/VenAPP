package p396v6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p363t8.C11137a;
import p363t8.C11172r0;
import p396v6.InterfaceC11647i;

/* renamed from: v6.x0 */
/* loaded from: classes.dex */
public final class C11678x0 implements InterfaceC11647i {

    /* renamed from: b */
    private int f30574b;

    /* renamed from: c */
    private float f30575c = 1.0f;

    /* renamed from: d */
    private float f30576d = 1.0f;

    /* renamed from: e */
    private InterfaceC11647i.a f30577e;

    /* renamed from: f */
    private InterfaceC11647i.a f30578f;

    /* renamed from: g */
    private InterfaceC11647i.a f30579g;

    /* renamed from: h */
    private InterfaceC11647i.a f30580h;

    /* renamed from: i */
    private boolean f30581i;

    /* renamed from: j */
    private C11676w0 f30582j;

    /* renamed from: k */
    private ByteBuffer f30583k;

    /* renamed from: l */
    private ShortBuffer f30584l;

    /* renamed from: m */
    private ByteBuffer f30585m;

    /* renamed from: n */
    private long f30586n;

    /* renamed from: o */
    private long f30587o;

    /* renamed from: p */
    private boolean f30588p;

    public C11678x0() {
        InterfaceC11647i.a aVar = InterfaceC11647i.a.f30410e;
        this.f30577e = aVar;
        this.f30578f = aVar;
        this.f30579g = aVar;
        this.f30580h = aVar;
        ByteBuffer byteBuffer = InterfaceC11647i.f30409a;
        this.f30583k = byteBuffer;
        this.f30584l = byteBuffer.asShortBuffer();
        this.f30585m = byteBuffer;
        this.f30574b = -1;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: a */
    public boolean mo36621a() {
        return this.f30578f.f30411a != -1 && (Math.abs(this.f30575c - 1.0f) >= 1.0E-4f || Math.abs(this.f30576d - 1.0f) >= 1.0E-4f || this.f30578f.f30411a != this.f30577e.f30411a);
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: b */
    public ByteBuffer mo36622b() {
        int m36765k;
        C11676w0 c11676w0 = this.f30582j;
        if (c11676w0 != null && (m36765k = c11676w0.m36765k()) > 0) {
            if (this.f30583k.capacity() < m36765k) {
                ByteBuffer order = ByteBuffer.allocateDirect(m36765k).order(ByteOrder.nativeOrder());
                this.f30583k = order;
                this.f30584l = order.asShortBuffer();
            } else {
                this.f30583k.clear();
                this.f30584l.clear();
            }
            c11676w0.m36764j(this.f30584l);
            this.f30587o += m36765k;
            this.f30583k.limit(m36765k);
            this.f30585m = this.f30583k;
        }
        ByteBuffer byteBuffer = this.f30585m;
        this.f30585m = InterfaceC11647i.f30409a;
        return byteBuffer;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: c */
    public InterfaceC11647i.a mo36623c(InterfaceC11647i.a aVar) {
        if (aVar.f30413c != 2) {
            throw new InterfaceC11647i.b(aVar);
        }
        int i10 = this.f30574b;
        if (i10 == -1) {
            i10 = aVar.f30411a;
        }
        this.f30577e = aVar;
        InterfaceC11647i.a aVar2 = new InterfaceC11647i.a(i10, aVar.f30412b, 2);
        this.f30578f = aVar2;
        this.f30581i = true;
        return aVar2;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: d */
    public void mo36464d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C11676w0 c11676w0 = (C11676w0) C11137a.m34603e(this.f30582j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f30586n += remaining;
            c11676w0.m36768t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: e */
    public boolean mo36624e() {
        C11676w0 c11676w0;
        return this.f30588p && ((c11676w0 = this.f30582j) == null || c11676w0.m36765k() == 0);
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: f */
    public void mo36625f() {
        C11676w0 c11676w0 = this.f30582j;
        if (c11676w0 != null) {
            c11676w0.m36767s();
        }
        this.f30588p = true;
    }

    @Override // p396v6.InterfaceC11647i
    public void flush() {
        if (mo36621a()) {
            InterfaceC11647i.a aVar = this.f30577e;
            this.f30579g = aVar;
            InterfaceC11647i.a aVar2 = this.f30578f;
            this.f30580h = aVar2;
            if (this.f30581i) {
                this.f30582j = new C11676w0(aVar.f30411a, aVar.f30412b, this.f30575c, this.f30576d, aVar2.f30411a);
            } else {
                C11676w0 c11676w0 = this.f30582j;
                if (c11676w0 != null) {
                    c11676w0.m36763i();
                }
            }
        }
        this.f30585m = InterfaceC11647i.f30409a;
        this.f30586n = 0L;
        this.f30587o = 0L;
        this.f30588p = false;
    }

    /* renamed from: g */
    public long m36791g(long j10) {
        if (this.f30587o < 1024) {
            return (long) (this.f30575c * j10);
        }
        long m36766l = this.f30586n - ((C11676w0) C11137a.m34603e(this.f30582j)).m36766l();
        int i10 = this.f30580h.f30411a;
        int i11 = this.f30579g.f30411a;
        return i10 == i11 ? C11172r0.m34885O0(j10, m36766l, this.f30587o) : C11172r0.m34885O0(j10, m36766l * i10, this.f30587o * i11);
    }

    /* renamed from: h */
    public void m36792h(float f10) {
        if (this.f30576d != f10) {
            this.f30576d = f10;
            this.f30581i = true;
        }
    }

    /* renamed from: i */
    public void m36793i(float f10) {
        if (this.f30575c != f10) {
            this.f30575c = f10;
            this.f30581i = true;
        }
    }

    @Override // p396v6.InterfaceC11647i
    public void reset() {
        this.f30575c = 1.0f;
        this.f30576d = 1.0f;
        InterfaceC11647i.a aVar = InterfaceC11647i.a.f30410e;
        this.f30577e = aVar;
        this.f30578f = aVar;
        this.f30579g = aVar;
        this.f30580h = aVar;
        ByteBuffer byteBuffer = InterfaceC11647i.f30409a;
        this.f30583k = byteBuffer;
        this.f30584l = byteBuffer.asShortBuffer();
        this.f30585m = byteBuffer;
        this.f30574b = -1;
        this.f30581i = false;
        this.f30582j = null;
        this.f30586n = 0L;
        this.f30587o = 0L;
        this.f30588p = false;
    }
}
