package p026b8;

import java.util.List;
import p351s8.C10822g0;
import p377u7.C11445b;
import p377u7.C11446c;

/* renamed from: b8.e */
/* loaded from: classes.dex */
public final class C1675e implements InterfaceC1681k {

    /* renamed from: a */
    private final InterfaceC1681k f7110a;

    /* renamed from: b */
    private final List<C11446c> f7111b;

    public C1675e(InterfaceC1681k interfaceC1681k, List<C11446c> list) {
        this.f7110a = interfaceC1681k;
        this.f7111b = list;
    }

    @Override // p026b8.InterfaceC1681k
    /* renamed from: a */
    public C10822g0.a<AbstractC1679i> mo9165a(C1678h c1678h, C1677g c1677g) {
        return new C11445b(this.f7110a.mo9165a(c1678h, c1677g), this.f7111b);
    }

    @Override // p026b8.InterfaceC1681k
    /* renamed from: b */
    public C10822g0.a<AbstractC1679i> mo9166b() {
        return new C11445b(this.f7110a.mo9166b(), this.f7111b);
    }
}
