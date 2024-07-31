package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private p f12621a;

    /* renamed from: b, reason: collision with root package name */
    private TaskCompletionSource<Uri> f12622b;

    /* renamed from: c, reason: collision with root package name */
    private gf.c f12623c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(p pVar, TaskCompletionSource<Uri> taskCompletionSource) {
        com.google.android.gms.common.internal.s.j(pVar);
        com.google.android.gms.common.internal.s.j(taskCompletionSource);
        this.f12621a = pVar;
        this.f12622b = taskCompletionSource;
        if (pVar.v().s().equals(pVar.s())) {
            throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
        }
        f w10 = this.f12621a.w();
        this.f12623c = new gf.c(w10.a().m(), w10.c(), w10.b(), w10.j());
    }

    private Uri a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(",", -1)[0];
        Uri.Builder buildUpon = this.f12621a.x().c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter(Constants.TOKEN, str);
        return buildUpon.build();
    }

    @Override // java.lang.Runnable
    public void run() {
        hf.b bVar = new hf.b(this.f12621a.x(), this.f12621a.m());
        this.f12623c.d(bVar);
        Uri a10 = bVar.v() ? a(bVar.n()) : null;
        TaskCompletionSource<Uri> taskCompletionSource = this.f12622b;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, a10);
        }
    }
}
