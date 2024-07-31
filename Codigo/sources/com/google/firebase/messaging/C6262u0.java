package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.C0731a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: classes.dex */
public class C6262u0 {

    /* renamed from: a */
    private final Executor f13407a;

    /* renamed from: b */
    private final Map<String, Task<String>> f13408b = new C0731a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.u0$a */
    /* loaded from: classes.dex */
    public interface a {
        Task<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6262u0(Executor executor) {
        this.f13407a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Task m17194c(String str, Task task) {
        synchronized (this) {
            this.f13408b.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public synchronized Task<String> m17195b(final String str, a aVar) {
        Task<String> task = this.f13408b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f13407a, new Continuation() { // from class: com.google.firebase.messaging.t0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m17194c;
                m17194c = C6262u0.this.m17194c(str, task2);
                return m17194c;
            }
        });
        this.f13408b.put(str, continueWithTask);
        return continueWithTask;
    }
}
