package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.d;
import androidx.core.provider.g;
import com.google.android.gms.common.api.a;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Long, d.c> f3722a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    class a implements b<g.b> {
        a() {
        }

        @Override // androidx.core.graphics.g0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.g0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(g.b bVar) {
            return bVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b<T> {
        boolean a(T t10);

        int b(T t10);
    }

    private static <T> T e(T[] tArr, int i10, b<T> bVar) {
        return (T) f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = a.e.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.b(t11) - i10) * 2) + (bVar.a(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > abs) {
                t10 = t11;
                i11 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface c(Context context, InputStream inputStream) {
        File e10 = h0.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (h0.d(e10, inputStream)) {
                return Typeface.createFromFile(e10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = h0.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (h0.c(e10, resources, i10)) {
                return Typeface.createFromFile(e10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g.b g(g.b[] bVarArr, int i10) {
        return (g.b) e(bVarArr, i10, new a());
    }
}
