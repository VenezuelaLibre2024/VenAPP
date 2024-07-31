package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C6400o;
import gf.C7561c;
import org.json.JSONException;
import p141hf.C7728k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.m0 */
/* loaded from: classes2.dex */
public class RunnableC6397m0 implements Runnable {

    /* renamed from: a */
    private final C6401p f13902a;

    /* renamed from: b */
    private final TaskCompletionSource<C6400o> f13903b;

    /* renamed from: c */
    private final C6400o f13904c;

    /* renamed from: d */
    private C6400o f13905d = null;

    /* renamed from: e */
    private C7561c f13906e;

    public RunnableC6397m0(C6401p c6401p, TaskCompletionSource<C6400o> taskCompletionSource, C6400o c6400o) {
        this.f13902a = c6401p;
        this.f13903b = taskCompletionSource;
        this.f13904c = c6400o;
        C6382f m18009w = c6401p.m18009w();
        this.f13906e = new C7561c(m18009w.m17859a().m42630m(), m18009w.m17861c(), m18009w.m17860b(), m18009w.m17865j());
    }

    @Override // java.lang.Runnable
    public void run() {
        C7728k c7728k = new C7728k(this.f13902a.m18010x(), this.f13902a.m17999m(), this.f13904c.m17965q());
        this.f13906e.m22959d(c7728k);
        if (c7728k.m23568v()) {
            try {
                this.f13905d = new C6400o.b(c7728k.m23561n(), this.f13902a).m17977a();
            } catch (JSONException e10) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + c7728k.m23560m(), e10);
                this.f13903b.setException(C6398n.m17919d(e10));
                return;
            }
        }
        TaskCompletionSource<C6400o> taskCompletionSource = this.f13903b;
        if (taskCompletionSource != null) {
            c7728k.m23554a(taskCompletionSource, this.f13905d);
        }
    }
}
