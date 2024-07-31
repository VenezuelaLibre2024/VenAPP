package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzcec;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class q extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f8897a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(s sVar, p pVar) {
        this.f8897a = sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            s sVar = this.f8897a;
            s.n2(sVar, (zzavi) s.m2(sVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzk("", e10);
        }
        return this.f8897a.zzp();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        s sVar = this.f8897a;
        String str = (String) obj;
        if (s.h2(sVar) == null || str == null) {
            return;
        }
        s.h2(sVar).loadUrl(str);
    }
}
