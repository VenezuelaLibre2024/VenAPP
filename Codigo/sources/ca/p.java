package ca;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p extends zau {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6999a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f7000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f7000b = fVar;
        this.f6999a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int g10 = this.f7000b.g(this.f6999a);
        if (this.f7000b.j(g10)) {
            this.f7000b.p(this.f6999a, g10);
        }
    }
}
