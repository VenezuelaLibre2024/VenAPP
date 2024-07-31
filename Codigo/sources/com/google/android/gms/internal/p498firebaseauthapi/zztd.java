package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zztd extends zzajc<zztd, zza> implements zzakp {
    private static final zztd zzc;
    private static volatile zzakw<zztd> zzd;
    private int zze;
    private int zzf;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zztd, zza> implements zzakp {
        private zza() {
            super(zztd.zzc);
        }

        /* synthetic */ zza(zzte zzteVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zztd) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zztd zztdVar = new zztd();
        zzc = zztdVar;
        zzajc.zza((Class<zztd>) zztd.class, zztdVar);
    }

    private zztd() {
    }

    public static zztd zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zztd) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztd>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztd> zzakwVar;
        zzte zzteVar = null;
        switch (zzte.zza[i10 - 1]) {
            case 1:
                return new zztd();
            case 2:
                return new zza(zzteVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztd> zzakwVar2 = zzd;
                zzakw<zztd> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zztd.class) {
                        zzakw<zztd> zzakwVar4 = zzd;
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
