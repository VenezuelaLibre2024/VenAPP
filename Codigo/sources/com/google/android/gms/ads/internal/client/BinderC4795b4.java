package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.client.b4 */
/* loaded from: classes.dex */
public final class BinderC4795b4 extends AbstractBinderC4878o1 {

    /* renamed from: a */
    private zzbpk f9697a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbpk zzbpkVar = this.f9697a;
        if (zzbpkVar != null) {
            try {
                zzbpkVar.zzb(Collections.emptyList());
            } catch (RemoteException e10) {
                zzcec.zzk("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzj(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzk() {
        zzcec.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcdv.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.a4
            @Override // java.lang.Runnable
            public final void run() {
                BinderC4795b4.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzl(String str, InterfaceC5312b interfaceC5312b) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzm(InterfaceC4800c2 interfaceC4800c2) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzn(InterfaceC5312b interfaceC5312b, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzo(zzbsv zzbsvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzp(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzq(float f10) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzr(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzs(zzbpk zzbpkVar) {
        this.f9697a = zzbpkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final void zzu(C4844i4 c4844i4) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4884p1
    public final boolean zzv() {
        return false;
    }
}
