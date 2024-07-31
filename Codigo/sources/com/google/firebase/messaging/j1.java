package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.m1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j1 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f12129a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        Task<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(a aVar) {
        this.f12129a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final m1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f12129a.a(aVar.f12144a).addOnCompleteListener(new p1.b(), new OnCompleteListener() { // from class: com.google.firebase.messaging.i1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                m1.a.this.d();
            }
        });
    }
}
