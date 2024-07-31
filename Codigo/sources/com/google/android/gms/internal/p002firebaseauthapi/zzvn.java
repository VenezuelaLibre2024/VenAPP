package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzvn extends zzajc<zzvn, zza> implements zzakp {
    private static final zzvn zzc;
    private static volatile zzakw<zzvn> zzd;
    private String zze = "";

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzvn, zza> implements zzakp {
        private zza() {
            super(zzvn.zzc);
        }

        /* synthetic */ zza(zzvm zzvmVar) {
            this();
        }

        public final zza zza(String str) {
            zzi();
            ((zzvn) this.zza).zza(str);
            return this;
        }
    }

    static {
        zzvn zzvnVar = new zzvn();
        zzc = zzvnVar;
        zzajc.zza((Class<zzvn>) zzvn.class, zzvnVar);
    }

    private zzvn() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzvn zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zzvn) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    public static zzvn zzc() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvn>] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvn> zzakwVar;
        zzvm zzvmVar = null;
        switch (zzvm.zza[i10 - 1]) {
            case 1:
                return new zzvn();
            case 2:
                return new zza(zzvmVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvn> zzakwVar2 = zzd;
                zzakw<zzvn> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvn.class) {
                        zzakw<zzvn> zzakwVar4 = zzd;
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

    public final String zzd() {
        return this.zze;
    }
}
