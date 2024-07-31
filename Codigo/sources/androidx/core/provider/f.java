package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.graphics.i;
import androidx.core.provider.g;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    static final androidx.collection.f<String, Typeface> f3822a = new androidx.collection.f<>(16);

    /* renamed from: b */
    private static final ExecutorService f3823b = h.a("fonts-androidx", 10, ModuleDescriptor.MODULE_VERSION);

    /* renamed from: c */
    static final Object f3824c = new Object();

    /* renamed from: d */
    static final androidx.collection.h<String, ArrayList<androidx.core.util.a<e>>> f3825d = new androidx.collection.h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f3826a;

        /* renamed from: b */
        final /* synthetic */ Context f3827b;

        /* renamed from: c */
        final /* synthetic */ androidx.core.provider.e f3828c;

        /* renamed from: d */
        final /* synthetic */ int f3829d;

        a(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f3826a = str;
            this.f3827b = context;
            this.f3828c = eVar;
            this.f3829d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return f.c(this.f3826a, this.f3827b, this.f3828c, this.f3829d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements androidx.core.util.a<e> {

        /* renamed from: a */
        final /* synthetic */ androidx.core.provider.a f3830a;

        b(androidx.core.provider.a aVar) {
            this.f3830a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f3830a.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f3831a;

        /* renamed from: b */
        final /* synthetic */ Context f3832b;

        /* renamed from: c */
        final /* synthetic */ androidx.core.provider.e f3833c;

        /* renamed from: d */
        final /* synthetic */ int f3834d;

        c(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f3831a = str;
            this.f3832b = context;
            this.f3833c = eVar;
            this.f3834d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.f3831a, this.f3832b, this.f3833c, this.f3834d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements androidx.core.util.a<e> {

        /* renamed from: a */
        final /* synthetic */ String f3835a;

        d(String str) {
            this.f3835a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (f.f3824c) {
                androidx.collection.h<String, ArrayList<androidx.core.util.a<e>>> hVar = f.f3825d;
                ArrayList<androidx.core.util.a<e>> arrayList = hVar.get(this.f3835a);
                if (arrayList == null) {
                    return;
                }
                hVar.remove(this.f3835a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        final Typeface f3836a;

        /* renamed from: b */
        final int f3837b;

        e(int i10) {
            this.f3836a = null;
            this.f3837b = i10;
        }

        e(Typeface typeface) {
            this.f3836a = typeface;
            this.f3837b = 0;
        }

        public boolean a() {
            return this.f3837b == 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (g.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i10) {
        androidx.collection.f<String, Typeface> fVar = f3822a;
        Typeface typeface = fVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e10 = androidx.core.provider.d.e(context, eVar, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = i.b(context, null, e10.b(), i10);
            if (b11 == null) {
                return new e(-3);
            }
            fVar.put(str, b11);
            return new e(b11);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, androidx.core.provider.e eVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String a10 = a(eVar, i10);
        Typeface typeface = f3822a.get(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f3824c) {
            androidx.collection.h<String, ArrayList<androidx.core.util.a<e>>> hVar = f3825d;
            ArrayList<androidx.core.util.a<e>> arrayList = hVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            hVar.put(a10, arrayList2);
            c cVar = new c(a10, context, eVar, i10);
            if (executor == null) {
                executor = f3823b;
            }
            h.b(executor, cVar, new d(a10));
            return null;
        }
    }

    public static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface typeface = f3822a.get(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e c10 = c(a10, context, eVar, i10);
            aVar.b(c10);
            return c10.f3836a;
        }
        try {
            e eVar2 = (e) h.c(f3823b, new a(a10, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f3836a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
