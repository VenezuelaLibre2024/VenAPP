package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzth extends zzajc<zzth, zza> implements zzakp {
    private static final zzth zzc;
    private static volatile zzakw<zzth> zzd;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzth, zza> implements zzakp {
        private zza() {
            super(zzth.zzc);
        }

        /* synthetic */ zza(zzti zztiVar) {
            this();
        }
    }

    static {
        zzth zzthVar = new zzth();
        zzc = zzthVar;
        zzajc.zza((Class<zzth>) zzth.class, zzthVar);
    }

    private zzth() {
    }

    public static zzth zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzth) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    public static zzth zzb() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzth>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzth> zzakwVar;
        zzti zztiVar = null;
        switch (zzti.zza[i10 - 1]) {
            case 1:
                return new zzth();
            case 2:
                return new zza(zztiVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzakw<zzth> zzakwVar2 = zzd;
                zzakw<zzth> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzth.class) {
                        zzakw<zzth> zzakwVar4 = zzd;
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
}
