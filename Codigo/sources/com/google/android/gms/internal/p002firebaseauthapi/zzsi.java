package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsi extends zzajc<zzsi, zza> implements zzakp {
    private static final zzsi zzc;
    private static volatile zzakw<zzsi> zzd;
    private int zze;
    private int zzf;
    private zzsm zzg;
    private zzahp zzh = zzahp.zza;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsi, zza> implements zzakp {
        private zza() {
            super(zzsi.zzc);
        }

        /* synthetic */ zza(zzsh zzshVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsi) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzsi) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzsm zzsmVar) {
            zzi();
            ((zzsi) this.zza).zza(zzsmVar);
            return this;
        }
    }

    static {
        zzsi zzsiVar = new zzsi();
        zzc = zzsiVar;
        zzajc.zza((Class<zzsi>) zzsi.class, zzsiVar);
    }

    private zzsi() {
    }

    public static zzsi zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzsi) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzh = zzahpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsm zzsmVar) {
        zzsmVar.getClass();
        this.zzg = zzsmVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsi zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsi>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsi> zzakwVar;
        zzsh zzshVar = null;
        switch (zzsh.zza[i10 - 1]) {
            case 1:
                return new zzsi();
            case 2:
                return new zza(zzshVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsi> zzakwVar2 = zzd;
                zzakw<zzsi> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsi.class) {
                        zzakw<zzsi> zzakwVar4 = zzd;
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

    public final zzsm zze() {
        zzsm zzsmVar = this.zzg;
        return zzsmVar == null ? zzsm.zzd() : zzsmVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }
}
