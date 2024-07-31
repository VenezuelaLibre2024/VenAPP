package sa;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes2.dex */
public class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final n f25427a;

    public d(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f25427a = new n(this, context, googleMapOptions);
        setClickable(true);
    }

    public void a(f fVar) {
        com.google.android.gms.common.internal.s.e("getMapAsync() must be called on the main thread");
        com.google.android.gms.common.internal.s.k(fVar, "callback must not be null.");
        this.f25427a.p(fVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f25427a.c(bundle);
            if (this.f25427a.b() == null) {
                com.google.android.gms.dynamic.a.i(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f25427a.d();
    }

    public void d() {
        this.f25427a.e();
    }

    public void e(Bundle bundle) {
        this.f25427a.f(bundle);
    }

    public void f() {
        this.f25427a.g();
    }

    public void g() {
        this.f25427a.h();
    }
}
