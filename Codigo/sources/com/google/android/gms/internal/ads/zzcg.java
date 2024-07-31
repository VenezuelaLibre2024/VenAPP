package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzcg {
    public final float zzc;
    public final float zzd;
    private final int zzg;
    public static final zzcg zza = new zzcg(1.0f, 1.0f);
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcf
    };

    public zzcg(float f10, float f11) {
        zzek.zzd(f10 > 0.0f);
        zzek.zzd(f11 > 0.0f);
        this.zzc = f10;
        this.zzd = f11;
        this.zzg = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcg.class == obj.getClass()) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.zzc == zzcgVar.zzc && this.zzd == zzcgVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + 527) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j10) {
        return j10 * this.zzg;
    }
}
