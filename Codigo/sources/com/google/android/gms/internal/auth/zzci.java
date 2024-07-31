package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.h;

/* loaded from: classes2.dex */
public final class zzci {
    private final h zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzci(h hVar) {
        this.zza = hVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        h hVar = (h) this.zza.get(uri.toString());
        if (hVar == null) {
            return null;
        }
        return (String) hVar.get("".concat(String.valueOf(str3)));
    }
}
