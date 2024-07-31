package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.C0736f;
import androidx.collection.C0738h;
import androidx.core.graphics.C0904i;
import androidx.core.provider.C0961g;
import androidx.core.util.InterfaceC0977a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.f */
/* loaded from: classes.dex */
public class C0960f {

    /* renamed from: a */
    static final C0736f<String, Typeface> f4494a = new C0736f<>(16);

    /* renamed from: b */
    private static final ExecutorService f4495b = C0962h.m4781a("fonts-androidx", 10, ModuleDescriptor.MODULE_VERSION);

    /* renamed from: c */
    static final Object f4496c = new Object();

    /* renamed from: d */
    static final C0738h<String, ArrayList<InterfaceC0977a<e>>> f4497d = new C0738h<>();

    /* renamed from: androidx.core.provider.f$a */
    /* loaded from: classes.dex */
    class a implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f4498a;

        /* renamed from: b */
        final /* synthetic */ Context f4499b;

        /* renamed from: c */
        final /* synthetic */ C0959e f4500c;

        /* renamed from: d */
        final /* synthetic */ int f4501d;

        a(String str, Context context, C0959e c0959e, int i10) {
            this.f4498a = str;
            this.f4499b = context;
            this.f4500c = c0959e;
            this.f4501d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C0960f.m4761c(this.f4498a, this.f4499b, this.f4500c, this.f4501d);
        }
    }

    /* renamed from: androidx.core.provider.f$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC0977a<e> {

        /* renamed from: a */
        final /* synthetic */ C0955a f4502a;

        b(C0955a c0955a) {
            this.f4502a = c0955a;
        }

        @Override // androidx.core.util.InterfaceC0977a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f4502a.m4741b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.f$c */
    /* loaded from: classes.dex */
    class c implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f4503a;

        /* renamed from: b */
        final /* synthetic */ Context f4504b;

        /* renamed from: c */
        final /* synthetic */ C0959e f4505c;

        /* renamed from: d */
        final /* synthetic */ int f4506d;

        c(String str, Context context, C0959e c0959e, int i10) {
            this.f4503a = str;
            this.f4504b = context;
            this.f4505c = c0959e;
            this.f4506d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return C0960f.m4761c(this.f4503a, this.f4504b, this.f4505c, this.f4506d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.f$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC0977a<e> {

        /* renamed from: a */
        final /* synthetic */ String f4507a;

        d(String str) {
            this.f4507a = str;
        }

        @Override // androidx.core.util.InterfaceC0977a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (C0960f.f4496c) {
                C0738h<String, ArrayList<InterfaceC0977a<e>>> c0738h = C0960f.f4497d;
                ArrayList<InterfaceC0977a<e>> arrayList = c0738h.get(this.f4507a);
                if (arrayList == null) {
                    return;
                }
                c0738h.remove(this.f4507a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        final Typeface f4508a;

        /* renamed from: b */
        final int f4509b;

        e(int i10) {
            this.f4508a = null;
            this.f4509b = i10;
        }

        e(Typeface typeface) {
            this.f4508a = typeface;
            this.f4509b = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m4768a() {
            return this.f4509b == 0;
        }
    }

    /* renamed from: a */
    private static String m4759a(C0959e c0959e, int i10) {
        return c0959e.m4755d() + "-" + i10;
    }

    /* renamed from: b */
    private static int m4760b(C0961g.a aVar) {
        int i10 = 1;
        if (aVar.m4774c() != 0) {
            return aVar.m4774c() != 1 ? -3 : -2;
        }
        C0961g.b[] m4773b = aVar.m4773b();
        if (m4773b != null && m4773b.length != 0) {
            i10 = 0;
            for (C0961g.b bVar : m4773b) {
                int m4776b = bVar.m4776b();
                if (m4776b != 0) {
                    if (m4776b < 0) {
                        return -3;
                    }
                    return m4776b;
                }
            }
        }
        return i10;
    }

    /* renamed from: c */
    static e m4761c(String str, Context context, C0959e c0959e, int i10) {
        C0736f<String, Typeface> c0736f = f4494a;
        Typeface typeface = c0736f.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            C0961g.a m4747e = C0958d.m4747e(context, c0959e, null);
            int m4760b = m4760b(m4747e);
            if (m4760b != 0) {
                return new e(m4760b);
            }
            Typeface m4604b = C0904i.m4604b(context, null, m4747e.m4773b(), i10);
            if (m4604b == null) {
                return new e(-3);
            }
            c0736f.put(str, m4604b);
            return new e(m4604b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m4762d(Context context, C0959e c0959e, int i10, Executor executor, C0955a c0955a) {
        String m4759a = m4759a(c0959e, i10);
        Typeface typeface = f4494a.get(m4759a);
        if (typeface != null) {
            c0955a.m4741b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c0955a);
        synchronized (f4496c) {
            C0738h<String, ArrayList<InterfaceC0977a<e>>> c0738h = f4497d;
            ArrayList<InterfaceC0977a<e>> arrayList = c0738h.get(m4759a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<InterfaceC0977a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            c0738h.put(m4759a, arrayList2);
            c cVar = new c(m4759a, context, c0959e, i10);
            if (executor == null) {
                executor = f4495b;
            }
            C0962h.m4782b(executor, cVar, new d(m4759a));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m4763e(Context context, C0959e c0959e, C0955a c0955a, int i10, int i11) {
        String m4759a = m4759a(c0959e, i10);
        Typeface typeface = f4494a.get(m4759a);
        if (typeface != null) {
            c0955a.m4741b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e m4761c = m4761c(m4759a, context, c0959e, i10);
            c0955a.m4741b(m4761c);
            return m4761c.f4508a;
        }
        try {
            e eVar = (e) C0962h.m4783c(f4495b, new a(m4759a, context, c0959e, i10), i11);
            c0955a.m4741b(eVar);
            return eVar.f4508a;
        } catch (InterruptedException unused) {
            c0955a.m4741b(new e(-3));
            return null;
        }
    }
}
