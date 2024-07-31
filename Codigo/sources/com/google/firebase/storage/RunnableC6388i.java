package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C6400o;
import gf.C7561c;
import org.json.JSONException;
import p141hf.C7719b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.i */
/* loaded from: classes2.dex */
public class RunnableC6388i implements Runnable {

    /* renamed from: a */
    private C6401p f13877a;

    /* renamed from: b */
    private TaskCompletionSource<C6400o> f13878b;

    /* renamed from: c */
    private C6400o f13879c;

    /* renamed from: d */
    private C7561c f13880d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6388i(C6401p c6401p, TaskCompletionSource<C6400o> taskCompletionSource) {
        C5276s.m13324j(c6401p);
        C5276s.m13324j(taskCompletionSource);
        this.f13877a = c6401p;
        this.f13878b = taskCompletionSource;
        if (c6401p.m18008v().m18005s().equals(c6401p.m18005s())) {
            throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
        }
        C6382f m18009w = this.f13877a.m18009w();
        this.f13880d = new C7561c(m18009w.m17859a().m42630m(), m18009w.m17861c(), m18009w.m17860b(), m18009w.m17864i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C7719b c7719b = new C7719b(this.f13877a.m18010x(), this.f13877a.m17999m());
        this.f13880d.m22959d(c7719b);
        if (c7719b.m23568v()) {
            try {
                this.f13879c = new C6400o.b(c7719b.m23561n(), this.f13877a).m17977a();
            } catch (JSONException e10) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + c7719b.m23560m(), e10);
                this.f13878b.setException(C6398n.m17919d(e10));
                return;
            }
        }
        TaskCompletionSource<C6400o> taskCompletionSource = this.f13878b;
        if (taskCompletionSource != null) {
            c7719b.m23554a(taskCompletionSource, this.f13879c);
        }
    }
}
