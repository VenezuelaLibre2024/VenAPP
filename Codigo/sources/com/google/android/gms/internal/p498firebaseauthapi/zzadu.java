package com.google.android.gms.internal.p498firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.google.firebase.auth.C6104o0;
import ga.C7533a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import na.C9696e;
import p417w9.C12090a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzadu {
    private static final C7533a zza = new C7533a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaeb> zzd = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(zzq.zza));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.m22869a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            zza.m22871c("NoSuchAlgorithm: " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzadu zzaduVar, String str) {
        zzaeb zzaebVar = zzaduVar.zzd.get(str);
        if (zzaebVar == null || zzag.zzc(zzaebVar.zzd) || zzag.zzc(zzaebVar.zze) || zzaebVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzacd> it = zzaebVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(C6104o0.m16579y1(zzaebVar.zzd, zzaebVar.zze));
        }
        zzaebVar.zzh = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null || zzaebVar.zzh || zzag.zzc(zzaebVar.zzd)) {
            return;
        }
        zza.m22876h("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzacd> it = zzaebVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzaebVar.zzd);
        }
        zzaebVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null) {
            return;
        }
        if (!zzaebVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzacd zza(zzacd zzacdVar, String str) {
        return new zzadz(this, zzacdVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(final String str, zzacd zzacdVar, long j10, boolean z10) {
        this.zzd.put(str, new zzaeb(j10, z10));
        zzb(zzacdVar, str);
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar.zza <= 0) {
            zza.m22876h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaebVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzadx
            @Override // java.lang.Runnable
            public final void run() {
                zzadu.this.zzb(str);
            }
        }, zzaebVar.zza, TimeUnit.SECONDS);
        if (!zzaebVar.zzc) {
            zza.m22876h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzady zzadyVar = new zzady(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzadyVar, intentFilter);
        C12090a.m38843a(this.zzb).startSmsRetriever().addOnFailureListener(new zzadw(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                apkContentsSigners = C9696e.m29080a(this.zzb).m29077f(packageName, 64).signatures;
            } else {
                signingInfo = C9696e.m29080a(this.zzb).m29077f(packageName, 134217728).signingInfo;
                apkContentsSigners = signingInfo.getApkContentsSigners();
            }
            String zza2 = zza(packageName, apkContentsSigners[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.m22871c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.m22871c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzacd zzacdVar, String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null) {
            return;
        }
        zzaebVar.zzb.add(zzacdVar);
        if (zzaebVar.zzg) {
            zzacdVar.zzb(zzaebVar.zzd);
        }
        if (zzaebVar.zzh) {
            zzacdVar.zza(C6104o0.m16579y1(zzaebVar.zzd, zzaebVar.zze));
        }
        if (zzaebVar.zzi) {
            zzacdVar.zza(zzaebVar.zzd);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzaebVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzaebVar.zzf.cancel(false);
        }
        zzaebVar.zzb.clear();
        this.zzd.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }
}
