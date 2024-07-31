package p494zk;

import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: zk.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13032a<T> extends C13050d2 implements Continuation<T>, InterfaceC13076k0 {

    /* renamed from: c */
    private final InterfaceC7587f f35386c;

    public AbstractC13032a(InterfaceC7587f interfaceC7587f, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m43115b0((InterfaceC13125w1) interfaceC7587f.mo20647b(InterfaceC13125w1.f35491q));
        }
        this.f35386c = interfaceC7587f.mo20646U(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p494zk.C13050d2
    /* renamed from: D */
    public String mo43029D() {
        return C13092o0.m43273a(this) + " was cancelled";
    }

    /* renamed from: N0 */
    protected void mo21550N0(Object obj) {
        mo21552t(obj);
    }

    /* renamed from: O0 */
    protected void m43030O0(Throwable th2, boolean z10) {
    }

    /* renamed from: P0 */
    protected void m43031P0(T t10) {
    }

    /* renamed from: Q0 */
    public final <R> void m43032Q0(EnumC13084m0 enumC13084m0, R r10, InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p) {
        enumC13084m0.m43237h(interfaceC10002p, r10, this);
    }

    @Override // p494zk.C13050d2, p494zk.InterfaceC13125w1
    /* renamed from: a */
    public boolean mo43033a() {
        return super.mo43033a();
    }

    @Override // p494zk.C13050d2
    /* renamed from: a0 */
    public final void mo43034a0(Throwable th2) {
        C13072j0.m43220a(this.f35386c, th2);
    }

    @Override // p124gk.Continuation
    public final InterfaceC7587f getContext() {
        return this.f35386c;
    }

    @Override // p494zk.InterfaceC13076k0
    /* renamed from: h */
    public InterfaceC7587f mo7278h() {
        return this.f35386c;
    }

    @Override // p494zk.C13050d2
    /* renamed from: p0 */
    public String mo43035p0() {
        String m43164b = C13060g0.m43164b(this.f35386c);
        if (m43164b == null) {
            return super.mo43035p0();
        }
        return '\"' + m43164b + "\":" + super.mo43035p0();
    }

    @Override // p124gk.Continuation
    public final void resumeWith(Object obj) {
        Object m43124n0 = m43124n0(C13052e0.m43150d(obj, null, 1, null));
        if (m43124n0 == C13054e2.f35425b) {
            return;
        }
        mo21550N0(m43124n0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p494zk.C13050d2
    /* renamed from: u0 */
    protected final void mo43036u0(Object obj) {
        if (!(obj instanceof C13033a0)) {
            m43031P0(obj);
        } else {
            C13033a0 c13033a0 = (C13033a0) obj;
            m43030O0(c13033a0.f35388a, c13033a0.m43037a());
        }
    }
}
