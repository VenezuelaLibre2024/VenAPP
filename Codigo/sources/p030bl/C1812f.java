package p030bl;

import ck.C2037v;
import com.google.android.gms.common.api.C5101a;
import p280ok.InterfaceC9998l;

/* renamed from: bl.f */
/* loaded from: classes3.dex */
public final class C1812f {
    /* renamed from: a */
    public static final <E> InterfaceC1810d<E> m9789a(int i10, EnumC1807a enumC1807a, InterfaceC9998l<? super E, C2037v> interfaceC9998l) {
        InterfaceC1810d<E> c1808b;
        if (i10 != -2) {
            if (i10 == -1) {
                if (enumC1807a == EnumC1807a.SUSPEND) {
                    return new C1818l(1, EnumC1807a.DROP_OLDEST, interfaceC9998l);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? enumC1807a == EnumC1807a.SUSPEND ? new C1808b(i10, interfaceC9998l) : new C1818l(i10, enumC1807a, interfaceC9998l) : new C1808b(C5101a.e.API_PRIORITY_OTHER, interfaceC9998l);
            }
            c1808b = enumC1807a == EnumC1807a.SUSPEND ? new C1808b<>(0, interfaceC9998l) : new C1818l<>(1, enumC1807a, interfaceC9998l);
        } else {
            c1808b = enumC1807a == EnumC1807a.SUSPEND ? new C1808b<>(InterfaceC1810d.f7709a.m9788a(), interfaceC9998l) : new C1818l<>(1, enumC1807a, interfaceC9998l);
        }
        return c1808b;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC1810d m9790b(int i10, EnumC1807a enumC1807a, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            enumC1807a = EnumC1807a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            interfaceC9998l = null;
        }
        return m9789a(i10, enumC1807a, interfaceC9998l);
    }
}
