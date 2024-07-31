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
import la.C9471p;
import p284p1.ExecutorC10035b;

/* renamed from: com.google.firebase.messaging.m */
/* loaded from: classes.dex */
public class C6244m {

    /* renamed from: c */
    private static final Object f13349c = new Object();

    /* renamed from: d */
    private static ServiceConnectionC6246m1 f13350d;

    /* renamed from: a */
    private final Context f13351a;

    /* renamed from: b */
    private final Executor f13352b = new ExecutorC10035b();

    public C6244m(Context context) {
        this.f13351a = context;
    }

    /* renamed from: e */
    private static Task<Integer> m17112e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        ServiceConnectionC6246m1 m17113f = m17113f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return m17113f.m17124c(intent).continueWith(new ExecutorC10035b(), new Continuation() { // from class: com.google.firebase.messaging.l
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Integer m17114g;
                    m17114g = C6244m.m17114g(task);
                    return m17114g;
                }
            });
        }
        if (C6266w0.m17198b().m17202e(context)) {
            C6231h1.m17037f(context, m17113f, intent);
        } else {
            m17113f.m17124c(intent);
        }
        return Tasks.forResult(-1);
    }

    /* renamed from: f */
    private static ServiceConnectionC6246m1 m17113f(Context context, String str) {
        ServiceConnectionC6246m1 serviceConnectionC6246m1;
        synchronized (f13349c) {
            if (f13350d == null) {
                f13350d = new ServiceConnectionC6246m1(context, str);
            }
            serviceConnectionC6246m1 = f13350d;
        }
        return serviceConnectionC6246m1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Integer m17114g(Task task) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Integer m17115h(Context context, Intent intent) {
        return Integer.valueOf(C6266w0.m17198b().m17203g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ Integer m17116i(Task task) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Task m17117j(Context context, Intent intent, boolean z10, Task task) {
        return (C9471p.m28172i() && ((Integer) task.getResult()).intValue() == 402) ? m17112e(context, intent, z10).continueWith(new ExecutorC10035b(), new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Integer m17116i;
                m17116i = C6244m.m17116i(task2);
                return m17116i;
            }
        }) : task;
    }

    /* renamed from: k */
    public Task<Integer> m17118k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m17119l(this.f13351a, intent);
    }

    /* renamed from: l */
    public Task<Integer> m17119l(final Context context, final Intent intent) {
        boolean z10 = C9471p.m28172i() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.call(this.f13352b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m17115h;
                m17115h = C6244m.m17115h(context, intent);
                return m17115h;
            }
        }).continueWithTask(this.f13352b, new Continuation() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m17117j;
                m17117j = C6244m.m17117j(context, intent, z11, task);
                return m17117j;
            }
        }) : m17112e(context, intent, z11);
    }
}
