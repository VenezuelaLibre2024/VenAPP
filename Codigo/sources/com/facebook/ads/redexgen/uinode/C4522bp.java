package com.facebook.ads.redexgen.uinode;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.bp */
/* loaded from: assets/audience_network.dex */
public final class C4522bp implements InterfaceC223903<File> {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC223903
    public final C223802<File> A3M(File file, InterfaceC22570L interfaceC22570L) {
        if (file.exists()) {
            return new C223802<>(true, file);
        }
        return new C223802<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC223903
    public final void A4U(File file, InterfaceC22570L interfaceC22570L) {
    }
}
