package r;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final a f24458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        void d(String str);

        String e();

        void f();

        Object g();

        Surface getSurface();
    }

    public f(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        this.f24458a = i11 >= 33 ? new m(i10, surface) : i11 >= 28 ? new l(i10, surface) : i11 >= 26 ? new j(i10, surface) : new g(i10, surface);
    }

    private f(a aVar) {
        this.f24458a = aVar;
    }

    public static f i(Object obj) {
        a j10;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            j10 = m.l((OutputConfiguration) obj);
        } else if (i10 >= 28) {
            j10 = l.k((OutputConfiguration) obj);
        } else {
            OutputConfiguration outputConfiguration = (OutputConfiguration) obj;
            j10 = i10 >= 26 ? j.j(outputConfiguration) : g.i(outputConfiguration);
        }
        if (j10 == null) {
            return null;
        }
        return new f(j10);
    }

    public void a(Surface surface) {
        this.f24458a.b(surface);
    }

    public void b() {
        this.f24458a.f();
    }

    public String c() {
        return this.f24458a.e();
    }

    public Surface d() {
        return this.f24458a.getSurface();
    }

    public void e(long j10) {
        this.f24458a.c(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f24458a.equals(((f) obj).f24458a);
        }
        return false;
    }

    public void f(String str) {
        this.f24458a.d(str);
    }

    public void g(long j10) {
        this.f24458a.a(j10);
    }

    public Object h() {
        return this.f24458a.g();
    }

    public int hashCode() {
        return this.f24458a.hashCode();
    }
}
