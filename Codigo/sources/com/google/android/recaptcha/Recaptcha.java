package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzb;
import com.google.android.recaptcha.internal.zzp;
import zk.j;
import zk.r0;

/* loaded from: classes2.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        r0 b10;
        b10 = j.b(zzp.zzb(), null, null, new Recaptcha$getTasksClient$1(application, str, null), 3, null);
        return zzb.zza(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: getClient-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8getClient0E7RQCE(android.app.Application r6, java.lang.String r7, gk.Continuation<? super ck.n<? extends com.google.android.recaptcha.RecaptchaClient>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ck.o.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L4f
        L29:
            r6 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ck.o.b(r8)
            ck.n$a r8 = ck.n.f7126b     // Catch: java.lang.Throwable -> L29
            zk.k0 r8 = com.google.android.recaptcha.internal.zzp.zzb()     // Catch: java.lang.Throwable -> L29
            gk.f r8 = r8.h()     // Catch: java.lang.Throwable -> L29
            com.google.android.recaptcha.Recaptcha$getClient$2$1 r2 = new com.google.android.recaptcha.Recaptcha$getClient$2$1     // Catch: java.lang.Throwable -> L29
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L29
            r0.zzc = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = zk.h.g(r8, r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r8 != r1) goto L4f
            return r1
        L4f:
            com.google.android.recaptcha.internal.zzaa r8 = (com.google.android.recaptcha.internal.zzaa) r8     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = ck.n.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L60
        L56:
            ck.n$a r7 = ck.n.f7126b
            java.lang.Object r6 = ck.o.a(r6)
            java.lang.Object r6 = ck.n.b(r6)
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m8getClient0E7RQCE(android.app.Application, java.lang.String, gk.Continuation):java.lang.Object");
    }
}
