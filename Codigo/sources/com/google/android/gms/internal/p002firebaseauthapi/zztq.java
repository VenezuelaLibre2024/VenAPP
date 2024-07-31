package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zztq extends zzajc<zztq, zza> implements zzakp {
    private static final zztq zzc;
    private static volatile zzakw<zztq> zzd;
    private int zze;
    private zztv zzf;
    private zztm zzg;
    private int zzh;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zztq, zza> implements zzakp {
        private zza() {
            super(zztq.zzc);
        }

        /* synthetic */ zza(zztp zztpVar) {
            this();
        }

        public final zza zza(zztk zztkVar) {
            zzi();
            ((zztq) this.zza).zza(zztkVar);
            return this;
        }

        public final zza zza(zztm zztmVar) {
            zzi();
            ((zztq) this.zza).zza(zztmVar);
            return this;
        }

        public final zza zza(zztv zztvVar) {
            zzi();
            ((zztq) this.zza).zza(zztvVar);
            return this;
        }
    }

    static {
        zztq zztqVar = new zztq();
        zzc = zztqVar;
        zzajc.zza((Class<zztq>) zztq.class, zztqVar);
    }

    private zztq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztk zztkVar) {
        this.zzh = zztkVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztm zztmVar) {
        zztmVar.getClass();
        this.zzg = zztmVar;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztv zztvVar) {
        zztvVar.getClass();
        this.zzf = zztvVar;
        this.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zztq zze() {
        return zzc;
    }

    public final zztk zza() {
        zztk zza2 = zztk.zza(this.zzh);
        return zza2 == null ? zztk.UNRECOGNIZED : zza2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztq>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztq> zzakwVar;
        zztp zztpVar = null;
        switch (zztp.zza[i10 - 1]) {
            case 1:
                return new zztq();
            case 2:
                return new zza(zztpVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztq> zzakwVar2 = zzd;
                zzakw<zztq> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zztq.class) {
                        zzakw<zztq> zzakwVar4 = zzd;
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

    public final zztm zzb() {
        zztm zztmVar = this.zzg;
        return zztmVar == null ? zztm.zzc() : zztmVar;
    }

    public final zztv zzf() {
        zztv zztvVar = this.zzf;
        return zztvVar == null ? zztv.zzc() : zztvVar;
    }
}
