package p312qe;

import p029bk.InterfaceC1806a;
import p106fe.InterfaceC7337f;
import p144hi.C7742b;

/* renamed from: qe.d */
/* loaded from: classes.dex */
public final class C10470d implements InterfaceC1806a {

    /* renamed from: a */
    private final C10467a f26016a;

    public C10470d(C10467a c10467a) {
        this.f26016a = c10467a;
    }

    /* renamed from: a */
    public static C10470d m31403a(C10467a c10467a) {
        return new C10470d(c10467a);
    }

    /* renamed from: c */
    public static InterfaceC7337f m31404c(C10467a c10467a) {
        return (InterfaceC7337f) C7742b.m23640c(c10467a.m31392c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7337f get() {
        return m31404c(this.f26016a);
    }
}
