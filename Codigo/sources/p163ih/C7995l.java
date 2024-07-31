package p163ih;

import kg.C9275m;
import p066dg.AbstractC6949j;
import p066dg.C6942c;
import p066dg.InterfaceC6954o;

/* renamed from: ih.l */
/* loaded from: classes3.dex */
public class C7995l extends C7989f {

    /* renamed from: c */
    private boolean f19458c;

    public C7995l(InterfaceC6954o interfaceC6954o) {
        super(interfaceC6954o);
        this.f19458c = true;
    }

    @Override // p163ih.C7989f
    /* renamed from: e */
    protected C6942c mo24537e(AbstractC6949j abstractC6949j) {
        if (this.f19458c) {
            this.f19458c = false;
            return new C6942c(new C9275m(abstractC6949j.mo20098e()));
        }
        this.f19458c = true;
        return new C6942c(new C9275m(abstractC6949j));
    }
}
