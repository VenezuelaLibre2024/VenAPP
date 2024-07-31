package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzws {
    public final int zzc;
    private final zzgaa zze;
    private int zzf;
    public static final zzws zza = new zzws(new zzcz[0]);
    private static final String zzd = Integer.toString(0, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzwr
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzws(zzcz... zzczVarArr) {
        this.zze = zzgaa.zzk(zzczVarArr);
        this.zzc = zzczVarArr.length;
        int i10 = 0;
        while (i10 < this.zze.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zze.size(); i12++) {
                if (((zzcz) this.zze.get(i10)).equals(this.zze.get(i12))) {
                    zzff.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzws.class == obj.getClass()) {
            zzws zzwsVar = (zzws) obj;
            if (this.zzc == zzwsVar.zzc && this.zze.equals(zzwsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.zze.hashCode();
        this.zzf = hashCode;
        return hashCode;
    }

    public final int zza(zzcz zzczVar) {
        int indexOf = this.zze.indexOf(zzczVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcz zzb(int i10) {
        return (zzcz) this.zze.get(i10);
    }
}
