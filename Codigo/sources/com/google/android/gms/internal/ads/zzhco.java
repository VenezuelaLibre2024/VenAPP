package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhco extends RuntimeException {
    public zzhco(zzhbe zzhbeVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhag zza() {
        return new zzhag(getMessage());
    }
}
