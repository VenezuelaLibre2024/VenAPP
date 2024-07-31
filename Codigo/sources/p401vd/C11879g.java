package p401vd;

import android.view.LayoutInflater;
import de.AbstractC6896i;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;

/* renamed from: vd.g */
/* loaded from: classes.dex */
public final class C11879g implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<C11543l> f31412a;

    /* renamed from: b */
    private final InterfaceC1806a<LayoutInflater> f31413b;

    /* renamed from: c */
    private final InterfaceC1806a<AbstractC6896i> f31414c;

    public C11879g(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        this.f31412a = interfaceC1806a;
        this.f31413b = interfaceC1806a2;
        this.f31414c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C11879g m37989a(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        return new C11879g(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C11878f m37990c(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        return new C11878f(c11543l, layoutInflater, abstractC6896i);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11878f get() {
        return m37990c(this.f31412a.get(), this.f31413b.get(), this.f31414c.get());
    }
}
