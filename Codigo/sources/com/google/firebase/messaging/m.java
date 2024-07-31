package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12134c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static m1 f12135d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f12136a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12137b = new p1.b();

    public m(Context context) {
        this.f12136a = context;
    }

    private static Task<Integer> e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        m1 f10 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return f10.c(intent).continueWith(new p1.b(), new Continuation() { // from class: com.google.firebase.messaging.l
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Integer g10;
                    g10 = m.g(task);
                    return g10;
                }
            });
        }
        if (w0.b().e(context)) {
            h1.f(context, f10, intent);
        } else {
            f10.c(intent);
        }
        return Tasks.forResult(-1);
    }

    private static m1 f(Context context, String str) {
        m1 m1Var;
        synchronized (f12134c) {
            if (f12135d == null) {
                f12135d = new m1(context, str);
            }
            m1Var = f12135d;
        }
        return m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(w0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(Task task) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z10, Task task) {
        return (la.p.i() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z10).continueWith(new p1.b(), new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Integer i10;
                i10 = m.i(task2);
                return i10;
            }
        }) : task;
    }

    public Task<Integer> k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f12136a, intent);
    }

    public Task<Integer> l(final Context context, final Intent intent) {
        boolean z10 = la.p.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.call(this.f12137b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h10;
                h10 = m.h(context, intent);
                return h10;
            }
        }).continueWithTask(this.f12137b, new Continuation() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task j10;
                j10 = m.j(context, intent, z11, task);
                return j10;
            }
        }) : e(context, intent, z11);
    }
}
