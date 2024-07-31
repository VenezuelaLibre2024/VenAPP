package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzamb extends zzajc<zzamb, zza> implements zzakp {
    private static final zzamb zzc;
    private static volatile zzakw<zzamb> zzd;
    private long zze;
    private int zzf;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzamb, zza> implements zzakp {
        private zza() {
            super(zzamb.zzc);
        }

        /* synthetic */ zza(zzama zzamaVar) {
            this();
        }

        public final zza zza(int i10) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamb) this.zza).zza(i10);
            return this;
        }

        public final zza zza(long j10) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamb) this.zza).zza(j10);
            return this;
        }
    }

    static {
        zzamb zzambVar = new zzamb();
        zzc = zzambVar;
        zzajc.zza((Class<zzamb>) zzamb.class, zzambVar);
    }

    private zzamb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j10) {
        this.zze = j10;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzamb>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzamb> zzakwVar;
        zzama zzamaVar = null;
        switch (zzama.zza[i10 - 1]) {
            case 1:
                return new zzamb();
            case 2:
                return new zza(zzamaVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzamb> zzakwVar2 = zzd;
                zzakw<zzamb> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzamb.class) {
                        zzakw<zzamb> zzakwVar4 = zzd;
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

    public final long zzb() {
        return this.zze;
    }
}
