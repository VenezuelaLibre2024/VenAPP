package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsv extends zzajc<zzsv, zza> implements zzakp {
    private static final zzsv zzc;
    private static volatile zzakw<zzsv> zzd;
    private int zze;
    private int zzf;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsv, zza> implements zzakp {
        private zza() {
            super(zzsv.zzc);
        }

        /* synthetic */ zza(zzsw zzswVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsv) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzsv zzsvVar = new zzsv();
        zzc = zzsvVar;
        zzajc.zza((Class<zzsv>) zzsv.class, zzsvVar);
    }

    private zzsv() {
    }

    public static zzsv zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzsv) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsv>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsv> zzakwVar;
        zzsw zzswVar = null;
        switch (zzsw.zza[i10 - 1]) {
            case 1:
                return new zzsv();
            case 2:
                return new zza(zzswVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsv> zzakwVar2 = zzd;
                zzakw<zzsv> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsv.class) {
                        zzakw<zzsv> zzakwVar4 = zzd;
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

    public final int zzb() {
        return this.zzf;
    }
}
