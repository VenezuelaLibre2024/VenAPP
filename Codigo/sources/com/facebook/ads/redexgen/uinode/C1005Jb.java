package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jb */
/* loaded from: assets/audience_network.dex */
public final class C1005Jb {
    public final AdErrorType A00;
    public final String A01;

    public C1005Jb(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C1005Jb(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1005Jb A00(AdErrorType adErrorType) {
        return new C1005Jb(adErrorType, (String) null);
    }

    public static C1005Jb A01(AdErrorType adErrorType, String str) {
        return new C1005Jb(adErrorType, str);
    }

    public static C1005Jb A02(C1006Jc c1006Jc) {
        return new C1005Jb(c1006Jc.A00(), c1006Jc.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
