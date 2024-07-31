package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsb extends zzajc<zzsb, zza> implements zzakp {
    private static final zzsb zzc;
    private static volatile zzakw<zzsb> zzd;
    private int zze;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsb, zza> implements zzakp {
        private zza() {
            super(zzsb.zzc);
        }

        /* synthetic */ zza(zzsc zzscVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsb) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzsb zzsbVar = new zzsb();
        zzc = zzsbVar;
        zzajc.zza((Class<zzsb>) zzsb.class, zzsbVar);
    }

    private zzsb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsb zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsb>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsb> zzakwVar;
        zzsc zzscVar = null;
        switch (zzsc.zza[i10 - 1]) {
            case 1:
                return new zzsb();
            case 2:
                return new zza(zzscVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsb> zzakwVar2 = zzd;
                zzakw<zzsb> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsb.class) {
                        zzakw<zzsb> zzakwVar4 = zzd;
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
