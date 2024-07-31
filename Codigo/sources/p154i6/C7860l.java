package p154i6;

import android.content.Context;
import p029bk.InterfaceC1806a;
import p174j6.InterfaceC8989b;

/* renamed from: i6.l */
/* loaded from: classes.dex */
public final class C7860l implements InterfaceC8989b<C7859k> {

    /* renamed from: a */
    private final InterfaceC1806a<Context> f18841a;

    /* renamed from: b */
    private final InterfaceC1806a<C7857i> f18842b;

    public C7860l(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<C7857i> interfaceC1806a2) {
        this.f18841a = interfaceC1806a;
        this.f18842b = interfaceC1806a2;
    }

    /* renamed from: a */
    public static C7860l m24169a(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<C7857i> interfaceC1806a2) {
        return new C7860l(interfaceC1806a, interfaceC1806a2);
    }

    /* renamed from: c */
    public static C7859k m24170c(Context context, Object obj) {
        return new C7859k(context, (C7857i) obj);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7859k get() {
        return m24170c(this.f18841a.get(), this.f18842b.get());
    }
}
