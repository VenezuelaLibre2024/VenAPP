package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Uh */
/* loaded from: assets/audience_network.dex */
public class C4086Uh implements InterfaceC3516LU {
    public final Collection<String> A00;

    public C4086Uh() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void AE8(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3516LU
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
