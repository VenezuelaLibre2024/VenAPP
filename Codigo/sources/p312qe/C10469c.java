package p312qe;

import p029bk.InterfaceC1806a;
import p144hi.C7742b;
import p485zb.C12867g;

/* renamed from: qe.c */
/* loaded from: classes.dex */
public final class C10469c implements InterfaceC1806a {

    /* renamed from: a */
    private final C10467a f26015a;

    public C10469c(C10467a c10467a) {
        this.f26015a = c10467a;
    }

    /* renamed from: a */
    public static C10469c m31400a(C10467a c10467a) {
        return new C10469c(c10467a);
    }

    /* renamed from: c */
    public static C12867g m31401c(C10467a c10467a) {
        return (C12867g) C7742b.m23640c(c10467a.m31391b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12867g get() {
        return m31401c(this.f26015a);
    }
}
