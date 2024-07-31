package i7;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import t8.n0;

/* loaded from: classes.dex */
public interface i0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f17318a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17319b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f17320c;

        public a(String str, int i10, byte[] bArr) {
            this.f17318a = str;
            this.f17319b = i10;
            this.f17320c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17321a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17322b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f17323c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f17324d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f17321a = i10;
            this.f17322b = str;
            this.f17323c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f17324d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray<i0> a();

        i0 b(int i10, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f17325a;

        /* renamed from: b, reason: collision with root package name */
        private final int f17326b;

        /* renamed from: c, reason: collision with root package name */
        private final int f17327c;

        /* renamed from: d, reason: collision with root package name */
        private int f17328d;

        /* renamed from: e, reason: collision with root package name */
        private String f17329e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f17325a = str;
            this.f17326b = i11;
            this.f17327c = i12;
            this.f17328d = Integer.MIN_VALUE;
            this.f17329e = "";
        }

        private void d() {
            if (this.f17328d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f17328d;
            this.f17328d = i10 == Integer.MIN_VALUE ? this.f17326b : i10 + this.f17327c;
            this.f17329e = this.f17325a + this.f17328d;
        }

        public String b() {
            d();
            return this.f17329e;
        }

        public int c() {
            d();
            return this.f17328d;
        }
    }

    void a(n0 n0Var, y6.m mVar, d dVar);

    void b(t8.e0 e0Var, int i10);

    void c();
}
