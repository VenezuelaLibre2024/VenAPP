package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzvr extends zzajc<zzvr, zza> implements zzakp {
    private static final zzvr zzc;
    private static volatile zzakw<zzvr> zzd;
    private int zze;
    private String zzf = "";
    private zzvb zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvr, zza> implements zzakp {
        private zza() {
            super(zzvr.zzc);
        }

        /* synthetic */ zza(zzvq zzvqVar) {
            this();
        }

        public final zza zza(zzvb zzvbVar) {
            zzi();
            ((zzvr) this.zza).zza(zzvbVar);
            return this;
        }

        public final zza zza(String str) {
            zzi();
            ((zzvr) this.zza).zza(str);
            return this;
        }
    }

    static {
        zzvr zzvrVar = new zzvr();
        zzc = zzvrVar;
        zzajc.zza((Class<zzvr>) zzvr.class, zzvrVar);
    }

    private zzvr() {
    }

    public static zzvr zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzvr) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    public final void zza(zzvb zzvbVar) {
        zzvbVar.getClass();
        this.zzg = zzvbVar;
        this.zze |= 1;
    }

    public final void zza(String str) {
        str.getClass();
        this.zzf = str;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzvr zzd() {
        return zzc;
    }

    public final zzvb zza() {
        zzvb zzvbVar = this.zzg;
        return zzvbVar == null ? zzvb.zzc() : zzvbVar;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvr>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvr> zzakwVar;
        switch (zzvq.zza[i10 - 1]) {
            case 1:
                return new zzvr();
            case 2:
                return new zza(null);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvr> zzakwVar2 = zzd;
                zzakw<zzvr> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvr.class) {
                        zzakw<zzvr> zzakwVar4 = zzd;
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

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }
}
