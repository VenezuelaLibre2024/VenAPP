package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
public final class zzvj extends zzajc<zzvj, zzb> implements zzakp {
    private static final zzvj zzc;
    private static volatile zzakw<zzvj> zzd;
    private int zze;
    private zzajj<zza> zzf = zzajc.zzp();

    /* loaded from: classes2.dex */
    public static final class zza extends zzajc<zza, C13183zza> implements zzakp {
        private static final zza zzc;
        private static volatile zzakw<zza> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C13183zza extends zzajc.zza<zza, C13183zza> implements zzakp {
            private C13183zza() {
                super(zza.zzc);
            }

            /* synthetic */ C13183zza(zzvi zzviVar) {
                this();
            }

            public final C13183zza zza(int i10) {
                zzi();
                ((zza) this.zza).zza(i10);
                return this;
            }

            public final C13183zza zza(zzuz zzuzVar) {
                zzi();
                ((zza) this.zza).zza(zzuzVar);
                return this;
            }

            public final C13183zza zza(zzvs zzvsVar) {
                zzi();
                ((zza) this.zza).zza(zzvsVar);
                return this;
            }

            public final C13183zza zza(String str) {
                zzi();
                ((zza) this.zza).zza(str);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzajc.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i10) {
            this.zzg = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzuz zzuzVar) {
            this.zzf = zzuzVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvs zzvsVar) {
            this.zzh = zzvsVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze = str;
        }

        public static C13183zza zzb() {
            return zzc.zzm();
        }

        public final int zza() {
            return this.zzg;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvj$zza>] */
        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
        public final Object zza(int i10, Object obj, Object obj2) {
            zzakw<zza> zzakwVar;
            zzvi zzviVar = null;
            switch (zzvi.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C13183zza(zzviVar);
                case 3:
                    return zzajc.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzakw<zza> zzakwVar2 = zzd;
                    zzakw<zza> zzakwVar3 = zzakwVar2;
                    if (zzakwVar2 == null) {
                        synchronized (zza.class) {
                            zzakw<zza> zzakwVar4 = zzd;
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

    /* loaded from: classes2.dex */
    public static final class zzb extends zzajc.zza<zzvj, zzb> implements zzakp {
        private zzb() {
            super(zzvj.zzc);
        }

        /* synthetic */ zzb(zzvi zzviVar) {
            this();
        }

        public final zzb zza(int i10) {
            zzi();
            ((zzvj) this.zza).zzc(i10);
            return this;
        }

        public final zzb zza(zza zzaVar) {
            zzi();
            ((zzvj) this.zza).zza(zzaVar);
            return this;
        }
    }

    static {
        zzvj zzvjVar = new zzvj();
        zzc = zzvjVar;
        zzajc.zza((Class<zzvj>) zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    public static zzb zza() {
        return zzc.zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzajj<zza> zzajjVar = this.zzf;
        if (!zzajjVar.zzc()) {
            this.zzf = zzajc.zza(zzajjVar);
        }
        this.zzf.add(zzaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i10) {
        this.zze = i10;
    }

    public final zza zza(int i10) {
        return this.zzf.get(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvj>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajc
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvj> zzakwVar;
        zzvi zzviVar = null;
        switch (zzvi.zza[i10 - 1]) {
            case 1:
                return new zzvj();
            case 2:
                return new zzb(zzviVar);
            case 3:
                return zzajc.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvj> zzakwVar2 = zzd;
                zzakw<zzvj> zzakwVar3 = zzakwVar2;
                if (zzakwVar2 == null) {
                    synchronized (zzvj.class) {
                        zzakw<zzvj> zzakwVar4 = zzd;
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
