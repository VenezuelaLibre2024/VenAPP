package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzcec;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.q */
/* loaded from: classes.dex */
final class AsyncTaskC4962q extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ BinderC4964s f9992a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AsyncTaskC4962q(BinderC4964s binderC4964s, C4961p c4961p) {
        this.f9992a = binderC4964s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            BinderC4964s binderC4964s = this.f9992a;
            BinderC4964s.m12559n2(binderC4964s, (zzavi) BinderC4964s.m12558m2(binderC4964s).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzk("", e10);
        }
        return this.f9992a.zzp();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BinderC4964s binderC4964s = this.f9992a;
        String str = (String) obj;
        if (BinderC4964s.m12553h2(binderC4964s) == null || str == null) {
            return;
        }
        BinderC4964s.m12553h2(binderC4964s).loadUrl(str);
    }
}
