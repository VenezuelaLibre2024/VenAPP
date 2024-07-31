package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.WD */
/* loaded from: assets/audience_network.dex */
public final class C4180WD implements InterfaceC3173Fo {
    public final C3196GB A00;
    public final Map<String, C3202GH> A01;
    public final Map<String, C3197GC> A02;
    public final long[] A03;

    public C4180WD(C3196GB c3196gb, Map<String, C3202GH> map, Map<String, C3197GC> map2) {
        Map<String, C3202GH> emptyMap;
        this.A00 = c3196gb;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c3196gb.A0F();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final List<C3172Fn> A6Z(long j10) {
        return this.A00.A0D(j10, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final long A70(int i10) {
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A71() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A7T(long j10) {
        int A0A = AbstractC3322IF.A0A(this.A03, j10, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
