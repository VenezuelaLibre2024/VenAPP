package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final p f12657a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<j> f12658b;

    /* renamed from: c, reason: collision with root package name */
    private final gf.c f12659c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12660d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f12661e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(p pVar, Integer num, String str, TaskCompletionSource<j> taskCompletionSource) {
        com.google.android.gms.common.internal.s.j(pVar);
        com.google.android.gms.common.internal.s.j(taskCompletionSource);
        this.f12657a = pVar;
        this.f12661e = num;
        this.f12660d = str;
        this.f12658b = taskCompletionSource;
        f w10 = pVar.w();
        this.f12659c = new gf.c(w10.a().m(), w10.c(), w10.b(), w10.i());
    }

    @Override // java.lang.Runnable
    public void run() {
        j a10;
        hf.d dVar = new hf.d(this.f12657a.x(), this.f12657a.m(), this.f12661e, this.f12660d);
        this.f12659c.d(dVar);
        if (dVar.v()) {
            try {
                a10 = j.a(this.f12657a.w(), dVar.n());
            } catch (JSONException e10) {
                Log.e("ListTask", "Unable to parse response body. " + dVar.m(), e10);
                this.f12658b.setException(n.d(e10));
                return;
            }
        } else {
            a10 = null;
        }
        TaskCompletionSource<j> taskCompletionSource = this.f12658b;
        if (taskCompletionSource != null) {
            dVar.a(taskCompletionSource, a10);
        }
    }
}
