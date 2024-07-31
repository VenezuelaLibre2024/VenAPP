package tc;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import sc.C10889g;

/* renamed from: tc.c */
/* loaded from: classes.dex */
public class C11239c implements InterfaceC11238b, InterfaceC11237a {

    /* renamed from: a */
    private final C11241e f29160a;

    /* renamed from: b */
    private final int f29161b;

    /* renamed from: c */
    private final TimeUnit f29162c;

    /* renamed from: e */
    private CountDownLatch f29164e;

    /* renamed from: d */
    private final Object f29163d = new Object();

    /* renamed from: f */
    private boolean f29165f = false;

    public C11239c(C11241e c11241e, int i10, TimeUnit timeUnit) {
        this.f29160a = c11241e;
        this.f29161b = i10;
        this.f29162c = timeUnit;
    }

    @Override // tc.InterfaceC11237a
    /* renamed from: a */
    public void mo32542a(String str, Bundle bundle) {
        synchronized (this.f29163d) {
            C10889g.m33216f().m33223i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f29164e = new CountDownLatch(1);
            this.f29165f = false;
            this.f29160a.mo32542a(str, bundle);
            C10889g.m33216f().m33223i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f29164e.await(this.f29161b, this.f29162c)) {
                    this.f29165f = true;
                    C10889g.m33216f().m33223i("App exception callback received from Analytics listener.");
                } else {
                    C10889g.m33216f().m33225k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                C10889g.m33216f().m33219d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f29164e = null;
        }
    }

    @Override // tc.InterfaceC11238b
    /* renamed from: c */
    public void mo35120c(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f29164e;
        if (countDownLatch != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str)) {
            countDownLatch.countDown();
        }
    }
}
