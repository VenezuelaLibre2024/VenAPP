package ie;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f17690d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f17691e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final i f17692a = i.c();

    /* renamed from: b, reason: collision with root package name */
    private long f17693b;

    /* renamed from: c, reason: collision with root package name */
    private int f17694c;

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f17694c) + this.f17692a.e(), f17691e);
        }
        return f17690d;
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f17694c = 0;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f17694c != 0) {
            z10 = this.f17692a.a() > this.f17693b;
        }
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f17694c++;
        this.f17693b = this.f17692a.a() + a(i10);
    }
}
