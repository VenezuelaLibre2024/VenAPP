package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C6104o0;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes2.dex */
final class zzze implements zzadk<zzahb> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzzb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzze(zzzb zzzbVar, zzadk zzadkVar) {
        this.zzb = zzzbVar;
        this.zza = zzadkVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzahb zzahbVar) {
        zzahb zzahbVar2 = zzahbVar;
        if (TextUtils.isEmpty(zzahbVar2.zze())) {
            this.zzb.zzb.zza(new zzafn(zzahbVar2.zzd(), zzahbVar2.zzb(), Long.valueOf(zzahbVar2.zza()), "Bearer"), null, Constants.SIGN_IN_METHOD_PHONE, Boolean.valueOf(zzahbVar2.zzf()), null, this.zzb.zza, this.zza);
        } else {
            this.zzb.zza.zza(new Status(17025), C6104o0.m16578A1(zzahbVar2.zzc(), zzahbVar2.zze()));
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
