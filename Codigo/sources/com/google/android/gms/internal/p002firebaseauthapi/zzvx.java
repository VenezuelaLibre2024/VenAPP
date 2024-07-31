package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzvx extends zzajc<zzvx, zza> implements zzakp {
    private static final zzvx zzc;
    private static volatile zzakw<zzvx> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvx, zza> implements zzakp {
        private zza() {
            super(zzvx.zzc);
        }

        /* synthetic */ zza(zzvw zzvwVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvx) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzvx) this.zza).zza(zzahpVar);
            return this;
        }
    }

    static {
        zzvx zzvxVar = new zzvx();
        zzc = zzvxVar;
        zzajc.zza((Class<zzvx>) zzvx.class, zzvxVar);
    }

    private zzvx() {
    }

    public static zzvx zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzvx) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzf = zzahpVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvx>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvx> zzakwVar;
        zzvw zzvwVar = null;
        switch (zzvw.zza[i10 - 1]) {
            case 1:
                return new zzvx();
            case 2:
                return new zza(zzvwVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvx> zzakwVar2 = zzd;
                zzakw<zzvx> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvx.class) {
                        zzakw<zzvx> zzakwVar4 = zzd;
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

    public final zzahp zzd() {
        return this.zzf;
    }
}
