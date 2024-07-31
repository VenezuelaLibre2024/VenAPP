package p260o0;

import p260o0.C9758f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o0.g */
/* loaded from: classes.dex */
public class C9759g extends C9758f {

    /* renamed from: m */
    public int f24027m;

    public C9759g(AbstractC9768p abstractC9768p) {
        super(abstractC9768p);
        this.f24019e = abstractC9768p instanceof C9764l ? C9758f.a.HORIZONTAL_DIMENSION : C9758f.a.VERTICAL_DIMENSION;
    }

    @Override // p260o0.C9758f
    /* renamed from: d */
    public void mo29263d(int i10) {
        if (this.f24024j) {
            return;
        }
        this.f24024j = true;
        this.f24021g = i10;
        for (InterfaceC9756d interfaceC9756d : this.f24025k) {
            interfaceC9756d.mo29241a(interfaceC9756d);
        }
    }
}
