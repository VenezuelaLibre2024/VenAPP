package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC6246m1;
import p284p1.ExecutorC10035b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.j1 */
/* loaded from: classes.dex */
public class BinderC6237j1 extends Binder {

    /* renamed from: a */
    private final a f13344a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.j1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Task<Void> mo17031a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC6237j1(a aVar) {
        this.f13344a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m17079c(final ServiceConnectionC6246m1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f13344a.mo17031a(aVar.f13359a).addOnCompleteListener(new ExecutorC10035b(), new OnCompleteListener() { // from class: com.google.firebase.messaging.i1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ServiceConnectionC6246m1.a.this.m17130d();
            }
        });
    }
}
