package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdlu implements zzbng {
    private final WeakReference zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdlu(zzdlx zzdlxVar, zzdlt zzdltVar) {
        this.zza = new WeakReference(zzdlxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        zzdav zzdavVar;
        zzdis zzdisVar;
        zzdis zzdisVar2;
        zzdlx zzdlxVar = (zzdlx) this.zza.get();
        if (zzdlxVar == null) {
            return;
        }
        zzdavVar = zzdlxVar.zzh;
        zzdavVar.onAdClicked();
        if (((Boolean) a0.c().zza(zzbgc.zzkm)).booleanValue()) {
            zzdisVar = zzdlxVar.zzi;
            zzdisVar.zzs();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdisVar2 = zzdlxVar.zzi;
            zzdisVar2.zzbo();
        }
    }
}
