package com.google.android.gms.internal.p002firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
final class zze extends zzb {
    private zze() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzb
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }
}
