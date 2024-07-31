package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.o;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final p f12670a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<o> f12671b;

    /* renamed from: c, reason: collision with root package name */
    private final o f12672c;

    /* renamed from: d, reason: collision with root package name */
    private o f12673d = null;

    /* renamed from: e, reason: collision with root package name */
    private gf.c f12674e;

    public m0(p pVar, TaskCompletionSource<o> taskCompletionSource, o oVar) {
        this.f12670a = pVar;
        this.f12671b = taskCompletionSource;
        this.f12672c = oVar;
        f w10 = pVar.w();
        this.f12674e = new gf.c(w10.a().m(), w10.c(), w10.b(), w10.j());
    }

    @Override // java.lang.Runnable
    public void run() {
        hf.k kVar = new hf.k(this.f12670a.x(), this.f12670a.m(), this.f12672c.q());
        this.f12674e.d(kVar);
        if (kVar.v()) {
            try {
                this.f12673d = new o.b(kVar.n(), this.f12670a).a();
            } catch (JSONException e10) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + kVar.m(), e10);
                this.f12671b.setException(n.d(e10));
                return;
            }
        }
        TaskCompletionSource<o> taskCompletionSource = this.f12671b;
        if (taskCompletionSource != null) {
            kVar.a(taskCompletionSource, this.f12673d);
        }
    }
}
