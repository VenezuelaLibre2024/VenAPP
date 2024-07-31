package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f11915a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Pair<String, String>, Task<l>> f11916b = new androidx.collection.a();

    /* loaded from: classes.dex */
    interface a {
        Task<l> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Executor executor) {
        this.f11915a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<l> a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        Task<l> task = this.f11916b.get(pair);
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
        Task continueWithTask = aVar.start().continueWithTask(this.f11915a, new Continuation(this, pair) { // from class: com.google.firebase.iid.r

            /* renamed from: a, reason: collision with root package name */
            private final s f11913a;

            /* renamed from: b, reason: collision with root package name */
            private final Pair f11914b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11913a = this;
                this.f11914b = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.f11913a.b(this.f11914b, task2);
                return task2;
            }
        });
        this.f11916b.put(pair, continueWithTask);
        return continueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task b(Pair pair, Task task) {
        synchronized (this) {
            this.f11916b.remove(pair);
        }
        return task;
    }
}
