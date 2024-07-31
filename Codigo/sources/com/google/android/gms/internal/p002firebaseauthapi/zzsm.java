package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsm extends zzajc<zzsm, zza> implements zzakp {
    private static final zzsm zzc;
    private static volatile zzakw<zzsm> zzd;
    private int zze;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsm, zza> implements zzakp {
        private zza() {
            super(zzsm.zzc);
        }

        /* synthetic */ zza(zzsl zzslVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsm) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzsm zzsmVar = new zzsm();
        zzc = zzsmVar;
        zzajc.zza((Class<zzsm>) zzsm.class, zzsmVar);
    }

    private zzsm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsm zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsm>] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsm> zzakwVar;
        zzsl zzslVar = null;
        switch (zzsl.zza[i10 - 1]) {
            case 1:
                return new zzsm();
            case 2:
                return new zza(zzslVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsm> zzakwVar2 = zzd;
                zzakw<zzsm> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsm.class) {
                        zzakw<zzsm> zzakwVar4 = zzd;
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
