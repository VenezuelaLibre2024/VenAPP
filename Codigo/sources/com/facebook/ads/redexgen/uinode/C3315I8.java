package com.facebook.ads.redexgen.uinode;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.I8 */
/* loaded from: assets/audience_network.dex */
public class C3315I8 implements Comparator<C3316I9> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C3316I9 c3316i9, C3316I9 c3316i92) {
        if (c3316i9.A00 < c3316i92.A00) {
            return -1;
        }
        return c3316i92.A00 < c3316i9.A00 ? 1 : 0;
    }
}
