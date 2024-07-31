package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b4 extends o1 {

    /* renamed from: a, reason: collision with root package name */
    private zzbpk f8620a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbpk zzbpkVar = this.f8620a;
        if (zzbpkVar != null) {
            try {
                zzbpkVar.zzb(Collections.emptyList());
            } catch (RemoteException e10) {
                zzcec.zzk("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzj(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzk() {
        zzcec.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcdv.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.a4
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzl(String str, com.google.android.gms.dynamic.b bVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzm(c2 c2Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzn(com.google.android.gms.dynamic.b bVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzo(zzbsv zzbsvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzp(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzq(float f10) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzr(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzs(zzbpk zzbpkVar) {
        this.f8620a = zzbpkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzu(i4 i4Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final boolean zzv() {
        return false;
    }
}
