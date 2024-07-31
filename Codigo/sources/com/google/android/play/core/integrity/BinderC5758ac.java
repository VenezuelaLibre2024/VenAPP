package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC5816a0;
import com.google.android.play.integrity.internal.C5820c0;
import io.flutter.plugins.firebase.auth.Constants;

/* renamed from: com.google.android.play.core.integrity.ac */
/* loaded from: classes2.dex */
final class BinderC5758ac extends AbstractBinderC5816a0 {

    /* renamed from: a */
    final /* synthetic */ C5759ad f12122a;

    /* renamed from: b */
    private final C5820c0 f12123b = new C5820c0("OnRequestIntegrityTokenCallback");

    /* renamed from: c */
    private final TaskCompletionSource f12124c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5758ac(C5759ad c5759ad, TaskCompletionSource taskCompletionSource) {
        this.f12122a = c5759ad;
        this.f12124c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5818b0
    /* renamed from: b */
    public final void mo14618b(Bundle bundle) {
        this.f12122a.f12125a.m14683v(this.f12124c);
        this.f12123b.m14658c("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f12124c.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString(Constants.TOKEN);
        if (string == null) {
            this.f12124c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", PendingIntent.class) : bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f12124c;
        C5755a c5755a = new C5755a();
        c5755a.mo14613c(string);
        c5755a.mo14612b(this.f12123b);
        c5755a.mo14611a((PendingIntent) parcelable);
        taskCompletionSource.trySetResult(c5755a.mo14614d());
    }
}
