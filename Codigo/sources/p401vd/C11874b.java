package p401vd;

import android.view.LayoutInflater;
import de.AbstractC6896i;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;

/* renamed from: vd.b */
/* loaded from: classes.dex */
public final class C11874b implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<C11543l> f31387a;

    /* renamed from: b */
    private final InterfaceC1806a<LayoutInflater> f31388b;

    /* renamed from: c */
    private final InterfaceC1806a<AbstractC6896i> f31389c;

    public C11874b(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        this.f31387a = interfaceC1806a;
        this.f31388b = interfaceC1806a2;
        this.f31389c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C11874b m37973a(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        return new C11874b(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C11873a m37974c(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        return new C11873a(c11543l, layoutInflater, abstractC6896i);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11873a get() {
        return m37974c(this.f31387a.get(), this.f31388b.get(), this.f31389c.get());
    }
}
