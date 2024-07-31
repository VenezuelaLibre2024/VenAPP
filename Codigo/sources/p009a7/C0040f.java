package p009a7;

import com.google.common.collect.AbstractC5877h1;
import com.google.common.collect.AbstractC5907w;
import p363t8.C11146e0;

/* renamed from: a7.f */
/* loaded from: classes.dex */
final class C0040f implements InterfaceC0035a {

    /* renamed from: a */
    public final AbstractC5907w<InterfaceC0035a> f110a;

    /* renamed from: b */
    private final int f111b;

    private C0040f(int i10, AbstractC5907w<InterfaceC0035a> abstractC5907w) {
        this.f111b = i10;
        this.f110a = abstractC5907w;
    }

    /* renamed from: a */
    private static InterfaceC0035a m150a(int i10, int i11, C11146e0 c11146e0) {
        switch (i10) {
            case 1718776947:
                return C0041g.m156d(i11, c11146e0);
            case 1751742049:
                return C0037c.m130b(c11146e0);
            case 1752331379:
                return C0038d.m132c(c11146e0);
            case 1852994675:
                return C0042h.m158a(c11146e0);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C0040f m151c(int i10, C11146e0 c11146e0) {
        AbstractC5907w.a aVar = new AbstractC5907w.a();
        int m34684g = c11146e0.m34684g();
        int i11 = -2;
        while (c11146e0.m34679a() > 8) {
            int m34696u = c11146e0.m34696u();
            int m34683f = c11146e0.m34683f() + c11146e0.m34696u();
            c11146e0.m34676T(m34683f);
            InterfaceC0035a m151c = m34696u == 1414744396 ? m151c(c11146e0.m34696u(), c11146e0) : m150a(m34696u, i11, c11146e0);
            if (m151c != null) {
                if (m151c.getType() == 1752331379) {
                    i11 = ((C0038d) m151c).m134b();
                }
                aVar.mo14724a(m151c);
            }
            c11146e0.m34677U(m34683f);
            c11146e0.m34676T(m34684g);
        }
        return new C0040f(i10, aVar.m15094k());
    }

    /* renamed from: b */
    public <T extends InterfaceC0035a> T m152b(Class<T> cls) {
        AbstractC5877h1<InterfaceC0035a> it = this.f110a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // p009a7.InterfaceC0035a
    public int getType() {
        return this.f111b;
    }
}
