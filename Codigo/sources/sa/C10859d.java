package sa;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.AbstractC5311a;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: sa.d */
/* loaded from: classes2.dex */
public class C10859d extends FrameLayout {

    /* renamed from: a */
    private final C10869n f27546a;

    public C10859d(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f27546a = new C10869n(this, context, googleMapOptions);
        setClickable(true);
    }

    /* renamed from: a */
    public void m33147a(InterfaceC10861f interfaceC10861f) {
        C5276s.m13319e("getMapAsync() must be called on the main thread");
        C5276s.m13325k(interfaceC10861f, "callback must not be null.");
        this.f27546a.m33179p(interfaceC10861f);
    }

    /* renamed from: b */
    public void m33148b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f27546a.m13404c(bundle);
            if (this.f27546a.m13403b() == null) {
                AbstractC5311a.m13395i(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void m33149c() {
        this.f27546a.m13405d();
    }

    /* renamed from: d */
    public void m33150d() {
        this.f27546a.m13406e();
    }

    /* renamed from: e */
    public void m33151e(Bundle bundle) {
        this.f27546a.m13407f(bundle);
    }

    /* renamed from: f */
    public void m33152f() {
        this.f27546a.m13408g();
    }

    /* renamed from: g */
    public void m33153g() {
        this.f27546a.m13409h();
    }
}
