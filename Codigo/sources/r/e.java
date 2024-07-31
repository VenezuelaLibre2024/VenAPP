package r;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f24456a;

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputConfiguration f24457a;

        a(Object obj) {
            this.f24457a = (InputConfiguration) obj;
        }

        @Override // r.e.c
        public Object a() {
            return this.f24457a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f24457a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f24457a.hashCode();
        }

        public String toString() {
            return this.f24457a.toString();
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    /* loaded from: classes.dex */
    private interface c {
        Object a();
    }

    private e(c cVar) {
        this.f24456a = cVar;
    }

    public static e b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new e(new b(obj)) : new e(new a(obj));
    }

    public Object a() {
        return this.f24456a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f24456a.equals(((e) obj).f24456a);
        }
        return false;
    }

    public int hashCode() {
        return this.f24456a.hashCode();
    }

    public String toString() {
        return this.f24456a.toString();
    }
}
