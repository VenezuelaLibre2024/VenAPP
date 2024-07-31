package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.L1 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3487L1 {
    public static AdError A00(C3403Jb c3403Jb) {
        if (c3403Jb.A03().isPublicError()) {
            return new AdError(c3403Jb.A03().getErrorCode(), c3403Jb.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
