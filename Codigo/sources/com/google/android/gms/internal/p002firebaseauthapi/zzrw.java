package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzrw extends zzajc<zzrw, zza> implements zzakp {
    private static final zzrw zzc;
    private static volatile zzakw<zzrw> zzd;
    private int zze;
    private int zzf;
    private zzahp zzg = zzahp.zza;
    private zzsb zzh;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzrw, zza> implements zzakp {
        private zza() {
            super(zzrw.zzc);
        }

        /* synthetic */ zza(zzry zzryVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzrw) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzrw) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzsb zzsbVar) {
            zzi();
            ((zzrw) this.zza).zza(zzsbVar);
            return this;
        }
    }

    static {
        zzrw zzrwVar = new zzrw();
        zzc = zzrwVar;
        zzajc.zza((Class<zzrw>) zzrw.class, zzrwVar);
    }

    private zzrw() {
    }

    public static zzrw zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzrw) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzg = zzahpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsb zzsbVar) {
        zzsbVar.getClass();
        this.zzh = zzsbVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzrw>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzrw> zzakwVar;
        zzry zzryVar = null;
        switch (zzry.zza[i10 - 1]) {
            case 1:
                return new zzrw();
            case 2:
                return new zza(zzryVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzrw> zzakwVar2 = zzd;
                zzakw<zzrw> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzrw.class) {
                        zzakw<zzrw> zzakwVar4 = zzd;
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

    public final zzsb zzd() {
        zzsb zzsbVar = this.zzh;
        return zzsbVar == null ? zzsb.zzd() : zzsbVar;
    }

    public final zzahp zze() {
        return this.zzg;
    }
}
