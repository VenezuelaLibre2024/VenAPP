package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import gf.C7561c;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;
import p141hf.C7719b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.h */
/* loaded from: classes2.dex */
public class RunnableC6386h implements Runnable {

    /* renamed from: a */
    private C6401p f13853a;

    /* renamed from: b */
    private TaskCompletionSource<Uri> f13854b;

    /* renamed from: c */
    private C7561c f13855c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6386h(C6401p c6401p, TaskCompletionSource<Uri> taskCompletionSource) {
        C5276s.m13324j(c6401p);
        C5276s.m13324j(taskCompletionSource);
        this.f13853a = c6401p;
        this.f13854b = taskCompletionSource;
        if (c6401p.m18008v().m18005s().equals(c6401p.m18005s())) {
            throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
        }
        C6382f m18009w = this.f13853a.m18009w();
        this.f13855c = new C7561c(m18009w.m17859a().m42630m(), m18009w.m17861c(), m18009w.m17860b(), m18009w.m17865j());
    }

    /* renamed from: a */
    private Uri m17886a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(",", -1)[0];
        Uri.Builder buildUpon = this.f13853a.m18010x().m22968c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter(Constants.TOKEN, str);
        return buildUpon.build();
    }

    @Override // java.lang.Runnable
    public void run() {
        C7719b c7719b = new C7719b(this.f13853a.m18010x(), this.f13853a.m17999m());
        this.f13855c.m22959d(c7719b);
        Uri m17886a = c7719b.m23568v() ? m17886a(c7719b.m23561n()) : null;
        TaskCompletionSource<Uri> taskCompletionSource = this.f13854b;
        if (taskCompletionSource != null) {
            c7719b.m23554a(taskCompletionSource, m17886a);
        }
    }
}
