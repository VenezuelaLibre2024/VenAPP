package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzuv extends zzajc<zzuv, zza> implements zzakp {
    private static final zzuv zzc;
    private static volatile zzakw<zzuv> zzd;
    private int zze;
    private int zzf;
    private zzur zzg;
    private zzahp zzh = zzahp.zza;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzuv, zza> implements zzakp {
        private zza() {
            super(zzuv.zzc);
        }

        /* synthetic */ zza(zzuw zzuwVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuv) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzuv) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzur zzurVar) {
            zzi();
            ((zzuv) this.zza).zza(zzurVar);
            return this;
        }
    }

    static {
        zzuv zzuvVar = new zzuv();
        zzc = zzuvVar;
        zzajc.zza((Class<zzuv>) zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    public static zzuv zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzuv) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    public final void zza(int i10) {
        this.zzf = i10;
    }

    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzh = zzahpVar;
    }

    public final void zza(zzur zzurVar) {
        zzurVar.getClass();
        this.zzg = zzurVar;
        this.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuv zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuv>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuv> zzakwVar;
        switch (zzuw.zza[i10 - 1]) {
            case 1:
                return new zzuv();
            case 2:
                return new zza(null);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuv> zzakwVar2 = zzd;
                zzakw<zzuv> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzuv.class) {
                        zzakw<zzuv> zzakwVar4 = zzd;
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

    public final zzur zzb() {
        zzur zzurVar = this.zzg;
        return zzurVar == null ? zzur.zzf() : zzurVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 1) != 0;
    }
}
