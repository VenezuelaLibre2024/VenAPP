package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgsk extends zzgzu implements zzhbf {
    private static final zzgsk zzb;
    private int zzd;
    private int zze;
    private zzgsn zzf;

    static {
        zzgsk zzgskVar = new zzgsk();
        zzb = zzgskVar;
        zzgzu.zzaU(zzgsk.class, zzgskVar);
    }

    private zzgsk() {
    }

    public static zzgsj zzc() {
        return (zzgsj) zzb.zzaA();
    }

    public static zzgsk zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgsk) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static /* synthetic */ void zzh(zzgsk zzgskVar, zzgsn zzgsnVar) {
        zzgsnVar.getClass();
        zzgskVar.zzf = zzgsnVar;
        zzgskVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgsk();
        }
        if (i11 == 4) {
            return new zzgsj(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgsn zzf() {
        zzgsn zzgsnVar = this.zzf;
        return zzgsnVar == null ? zzgsn.zze() : zzgsnVar;
    }
}
