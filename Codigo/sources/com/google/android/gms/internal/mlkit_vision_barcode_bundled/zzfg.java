package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfg implements zzgi {
    private static final zzfm zza = new zzfe();
    private final zzfm zzb;

    public zzfg() {
        zzfm zzfmVar;
        zzfm[] zzfmVarArr = new zzfm[2];
        zzfmVarArr[0] = zzdw.zza();
        try {
            zzfmVar = (zzfm) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfmVar = zza;
        }
        zzfmVarArr[1] = zzfmVar;
        zzff zzffVar = new zzff(zzfmVarArr);
        byte[] bArr = zzem.zzd;
        this.zzb = zzffVar;
    }

    private static boolean zzb(zzfl zzflVar) {
        return zzflVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgi
    public final zzgh zza(Class cls) {
        zzfu zza2;
        zzfc zzc;
        zzgy zzy;
        zzdp zza3;
        zzfj zza4;
        zzgy zzy2;
        zzdp zza5;
        zzgj.zzD(cls);
        zzfl zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzed.class.isAssignableFrom(cls)) {
                zzy2 = zzgj.zzz();
                zza5 = zzdr.zzb();
            } else {
                zzy2 = zzgj.zzy();
                zza5 = zzdr.zza();
            }
            return zzfs.zzc(zzy2, zza5, zzb.zza());
        }
        if (zzed.class.isAssignableFrom(cls)) {
            boolean zzb2 = zzb(zzb);
            zza2 = zzfv.zzb();
            zzc = zzfc.zzd();
            zzy = zzgj.zzz();
            zza3 = zzb2 ? zzdr.zzb() : null;
            zza4 = zzfk.zzb();
        } else {
            boolean zzb3 = zzb(zzb);
            zza2 = zzfv.zza();
            zzc = zzfc.zzc();
            zzy = zzgj.zzy();
            zza3 = zzb3 ? zzdr.zza() : null;
            zza4 = zzfk.zza();
        }
        return zzfr.zzl(cls, zzb, zza2, zzc, zzy, zza3, zza4);
    }
}
