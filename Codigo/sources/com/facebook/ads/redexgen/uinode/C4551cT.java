package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.cT */
/* loaded from: assets/audience_network.dex */
public final class C4551cT {
    public final Map<DspViewableNode, C4558ca> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized C4558ca A00(DspViewableNode dspViewableNode) {
        C4558ca c4558ca = this.A00.get(dspViewableNode);
        if (c4558ca != null) {
            return c4558ca;
        }
        return C4558ca.A08;
    }

    public final synchronized void A01(DspViewableNode dspViewableNode) {
        this.A00.remove(dspViewableNode);
    }

    public final synchronized void A02(DspViewableNode dspViewableNode, C4558ca c4558ca) {
        this.A00.put(dspViewableNode, c4558ca);
    }

    public final synchronized void A03(Collection<DspViewableNode> collection) {
        Iterator<DspViewableNode> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
