package ca;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ca.p */
/* loaded from: classes.dex */
public final class HandlerC1921p extends zau {

    /* renamed from: a */
    private final Context f7951a;

    /* renamed from: b */
    final /* synthetic */ C1902f f7952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1921p(C1902f c1902f, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f7952b = c1902f;
        this.f7951a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int mo10071g = this.f7952b.mo10071g(this.f7951a);
        if (this.f7952b.mo10073j(mo10071g)) {
            this.f7952b.m10077p(this.f7951a, mo10071g);
        }
    }
}
