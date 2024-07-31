package p124gk;

import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: gk.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7582a implements InterfaceC7587f.b {

    /* renamed from: a */
    private final InterfaceC7587f.c<?> f17918a;

    public AbstractC7582a(InterfaceC7587f.c<?> key) {
        C9322n.m27781e(key, "key");
        this.f17918a = key;
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: Q */
    public InterfaceC7587f mo20645Q(InterfaceC7587f.c<?> cVar) {
        return InterfaceC7587f.b.a.m23045c(this, cVar);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: U */
    public InterfaceC7587f mo20646U(InterfaceC7587f interfaceC7587f) {
        return InterfaceC7587f.b.a.m23046d(this, interfaceC7587f);
    }

    @Override // p124gk.InterfaceC7587f.b, p124gk.InterfaceC7587f
    /* renamed from: b */
    public <E extends InterfaceC7587f.b> E mo20647b(InterfaceC7587f.c<E> cVar) {
        return (E) InterfaceC7587f.b.a.m23044b(this, cVar);
    }

    @Override // p124gk.InterfaceC7587f.b
    public InterfaceC7587f.c<?> getKey() {
        return this.f17918a;
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: z0 */
    public <R> R mo20648z0(R r10, InterfaceC10002p<? super R, ? super InterfaceC7587f.b, ? extends R> interfaceC10002p) {
        return (R) InterfaceC7587f.b.a.m23043a(this, r10, interfaceC10002p);
    }
}
