package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bb.C1715a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.h1 */
/* loaded from: classes.dex */
public final class C6231h1 {

    /* renamed from: a */
    static final long f13330a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f13331b = new Object();

    /* renamed from: c */
    private static C1715a f13332c;

    /* renamed from: b */
    private static void m17033b(Context context) {
        if (f13332c == null) {
            C1715a c1715a = new C1715a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f13332c = c1715a;
            c1715a.m9328d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m17034c(Intent intent) {
        synchronized (f13331b) {
            if (f13332c != null && m17035d(intent)) {
                m17038g(intent, false);
                f13332c.m9327c();
            }
        }
    }

    /* renamed from: d */
    static boolean m17035d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m17037f(Context context, ServiceConnectionC6246m1 serviceConnectionC6246m1, final Intent intent) {
        synchronized (f13331b) {
            m17033b(context);
            boolean m17035d = m17035d(intent);
            m17038g(intent, true);
            if (!m17035d) {
                f13332c.m9325a(f13330a);
            }
            serviceConnectionC6246m1.m17124c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.g1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C6231h1.m17034c(intent);
                }
            });
        }
    }

    /* renamed from: g */
    private static void m17038g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static ComponentName m17039h(Context context, Intent intent) {
        synchronized (f13331b) {
            m17033b(context);
            boolean m17035d = m17035d(intent);
            m17038g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m17035d) {
                f13332c.m9325a(f13330a);
            }
            return startService;
        }
    }
}
