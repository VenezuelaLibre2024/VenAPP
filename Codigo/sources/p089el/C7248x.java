package p089el;

import ck.C2020e;
import java.util.List;
import p494zk.AbstractC13066h2;

/* renamed from: el.x */
/* loaded from: classes3.dex */
public final class C7248x {

    /* renamed from: a */
    private static final boolean f16246a = true;

    /* renamed from: a */
    private static final C7249y m21680a(Throwable th2, String str) {
        if (f16246a) {
            return new C7249y(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        m21683d();
        throw new C2020e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ C7249y m21681b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m21680a(th2, str);
    }

    /* renamed from: c */
    public static final boolean m21682c(AbstractC13066h2 abstractC13066h2) {
        return abstractC13066h2.mo627I0() instanceof C7249y;
    }

    /* renamed from: d */
    public static final Void m21683d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC13066h2 m21684e(InterfaceC7246v interfaceC7246v, List<? extends InterfaceC7246v> list) {
        try {
            return interfaceC7246v.mo618b(list);
        } catch (Throwable th2) {
            return m21680a(th2, interfaceC7246v.mo617a());
        }
    }
}
