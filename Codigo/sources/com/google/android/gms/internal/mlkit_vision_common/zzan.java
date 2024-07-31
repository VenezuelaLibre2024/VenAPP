package com.google.android.gms.internal.mlkit_vision_common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import jd.d;

/* loaded from: classes2.dex */
public final class zzan {
    private final Map zza;
    private final Map zzb;
    private final d zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(Map map, Map map2, d dVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = dVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzak(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
