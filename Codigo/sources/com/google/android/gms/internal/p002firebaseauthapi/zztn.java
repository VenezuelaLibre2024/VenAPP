package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zztn extends zzajc<zztn, zza> implements zzakp {
    private static final zztn zzc;
    private static volatile zzakw<zztn> zzd;
    private int zze;
    private zztq zzf;

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc.zza<zztn, zza> implements zzakp {
        private zza() {
            super(zztn.zzc);
        }

        /* synthetic */ zza(zzto zztoVar) {
            this();
        }

        public final zza zza(zztq zztqVar) {
            zzi();
            ((zztn) this.zza).zza(zztqVar);
            return this;
        }
    }

    static {
        zztn zztnVar = new zztn();
        zzc = zztnVar;
        zzajc.zza((Class<zztn>) zztn.class, zztnVar);
    }

    private zztn() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zztn zza(zzahp zzahpVar, zzaio zzaioVar) {
        return (zztn) zzajc.zza(zzc, zzahpVar, zzaioVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztq zztqVar) {
        zztqVar.getClass();
        this.zzf = zztqVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztn>] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztn> zzakwVar;
        zzto zztoVar = null;
        switch (zzto.zza[i10 - 1]) {
            case 1:
                return new zztn();
            case 2:
                return new zza(zztoVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztn> zzakwVar2 = zzd;
                zzakw<zztn> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zztn.class) {
                        zzakw<zztn> zzakwVar4 = zzd;
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

    public final zztq zzc() {
        zztq zztqVar = this.zzf;
        return zztqVar == null ? zztq.zze() : zztqVar;
    }
}
