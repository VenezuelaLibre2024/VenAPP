package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsf extends zzajc<zzsf, zza> implements zzakp {
    private static final zzsf zzc;
    private static volatile zzakw<zzsf> zzd;
    private int zze;
    private zzsj zzf;
    private zzug zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsf, zza> implements zzakp {
        private zza() {
            super(zzsf.zzc);
        }

        /* synthetic */ zza(zzsg zzsgVar) {
            this();
        }

        public final zza zza(zzsj zzsjVar) {
            zzi();
            ((zzsf) this.zza).zza(zzsjVar);
            return this;
        }

        public final zza zza(zzug zzugVar) {
            zzi();
            ((zzsf) this.zza).zza(zzugVar);
            return this;
        }
    }

    static {
        zzsf zzsfVar = new zzsf();
        zzc = zzsfVar;
        zzajc.zza((Class<zzsf>) zzsf.class, zzsfVar);
    }

    private zzsf() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzsf zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzsf) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsj zzsjVar) {
        zzsjVar.getClass();
        this.zzf = zzsjVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzug zzugVar) {
        zzugVar.getClass();
        this.zzg = zzugVar;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsf>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsf> zzakwVar;
        zzsg zzsgVar = null;
        switch (zzsg.zza[i10 - 1]) {
            case 1:
                return new zzsf();
            case 2:
                return new zza(zzsgVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsf> zzakwVar2 = zzd;
                zzakw<zzsf> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsf.class) {
                        zzakw<zzsf> zzakwVar4 = zzd;
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

    public final zzsj zzc() {
        zzsj zzsjVar = this.zzf;
        return zzsjVar == null ? zzsj.zzd() : zzsjVar;
    }

    public final zzug zzd() {
        zzug zzugVar = this.zzg;
        return zzugVar == null ? zzug.zze() : zzugVar;
    }
}
