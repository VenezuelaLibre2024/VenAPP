package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzvo extends zzajc<zzvo, zza> implements zzakp {
    private static final zzvo zzc;
    private static volatile zzakw<zzvo> zzd;
    private int zze;
    private int zzf;
    private zzvr zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvo, zza> implements zzakp {
        private zza() {
            super(zzvo.zzc);
        }

        /* synthetic */ zza(zzvp zzvpVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvo) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzvr zzvrVar) {
            zzi();
            ((zzvo) this.zza).zza(zzvrVar);
            return this;
        }
    }

    static {
        zzvo zzvoVar = new zzvo();
        zzc = zzvoVar;
        zzajc.zza((Class<zzvo>) zzvo.class, zzvoVar);
    }

    private zzvo() {
    }

    public static zzvo zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzvo) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvr zzvrVar) {
        zzvrVar.getClass();
        this.zzg = zzvrVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvo>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvo> zzakwVar;
        zzvp zzvpVar = null;
        switch (zzvp.zza[i10 - 1]) {
            case 1:
                return new zzvo();
            case 2:
                return new zza(zzvpVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvo> zzakwVar2 = zzd;
                zzakw<zzvo> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvo.class) {
                        zzakw<zzvo> zzakwVar4 = zzd;
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

    public final zzvr zzd() {
        zzvr zzvrVar = this.zzg;
        return zzvrVar == null ? zzvr.zzd() : zzvrVar;
    }
}
