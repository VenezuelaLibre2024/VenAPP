package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzjx implements zzle {
    private static final zzkk zza = new zzka();
    private final zzkk zzb;

    public zzjx() {
        this(new zzkc(zziy.zza(), zza()));
    }

    private zzjx(zzkk zzkkVar) {
        this.zzb = (zzkk) zziz.zza(zzkkVar, "messageInfoFactory");
    }

    private static zzkk zza() {
        try {
            return (zzkk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    private static boolean zza(zzkh zzkhVar) {
        return zzjz.zza[zzkhVar.zzb().ordinal()] != 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final <T> zzlb<T> zza(Class<T> cls) {
        zzld.zza((Class<?>) cls);
        zzkh zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzix.class.isAssignableFrom(cls) ? zzkp.zza(zzld.zzb(), zzin.zzb(), zza2.zza()) : zzkp.zza(zzld.zza(), zzin.zza(), zza2.zza());
        }
        if (zzix.class.isAssignableFrom(cls)) {
            boolean zza3 = zza(zza2);
            zzkr zzb = zzkt.zzb();
            zzjs zzb2 = zzjs.zzb();
            zzma<?, ?> zzb3 = zzld.zzb();
            return zza3 ? zzkn.zza(cls, zza2, zzb, zzb2, zzb3, zzin.zzb(), zzki.zzb()) : zzkn.zza(cls, zza2, zzb, zzb2, zzb3, (zzim<?>) null, zzki.zzb());
        }
        boolean zza4 = zza(zza2);
        zzkr zza5 = zzkt.zza();
        zzjs zza6 = zzjs.zza();
        zzma<?, ?> zza7 = zzld.zza();
        return zza4 ? zzkn.zza(cls, zza2, zza5, zza6, zza7, zzin.zza(), zzki.zza()) : zzkn.zza(cls, zza2, zza5, zza6, zza7, (zzim<?>) null, zzki.zza());
    }
}
