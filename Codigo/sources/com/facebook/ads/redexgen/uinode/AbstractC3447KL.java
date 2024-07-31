package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.KL */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3447KL {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC3445KJ> A02 = new AtomicReference<>();

    public static void A00(Throwable th2, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            AbstractC3462Ka.A00().A9S(3306, th2);
            InterfaceC3445KJ contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AFC(th2, obj);
                return;
            }
            return;
        }
        throw th2;
    }

    public static void A01(boolean z10, InterfaceC3445KJ interfaceC3445KJ) {
        A01.set(z10);
        A02.set(interfaceC3445KJ);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
