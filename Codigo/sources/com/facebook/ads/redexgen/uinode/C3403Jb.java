package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jb */
/* loaded from: assets/audience_network.dex */
public final class C3403Jb {
    public final AdErrorType A00;
    public final String A01;

    public C3403Jb(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C3403Jb(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C3403Jb A00(AdErrorType adErrorType) {
        return new C3403Jb(adErrorType, (String) null);
    }

    public static C3403Jb A01(AdErrorType adErrorType, String str) {
        return new C3403Jb(adErrorType, str);
    }

    public static C3403Jb A02(C3404Jc c3404Jc) {
        return new C3403Jb(c3404Jc.A00(), c3404Jc.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
