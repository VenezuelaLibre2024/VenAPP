package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzchw implements com.google.android.gms.common.api.k {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzchw(zzcgl zzcglVar) {
        Context context = zzcglVar.getContext();
        this.zza = context;
        this.zzb = t.r().E(context, zzcglVar.zzn().zza);
        this.zzc = new WeakReference(zzcglVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzchw zzchwVar, String str, Map map) {
        zzcgl zzcglVar = (zzcgl) zzchwVar.zzc.get();
        if (zzcglVar != null) {
            zzcglVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzcdv.zza.post(new zzchv(this, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i10) {
        zzcdv.zza.post(new zzcht(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j10) {
        zzcdv.zza.post(new zzchu(this, str, str2, j10));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        zzcdv.zza.post(new zzchs(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        zzcdv.zza.post(new zzchr(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzp(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzq(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzr(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzs(int i10) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcho zzchoVar) {
        return zzt(str);
    }
}
