package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzug extends zzajc<zzug, zza> implements zzakp {
    private static final zzug zzc;
    private static volatile zzakw<zzug> zzd;
    private int zze;
    private zzuh zzf;
    private int zzg;
    private int zzh;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzug, zza> implements zzakp {
        private zza() {
            super(zzug.zzc);
        }

        /* synthetic */ zza(zzuf zzufVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzug) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzuh zzuhVar) {
            zzi();
            ((zzug) this.zza).zza(zzuhVar);
            return this;
        }
    }

    static {
        zzug zzugVar = new zzug();
        zzc = zzugVar;
        zzajc.zza((Class<zzug>) zzug.class, zzugVar);
    }

    private zzug() {
    }

    public static zzug zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzug) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuh zzuhVar) {
        zzuhVar.getClass();
        this.zzf = zzuhVar;
        this.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzug zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzug>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzug> zzakwVar;
        zzuf zzufVar = null;
        switch (zzuf.zza[i10 - 1]) {
            case 1:
                return new zzug();
            case 2:
                return new zza(zzufVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzug> zzakwVar2 = zzd;
                zzakw<zzug> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzug.class) {
                        zzakw<zzug> zzakwVar4 = zzd;
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
        return this.zzh;
    }

    public final zzuh zzf() {
        zzuh zzuhVar = this.zzf;
        return zzuhVar == null ? zzuh.zze() : zzuhVar;
    }
}
