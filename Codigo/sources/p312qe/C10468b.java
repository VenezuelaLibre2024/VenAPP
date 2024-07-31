package p312qe;

import com.google.firebase.perf.config.C6277a;
import p029bk.InterfaceC1806a;
import p144hi.C7742b;

/* renamed from: qe.b */
/* loaded from: classes.dex */
public final class C10468b implements InterfaceC1806a {

    /* renamed from: a */
    private final C10467a f26014a;

    public C10468b(C10467a c10467a) {
        this.f26014a = c10467a;
    }

    /* renamed from: a */
    public static C10468b m31397a(C10467a c10467a) {
        return new C10468b(c10467a);
    }

    /* renamed from: c */
    public static C6277a m31398c(C10467a c10467a) {
        return (C6277a) C7742b.m23640c(c10467a.m31390a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6277a get() {
        return m31398c(this.f26014a);
    }
}
