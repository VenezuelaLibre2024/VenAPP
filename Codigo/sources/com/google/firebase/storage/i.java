package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.o;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private p f12645a;

    /* renamed from: b, reason: collision with root package name */
    private TaskCompletionSource<o> f12646b;

    /* renamed from: c, reason: collision with root package name */
    private o f12647c;

    /* renamed from: d, reason: collision with root package name */
    private gf.c f12648d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(p pVar, TaskCompletionSource<o> taskCompletionSource) {
        com.google.android.gms.common.internal.s.j(pVar);
        com.google.android.gms.common.internal.s.j(taskCompletionSource);
        this.f12645a = pVar;
        this.f12646b = taskCompletionSource;
        if (pVar.v().s().equals(pVar.s())) {
            throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
        }
        f w10 = this.f12645a.w();
        this.f12648d = new gf.c(w10.a().m(), w10.c(), w10.b(), w10.i());
    }

    @Override // java.lang.Runnable
    public void run() {
        hf.b bVar = new hf.b(this.f12645a.x(), this.f12645a.m());
        this.f12648d.d(bVar);
        if (bVar.v()) {
            try {
                this.f12647c = new o.b(bVar.n(), this.f12645a).a();
            } catch (JSONException e10) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + bVar.m(), e10);
                this.f12646b.setException(n.d(e10));
                return;
            }
        }
        TaskCompletionSource<o> taskCompletionSource = this.f12646b;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, this.f12647c);
        }
    }
}
