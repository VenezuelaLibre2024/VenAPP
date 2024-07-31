package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsj extends zzajc<zzsj, zza> implements zzakp {
    private static final zzsj zzc;
    private static volatile zzakw<zzsj> zzd;
    private int zze;
    private zzsm zzf;
    private int zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsj, zza> implements zzakp {
        private zza() {
            super(zzsj.zzc);
        }

        /* synthetic */ zza(zzsk zzskVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsj) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzsm zzsmVar) {
            zzi();
            ((zzsj) this.zza).zza(zzsmVar);
            return this;
        }
    }

    static {
        zzsj zzsjVar = new zzsj();
        zzc = zzsjVar;
        zzajc.zza((Class<zzsj>) zzsj.class, zzsjVar);
    }

    private zzsj() {
    }

    public static zzsj zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzsj) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsm zzsmVar) {
        zzsmVar.getClass();
        this.zzf = zzsmVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsj zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsj>] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsj> zzakwVar;
        zzsk zzskVar = null;
        switch (zzsk.zza[i10 - 1]) {
            case 1:
                return new zzsj();
            case 2:
                return new zza(zzskVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsj> zzakwVar2 = zzd;
                zzakw<zzsj> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsj.class) {
                        zzakw<zzsj> zzakwVar4 = zzd;
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
        zzsm zzsmVar = this.zzf;
        return zzsmVar == null ? zzsm.zzd() : zzsmVar;
    }
}
