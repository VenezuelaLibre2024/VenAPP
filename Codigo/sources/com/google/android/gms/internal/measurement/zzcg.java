package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
final class zzcg extends zzcd {
    private zzcg() {
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }
}
