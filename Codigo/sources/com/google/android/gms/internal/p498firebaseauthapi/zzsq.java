package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsq extends zzajc<zzsq, zza> implements zzakp {
    private static final zzsq zzc;
    private static volatile zzakw<zzsq> zzd;
    private int zze;
    private zzsr zzf;
    private int zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsq, zza> implements zzakp {
        private zza() {
            super(zzsq.zzc);
        }

        /* synthetic */ zza(zzsp zzspVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsq) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzsr zzsrVar) {
            zzi();
            ((zzsq) this.zza).zza(zzsrVar);
            return this;
        }
    }

    static {
        zzsq zzsqVar = new zzsq();
        zzc = zzsqVar;
        zzajc.zza((Class<zzsq>) zzsq.class, zzsqVar);
    }

    private zzsq() {
    }

    public static zzsq zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzsq) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsr zzsrVar) {
        zzsrVar.getClass();
        this.zzf = zzsrVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsq>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsq> zzakwVar;
        zzsp zzspVar = null;
        switch (zzsp.zza[i10 - 1]) {
            case 1:
                return new zzsq();
            case 2:
                return new zza(zzspVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsq> zzakwVar2 = zzd;
                zzakw<zzsq> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsq.class) {
                        zzakw<zzsq> zzakwVar4 = zzd;
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

    public final zzsr zzd() {
        zzsr zzsrVar = this.zzf;
        return zzsrVar == null ? zzsr.zzd() : zzsrVar;
    }
}
