package p404vj;

import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import p145hj.C7744b;
import p241mj.InterfaceC9597g;
import p426wj.EnumC12224g;
import p471yj.C12727a;

/* renamed from: vj.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11961b<T, R> implements InterfaceC6984i<T>, InterfaceC9597g<R> {

    /* renamed from: a */
    protected final InterfaceC8015b<? super R> f31730a;

    /* renamed from: b */
    protected InterfaceC8016c f31731b;

    /* renamed from: c */
    protected InterfaceC9597g<T> f31732c;

    /* renamed from: d */
    protected boolean f31733d;

    /* renamed from: e */
    protected int f31734e;

    public AbstractC11961b(InterfaceC8015b<? super R> interfaceC8015b) {
        this.f31730a = interfaceC8015b;
    }

    @Override // im.InterfaceC8015b
    /* renamed from: a */
    public void mo24632a() {
        if (this.f31733d) {
            return;
        }
        this.f31733d = true;
        this.f31730a.mo24632a();
    }

    /* renamed from: b */
    protected void m38390b() {
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
        this.f31731b.cancel();
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
        this.f31732c.clear();
    }

    @Override // dj.InterfaceC6984i, im.InterfaceC8015b
    /* renamed from: d */
    public final void mo20249d(InterfaceC8016c interfaceC8016c) {
        if (EnumC12224g.m39360q(this.f31731b, interfaceC8016c)) {
            this.f31731b = interfaceC8016c;
            if (interfaceC8016c instanceof InterfaceC9597g) {
                this.f31732c = (InterfaceC9597g) interfaceC8016c;
            }
            if (m38391e()) {
                this.f31730a.mo20249d(this);
                m38390b();
            }
        }
    }

    /* renamed from: e */
    protected boolean m38391e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m38392g(Throwable th2) {
        C7744b.m23648b(th2);
        this.f31731b.cancel();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final int m38393h(int i10) {
        InterfaceC9597g<T> interfaceC9597g = this.f31732c;
        if (interfaceC9597g == null || (i10 & 4) != 0) {
            return 0;
        }
        int mo27706l = interfaceC9597g.mo27706l(i10);
        if (mo27706l != 0) {
            this.f31734e = mo27706l;
        }
        return mo27706l;
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public void mo24634i(long j10) {
        this.f31731b.mo24634i(j10);
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return this.f31732c.isEmpty();
    }

    @Override // p241mj.InterfaceC9600j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // im.InterfaceC8015b
    public void onError(Throwable th2) {
        if (this.f31733d) {
            C12727a.m41995q(th2);
        } else {
            this.f31733d = true;
            this.f31730a.onError(th2);
        }
    }
}
