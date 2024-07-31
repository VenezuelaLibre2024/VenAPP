package p155i7;

import java.util.List;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12608b;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.d0 */
/* loaded from: classes.dex */
public final class C7869d0 {

    /* renamed from: a */
    private final List<C11108u1> f18885a;

    /* renamed from: b */
    private final InterfaceC12609b0[] f18886b;

    public C7869d0(List<C11108u1> list) {
        this.f18885a = list;
        this.f18886b = new InterfaceC12609b0[list.size()];
    }

    /* renamed from: a */
    public void m24194a(long j10, C11146e0 c11146e0) {
        C12608b.m41508a(j10, c11146e0, this.f18886b);
    }

    /* renamed from: b */
    public void m24195b(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        for (int i10 = 0; i10 < this.f18886b.length; i10++) {
            dVar.m24263a();
            InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 3);
            C11108u1 c11108u1 = this.f18885a.get(i10);
            String str = c11108u1.f28797w;
            C11137a.m34600b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = c11108u1.f28786a;
            if (str2 == null) {
                str2 = dVar.m24264b();
            }
            mo308d.mo332c(new C11108u1.b().m34540U(str2).m34552g0(str).m34554i0(c11108u1.f28789d).m34543X(c11108u1.f28788c).m34527H(c11108u1.f28781O).m34541V(c11108u1.f28799y).m34526G());
            this.f18886b[i10] = mo308d;
        }
    }
}
