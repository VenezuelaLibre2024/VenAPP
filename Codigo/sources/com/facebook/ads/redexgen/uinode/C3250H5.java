package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.H5 */
/* loaded from: assets/audience_network.dex */
public final class C3250H5 {
    public Map<String, String> A00;
    public final Map<String, String> A01 = new HashMap();

    public final synchronized Map<String, String> A00() {
        if (this.A00 == null) {
            this.A00 = Collections.unmodifiableMap(new HashMap(this.A01));
        }
        return this.A00;
    }
}
