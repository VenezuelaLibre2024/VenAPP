package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
final class zzatw implements Runnable {
    private zzatw() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzatw(zzatv zzatvVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzatx.zzc(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th2) {
            zzatx.zzb.countDown();
            throw th2;
        }
        zzatx.zzb.countDown();
    }
}
