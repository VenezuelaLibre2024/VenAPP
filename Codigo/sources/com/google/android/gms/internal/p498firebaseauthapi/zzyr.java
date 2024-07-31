package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C6059d2;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyr implements zzadk<zzafd> {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ C6059d2 zze;
    private final /* synthetic */ zzacd zzf;
    private final /* synthetic */ zzafn zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyr(zzyj zzyjVar, zzadl zzadlVar, String str, String str2, Boolean bool, C6059d2 c6059d2, zzacd zzacdVar, zzafn zzafnVar) {
        this.zza = zzadlVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = c6059d2;
        this.zzf = zzacdVar;
        this.zzg = zzafnVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafd zzafdVar) {
        zzafs zzafsVar;
        List<zzafc> zza = zzafdVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean z10 = false;
        zzafc zzafcVar = zza.get(0);
        zzafv zzf = zzafcVar.zzf();
        List<zzafs> zza2 = zzf != null ? zzf.zza() : null;
        if (zza2 != null && !zza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zzafsVar = zza2.get(0);
            } else {
                for (int i10 = 0; i10 < zza2.size(); i10++) {
                    if (zza2.get(i10).zzf().equals(this.zzb)) {
                        zzafsVar = zza2.get(i10);
                    }
                }
            }
            zzafsVar.zza(this.zzc);
            break;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else if (zzafcVar.zzb() - zzafcVar.zza() < 1000) {
            z10 = true;
        }
        zzafcVar.zza(z10);
        zzafcVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzafcVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
