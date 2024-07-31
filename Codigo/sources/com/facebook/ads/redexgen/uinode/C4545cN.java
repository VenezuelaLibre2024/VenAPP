package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.cN */
/* loaded from: assets/audience_network.dex */
public class C4545cN {
    public final Map<String, C4558ca> A00;
    public final Set<C4558ca> A01;

    public C4545cN() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C4558ca> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C4558ca> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C4558ca c4558ca : this.A01) {
            this.A00.put(c4558ca.A04, c4558ca);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C4558ca c4558ca) {
        if (this.A01.add(c4558ca)) {
            this.A00.remove(c4558ca.A04);
            return true;
        }
        return false;
    }
}
