package p404vj;

import im.InterfaceC8016c;
import p145hj.C7744b;
import p241mj.InterfaceC9591a;
import p241mj.InterfaceC9597g;
import p426wj.EnumC12224g;
import p471yj.C12727a;

/* renamed from: vj.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11960a<T, R> implements InterfaceC9591a<T>, InterfaceC9597g<R> {

    /* renamed from: a */
    protected final InterfaceC9591a<? super R> f31725a;

    /* renamed from: b */
    protected InterfaceC8016c f31726b;

    /* renamed from: c */
    protected InterfaceC9597g<T> f31727c;

    /* renamed from: d */
    protected boolean f31728d;

    /* renamed from: e */
    protected int f31729e;

    public AbstractC11960a(InterfaceC9591a<? super R> interfaceC9591a) {
        this.f31725a = interfaceC9591a;
    }

    @Override // im.InterfaceC8015b
    /* renamed from: a */
    public void mo24632a() {
        if (this.f31728d) {
            return;
        }
        this.f31728d = true;
        this.f31725a.mo24632a();
    }

    /* renamed from: b */
    protected void m38386b() {
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
        this.f31726b.cancel();
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
        this.f31727c.clear();
    }

    @Override // dj.InterfaceC6984i, im.InterfaceC8015b
    /* renamed from: d */
    public final void mo20249d(InterfaceC8016c interfaceC8016c) {
        if (EnumC12224g.m39360q(this.f31726b, interfaceC8016c)) {
            this.f31726b = interfaceC8016c;
            if (interfaceC8016c instanceof InterfaceC9597g) {
                this.f31727c = (InterfaceC9597g) interfaceC8016c;
            }
            if (m38387e()) {
                this.f31725a.mo20249d(this);
                m38386b();
            }
        }
    }

    /* renamed from: e */
    protected boolean m38387e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m38388g(Throwable th2) {
        C7744b.m23648b(th2);
        this.f31726b.cancel();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final int m38389h(int i10) {
        InterfaceC9597g<T> interfaceC9597g = this.f31727c;
        if (interfaceC9597g == null || (i10 & 4) != 0) {
            return 0;
        }
        int mo27706l = interfaceC9597g.mo27706l(i10);
        if (mo27706l != 0) {
            this.f31729e = mo27706l;
        }
        return mo27706l;
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public void mo24634i(long j10) {
        this.f31726b.mo24634i(j10);
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return this.f31727c.isEmpty();
    }

    @Override // p241mj.InterfaceC9600j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // im.InterfaceC8015b
    public void onError(Throwable th2) {
        if (this.f31728d) {
            C12727a.m41995q(th2);
        } else {
            this.f31728d = true;
            this.f31725a.onError(th2);
        }
    }
}
