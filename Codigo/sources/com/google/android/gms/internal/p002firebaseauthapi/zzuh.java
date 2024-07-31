package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzuh extends zzajc<zzuh, zza> implements zzakp {
    private static final zzuh zzc;
    private static volatile zzakw<zzuh> zzd;
    private int zze;
    private int zzf;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzuh, zza> implements zzakp {
        private zza() {
            super(zzuh.zzc);
        }

        /* synthetic */ zza(zzui zzuiVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuh) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzub zzubVar) {
            zzi();
            ((zzuh) this.zza).zza(zzubVar);
            return this;
        }
    }

    static {
        zzuh zzuhVar = new zzuh();
        zzc = zzuhVar;
        zzajc.zza((Class<zzuh>) zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzub zzubVar) {
        this.zze = zzubVar.zza();
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuh zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuh>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuh> zzakwVar;
        zzui zzuiVar = null;
        switch (zzui.zza[i10 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza(zzuiVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuh> zzakwVar2 = zzd;
                zzakw<zzuh> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzuh.class) {
                        zzakw<zzuh> zzakwVar4 = zzd;
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

    public final zzub zzb() {
        zzub zza2 = zzub.zza(this.zze);
        return zza2 == null ? zzub.UNRECOGNIZED : zza2;
    }
}
