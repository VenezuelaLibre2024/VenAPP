package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzif {
    private static final Logger zza = Logger.getLogger(zzif.class.getName());
    private static final AtomicBoolean zzb = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public static abstract class zza extends Enum<zza> {
        public static final zza zza;
        public static final zza zzb;
        private static final /* synthetic */ zza[] zzc;

        static {
            zzih zzihVar = new zzih("ALGORITHM_NOT_FIPS");
            zza = zzihVar;
            zzij zzijVar = new zzij("ALGORITHM_REQUIRES_BORINGCRYPTO");
            zzb = zzijVar;
            zzc = new zza[]{zzihVar, zzijVar};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public zza(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ zza(String str, int i10, zzil zzilVar) {
            this(str, i10);
        }

        public static zza[] values() {
            return (zza[]) zzc.clone();
        }

        public abstract boolean zza();
    }

    private zzif() {
    }

    public static Boolean zza() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean zzb() {
        return zzb.get();
    }
}
