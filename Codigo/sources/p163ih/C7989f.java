package p163ih;

import java.util.ArrayList;
import java.util.List;
import kg.C9275m;
import p066dg.AbstractC6949j;
import p066dg.C6942c;
import p066dg.C6950k;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.InterfaceC6954o;
import p066dg.InterfaceC6959t;

/* renamed from: ih.f */
/* loaded from: classes3.dex */
public class C7989f implements InterfaceC6959t {

    /* renamed from: a */
    private InterfaceC6954o f19438a;

    /* renamed from: b */
    private List<C6958s> f19439b = new ArrayList();

    public C7989f(InterfaceC6954o interfaceC6954o) {
        this.f19438a = interfaceC6954o;
    }

    @Override // p066dg.InterfaceC6959t
    /* renamed from: a */
    public void mo20121a(C6958s c6958s) {
        this.f19439b.add(c6958s);
    }

    /* renamed from: b */
    protected C6956q m24534b(C6942c c6942c) {
        this.f19439b.clear();
        try {
            InterfaceC6954o interfaceC6954o = this.f19438a;
            if (interfaceC6954o instanceof C6950k) {
                C6956q m20104d = ((C6950k) interfaceC6954o).m20104d(c6942c);
                this.f19438a.reset();
                return m20104d;
            }
            C6956q mo10300a = interfaceC6954o.mo10300a(c6942c);
            this.f19438a.reset();
            return mo10300a;
        } catch (Exception unused) {
            this.f19438a.reset();
            return null;
        } catch (Throwable th2) {
            this.f19438a.reset();
            throw th2;
        }
    }

    /* renamed from: c */
    public C6956q m24535c(AbstractC6949j abstractC6949j) {
        return m24534b(mo24537e(abstractC6949j));
    }

    /* renamed from: d */
    public List<C6958s> m24536d() {
        return new ArrayList(this.f19439b);
    }

    /* renamed from: e */
    protected C6942c mo24537e(AbstractC6949j abstractC6949j) {
        return new C6942c(new C9275m(abstractC6949j));
    }
}
