package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.collection.C0731a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.s */
/* loaded from: classes.dex */
class C6187s {

    /* renamed from: a */
    private final Executor f13130a;

    /* renamed from: b */
    private final Map<Pair<String, String>, Task<InterfaceC6180l>> f13131b = new C0731a();

    /* renamed from: com.google.firebase.iid.s$a */
    /* loaded from: classes.dex */
    interface a {
        Task<InterfaceC6180l> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6187s(Executor executor) {
        this.f13130a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public synchronized Task<InterfaceC6180l> m16771a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        Task<InterfaceC6180l> task = this.f13131b.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 29);
                sb2.append("Joining ongoing request for: ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
            sb3.append("Making new request for: ");
            sb3.append(valueOf2);
            Log.d("FirebaseInstanceId", sb3.toString());
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f13130a, new Continuation(this, pair) { // from class: com.google.firebase.iid.r

            /* renamed from: a */
            private final C6187s f13128a;

            /* renamed from: b */
            private final Pair f13129b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f13128a = this;
                this.f13129b = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.f13128a.m16772b(this.f13129b, task2);
                return task2;
            }
        });
        this.f13131b.put(pair, continueWithTask);
        return continueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Task m16772b(Pair pair, Task task) {
        synchronized (this) {
            this.f13131b.remove(pair);
        }
        return task;
    }
}
