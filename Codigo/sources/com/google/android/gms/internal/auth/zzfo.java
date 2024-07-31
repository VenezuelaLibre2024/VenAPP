package com.google.android.gms.internal.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfo implements zzgi {
    private static final zzfu zza = new zzfm();
    private final zzfu zzb;

    public zzfo() {
        zzfu zzfuVar;
        zzfu[] zzfuVarArr = new zzfu[2];
        zzfuVarArr[0] = zzer.zza();
        try {
            zzfuVar = (zzfu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfuVar = zza;
        }
        zzfuVarArr[1] = zzfuVar;
        zzfn zzfnVar = new zzfn(zzfuVarArr);
        zzez.zzf(zzfnVar, "messageInfoFactory");
        this.zzb = zzfnVar;
    }

    private static boolean zzb(zzft zzftVar) {
        return zzftVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final zzgh zza(Class cls) {
        zzgb zza2;
        zzfk zzc;
        zzgy zzb;
        zzel zzelVar;
        zzfr zza3;
        zzgy zza4;
        zzel zza5;
        zzgj.zzg(cls);
        zzft zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (zzeu.class.isAssignableFrom(cls)) {
                zza4 = zzgj.zzc();
                zza5 = zzen.zzb();
            } else {
                zza4 = zzgj.zza();
                zza5 = zzen.zza();
            }
            return zzga.zzb(zza4, zza5, zzb2.zza());
        }
        if (zzeu.class.isAssignableFrom(cls)) {
            boolean zzb3 = zzb(zzb2);
            zza2 = zzgc.zzb();
            zzc = zzfk.zzd();
            zzb = zzgj.zzc();
            zzelVar = zzb3 ? zzen.zzb() : null;
            zza3 = zzfs.zzb();
        } else {
            boolean zzb4 = zzb(zzb2);
            zza2 = zzgc.zza();
            zzc = zzfk.zzc();
            if (zzb4) {
                zzb = zzgj.zza();
                zzelVar = zzen.zza();
            } else {
                zzb = zzgj.zzb();
                zzelVar = null;
            }
            zza3 = zzfs.zza();
        }
        return zzfz.zzj(cls, zzb2, zza2, zzc, zzb, zzelVar, zza3);
    }
}
