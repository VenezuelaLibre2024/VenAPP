package p121g9;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.C5048v;

/* renamed from: g9.o */
/* loaded from: classes.dex */
final class C7521o extends RelativeLayout {

    /* renamed from: a */
    final C5048v f17764a;

    /* renamed from: b */
    boolean f17765b;

    public C7521o(Context context, String str, String str2, String str3) {
        super(context);
        C5048v c5048v = new C5048v(context, str);
        this.f17764a = c5048v;
        c5048v.m12746o(str2);
        c5048v.m12745n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f17765b) {
            return false;
        }
        this.f17764a.m12744m(motionEvent);
        return false;
    }
}
