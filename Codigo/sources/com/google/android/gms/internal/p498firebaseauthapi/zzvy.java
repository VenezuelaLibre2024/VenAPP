package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzvy extends zzajc<zzvy, zza> implements zzakp {
    private static final zzvy zzc;
    private static volatile zzakw<zzvy> zzd;
    private int zze;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvy, zza> implements zzakp {
        private zza() {
            super(zzvy.zzc);
        }

        /* synthetic */ zza(zzvz zzvzVar) {
            this();
        }
    }

    static {
        zzvy zzvyVar = new zzvy();
        zzc = zzvyVar;
        zzajc.zza((Class<zzvy>) zzvy.class, zzvyVar);
    }

    private zzvy() {
    }

    public static zzvy zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzvy) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    public static zzvy zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvy>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvy> zzakwVar;
        zzvz zzvzVar = null;
        switch (zzvz.zza[i10 - 1]) {
            case 1:
                return new zzvy();
            case 2:
                return new zza(zzvzVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvy> zzakwVar2 = zzd;
                zzakw<zzvy> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvy.class) {
                        zzakw<zzvy> zzakwVar4 = zzd;
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
