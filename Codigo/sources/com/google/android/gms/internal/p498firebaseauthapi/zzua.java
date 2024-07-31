package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzua extends zzajc<zzua, zza> implements zzakp {
    private static final zzua zzc;
    private static volatile zzakw<zzua> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;
    private zzvj zzg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zzua, zza> implements zzakp {
        private zza() {
            super(zzua.zzc);
        }

        /* synthetic */ zza(zztz zztzVar) {
            this();
        }

        public final zza zza(zzahp zzahpVar) {
            zzi();
            ((zzua) this.zza).zza(zzahpVar);
            return this;
        }

        public final zza zza(zzvj zzvjVar) {
            zzi();
            ((zzua) this.zza).zza(zzvjVar);
            return this;
        }
    }

    static {
        zzua zzuaVar = new zzua();
        zzc = zzuaVar;
        zzajc.zza((Class<zzua>) zzua.class, zzuaVar);
    }

    private zzua() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzua zza(InputStream inputStream, zzaio zzaioVar) {
        return (zzua) zzajc.zza(zzc, inputStream, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahp zzahpVar) {
        zzahpVar.getClass();
        this.zzf = zzahpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvj zzvjVar) {
        zzvjVar.getClass();
        this.zzg = zzvjVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzua>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzua> zzakwVar;
        zztz zztzVar = null;
        switch (zztz.zza[i10 - 1]) {
            case 1:
                return new zzua();
            case 2:
                return new zza(zztzVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzua> zzakwVar2 = zzd;
                zzakw<zzua> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzua.class) {
                        zzakw<zzua> zzakwVar4 = zzd;
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

    public final zzahp zzc() {
        return this.zzf;
    }
}
