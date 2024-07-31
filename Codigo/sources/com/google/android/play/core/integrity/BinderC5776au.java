package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5820c0;
import io.flutter.plugins.firebase.auth.Constants;

/* renamed from: com.google.android.play.core.integrity.au */
/* loaded from: classes2.dex */
final class BinderC5776au extends BinderC5775at {

    /* renamed from: c */
    private final C5820c0 f12154c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5776au(C5779ax c5779ax, TaskCompletionSource taskCompletionSource) {
        super(c5779ax, taskCompletionSource);
        this.f12154c = new C5820c0("OnRequestIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC5775at, com.google.android.play.integrity.internal.InterfaceC5849w
    /* renamed from: c */
    public final void mo14628c(Bundle bundle) {
        super.mo14628c(bundle);
        this.f12154c.m14658c("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f12152a.trySetException(new StandardIntegrityException(i10, null));
            return;
        }
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", PendingIntent.class) : bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f12152a;
        C5782b c5782b = new C5782b();
        c5782b.mo14640c(bundle.getString(Constants.TOKEN));
        c5782b.mo14639b(this.f12154c);
        c5782b.mo14638a((PendingIntent) parcelable);
        taskCompletionSource.trySetResult(c5782b.mo14641d());
    }
}
