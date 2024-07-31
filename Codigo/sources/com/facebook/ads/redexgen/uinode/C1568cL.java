package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1568cL {
    public final InterfaceC1572cP A00;
    public final String A01;
    public final Collection<C1582ca> A02;
    public final Collection<C1582ca> A03;
    public final List<Rect> A04;

    public C1568cL(String str, InterfaceC1572cP interfaceC1572cP, List<Rect> rects, Collection<C1582ca> collection, Collection<C1582ca> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1572cP;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
