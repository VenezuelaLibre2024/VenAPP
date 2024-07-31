package ba;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ba.e */
/* loaded from: classes.dex */
public final class HandlerC1693e extends zzf {

    /* renamed from: a */
    final /* synthetic */ C1689c f7257a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1693e(C1689c c1689c, Looper looper) {
        super(looper);
        this.f7257a = c1689c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1689c.m9288d(this.f7257a, message);
    }
}
