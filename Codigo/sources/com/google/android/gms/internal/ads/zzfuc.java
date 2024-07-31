package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes2.dex */
class zzfuc {
    static final String zza = new UUID(0, 0).toString();
    final zzfud zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuc(Context context, String str, String str2, String str3) {
        this.zzb = zzfud.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzg;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str2 == null ? "null" : "not null");
        sb2.append(", hashKey is ");
        sb2.append(str3 != null ? "not null" : "null");
        throw new IllegalArgumentException(sb2.toString());
    }

    final long zza(boolean z10) {
        return this.zzb.zza(z10 ? this.zzf : this.zze, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfub zzb(String str, String str2, long j10, boolean z10) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfub();
        }
        boolean z11 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long zza2 = zza(z11);
        if (zza2 != -1) {
            if (currentTimeMillis < zza2) {
                this.zzb.zzd(z11 ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= zza2 + j10) {
                return zzc(str, str2);
            }
        }
        String zze2 = zze(z11);
        return (zze2 != null || z10) ? new zzfub(zze2, zza(z11)) : zzc(str, str2);
    }

    final zzfub zzc(String str, String str2) {
        String zzh;
        boolean z10;
        if (str == null) {
            zzh = UUID.randomUUID().toString();
            z10 = false;
        } else {
            String uuid = UUID.randomUUID().toString();
            this.zzb.zzd("paid_3p_hash_key", uuid);
            zzh = zzh(str, str2, uuid);
            z10 = true;
        }
        return zzd(zzh, z10);
    }

    final zzfub zzd(String str, boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z10 ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
        this.zzb.zzd(z10 ? this.zzd : this.zzc, str);
        return new zzfub(str, currentTimeMillis);
    }

    final String zze(boolean z10) {
        return this.zzb.zzc(z10 ? this.zzd : this.zzc, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(boolean z10) {
        this.zzb.zze(z10 ? this.zzf : this.zze);
        this.zzb.zze(z10 ? this.zzd : this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzc);
    }
}
