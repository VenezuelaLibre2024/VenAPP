package p443xd;

import de.AbstractC6896i;
import p029bk.InterfaceC1806a;
import td.C11246d;

/* renamed from: xd.s */
/* loaded from: classes.dex */
public final class C12466s implements InterfaceC1806a {

    /* renamed from: a */
    private final C12464q f33735a;

    public C12466s(C12464q c12464q) {
        this.f33735a = c12464q;
    }

    /* renamed from: a */
    public static C12466s m40482a(C12464q c12464q) {
        return new C12466s(c12464q);
    }

    /* renamed from: c */
    public static AbstractC6896i m40483c(C12464q c12464q) {
        return (AbstractC6896i) C11246d.m35132d(c12464q.m40477b());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC6896i get() {
        return m40483c(this.f33735a);
    }
}
