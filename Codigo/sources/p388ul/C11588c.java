package p388ul;

import ck.C2037v;
import p280ok.InterfaceC9987a;

/* renamed from: ul.c */
/* loaded from: classes3.dex */
public final class C11588c extends AbstractC11586a {

    /* renamed from: e */
    final /* synthetic */ String f30134e;

    /* renamed from: f */
    final /* synthetic */ boolean f30135f;

    /* renamed from: g */
    final /* synthetic */ InterfaceC9987a<C2037v> f30136g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11588c(String str, boolean z10, InterfaceC9987a<C2037v> interfaceC9987a) {
        super(str, z10);
        this.f30134e = str;
        this.f30135f = z10;
        this.f30136g = interfaceC9987a;
    }

    @Override // p388ul.AbstractC11586a
    /* renamed from: f */
    public long mo36308f() {
        this.f30136g.invoke();
        return -1L;
    }
}
