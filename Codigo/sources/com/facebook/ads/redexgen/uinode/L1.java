package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public abstract class L1 {
    public static AdError A00(C1005Jb c1005Jb) {
        if (c1005Jb.A03().isPublicError()) {
            return new AdError(c1005Jb.A03().getErrorCode(), c1005Jb.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
