package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

@Deprecated
/* loaded from: classes2.dex */
public final class zzvf extends zzajc<zzvf, zza> implements zzakp {
    private static final zzvf zzc;
    private static volatile zzakw<zzvf> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvf, zza> implements zzakp {
        private zza() {
            super(zzvf.zzc);
        }

        /* synthetic */ zza(zzve zzveVar) {
            this();
        }
    }

    static {
        zzvf zzvfVar = new zzvf();
        zzc = zzvfVar;
        zzajc.zza((Class<zzvf>) zzvf.class, zzvfVar);
    }

    private zzvf() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvf>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvf> zzakwVar;
        zzve zzveVar = null;
        switch (zzve.zza[i10 - 1]) {
            case 1:
                return new zzvf();
            case 2:
                return new zza(zzveVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvf> zzakwVar2 = zzd;
                zzakw<zzvf> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvf.class) {
                        zzakw<zzvf> zzakwVar4 = zzd;
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
