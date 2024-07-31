package p320r;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* renamed from: r.e */
/* loaded from: classes.dex */
public final class C10556e {

    /* renamed from: a */
    private final c f26570a;

    /* renamed from: r.e$a */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: a */
        private final InputConfiguration f26571a;

        a(Object obj) {
            this.f26571a = (InputConfiguration) obj;
        }

        @Override // p320r.C10556e.c
        /* renamed from: a */
        public Object mo32051a() {
            return this.f26571a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f26571a, ((c) obj).mo32051a());
            }
            return false;
        }

        public int hashCode() {
            return this.f26571a.hashCode();
        }

        public String toString() {
            return this.f26571a.toString();
        }
    }

    /* renamed from: r.e$b */
    /* loaded from: classes.dex */
    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: r.e$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        Object mo32051a();
    }

    private C10556e(c cVar) {
        this.f26570a = cVar;
    }

    /* renamed from: b */
    public static C10556e m32049b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C10556e(new b(obj)) : new C10556e(new a(obj));
    }

    /* renamed from: a */
    public Object m32050a() {
        return this.f26570a.mo32051a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10556e) {
            return this.f26570a.equals(((C10556e) obj).f26570a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26570a.hashCode();
    }

    public String toString() {
        return this.f26570a.toString();
    }
}
