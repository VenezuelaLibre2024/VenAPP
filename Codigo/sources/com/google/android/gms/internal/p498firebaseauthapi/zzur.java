package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzur extends zzajc<zzur, zza> implements zzakp {
    private static final zzur zzc;
    private static volatile zzakw<zzur> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzur, zza> implements zzakp {
        private zza() {
            super(zzur.zzc);
        }

        /* synthetic */ zza(zzus zzusVar) {
            this();
        }

        public final zza zza(zzuk zzukVar) {
            zzi();
            ((zzur) this.zza).zza(zzukVar);
            return this;
        }

        public final zza zza(zzum zzumVar) {
            zzi();
            ((zzur) this.zza).zza(zzumVar);
            return this;
        }

        public final zza zza(zzuo zzuoVar) {
            zzi();
            ((zzur) this.zza).zza(zzuoVar);
            return this;
        }
    }

    static {
        zzur zzurVar = new zzur();
        zzc = zzurVar;
        zzajc.zza((Class<zzur>) zzur.class, zzurVar);
    }

    private zzur() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuk zzukVar) {
        this.zzg = zzukVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzum zzumVar) {
        this.zzf = zzumVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuo zzuoVar) {
        this.zze = zzuoVar.zza();
    }

    public static zza zzd() {
        return zzc.zzm();
    }

    public static zzur zzf() {
        return zzc;
    }

    public final zzuk zza() {
        zzuk zza2 = zzuk.zza(this.zzg);
        return zza2 == null ? zzuk.UNRECOGNIZED : zza2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzur>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzur> zzakwVar;
        zzus zzusVar = null;
        switch (zzus.zza[i10 - 1]) {
            case 1:
                return new zzur();
            case 2:
                return new zza(zzusVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzur> zzakwVar2 = zzd;
                zzakw<zzur> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzur.class) {
                        zzakw<zzur> zzakwVar4 = zzd;
                        zzakwVar = zzakwVar4;
                        if (zzakwVar4 == null) {
                            ?? zzcVar = new zzajc.zzc(zzc);
                            zzd = zzcVar;
                            zzakwVar = zzcVar;
                        }
                    }
                    zzakwVar3 = zzakwVar;
                }
                return zzakwVar3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzum zzb() {
        zzum zza2 = zzum.zza(this.zzf);
        return zza2 == null ? zzum.UNRECOGNIZED : zza2;
    }

    public final zzuo zzc() {
        zzuo zza2 = zzuo.zza(this.zze);
        return zza2 == null ? zzuo.UNRECOGNIZED : zza2;
    }
}
