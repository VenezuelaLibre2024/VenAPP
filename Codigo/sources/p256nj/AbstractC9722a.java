package p256nj;

import dj.InterfaceC6992q;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p205kj.EnumC9284b;
import p241mj.InterfaceC9595e;
import p471yj.C12727a;

/* renamed from: nj.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9722a<T, R> implements InterfaceC6992q<T>, InterfaceC9595e<R> {

    /* renamed from: a */
    protected final InterfaceC6992q<? super R> f23912a;

    /* renamed from: b */
    protected InterfaceC7578b f23913b;

    /* renamed from: c */
    protected InterfaceC9595e<T> f23914c;

    /* renamed from: d */
    protected boolean f23915d;

    /* renamed from: e */
    protected int f23916e;

    public AbstractC9722a(InterfaceC6992q<? super R> interfaceC6992q) {
        this.f23912a = interfaceC6992q;
    }

    @Override // dj.InterfaceC6992q
    /* renamed from: a */
    public void mo605a() {
        if (this.f23915d) {
            return;
        }
        this.f23915d = true;
        this.f23912a.mo605a();
    }

    @Override // dj.InterfaceC6992q
    /* renamed from: b */
    public final void mo606b(InterfaceC7578b interfaceC7578b) {
        if (EnumC9284b.m27698p(this.f23913b, interfaceC7578b)) {
            this.f23913b = interfaceC7578b;
            if (interfaceC7578b instanceof InterfaceC9595e) {
                this.f23914c = (InterfaceC9595e) interfaceC7578b;
            }
            if (m29154e()) {
                this.f23912a.mo606b(this);
                m29153d();
            }
        }
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
        this.f23914c.clear();
    }

    /* renamed from: d */
    protected void m29153d() {
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        this.f23913b.dispose();
    }

    /* renamed from: e */
    protected boolean m29154e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final void m29155f(Throwable th2) {
        C7744b.m23648b(th2);
        this.f23913b.dispose();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final int m29156g(int i10) {
        InterfaceC9595e<T> interfaceC9595e = this.f23914c;
        if (interfaceC9595e == null || (i10 & 4) != 0) {
            return 0;
        }
        int mo27706l = interfaceC9595e.mo27706l(i10);
        if (mo27706l != 0) {
            this.f23916e = mo27706l;
        }
        return mo27706l;
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return this.f23913b.mo616h();
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return this.f23914c.isEmpty();
    }

    @Override // p241mj.InterfaceC9600j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dj.InterfaceC6992q
    public void onError(Throwable th2) {
        if (this.f23915d) {
            C12727a.m41995q(th2);
        } else {
            this.f23915d = true;
            this.f23912a.onError(th2);
        }
    }
}
