package p069dl;

import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: dl.e */
/* loaded from: classes3.dex */
public final class C7047e implements InterfaceC7587f {

    /* renamed from: a */
    public final Throwable f15609a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC7587f f15610b;

    public C7047e(Throwable th2, InterfaceC7587f interfaceC7587f) {
        this.f15609a = th2;
        this.f15610b = interfaceC7587f;
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: Q */
    public InterfaceC7587f mo20645Q(InterfaceC7587f.c<?> cVar) {
        return this.f15610b.mo20645Q(cVar);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: U */
    public InterfaceC7587f mo20646U(InterfaceC7587f interfaceC7587f) {
        return this.f15610b.mo20646U(interfaceC7587f);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: b */
    public <E extends InterfaceC7587f.b> E mo20647b(InterfaceC7587f.c<E> cVar) {
        return (E) this.f15610b.mo20647b(cVar);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: z0 */
    public <R> R mo20648z0(R r10, InterfaceC10002p<? super R, ? super InterfaceC7587f.b, ? extends R> interfaceC10002p) {
        return (R) this.f15610b.mo20648z0(r10, interfaceC10002p);
    }
}
