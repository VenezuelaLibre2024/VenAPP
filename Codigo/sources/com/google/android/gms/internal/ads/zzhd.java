package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhd implements zzgw {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgw zzc;
    private zzgw zzd;
    private zzgw zze;
    private zzgw zzf;
    private zzgw zzg;
    private zzgw zzh;
    private zzgw zzi;
    private zzgw zzj;
    private zzgw zzk;

    public zzhd(Context context, zzgw zzgwVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgwVar;
    }

    private final zzgw zzg() {
        if (this.zze == null) {
            zzgp zzgpVar = new zzgp(this.zza);
            this.zze = zzgpVar;
            zzh(zzgpVar);
        }
        return this.zze;
    }

    private final void zzh(zzgw zzgwVar) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzgwVar.zzf((zzhy) this.zzb.get(i10));
        }
    }

    private static final void zzi(zzgw zzgwVar, zzhy zzhyVar) {
        if (zzgwVar != null) {
            zzgwVar.zzf(zzhyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i10, int i11) {
        zzgw zzgwVar = this.zzk;
        zzgwVar.getClass();
        return zzgwVar.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        zzgw zzgwVar;
        zzek.zzf(this.zzk == null);
        String scheme = zzhbVar.zza.getScheme();
        Uri uri = zzhbVar.zza;
        int i10 = zzfy.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Constants.FILE.equals(scheme2)) {
            String path = zzhbVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzhm zzhmVar = new zzhm();
                    this.zzd = zzhmVar;
                    zzh(zzhmVar);
                }
                zzgwVar = this.zzd;
            }
            zzgwVar = zzg();
        } else {
            if (!"asset".equals(scheme)) {
                if ("content".equals(scheme)) {
                    if (this.zzf == null) {
                        zzgt zzgtVar = new zzgt(this.zza);
                        this.zzf = zzgtVar;
                        zzh(zzgtVar);
                    }
                    zzgwVar = this.zzf;
                } else if ("rtmp".equals(scheme)) {
                    if (this.zzg == null) {
                        try {
                            zzgw zzgwVar2 = (zzgw) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.zzg = zzgwVar2;
                            zzh(zzgwVar2);
                        } catch (ClassNotFoundException unused) {
                            zzff.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.zzg == null) {
                            this.zzg = this.zzc;
                        }
                    }
                    zzgwVar = this.zzg;
                } else if ("udp".equals(scheme)) {
                    if (this.zzh == null) {
                        zzia zziaVar = new zzia(AdError.SERVER_ERROR_CODE);
                        this.zzh = zziaVar;
                        zzh(zziaVar);
                    }
                    zzgwVar = this.zzh;
                } else if ("data".equals(scheme)) {
                    if (this.zzi == null) {
                        zzgu zzguVar = new zzgu();
                        this.zzi = zzguVar;
                        zzh(zzguVar);
                    }
                    zzgwVar = this.zzi;
                } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                    if (this.zzj == null) {
                        zzhw zzhwVar = new zzhw(this.zza);
                        this.zzj = zzhwVar;
                        zzh(zzhwVar);
                    }
                    zzgwVar = this.zzj;
                } else {
                    zzgwVar = this.zzc;
                }
            }
            zzgwVar = zzg();
        }
        this.zzk = zzgwVar;
        return this.zzk.zzb(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        zzgw zzgwVar = this.zzk;
        if (zzgwVar == null) {
            return null;
        }
        return zzgwVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        zzgw zzgwVar = this.zzk;
        if (zzgwVar != null) {
            try {
                zzgwVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        zzgw zzgwVar = this.zzk;
        return zzgwVar == null ? Collections.emptyMap() : zzgwVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzf(zzhy zzhyVar) {
        zzhyVar.getClass();
        this.zzc.zzf(zzhyVar);
        this.zzb.add(zzhyVar);
        zzi(this.zzd, zzhyVar);
        zzi(this.zze, zzhyVar);
        zzi(this.zzf, zzhyVar);
        zzi(this.zzg, zzhyVar);
        zzi(this.zzh, zzhyVar);
        zzi(this.zzi, zzhyVar);
        zzi(this.zzj, zzhyVar);
    }
}
