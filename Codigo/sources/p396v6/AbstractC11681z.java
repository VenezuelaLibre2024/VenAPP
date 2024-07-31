package p396v6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p396v6.InterfaceC11647i;

/* renamed from: v6.z */
/* loaded from: classes.dex */
public abstract class AbstractC11681z implements InterfaceC11647i {

    /* renamed from: b */
    protected InterfaceC11647i.a f30598b;

    /* renamed from: c */
    protected InterfaceC11647i.a f30599c;

    /* renamed from: d */
    private InterfaceC11647i.a f30600d;

    /* renamed from: e */
    private InterfaceC11647i.a f30601e;

    /* renamed from: f */
    private ByteBuffer f30602f;

    /* renamed from: g */
    private ByteBuffer f30603g;

    /* renamed from: h */
    private boolean f30604h;

    public AbstractC11681z() {
        ByteBuffer byteBuffer = InterfaceC11647i.f30409a;
        this.f30602f = byteBuffer;
        this.f30603g = byteBuffer;
        InterfaceC11647i.a aVar = InterfaceC11647i.a.f30410e;
        this.f30600d = aVar;
        this.f30601e = aVar;
        this.f30598b = aVar;
        this.f30599c = aVar;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: a */
    public boolean mo36621a() {
        return this.f30601e != InterfaceC11647i.a.f30410e;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: b */
    public ByteBuffer mo36622b() {
        ByteBuffer byteBuffer = this.f30603g;
        this.f30603g = InterfaceC11647i.f30409a;
        return byteBuffer;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: c */
    public final InterfaceC11647i.a mo36623c(InterfaceC11647i.a aVar) {
        this.f30600d = aVar;
        this.f30601e = mo36465h(aVar);
        return mo36621a() ? this.f30601e : InterfaceC11647i.a.f30410e;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: e */
    public boolean mo36624e() {
        return this.f30604h && this.f30603g == InterfaceC11647i.f30409a;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: f */
    public final void mo36625f() {
        this.f30604h = true;
        mo36732j();
    }

    @Override // p396v6.InterfaceC11647i
    public final void flush() {
        this.f30603g = InterfaceC11647i.f30409a;
        this.f30604h = false;
        this.f30598b = this.f30600d;
        this.f30599c = this.f30601e;
        mo36466i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean m36797g() {
        return this.f30603g.hasRemaining();
    }

    /* renamed from: h */
    protected abstract InterfaceC11647i.a mo36465h(InterfaceC11647i.a aVar);

    /* renamed from: i */
    protected void mo36466i() {
    }

    /* renamed from: j */
    protected void mo36732j() {
    }

    /* renamed from: k */
    protected void mo36467k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final ByteBuffer m36798l(int i10) {
        if (this.f30602f.capacity() < i10) {
            this.f30602f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f30602f.clear();
        }
        ByteBuffer byteBuffer = this.f30602f;
        this.f30603g = byteBuffer;
        return byteBuffer;
    }

    @Override // p396v6.InterfaceC11647i
    public final void reset() {
        flush();
        this.f30602f = InterfaceC11647i.f30409a;
        InterfaceC11647i.a aVar = InterfaceC11647i.a.f30410e;
        this.f30600d = aVar;
        this.f30601e = aVar;
        this.f30598b = aVar;
        this.f30599c = aVar;
        mo36467k();
    }
}
