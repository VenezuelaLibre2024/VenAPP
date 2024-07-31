package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.i;

/* loaded from: classes.dex */
public class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f3838a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f3839b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f3838a = i10;
            this.f3839b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f3839b;
        }

        public int c() {
            return this.f3838a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f3840a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3841b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3842c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f3843d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3844e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f3840a = (Uri) androidx.core.util.h.k(uri);
            this.f3841b = i10;
            this.f3842c = i11;
            this.f3843d = z10;
            this.f3844e = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f3844e;
        }

        public int c() {
            return this.f3841b;
        }

        public Uri d() {
            return this.f3840a;
        }

        public int e() {
            return this.f3842c;
        }

        public boolean f() {
            return this.f3843d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return i.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z10 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, null, aVar);
    }
}
