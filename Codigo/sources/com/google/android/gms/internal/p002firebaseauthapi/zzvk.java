package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzvk extends zzajc<zzvk, zza> implements zzakp {
    private static final zzvk zzc;
    private static volatile zzakw<zzvk> zzd;
    private int zze;
    private int zzf;
    private zzvn zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvk, zza> implements zzakp {
        private zza() {
            super(zzvk.zzc);
        }

        /* synthetic */ zza(zzvl zzvlVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvk) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzvn zzvnVar) {
            zzi();
            ((zzvk) this.zza).zza(zzvnVar);
            return this;
        }
    }

    static {
        zzvk zzvkVar = new zzvk();
        zzc = zzvkVar;
        zzajc.zza((Class<zzvk>) zzvk.class, zzvkVar);
    }

    private zzvk() {
    }

    public static zzvk zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzvk) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvn zzvnVar) {
        zzvnVar.getClass();
        this.zzg = zzvnVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvk>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvk> zzakwVar;
        zzvl zzvlVar = null;
        switch (zzvl.zza[i10 - 1]) {
            case 1:
                return new zzvk();
            case 2:
                return new zza(zzvlVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvk> zzakwVar2 = zzd;
                zzakw<zzvk> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvk.class) {
                        zzakw<zzvk> zzakwVar4 = zzd;
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

    public final zzvn zzd() {
        zzvn zzvnVar = this.zzg;
        return zzvnVar == null ? zzvn.zzc() : zzvnVar;
    }
}
