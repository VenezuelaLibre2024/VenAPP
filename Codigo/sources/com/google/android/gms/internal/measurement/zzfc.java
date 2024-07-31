package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfc {

    /* loaded from: classes2.dex */
    public static final class zza extends zzix<zza, C0154zza> implements zzkl {
        private static final zza zzc;
        private static volatile zzkw<zza> zzd;
        private int zze;
        private boolean zzi;
        private zzjf<zzb> zzf = zzix.zzcc();
        private zzjf<zzc> zzg = zzix.zzcc();
        private zzjf<zzf> zzh = zzix.zzcc();
        private zzjf<zzb> zzj = zzix.zzcc();

        /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0154zza extends zzix.zzb<zza, C0154zza> implements zzkl {
            private C0154zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0154zza(zzfb zzfbVar) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzb extends zzix<zzb, C0155zza> implements zzkl {
            private static final zzb zzc;
            private static volatile zzkw<zzb> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzb$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0155zza extends zzix.zzb<zzb, C0155zza> implements zzkl {
                private C0155zza() {
                    super(zzb.zzc);
                }

                /* synthetic */ C0155zza(zzfb zzfbVar) {
                    this();
                }
            }

            static {
                zzb zzbVar = new zzb();
                zzc = zzbVar;
                zzix.zza((Class<zzb>) zzb.class, zzbVar);
            }

            private zzb() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.measurement.zzix
            public final Object zza(int i10, Object obj, Object obj2) {
                zzfb zzfbVar = null;
                switch (zzfb.zza[i10 - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0155zza(zzfbVar);
                    case 3:
                        return zzix.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zzd.zzb()});
                    case 4:
                        return zzc;
                    case 5:
                        zzkw<zzb> zzkwVar = zzd;
                        if (zzkwVar == null) {
                            synchronized (zzb.class) {
                                zzkwVar = zzd;
                                if (zzkwVar == null) {
                                    zzkwVar = new zzix.zza<>(zzc);
                                    zzd = zzkwVar;
                                }
                            }
                        }
                        return zzkwVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public final zzd zzb() {
                zzd zza = zzd.zza(this.zzg);
                return zza == null ? zzd.CONSENT_STATUS_UNSPECIFIED : zza;
            }

            public final zze zzc() {
                zze zza = zze.zza(this.zzf);
                return zza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zza;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzc extends zzix<zzc, C0156zza> implements zzkl {
            private static final zzc zzc;
            private static volatile zzkw<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzc$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0156zza extends zzix.zzb<zzc, C0156zza> implements zzkl {
                private C0156zza() {
                    super(zzc.zzc);
                }

                /* synthetic */ C0156zza(zzfb zzfbVar) {
                    this();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzc = zzcVar;
                zzix.zza((Class<zzc>) zzc.class, zzcVar);
            }

            private zzc() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.measurement.zzix
            public final Object zza(int i10, Object obj, Object obj2) {
                zzfb zzfbVar = null;
                switch (zzfb.zza[i10 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C0156zza(zzfbVar);
                    case 3:
                        return zzix.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zze.zzb()});
                    case 4:
                        return zzc;
                    case 5:
                        zzkw<zzc> zzkwVar = zzd;
                        if (zzkwVar == null) {
                            synchronized (zzc.class) {
                                zzkwVar = zzd;
                                if (zzkwVar == null) {
                                    zzkwVar = new zzix.zza<>(zzc);
                                    zzd = zzkwVar;
                                }
                            }
                        }
                        return zzkwVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public final zze zzb() {
                zze zza = zze.zza(this.zzg);
                return zza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zza;
            }

            public final zze zzc() {
                zze zza = zze.zza(this.zzf);
                return zza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zza;
            }
        }

        /* loaded from: classes2.dex */
        public enum zzd implements zzjc {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);

            private static final zzjb<zzd> zzd = new zzfd();
            private final int zzf;

            zzd(int i10) {
                this.zzf = i10;
            }

            public static zzd zza(int i10) {
                if (i10 == 0) {
                    return CONSENT_STATUS_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return GRANTED;
                }
                if (i10 != 2) {
                    return null;
                }
                return DENIED;
            }

            public static zzje zzb() {
                return zzfe.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int zza() {
                return this.zzf;
            }
        }

        /* loaded from: classes2.dex */
        public enum zze implements zzjc {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);

            private static final zzjb<zze> zzf = new zzfg();
            private final int zzh;

            zze(int i10) {
                this.zzh = i10;
            }

            public static zze zza(int i10) {
                if (i10 == 0) {
                    return CONSENT_TYPE_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return AD_STORAGE;
                }
                if (i10 == 2) {
                    return ANALYTICS_STORAGE;
                }
                if (i10 == 3) {
                    return AD_USER_DATA;
                }
                if (i10 != 4) {
                    return null;
                }
                return AD_PERSONALIZATION;
            }

            public static zzje zzb() {
                return zzff.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjc
            public final int zza() {
                return this.zzh;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzf extends zzix<zzf, C0157zza> implements zzkl {
            private static final zzf zzc;
            private static volatile zzkw<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* renamed from: com.google.android.gms.internal.measurement.zzfc$zza$zzf$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0157zza extends zzix.zzb<zzf, C0157zza> implements zzkl {
                private C0157zza() {
                    super(zzf.zzc);
                }

                /* synthetic */ C0157zza(zzfb zzfbVar) {
                    this();
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzc = zzfVar;
                zzix.zza((Class<zzf>) zzf.class, zzfVar);
            }

            private zzf() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.measurement.zzix
            public final Object zza(int i10, Object obj, Object obj2) {
                zzfb zzfbVar = null;
                switch (zzfb.zza[i10 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0157zza(zzfbVar);
                    case 3:
                        return zzix.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    case 4:
                        return zzc;
                    case 5:
                        zzkw<zzf> zzkwVar = zzd;
                        if (zzkwVar == null) {
                            synchronized (zzf.class) {
                                zzkwVar = zzd;
                                if (zzkwVar == null) {
                                    zzkwVar = new zzix.zza<>(zzc);
                                    zzd = zzkwVar;
                                }
                            }
                        }
                        return zzkwVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public final String zzb() {
                return this.zzf;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzix.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzb() {
            return zzc;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i10, Object obj, Object obj2) {
            zzfb zzfbVar = null;
            switch (zzfb.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0154zza(zzfbVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", zzb.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zza> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zza.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final List<zzf> zzc() {
            return this.zzh;
        }

        public final List<zzb> zzd() {
            return this.zzf;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzix<zzb, zza> implements zzkl {
        private static final zzb zzc;
        private static volatile zzkw<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjf<zzf> zzg = zzix.zzcc();
        private boolean zzh;

        /* loaded from: classes2.dex */
        public static final class zza extends zzix.zzb<zzb, zza> implements zzkl {
            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzix.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i10, Object obj, Object obj2) {
            zzfb zzfbVar = null;
            switch (zzfb.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzf.class, "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzb> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzb.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzb() {
            return this.zzf;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzc extends zzix<zzc, zza> implements zzkl {
        private static final zzc zzc;
        private static volatile zzkw<zzc> zzd;
        private int zze;
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        /* loaded from: classes2.dex */
        public static final class zza extends zzix.zzb<zzc, zza> implements zzkl {
            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }

            public final int zza() {
                return ((zzc) this.zza).zza();
            }

            public final zza zza(String str) {
                zzad();
                ((zzc) this.zza).zza(str);
                return this;
            }

            public final String zzb() {
                return ((zzc) this.zza).zzc();
            }

            public final boolean zzc() {
                return ((zzc) this.zza).zzd();
            }

            public final boolean zzd() {
                return ((zzc) this.zza).zze();
            }

            public final boolean zze() {
                return ((zzc) this.zza).zzf();
            }

            public final boolean zzf() {
                return ((zzc) this.zza).zzg();
            }

            public final boolean zzg() {
                return ((zzc) this.zza).zzh();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzix.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        public final int zza() {
            return this.zzi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i10, Object obj, Object obj2) {
            zzfb zzfbVar = null;
            switch (zzfb.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzc> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzc.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return this.zzg;
        }

        public final boolean zze() {
            return this.zzh;
        }

        public final boolean zzf() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzd extends zzix<zzd, zza> implements zzkl {
        private static final zzd zzc;
        private static volatile zzkw<zzd> zzd;
        private int zze;
        private long zzf;
        private int zzh;
        private boolean zzm;
        private zza zzt;
        private zze zzu;
        private String zzg = "";
        private zzjf<zzg> zzi = zzix.zzcc();
        private zzjf<zzc> zzj = zzix.zzcc();
        private zzjf<zzew.zza> zzk = zzix.zzcc();
        private String zzl = "";
        private zzjf<zzfp.zzc> zzn = zzix.zzcc();
        private zzjf<zzb> zzo = zzix.zzcc();
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzs = "";

        /* loaded from: classes2.dex */
        public static final class zza extends zzix.zzb<zzd, zza> implements zzkl {
            private zza() {
                super(zzd.zzc);
            }

            /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }

            public final int zza() {
                return ((zzd) this.zza).zzb();
            }

            public final zzc zza(int i10) {
                return ((zzd) this.zza).zza(i10);
            }

            public final zza zza(int i10, zzc.zza zzaVar) {
                zzad();
                ((zzd) this.zza).zza(i10, (zzc) ((zzix) zzaVar.zzab()));
                return this;
            }

            public final zza zzb() {
                zzad();
                ((zzd) this.zza).zzt();
                return this;
            }

            public final String zzc() {
                return ((zzd) this.zza).zzk();
            }

            public final List<zzew.zza> zzd() {
                return Collections.unmodifiableList(((zzd) this.zza).zzl());
            }

            public final List<zzb> zze() {
                return Collections.unmodifiableList(((zzd) this.zza).zzm());
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzix.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i10, zzc zzcVar) {
            zzcVar.getClass();
            zzjf<zzc> zzjfVar = this.zzj;
            if (!zzjfVar.zzc()) {
                this.zzj = zzix.zza(zzjfVar);
            }
            this.zzj.set(i10, zzcVar);
        }

        public static zza zze() {
            return zzc.zzbx();
        }

        public static zzd zzg() {
            return zzc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzt() {
            this.zzk = zzix.zzcc();
        }

        public final int zza() {
            return this.zzn.size();
        }

        public final zzc zza(int i10) {
            return this.zzj.get(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i10, Object obj, Object obj2) {
            zzfb zzfbVar = null;
            switch (zzfb.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzg.class, "zzj", zzc.class, "zzk", zzew.zza.class, "zzl", "zzm", "zzn", zzfp.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzd> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzd.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int zzb() {
            return this.zzj.size();
        }

        public final long zzc() {
            return this.zzf;
        }

        public final zza zzd() {
            zza zzaVar = this.zzt;
            return zzaVar == null ? zza.zzb() : zzaVar;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final String zzi() {
            return this.zzr;
        }

        public final String zzj() {
            return this.zzq;
        }

        public final String zzk() {
            return this.zzp;
        }

        public final List<zzew.zza> zzl() {
            return this.zzk;
        }

        public final List<zzb> zzm() {
            return this.zzo;
        }

        public final List<zzfp.zzc> zzn() {
            return this.zzn;
        }

        public final List<zzg> zzo() {
            return this.zzi;
        }

        public final boolean zzp() {
            return this.zzm;
        }

        public final boolean zzq() {
            return (this.zze & RecognitionOptions.UPC_A) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzs() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zze extends zzix<zze, zza> implements zzkl {
        private static final zze zzc;
        private static volatile zzkw<zze> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        /* loaded from: classes2.dex */
        public static final class zza extends zzix.zzb<zze, zza> implements zzkl {
            private zza() {
                super(zze.zzc);
            }

            /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzix.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i10, Object obj, Object obj2) {
            zzfb zzfbVar = null;
            switch (zzfb.zza[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zze> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zze.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
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
    public static final class zzf extends zzix<zzf, zza> implements zzkl {
        private static final zzf zzc;
        private static volatile zzkw<zzf> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes2.dex */
        public static final class zza extends zzix.zzb<zzf, zza> implements zzkl {
            private zza() {
                super(zzf.zzc);
            }

            /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzix.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i10, Object obj, Object obj2) {
            zzfb zzfbVar = null;
            switch (zzfb.zza[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzf> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzf.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
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
    public static final class zzg extends zzix<zzg, zza> implements zzkl {
        private static final zzg zzc;
        private static volatile zzkw<zzg> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes2.dex */
        public static final class zza extends zzix.zzb<zzg, zza> implements zzkl {
            private zza() {
                super(zzg.zzc);
            }

            /* synthetic */ zza(zzfb zzfbVar) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzix.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzix
        public final Object zza(int i10, Object obj, Object obj2) {
            zzfb zzfbVar = null;
            switch (zzfb.zza[i10 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(zzfbVar);
                case 3:
                    return zzix.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzkw<zzg> zzkwVar = zzd;
                    if (zzkwVar == null) {
                        synchronized (zzg.class) {
                            zzkwVar = zzd;
                            if (zzkwVar == null) {
                                zzkwVar = new zzix.zza<>(zzc);
                                zzd = zzkwVar;
                            }
                        }
                    }
                    return zzkwVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzb() {
            return this.zzf;
        }

        public final String zzc() {
            return this.zzg;
        }
    }
}
