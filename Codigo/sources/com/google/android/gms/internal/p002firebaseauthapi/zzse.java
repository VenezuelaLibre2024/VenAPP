package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzse extends zzajc<zzse, zza> implements zzakp {
    private static final zzse zzc;
    private static volatile zzakw<zzse> zzd;
    private int zze;
    private int zzf;
    private zzsi zzg;
    private zzuc zzh;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzse, zza> implements zzakp {
        private zza() {
            super(zzse.zzc);
        }

        /* synthetic */ zza(zzsd zzsdVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzse) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzsi zzsiVar) {
            zzi();
            ((zzse) this.zza).zza(zzsiVar);
            return this;
        }

        public final zza zza(zzuc zzucVar) {
            zzi();
            ((zzse) this.zza).zza(zzucVar);
            return this;
        }
    }

    static {
        zzse zzseVar = new zzse();
        zzc = zzseVar;
        zzajc.zza((Class<zzse>) zzse.class, zzseVar);
    }

    private zzse() {
    }

    public static zzse zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzse) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsi zzsiVar) {
        zzsiVar.getClass();
        this.zzg = zzsiVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuc zzucVar) {
        zzucVar.getClass();
        this.zzh = zzucVar;
        this.zze |= 2;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzse>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzse> zzakwVar;
        zzsd zzsdVar = null;
        switch (zzsd.zza[i10 - 1]) {
            case 1:
                return new zzse();
            case 2:
                return new zza(zzsdVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzse> zzakwVar2 = zzd;
                zzakw<zzse> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzse.class) {
                        zzakw<zzse> zzakwVar4 = zzd;
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

    public final zzsi zzd() {
        zzsi zzsiVar = this.zzg;
        return zzsiVar == null ? zzsi.zzd() : zzsiVar;
    }

    public final zzuc zze() {
        zzuc zzucVar = this.zzh;
        return zzucVar == null ? zzuc.zzd() : zzucVar;
    }
}
