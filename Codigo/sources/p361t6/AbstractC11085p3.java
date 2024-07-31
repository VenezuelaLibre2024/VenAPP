package p361t6;

import android.os.Bundle;
import p361t6.InterfaceC11076o;
import p363t8.C11172r0;

/* renamed from: t6.p3 */
/* loaded from: classes.dex */
public abstract class AbstractC11085p3 implements InterfaceC11076o {

    /* renamed from: a */
    static final String f28581a = C11172r0.m34945r0(0);

    /* renamed from: b */
    public static final InterfaceC11076o.a<AbstractC11085p3> f28582b = new InterfaceC11076o.a() { // from class: t6.o3
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            AbstractC11085p3 m34307c;
            m34307c = AbstractC11085p3.m34307c(bundle);
            return m34307c;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static AbstractC11085p3 m34307c(Bundle bundle) {
        InterfaceC11076o.a aVar;
        int i10 = bundle.getInt(f28581a, -1);
        if (i10 == 0) {
            aVar = C11123x1.f28881r;
        } else if (i10 == 1) {
            aVar = C11017d3.f28212e;
        } else if (i10 == 2) {
            aVar = C11120w3.f28862r;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("Unknown RatingType: " + i10);
            }
            aVar = C11006b4.f28012r;
        }
        return (AbstractC11085p3) aVar.mo22759a(bundle);
    }
}
