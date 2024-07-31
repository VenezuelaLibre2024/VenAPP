package ba;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends zzf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f6335a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Looper looper) {
        super(looper);
        this.f6335a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.d(this.f6335a, message);
    }
}
