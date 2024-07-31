package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgvg extends zzgzu implements zzhbf {
    private static final zzgvg zzb;
    private int zzd;
    private zzhad zze = zzgzu.zzaN();

    static {
        zzgvg zzgvgVar = new zzgvg();
        zzb = zzgvgVar;
        zzgzu.zzaU(zzgvg.class, zzgvgVar);
    }

    private zzgvg() {
    }

    public static zzgvd zzd() {
        return (zzgvd) zzb.zzaA();
    }

    public static zzgvg zzg(InputStream inputStream, zzgzf zzgzfVar) {
        return (zzgvg) zzgzu.zzaH(zzb, inputStream, zzgzfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgvg zzgvgVar, zzgvf zzgvfVar) {
        zzgvfVar.getClass();
        zzhad zzhadVar = zzgvgVar.zze;
        if (!zzhadVar.zzc()) {
            zzgvgVar.zze = zzgzu.zzaO(zzhadVar);
        }
        zzgvgVar.zze.add(zzgvfVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgvf.class});
        }
        if (i11 == 3) {
            return new zzgvg();
        }
        zzgvc zzgvcVar = null;
        if (i11 == 4) {
            return new zzgvd(zzgvcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgvf zze(int i10) {
        return (zzgvf) this.zze.get(i10);
    }

    public final List zzh() {
        return this.zze;
    }
}
