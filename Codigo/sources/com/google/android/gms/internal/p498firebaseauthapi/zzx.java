package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzx {
    private static final Logger zza = Logger.getLogger(zzx.class.getName());
    private static final zzv zzb = new zza();

    /* loaded from: classes2.dex */
    private static final class zza implements zzv {
        private zza() {
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzv
        public final zzs zza(String str) {
            return new zzu(Pattern.compile(str));
        }
    }

    private zzx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzs zza(String str) {
        zzy.zza(str);
        return zzb.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(String str) {
        if (zzd(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(String str) {
        return str == null || str.isEmpty();
    }
}
