package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gh */
/* loaded from: assets/audience_network.dex */
public final class C3226Gh {
    public int A00;
    public final int A01;
    public final InterfaceC3225Gg[] A02;

    public C3226Gh(InterfaceC3225Gg... interfaceC3225GgArr) {
        this.A02 = interfaceC3225GgArr;
        this.A01 = interfaceC3225GgArr.length;
    }

    public final InterfaceC3225Gg A00(int i10) {
        return this.A02[i10];
    }

    public final InterfaceC3225Gg[] A01() {
        return (InterfaceC3225Gg[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C3226Gh) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
