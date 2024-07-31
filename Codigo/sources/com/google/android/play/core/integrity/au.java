package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c0;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes2.dex */
final class au extends at {

    /* renamed from: c, reason: collision with root package name */
    private final c0 f10939c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f10939c = new c0("OnRequestIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, com.google.android.play.integrity.internal.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f10939c.c("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f10937a.trySetException(new StandardIntegrityException(i10, null));
            return;
        }
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", PendingIntent.class) : bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f10937a;
        b bVar = new b();
        bVar.c(bundle.getString(Constants.TOKEN));
        bVar.b(this.f10939c);
        bVar.a((PendingIntent) parcelable);
        taskCompletionSource.trySetResult(bVar.d());
    }
}
