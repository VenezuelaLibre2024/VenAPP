package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzuq extends zzajc<zzuq, zza> implements zzakp {
    private static final zzuq zzc;
    private static volatile zzakw<zzuq> zzd;
    private int zze;
    private zzur zzf;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzuq, zza> implements zzakp {
        private zza() {
            super(zzuq.zzc);
        }

        /* synthetic */ zza(zzup zzupVar) {
            this();
        }

        public final zza zza(zzur zzurVar) {
            zzi();
            ((zzuq) this.zza).zza(zzurVar);
            return this;
        }
    }

    static {
        zzuq zzuqVar = new zzuq();
        zzc = zzuqVar;
        zzajc.zza((Class<zzuq>) zzuq.class, zzuqVar);
    }

    private zzuq() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzuq zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzuq) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzur zzurVar) {
        zzurVar.getClass();
        this.zzf = zzurVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuq>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuq> zzakwVar;
        zzup zzupVar = null;
        switch (zzup.zza[i10 - 1]) {
            case 1:
                return new zzuq();
            case 2:
                return new zza(zzupVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuq> zzakwVar2 = zzd;
                zzakw<zzuq> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzuq.class) {
                        zzakw<zzuq> zzakwVar4 = zzd;
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

    public final zzur zzc() {
        zzur zzurVar = this.zzf;
        return zzurVar == null ? zzur.zzf() : zzurVar;
    }
}
