package com.google.android.gms.internal.p498firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzakb implements zzale {
    private static final zzakk zza = new zzaka();
    private final zzakk zzb;

    public zzakb() {
        this(new zzakc(zzaja.zza(), zza()));
    }

    private zzakb(zzakk zzakkVar) {
        this.zzb = (zzakk) zzajf.zza(zzakkVar, "messageInfoFactory");
    }

    private static zzakk zza() {
        try {
            return (zzakk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    private static boolean zza(zzakl zzaklVar) {
        return zzakd.zza[zzaklVar.zzb().ordinal()] != 1;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzale
    public final <T> zzalf<T> zza(Class<T> cls) {
        zzalh.zza((Class<?>) cls);
        zzakl zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzajc.class.isAssignableFrom(cls) ? zzakt.zza(zzalh.zzb(), zzais.zzb(), zza2.zza()) : zzakt.zza(zzalh.zza(), zzais.zza(), zza2.zza());
        }
        if (zzajc.class.isAssignableFrom(cls)) {
            boolean zza3 = zza(zza2);
            zzakv zzb = zzakx.zzb();
            zzajs zzb2 = zzajs.zzb();
            zzame<?, ?> zzb3 = zzalh.zzb();
            return zza3 ? zzakr.zza(cls, zza2, zzb, zzb2, zzb3, zzais.zzb(), zzaki.zzb()) : zzakr.zza(cls, zza2, zzb, zzb2, zzb3, (zzaiq<?>) null, zzaki.zzb());
        }
        boolean zza4 = zza(zza2);
        zzakv zza5 = zzakx.zza();
        zzajs zza6 = zzajs.zza();
        zzame<?, ?> zza7 = zzalh.zza();
        return zza4 ? zzakr.zza(cls, zza2, zza5, zza6, zza7, zzais.zza(), zzaki.zza()) : zzakr.zza(cls, zza2, zza5, zza6, zza7, (zzaiq<?>) null, zzaki.zza());
    }
}
