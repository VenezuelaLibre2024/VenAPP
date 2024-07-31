package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.PC */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3746PC {
    public static final Map<String, WeakReference<C3745PB>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static C3745PB A01(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, int i10, InterfaceC3743P9 interfaceC3743P9) {
        C3745PB c3745pb = new C3745PB(c4337Yn, abstractC4476b5, c4337Yn.A01().A09(), i10);
        c3745pb.A0b(interfaceC3743P9);
        c3745pb.A0X();
        A00.put(abstractC4476b5.A0S(), new WeakReference<>(c3745pb));
        return c3745pb;
    }

    public static C3745PB A02(String str) {
        WeakReference<C3745PB> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC4476b5 abstractC4476b5, C3745PB c3745pb) {
        A00.put(abstractC4476b5.A0S(), new WeakReference<>(c3745pb));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
