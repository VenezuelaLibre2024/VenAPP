package p289p6;

import android.content.Context;
import p029bk.InterfaceC1806a;
import p174j6.InterfaceC8989b;

/* renamed from: p6.u0 */
/* loaded from: classes.dex */
public final class C10102u0 implements InterfaceC8989b<C10100t0> {

    /* renamed from: a */
    private final InterfaceC1806a<Context> f24783a;

    /* renamed from: b */
    private final InterfaceC1806a<String> f24784b;

    /* renamed from: c */
    private final InterfaceC1806a<Integer> f24785c;

    public C10102u0(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<String> interfaceC1806a2, InterfaceC1806a<Integer> interfaceC1806a3) {
        this.f24783a = interfaceC1806a;
        this.f24784b = interfaceC1806a2;
        this.f24785c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C10102u0 m30144a(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<String> interfaceC1806a2, InterfaceC1806a<Integer> interfaceC1806a3) {
        return new C10102u0(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C10100t0 m30145c(Context context, String str, int i10) {
        return new C10100t0(context, str, i10);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10100t0 get() {
        return m30145c(this.f24783a.get(), this.f24784b.get(), this.f24785c.get().intValue());
    }
}
