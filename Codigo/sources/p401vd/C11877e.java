package p401vd;

import android.view.LayoutInflater;
import de.AbstractC6896i;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;

/* renamed from: vd.e */
/* loaded from: classes.dex */
public final class C11877e implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<C11543l> f31405a;

    /* renamed from: b */
    private final InterfaceC1806a<LayoutInflater> f31406b;

    /* renamed from: c */
    private final InterfaceC1806a<AbstractC6896i> f31407c;

    public C11877e(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        this.f31405a = interfaceC1806a;
        this.f31406b = interfaceC1806a2;
        this.f31407c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C11877e m37986a(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        return new C11877e(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C11876d m37987c(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        return new C11876d(c11543l, layoutInflater, abstractC6896i);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11876d get() {
        return m37987c(this.f31405a.get(), this.f31406b.get(), this.f31407c.get());
    }
}
