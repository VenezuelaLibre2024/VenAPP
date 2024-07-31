package p312qe;

import ee.InterfaceC7183b;
import p029bk.InterfaceC1806a;
import p098f6.InterfaceC7303g;
import p144hi.C7742b;

/* renamed from: qe.h */
/* loaded from: classes.dex */
public final class C10474h implements InterfaceC1806a {

    /* renamed from: a */
    private final C10467a f26020a;

    public C10474h(C10467a c10467a) {
        this.f26020a = c10467a;
    }

    /* renamed from: a */
    public static C10474h m31415a(C10467a c10467a) {
        return new C10474h(c10467a);
    }

    /* renamed from: c */
    public static InterfaceC7183b<InterfaceC7303g> m31416c(C10467a c10467a) {
        return (InterfaceC7183b) C7742b.m23640c(c10467a.m31396g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7183b<InterfaceC7303g> get() {
        return m31416c(this.f26020a);
    }
}
