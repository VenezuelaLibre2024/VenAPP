package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.C0869d;
import androidx.core.provider.C0961g;
import com.google.android.gms.common.api.C5101a;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.g0 */
/* loaded from: classes.dex */
public class C0901g0 {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0869d.c> f4394a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.g0$a */
    /* loaded from: classes.dex */
    class a implements b<C0961g.b> {
        a() {
        }

        @Override // androidx.core.graphics.C0901g0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo4589b(C0961g.b bVar) {
            return bVar.m4779e();
        }

        @Override // androidx.core.graphics.C0901g0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo4588a(C0961g.b bVar) {
            return bVar.m4780f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.g0$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        boolean mo4588a(T t10);

        /* renamed from: b */
        int mo4589b(T t10);
    }

    /* renamed from: e */
    private static <T> T m4585e(T[] tArr, int i10, b<T> bVar) {
        return (T) m4586f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    /* renamed from: f */
    private static <T> T m4586f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = C5101a.e.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.mo4589b(t11) - i10) * 2) + (bVar.mo4588a(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > abs) {
                t10 = t11;
                i11 = abs;
            }
        }
        return t10;
    }

    /* renamed from: a */
    public Typeface mo4575a(Context context, C0869d.c cVar, Resources resources, int i10) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo4576b(Context context, CancellationSignal cancellationSignal, C0961g.b[] bVarArr, int i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Typeface m4587c(Context context, InputStream inputStream) {
        File m4598e = C0903h0.m4598e(context);
        if (m4598e == null) {
            return null;
        }
        try {
            if (C0903h0.m4597d(m4598e, inputStream)) {
                return Typeface.createFromFile(m4598e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m4598e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo4577d(Context context, Resources resources, int i10, String str, int i11) {
        File m4598e = C0903h0.m4598e(context);
        if (m4598e == null) {
            return null;
        }
        try {
            if (C0903h0.m4596c(m4598e, resources, i10)) {
                return Typeface.createFromFile(m4598e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m4598e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C0961g.b mo4578g(C0961g.b[] bVarArr, int i10) {
        return (C0961g.b) m4585e(bVarArr, i10, new a());
    }
}
