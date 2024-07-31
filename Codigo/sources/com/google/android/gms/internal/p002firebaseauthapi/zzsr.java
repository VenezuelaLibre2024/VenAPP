package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsr extends zzajc<zzsr, zza> implements zzakp {
    private static final zzsr zzc;
    private static volatile zzakw<zzsr> zzd;
    private int zze;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsr, zza> implements zzakp {
        private zza() {
            super(zzsr.zzc);
        }

        /* synthetic */ zza(zzss zzssVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsr) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzsr zzsrVar = new zzsr();
        zzc = zzsrVar;
        zzajc.zza((Class<zzsr>) zzsr.class, zzsrVar);
    }

    private zzsr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsr zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsr>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsr> zzakwVar;
        zzss zzssVar = null;
        switch (zzss.zza[i10 - 1]) {
            case 1:
                return new zzsr();
            case 2:
                return new zza(zzssVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsr> zzakwVar2 = zzd;
                zzakw<zzsr> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsr.class) {
                        zzakw<zzsr> zzakwVar4 = zzd;
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
}
