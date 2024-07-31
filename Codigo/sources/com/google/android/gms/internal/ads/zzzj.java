package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzzj extends IOException {
    public zzzj(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + (th2.getMessage() != null ? ": ".concat(String.valueOf(th2.getMessage())) : ""), th2);
    }
}
