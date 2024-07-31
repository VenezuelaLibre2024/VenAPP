package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzuc extends zzajc<zzuc, zza> implements zzakp {
    private static final zzuc zzc;
    private static volatile zzakw<zzuc> zzd;
    private int zze;
    private int zzf;
    private zzuh zzg;
    private zzahp zzh = zzahp.zza;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzuc, zza> implements zzakp {
        private zza() {
            super(zzuc.zzc);
        }

        /* synthetic */ zza(zzue zzueVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuc) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzuc) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzuh zzuhVar) {
            zzi();
            ((zzuc) this.zza).zza(zzuhVar);
            return this;
        }
    }

    static {
        zzuc zzucVar = new zzuc();
        zzc = zzucVar;
        zzajc.zza((Class<zzuc>) zzuc.class, zzucVar);
    }

    private zzuc() {
    }

    public static zzuc zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzuc) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zzuh zzuhVar) {
        zzuhVar.getClass();
        this.zzg = zzuhVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzuc zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuc>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuc> zzakwVar;
        zzue zzueVar = null;
        switch (zzue.zza[i10 - 1]) {
            case 1:
                return new zzuc();
            case 2:
                return new zza(zzueVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuc> zzakwVar2 = zzd;
                zzakw<zzuc> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzuc.class) {
                        zzakw<zzuc> zzakwVar4 = zzd;
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

    public final zzuh zze() {
        zzuh zzuhVar = this.zzg;
        return zzuhVar == null ? zzuh.zze() : zzuhVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }
}
