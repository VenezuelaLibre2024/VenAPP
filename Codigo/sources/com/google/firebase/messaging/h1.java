package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    static final long f12115a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12116b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static bb.a f12117c;

    private static void b(Context context) {
        if (f12117c == null) {
            bb.a aVar = new bb.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f12117c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f12116b) {
            if (f12117c != null && d(intent)) {
                g(intent, false);
                f12117c.c();
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Context context, m1 m1Var, final Intent intent) {
        synchronized (f12116b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            if (!d10) {
                f12117c.a(f12115a);
            }
            m1Var.c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.g1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    h1.c(intent);
                }
            });
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName h(Context context, Intent intent) {
        synchronized (f12116b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!d10) {
                f12117c.a(f12115a);
            }
            return startService;
        }
    }
}
