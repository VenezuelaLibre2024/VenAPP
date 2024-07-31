package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.a0;
import com.google.android.play.integrity.internal.c0;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes2.dex */
final class ac extends a0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f10907a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f10908b = new c0("OnRequestIntegrityTokenCallback");

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f10909c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(ad adVar, TaskCompletionSource taskCompletionSource) {
        this.f10907a = adVar;
        this.f10909c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.b0
    public final void b(Bundle bundle) {
        this.f10907a.f10910a.v(this.f10909c);
        this.f10908b.c("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f10909c.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString(Constants.TOKEN);
        if (string == null) {
            this.f10909c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", PendingIntent.class) : bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f10909c;
        a aVar = new a();
        aVar.c(string);
        aVar.b(this.f10908b);
        aVar.a((PendingIntent) parcelable);
        taskCompletionSource.trySetResult(aVar.d());
    }
}
