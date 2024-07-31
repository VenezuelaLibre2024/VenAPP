package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.HD */
/* loaded from: assets/audience_network.dex */
public class C3258HD implements InterfaceC4553cV {
    public final /* synthetic */ C4552cU A00;

    public C3258HD(C4552cU c4552cU) {
        this.A00 = c4552cU;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4553cV
    public final void AD2() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC4553cV interfaceC4553cV;
        InterfaceC4553cV interfaceC4553cV2;
        linkedHashMap = this.A00.A05;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A05;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A05;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A05;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC4553cV = this.A00.A00;
        if (interfaceC4553cV == null) {
            return;
        }
        interfaceC4553cV2 = this.A00.A00;
        interfaceC4553cV2.AD2();
    }
}
