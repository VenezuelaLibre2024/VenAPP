package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.DA */
/* loaded from: assets/audience_network.dex */
public final class C3023DA {
    public final int A00;
    public final String A01;
    public final List<C3022D9> A02;
    public final byte[] A03;

    public C3023DA(int i10, String str, List<C3022D9> list, byte[] bArr) {
        List<C3022D9> unmodifiableList;
        this.A00 = i10;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}