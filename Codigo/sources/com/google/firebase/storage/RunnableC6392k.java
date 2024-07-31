package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import gf.C7561c;
import org.json.JSONException;
import p141hf.C7721d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.k */
/* loaded from: classes2.dex */
public class RunnableC6392k implements Runnable {

    /* renamed from: a */
    private final C6401p f13889a;

    /* renamed from: b */
    private final TaskCompletionSource<C6390j> f13890b;

    /* renamed from: c */
    private final C7561c f13891c;

    /* renamed from: d */
    private final String f13892d;

    /* renamed from: e */
    private final Integer f13893e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6392k(C6401p c6401p, Integer num, String str, TaskCompletionSource<C6390j> taskCompletionSource) {
        C5276s.m13324j(c6401p);
        C5276s.m13324j(taskCompletionSource);
        this.f13889a = c6401p;
        this.f13893e = num;
        this.f13892d = str;
        this.f13890b = taskCompletionSource;
        C6382f m18009w = c6401p.m18009w();
        this.f13891c = new C7561c(m18009w.m17859a().m42630m(), m18009w.m17861c(), m18009w.m17860b(), m18009w.m17864i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C6390j m17901a;
        C7721d c7721d = new C7721d(this.f13889a.m18010x(), this.f13889a.m17999m(), this.f13893e, this.f13892d);
        this.f13891c.m22959d(c7721d);
        if (c7721d.m23568v()) {
            try {
                m17901a = C6390j.m17901a(this.f13889a.m18009w(), c7721d.m23561n());
            } catch (JSONException e10) {
                Log.e("ListTask", "Unable to parse response body. " + c7721d.m23560m(), e10);
                this.f13890b.setException(C6398n.m17919d(e10));
                return;
            }
        } else {
            m17901a = null;
        }
        TaskCompletionSource<C6390j> taskCompletionSource = this.f13890b;
        if (taskCompletionSource != null) {
            c7721d.m23554a(taskCompletionSource, m17901a);
        }
    }
}
