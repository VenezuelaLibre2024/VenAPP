package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u */
/* loaded from: assets/audience_network.dex */
public final class C24753u {
    public static final InterfaceC24743t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C3104Ef();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C3105Eg();
        } else {
            A01 = new C4403Zs();
        }
    }

    public C24753u() {
        this.A00 = A01.AAW(this);
    }

    public C24753u(Object obj) {
        this.A00 = obj;
    }

    public final C24733s A00(int i10) {
        return null;
    }

    public final C24733s A01(int i10) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C24733s> A03(String str, int i10) {
        return null;
    }

    public final boolean A04(int i10, int i11, Bundle bundle) {
        return false;
    }
}
