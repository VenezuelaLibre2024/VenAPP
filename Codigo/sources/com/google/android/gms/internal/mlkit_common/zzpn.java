package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpn extends zzqa {
    private zzlm zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private l zze;
    private zzls zzf;
    private int zzg;
    private byte zzh;

    @Override // com.google.android.gms.internal.mlkit_common.zzqa
    public final zzqa zza(zzls zzlsVar) {
        if (zzlsVar == null) {
            throw new NullPointerException("Null downloadStatus");
        }
        this.zzf = zzlsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqa
    public final zzqa zzb(zzlm zzlmVar) {
        if (zzlmVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.zza = zzlmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqa
    public final zzqa zzc(int i10) {
        this.zzg = i10;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqa
    public final zzqa zzd(l lVar) {
        if (lVar == null) {
            throw new NullPointerException("Null modelType");
        }
        this.zze = lVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqa
    public final zzqa zze(boolean z10) {
        this.zzd = z10;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqa
    public final zzqa zzf(boolean z10) {
        this.zzc = z10;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzqa zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzqa
    public final zzqb zzh() {
        zzlm zzlmVar;
        String str;
        l lVar;
        zzls zzlsVar;
        if (this.zzh == 7 && (zzlmVar = this.zza) != null && (str = this.zzb) != null && (lVar = this.zze) != null && (zzlsVar = this.zzf) != null) {
            return new zzpp(zzlmVar, str, this.zzc, this.zzd, lVar, zzlsVar, this.zzg, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" errorCode");
        }
        if (this.zzb == null) {
            sb2.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb2.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb2.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb2.append(" modelType");
        }
        if (this.zzf == null) {
            sb2.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb2.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
