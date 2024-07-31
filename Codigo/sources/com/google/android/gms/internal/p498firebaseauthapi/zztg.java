package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zztg extends zzajc<zztg, zza> implements zzakp {
    private static final zztg zzc;
    private static volatile zzakw<zztg> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zztg, zza> implements zzakp {
        private zza() {
            super(zztg.zzc);
        }

        /* synthetic */ zza(zztf zztfVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zztg) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zztg) this.zza).zza(zzahpVar);
            return this;
        }
    }

    static {
        zztg zztgVar = new zztg();
        zzc = zztgVar;
        zzajc.zza((Class<zztg>) zztg.class, zztgVar);
    }

    private zztg() {
    }

    public static zztg zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zztg) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztg>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztg> zzakwVar;
        zztf zztfVar = null;
        switch (zztf.zza[i10 - 1]) {
            case 1:
                return new zztg();
            case 2:
                return new zza(zztfVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztg> zzakwVar2 = zzd;
                zzakw<zztg> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zztg.class) {
                        zzakw<zztg> zzakwVar4 = zzd;
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
