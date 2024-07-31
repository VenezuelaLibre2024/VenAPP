package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C0904i;
import androidx.core.util.C0984h;

/* renamed from: androidx.core.provider.g */
/* loaded from: classes.dex */
public class C0961g {

    /* renamed from: androidx.core.provider.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final int f4510a;

        /* renamed from: b */
        private final b[] f4511b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f4510a = i10;
            this.f4511b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static a m4772a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        /* renamed from: b */
        public b[] m4773b() {
            return this.f4511b;
        }

        /* renamed from: c */
        public int m4774c() {
            return this.f4510a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Uri f4512a;

        /* renamed from: b */
        private final int f4513b;

        /* renamed from: c */
        private final int f4514c;

        /* renamed from: d */
        private final boolean f4515d;

        /* renamed from: e */
        private final int f4516e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f4512a = (Uri) C0984h.m4833k(uri);
            this.f4513b = i10;
            this.f4514c = i11;
            this.f4515d = z10;
            this.f4516e = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static b m4775a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        /* renamed from: b */
        public int m4776b() {
            return this.f4516e;
        }

        /* renamed from: c */
        public int m4777c() {
            return this.f4513b;
        }

        /* renamed from: d */
        public Uri m4778d() {
            return this.f4512a;
        }

        /* renamed from: e */
        public int m4779e() {
            return this.f4514c;
        }

        /* renamed from: f */
        public boolean m4780f() {
            return this.f4515d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public void mo4610a(int i10) {
            throw null;
        }

        /* renamed from: b */
        public void mo4611b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m4769a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return C0904i.m4604b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static a m4770b(Context context, CancellationSignal cancellationSignal, C0959e c0959e) {
        return C0958d.m4747e(context, c0959e, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m4771c(Context context, C0959e c0959e, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C0955a c0955a = new C0955a(cVar, handler);
        return z10 ? C0960f.m4763e(context, c0959e, c0955a, i10, i11) : C0960f.m4762d(context, c0959e, i10, null, c0955a);
    }
}
