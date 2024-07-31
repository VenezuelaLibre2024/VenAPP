package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s3;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.ads.nativead.d;
import java.util.List;
import x8.p;

/* loaded from: classes2.dex */
public final class zzbwh implements com.google.android.gms.ads.nativead.d {
    private final zzbkg zza;
    private d.a zzb;

    public zzbwh(zzbkg zzbkgVar) {
        this.zza = zzbkgVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    public final d.a getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbvz(this.zza);
            }
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
        return this.zzb;
    }

    public final b.AbstractC0145b getImage(String str) {
        try {
            zzbjm zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbwa(zzg);
            }
            return null;
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    public final p getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new s3(this.zza.zzf(), this.zza);
            }
            return null;
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }
}
