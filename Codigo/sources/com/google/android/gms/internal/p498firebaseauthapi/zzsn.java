package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzsn extends zzajc<zzsn, zza> implements zzakp {
    private static final zzsn zzc;
    private static volatile zzakw<zzsn> zzd;
    private int zze;
    private int zzf;
    private zzsr zzg;
    private zzahp zzh = zzahp.zza;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzsn, zza> implements zzakp {
        private zza() {
            super(zzsn.zzc);
        }

        /* synthetic */ zza(zzso zzsoVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsn) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzsn) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzsr zzsrVar) {
            zzi();
            ((zzsn) this.zza).zza(zzsrVar);
            return this;
        }
    }

    static {
        zzsn zzsnVar = new zzsn();
        zzc = zzsnVar;
        zzajc.zza((Class<zzsn>) zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    public static zzsn zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzsn) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zzsr zzsrVar) {
        zzsrVar.getClass();
        this.zzg = zzsrVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsn>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsn> zzakwVar;
        zzso zzsoVar = null;
        switch (zzso.zza[i10 - 1]) {
            case 1:
                return new zzsn();
            case 2:
                return new zza(zzsoVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsn> zzakwVar2 = zzd;
                zzakw<zzsn> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzsn.class) {
                        zzakw<zzsn> zzakwVar4 = zzd;
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
        zzsr zzsrVar = this.zzg;
        return zzsrVar == null ? zzsr.zzd() : zzsrVar;
    }

    public final zzahp zze() {
        return this.zzh;
    }
}
