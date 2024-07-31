package p443xd;

import android.view.LayoutInflater;
import p029bk.InterfaceC1806a;
import td.C11246d;

/* renamed from: xd.t */
/* loaded from: classes.dex */
public final class C12467t implements InterfaceC1806a {

    /* renamed from: a */
    private final C12464q f33736a;

    public C12467t(C12464q c12464q) {
        this.f33736a = c12464q;
    }

    /* renamed from: a */
    public static C12467t m40485a(C12464q c12464q) {
        return new C12467t(c12464q);
    }

    /* renamed from: c */
    public static LayoutInflater m40486c(C12464q c12464q) {
        return (LayoutInflater) C11246d.m35132d(c12464q.m40478c());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutInflater get() {
        return m40486c(this.f33736a);
    }
}
