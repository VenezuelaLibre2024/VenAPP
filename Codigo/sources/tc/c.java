package tc;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import sc.g;

/* loaded from: classes.dex */
public class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    private final e f26864a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26865b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f26866c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f26868e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f26867d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f26869f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f26864a = eVar;
        this.f26865b = i10;
        this.f26866c = timeUnit;
    }

    @Override // tc.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f26867d) {
            g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f26868e = new CountDownLatch(1);
            this.f26869f = false;
            this.f26864a.a(str, bundle);
            g.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f26868e.await(this.f26865b, this.f26866c)) {
                    this.f26869f = true;
                    g.f().i("App exception callback received from Analytics listener.");
                } else {
                    g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f26868e = null;
        }
    }

    @Override // tc.b
    public void c(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f26868e;
        if (countDownLatch != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str)) {
            countDownLatch.countDown();
        }
    }
}
