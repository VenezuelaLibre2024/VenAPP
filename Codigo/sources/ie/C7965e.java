package ie;

import com.google.firebase.installations.C6202i;
import java.util.concurrent.TimeUnit;

/* renamed from: ie.e */
/* loaded from: classes.dex */
class C7965e {

    /* renamed from: d */
    private static final long f19352d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f19353e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C6202i f19354a = C6202i.m16862c();

    /* renamed from: b */
    private long f19355b;

    /* renamed from: c */
    private int f19356c;

    /* renamed from: a */
    private synchronized long m24494a(int i10) {
        if (m24495c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f19356c) + this.f19354a.m16868e(), f19353e);
        }
        return f19352d;
    }

    /* renamed from: c */
    private static boolean m24495c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    /* renamed from: d */
    private static boolean m24496d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    /* renamed from: e */
    private synchronized void m24497e() {
        this.f19356c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m24498b() {
        boolean z10;
        if (this.f19356c != 0) {
            z10 = this.f19354a.m16866a() > this.f19355b;
        }
        return z10;
    }

    /* renamed from: f */
    public synchronized void m24499f(int i10) {
        if (m24496d(i10)) {
            m24497e();
            return;
        }
        this.f19356c++;
        this.f19355b = this.f19354a.m16866a() + m24494a(i10);
    }
}
