package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zztu extends zzajc<zztu, zza> implements zzakp {
    private static final zztu zzc;
    private static volatile zzakw<zztu> zzd;
    private int zze;
    private int zzf;
    private zztq zzg;
    private zzahp zzh;
    private zzahp zzi;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zztu, zza> implements zzakp {
        private zza() {
            super(zztu.zzc);
        }

        /* synthetic */ zza(zztt zzttVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zztu) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zztu) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zztq zztqVar) {
            zzi();
            ((zztu) this.zza).zza(zztqVar);
            return this;
        }

        public final zza zzb(zzahp zzahpVar) {
            zzi();
            ((zztu) this.zza).zzb(zzahpVar);
            return this;
        }
    }

    static {
        zztu zztuVar = new zztu();
        zzc = zztuVar;
        zzajc.zza((Class<zztu>) zztu.class, zztuVar);
    }

    private zztu() {
        zzahp zzahpVar = zzahp.zza;
        this.zzh = zzahpVar;
        this.zzi = zzahpVar;
    }

    public static zztu zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zztu) zzajc.zza(zzc, zzahpVar, zzaioVar);
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
    public final void zza(zztq zztqVar) {
        zztqVar.getClass();
        this.zzg = zztqVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzi = zzahpVar;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zztu zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztu>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztu> zzakwVar;
        zztt zzttVar = null;
        switch (zztt.zza[i10 - 1]) {
            case 1:
                return new zztu();
            case 2:
                return new zza(zzttVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztu> zzakwVar2 = zzd;
                zzakw<zztu> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zztu.class) {
                        zzakw<zztu> zzakwVar4 = zzd;
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

    public final zztq zzb() {
        zztq zztqVar = this.zzg;
        return zztqVar == null ? zztq.zze() : zztqVar;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public final zzahp zzg() {
        return this.zzi;
    }
}
