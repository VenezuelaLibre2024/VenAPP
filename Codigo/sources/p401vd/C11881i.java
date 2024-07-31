package p401vd;

import android.view.LayoutInflater;
import de.AbstractC6896i;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;

/* renamed from: vd.i */
/* loaded from: classes.dex */
public final class C11881i implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<C11543l> f31426a;

    /* renamed from: b */
    private final InterfaceC1806a<LayoutInflater> f31427b;

    /* renamed from: c */
    private final InterfaceC1806a<AbstractC6896i> f31428c;

    public C11881i(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        this.f31426a = interfaceC1806a;
        this.f31427b = interfaceC1806a2;
        this.f31428c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C11881i m37997a(InterfaceC1806a<C11543l> interfaceC1806a, InterfaceC1806a<LayoutInflater> interfaceC1806a2, InterfaceC1806a<AbstractC6896i> interfaceC1806a3) {
        return new C11881i(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C11880h m37998c(C11543l c11543l, LayoutInflater layoutInflater, AbstractC6896i abstractC6896i) {
        return new C11880h(c11543l, layoutInflater, abstractC6896i);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11880h get() {
        return m37998c(this.f31426a.get(), this.f31427b.get(), this.f31428c.get());
    }
}
