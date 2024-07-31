package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.GU */
/* loaded from: assets/audience_network.dex */
public final class C3215GU implements Comparator<Format> {
    public C3215GU() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Format format, Format format2) {
        return format2.A04 - format.A04;
    }
}
