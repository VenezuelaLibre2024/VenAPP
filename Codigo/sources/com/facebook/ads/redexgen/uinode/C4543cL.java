package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cL */
/* loaded from: assets/audience_network.dex */
public final class C4543cL {
    public final InterfaceC4547cP A00;
    public final String A01;
    public final Collection<C4558ca> A02;
    public final Collection<C4558ca> A03;
    public final List<Rect> A04;

    public C4543cL(String str, InterfaceC4547cP interfaceC4547cP, List<Rect> rects, Collection<C4558ca> collection, Collection<C4558ca> collection2) {
        this.A01 = str;
        this.A00 = interfaceC4547cP;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
