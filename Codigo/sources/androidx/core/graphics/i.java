package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.d;
import androidx.core.content.res.f;
import androidx.core.provider.g;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private static final g0 f3725a;

    /* renamed from: b */
    private static final androidx.collection.f<String, Typeface> f3726b;

    /* loaded from: classes.dex */
    public static class a extends g.c {

        /* renamed from: a */
        private f.e f3727a;

        public a(f.e eVar) {
            this.f3727a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i10) {
            f.e eVar = this.f3727a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            f.e eVar = this.f3727a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3725a = i10 >= 29 ? new f0() : i10 >= 28 ? new q() : i10 >= 26 ? new p() : k.j() ? new k() : new j();
        f3726b = new androidx.collection.f<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f3725a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, d.b bVar, Resources resources, int i10, String str, int i11, int i12, f.e eVar, Handler handler, boolean z10) {
        Typeface a10;
        if (bVar instanceof d.e) {
            d.e eVar2 = (d.e) bVar;
            Typeface g10 = g(eVar2.c());
            if (g10 != null) {
                if (eVar != null) {
                    eVar.d(g10, handler);
                }
                return g10;
            }
            boolean z11 = !z10 ? eVar != null : eVar2.a() != 0;
            int d10 = z10 ? eVar2.d() : -1;
            a10 = androidx.core.provider.g.c(context, eVar2.b(), i12, z11, d10, f.e.e(handler), new a(eVar));
        } else {
            a10 = f3725a.a(context, (d.c) bVar, resources, i12);
            if (eVar != null) {
                if (a10 != null) {
                    eVar.d(a10, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a10 != null) {
            f3726b.put(e(resources, i10, str, i11, i12), a10);
        }
        return a10;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f3725a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            f3726b.put(e(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f3726b.get(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
