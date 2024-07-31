package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06463u {
    public static final InterfaceC06453t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C0886Ef();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C0887Eg();
        } else {
            A01 = new C1429Zs();
        }
    }

    public C06463u() {
        this.A00 = A01.AAW(this);
    }

    public C06463u(Object obj) {
        this.A00 = obj;
    }

    public final C06443s A00(int i10) {
        return null;
    }

    public final C06443s A01(int i10) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C06443s> A03(String str, int i10) {
        return null;
    }

    public final boolean A04(int i10, int i11, Bundle bundle) {
        return false;
    }
}
