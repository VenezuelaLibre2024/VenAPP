package com.google.android.gms.internal.ads;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class zzhgy {
    final LinkedHashMap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhgy(int i10) {
        this.zza = zzhha.zzb(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhgy zza(Object obj, zzhhm zzhhmVar) {
        zzhhl.zza(obj, Constants.KEY);
        zzhhl.zza(zzhhmVar, "provider");
        this.zza.put(obj, zzhhmVar);
        return this;
    }
}
