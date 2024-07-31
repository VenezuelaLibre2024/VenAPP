package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgui extends zzgzu implements zzhbf {
    private static final zzgui zzb;
    private static volatile zzhbl zzd;
    private int zze;
    private int zzf;
    private zzguo zzg;
    private zzgyl zzh = zzgyl.zzb;

    static {
        zzgui zzguiVar = new zzgui();
        zzb = zzguiVar;
        zzgzu.zzaU(zzgui.class, zzguiVar);
    }

    private zzgui() {
    }

    public static zzguh zzc() {
        return (zzguh) zzb.zzaA();
    }

    public static zzgui zze() {
        return zzb;
    }

    public static zzgui zzf(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgui) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static zzhbl zzi() {
        return (zzhbl) zzb.zzb(7, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgui zzguiVar, zzguo zzguoVar) {
        zzguoVar.getClass();
        zzguiVar.zzg = zzguoVar;
        zzguiVar.zze |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgui();
        }
        zzgug zzgugVar = null;
        if (i11 == 4) {
            return new zzguh(zzgugVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzhbl zzhblVar = zzd;
        if (zzhblVar == null) {
            synchronized (zzgui.class) {
                zzhblVar = zzd;
                if (zzhblVar == null) {
                    zzhblVar = new zzgzq(zzb);
                    zzd = zzhblVar;
                }
            }
        }
        return zzhblVar;
    }

    public final zzguo zzg() {
        zzguo zzguoVar = this.zzg;
        return zzguoVar == null ? zzguo.zzf() : zzguoVar;
    }

    public final zzgyl zzh() {
        return this.zzh;
    }
}
