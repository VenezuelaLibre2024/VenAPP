package g9;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
final class o extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.gms.ads.internal.util.v f16135a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16136b;

    public o(Context context, String str, String str2, String str3) {
        super(context);
        com.google.android.gms.ads.internal.util.v vVar = new com.google.android.gms.ads.internal.util.v(context, str);
        this.f16135a = vVar;
        vVar.o(str2);
        vVar.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f16136b) {
            return false;
        }
        this.f16135a.m(motionEvent);
        return false;
    }
}
