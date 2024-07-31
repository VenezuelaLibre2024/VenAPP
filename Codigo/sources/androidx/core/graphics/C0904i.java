package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.C0736f;
import androidx.core.content.res.C0869d;
import androidx.core.content.res.C0871f;
import androidx.core.provider.C0961g;

/* renamed from: androidx.core.graphics.i */
/* loaded from: classes.dex */
public class C0904i {

    /* renamed from: a */
    private static final C0901g0 f4397a;

    /* renamed from: b */
    private static final C0736f<String, Typeface> f4398b;

    /* renamed from: androidx.core.graphics.i$a */
    /* loaded from: classes.dex */
    public static class a extends C0961g.c {

        /* renamed from: a */
        private C0871f.e f4399a;

        public a(C0871f.e eVar) {
            this.f4399a = eVar;
        }

        @Override // androidx.core.provider.C0961g.c
        /* renamed from: a */
        public void mo4610a(int i10) {
            C0871f.e eVar = this.f4399a;
            if (eVar != null) {
                eVar.m4468f(i10);
            }
        }

        @Override // androidx.core.provider.C0961g.c
        /* renamed from: b */
        public void mo4611b(Typeface typeface) {
            C0871f.e eVar = this.f4399a;
            if (eVar != null) {
                eVar.m4469g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f4397a = i10 >= 29 ? new C0899f0() : i10 >= 28 ? new C0912q() : i10 >= 26 ? new C0911p() : C0906k.m4619j() ? new C0906k() : new C0905j();
        f4398b = new C0736f<>(16);
    }

    /* renamed from: a */
    public static Typeface m4603a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m4604b(Context context, CancellationSignal cancellationSignal, C0961g.b[] bVarArr, int i10) {
        return f4397a.mo4576b(context, cancellationSignal, bVarArr, i10);
    }

    /* renamed from: c */
    public static Typeface m4605c(Context context, C0869d.b bVar, Resources resources, int i10, String str, int i11, int i12, C0871f.e eVar, Handler handler, boolean z10) {
        Typeface mo4575a;
        if (bVar instanceof C0869d.e) {
            C0869d.e eVar2 = (C0869d.e) bVar;
            Typeface m4609g = m4609g(eVar2.m4445c());
            if (m4609g != null) {
                if (eVar != null) {
                    eVar.m4471d(m4609g, handler);
                }
                return m4609g;
            }
            boolean z11 = !z10 ? eVar != null : eVar2.m4443a() != 0;
            int m4446d = z10 ? eVar2.m4446d() : -1;
            mo4575a = C0961g.m4771c(context, eVar2.m4444b(), i12, z11, m4446d, C0871f.e.m4467e(handler), new a(eVar));
        } else {
            mo4575a = f4397a.mo4575a(context, (C0869d.c) bVar, resources, i12);
            if (eVar != null) {
                if (mo4575a != null) {
                    eVar.m4471d(mo4575a, handler);
                } else {
                    eVar.m4470c(-3, handler);
                }
            }
        }
        if (mo4575a != null) {
            f4398b.put(m4607e(resources, i10, str, i11, i12), mo4575a);
        }
        return mo4575a;
    }

    /* renamed from: d */
    public static Typeface m4606d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface mo4577d = f4397a.mo4577d(context, resources, i10, str, i12);
        if (mo4577d != null) {
            f4398b.put(m4607e(resources, i10, str, i11, i12), mo4577d);
        }
        return mo4577d;
    }

    /* renamed from: e */
    private static String m4607e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    /* renamed from: f */
    public static Typeface m4608f(Resources resources, int i10, String str, int i11, int i12) {
        return f4398b.get(m4607e(resources, i10, str, i11, i12));
    }

    /* renamed from: g */
    private static Typeface m4609g(String str) {
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
