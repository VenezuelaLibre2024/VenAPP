package v6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v6.i;

/* loaded from: classes.dex */
public abstract class z implements i {

    /* renamed from: b, reason: collision with root package name */
    protected i.a f28229b;

    /* renamed from: c, reason: collision with root package name */
    protected i.a f28230c;

    /* renamed from: d, reason: collision with root package name */
    private i.a f28231d;

    /* renamed from: e, reason: collision with root package name */
    private i.a f28232e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f28233f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f28234g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28235h;

    public z() {
        ByteBuffer byteBuffer = i.f28059a;
        this.f28233f = byteBuffer;
        this.f28234g = byteBuffer;
        i.a aVar = i.a.f28060e;
        this.f28231d = aVar;
        this.f28232e = aVar;
        this.f28229b = aVar;
        this.f28230c = aVar;
    }

    @Override // v6.i
    public boolean a() {
        return this.f28232e != i.a.f28060e;
    }

    @Override // v6.i
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f28234g;
        this.f28234g = i.f28059a;
        return byteBuffer;
    }

    @Override // v6.i
    public final i.a c(i.a aVar) {
        this.f28231d = aVar;
        this.f28232e = h(aVar);
        return a() ? this.f28232e : i.a.f28060e;
    }

    @Override // v6.i
    public boolean e() {
        return this.f28235h && this.f28234g == i.f28059a;
    }

    @Override // v6.i
    public final void f() {
        this.f28235h = true;
        j();
    }

    @Override // v6.i
    public final void flush() {
        this.f28234g = i.f28059a;
        this.f28235h = false;
        this.f28229b = this.f28231d;
        this.f28230c = this.f28232e;
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return this.f28234g.hasRemaining();
    }

    protected abstract i.a h(i.a aVar);

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer l(int i10) {
        if (this.f28233f.capacity() < i10) {
            this.f28233f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f28233f.clear();
        }
        ByteBuffer byteBuffer = this.f28233f;
        this.f28234g = byteBuffer;
        return byteBuffer;
    }

    @Override // v6.i
    public final void reset() {
        flush();
        this.f28233f = i.f28059a;
        i.a aVar = i.a.f28060e;
        this.f28231d = aVar;
        this.f28232e = aVar;
        this.f28229b = aVar;
        this.f28230c = aVar;
        k();
    }
}
