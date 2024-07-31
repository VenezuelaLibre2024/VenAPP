package p443xd;

import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.r */
/* loaded from: classes.dex */
public final class C12465r implements InterfaceC1806a {

    /* renamed from: a */
    private final C12464q f33734a;

    public C12465r(C12464q c12464q) {
        this.f33734a = c12464q;
    }

    /* renamed from: a */
    public static C12465r m40479a(C12464q c12464q) {
        return new C12465r(c12464q);
    }

    /* renamed from: c */
    public static C11543l m40480c(C12464q c12464q) {
        return (C11543l) C11246d.m35132d(c12464q.m40476a());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40480c(this.f33734a);
    }
}
