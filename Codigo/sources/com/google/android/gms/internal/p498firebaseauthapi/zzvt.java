package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

@Deprecated
/* loaded from: classes2.dex */
public final class zzvt extends zzajc<zzvt, zza> implements zzakp {
    private static final zzvt zzc;
    private static volatile zzakw<zzvt> zzd;
    private String zze = "";
    private zzajj<zzvf> zzf = zzajc.zzp();

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvt, zza> implements zzakp {
        private zza() {
            super(zzvt.zzc);
        }

        /* synthetic */ zza(zzvv zzvvVar) {
            this();
        }
    }

    static {
        zzvt zzvtVar = new zzvt();
        zzc = zzvtVar;
        zzajc.zza((Class<zzvt>) zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    public static zzvt zzb() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvt>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvt> zzakwVar;
        zzvv zzvvVar = null;
        switch (zzvv.zza[i10 - 1]) {
            case 1:
                return new zzvt();
            case 2:
                return new zza(zzvvVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzvf.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvt> zzakwVar2 = zzd;
                zzakw<zzvt> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvt.class) {
                        zzakw<zzvt> zzakwVar4 = zzd;
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
