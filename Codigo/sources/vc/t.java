package vc;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import xc.f0;

/* loaded from: classes.dex */
public class t {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f28910g;

    /* renamed from: h, reason: collision with root package name */
    static final String f28911h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28912a;

    /* renamed from: b, reason: collision with root package name */
    private final b0 f28913b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28914c;

    /* renamed from: d, reason: collision with root package name */
    private final dd.d f28915d;

    /* renamed from: e, reason: collision with root package name */
    private final cd.i f28916e;

    /* renamed from: f, reason: collision with root package name */
    private final sc.i f28917f = sc.i.f25475a;

    static {
        HashMap hashMap = new HashMap();
        f28910g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f28911h = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.6.0");
    }

    public t(Context context, b0 b0Var, a aVar, dd.d dVar, cd.i iVar) {
        this.f28912a = context;
        this.f28913b = b0Var;
        this.f28914c = aVar;
        this.f28915d = dVar;
        this.f28916e = iVar;
    }

    private f0.e.d.a.c A(f0.a aVar) {
        return this.f28917f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private f0.a a(f0.a aVar) {
        List<f0.a.AbstractC0503a> list;
        if (!this.f28916e.b().f7047b.f7056c || this.f28914c.f28774c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f28914c.f28774c) {
                arrayList.add(f0.a.AbstractC0503a.a().d(fVar.c()).b(fVar.a()).c(fVar.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return f0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private f0.b b() {
        return xc.f0.b().k("18.6.0").g(this.f28914c.f28772a).h(this.f28913b.a().c()).f(this.f28913b.a().d()).d(this.f28914c.f28777f).e(this.f28914c.f28778g).j(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f28910g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private f0.e.d.a.b.AbstractC0507a h() {
        return f0.e.d.a.b.AbstractC0507a.a().b(0L).d(0L).c(this.f28914c.f28776e).e(this.f28914c.f28773b).a();
    }

    private List<f0.e.d.a.b.AbstractC0507a> i() {
        return Collections.singletonList(h());
    }

    private f0.e.d.a j(int i10, dd.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        f0.e.d.a.c e10 = this.f28917f.e(this.f28912a);
        if (e10.b() > 0) {
            bool = Boolean.valueOf(e10.b() != 100);
        } else {
            bool = null;
        }
        return f0.e.d.a.a().c(bool).d(e10).b(this.f28917f.d(this.f28912a)).h(i10).f(o(eVar, thread, i11, i12, z10)).a();
    }

    private f0.e.d.a k(int i10, f0.a aVar) {
        return f0.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(p(aVar)).a();
    }

    private f0.e.d.c l(int i10) {
        e a10 = e.a(this.f28912a);
        Float b10 = a10.b();
        Double valueOf = b10 != null ? Double.valueOf(b10.doubleValue()) : null;
        int c10 = a10.c();
        boolean n10 = i.n(this.f28912a);
        return f0.e.d.c.a().b(valueOf).c(c10).f(n10).e(i10).g(f(i.b(this.f28912a) - i.a(this.f28912a))).d(i.c(Environment.getDataDirectory().getPath())).a();
    }

    private f0.e.d.a.b.c m(dd.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private f0.e.d.a.b.c n(dd.e eVar, int i10, int i11, int i12) {
        String str = eVar.f13883b;
        String str2 = eVar.f13882a;
        StackTraceElement[] stackTraceElementArr = eVar.f13884c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        dd.e eVar2 = eVar.f13885d;
        if (i12 >= i11) {
            dd.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f13885d;
                i13++;
            }
        }
        f0.e.d.a.b.c.AbstractC0510a d10 = f0.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            d10.b(n(eVar2, i10, i11, i12 + 1));
        }
        return d10.a();
    }

    private f0.e.d.a.b o(dd.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return f0.e.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private f0.e.d.a.b p(f0.a aVar) {
        return f0.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private f0.e.d.a.b.AbstractC0513e.AbstractC0515b q(StackTraceElement stackTraceElement, f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a abstractC0516a) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = stackTraceElement.getLineNumber();
        }
        return abstractC0516a.e(max).f(str).b(fileName).d(j10).a();
    }

    private List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, f0.e.d.a.b.AbstractC0513e.AbstractC0515b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private f0.e.a s() {
        return f0.e.a.a().e(this.f28913b.f()).g(this.f28914c.f28777f).d(this.f28914c.f28778g).f(this.f28913b.a().c()).b(this.f28914c.f28779h.d()).c(this.f28914c.f28779h.e()).a();
    }

    private f0.e t(String str, long j10) {
        return f0.e.a().m(j10).j(str).h(f28911h).b(s()).l(v()).e(u()).i(3).a();
    }

    private f0.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g10 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = i.b(this.f28912a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean w10 = i.w();
        int l10 = i.l();
        return f0.e.c.a().b(g10).f(Build.MODEL).c(availableProcessors).h(b10).d(blockCount).i(w10).j(l10).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private f0.e.AbstractC0520e v() {
        return f0.e.AbstractC0520e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.x()).a();
    }

    private f0.e.d.a.b.AbstractC0511d w() {
        return f0.e.d.a.b.AbstractC0511d.a().d("0").c("0").b(0L).a();
    }

    private f0.e.d.a.b.AbstractC0513e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private f0.e.d.a.b.AbstractC0513e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return f0.e.d.a.b.AbstractC0513e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List<f0.e.d.a.b.AbstractC0513e> z(dd.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f13884c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f28915d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public f0.e.d c(f0.a aVar) {
        int i10 = this.f28912a.getResources().getConfiguration().orientation;
        return f0.e.d.a().g("anr").f(aVar.i()).b(k(i10, a(aVar))).c(l(i10)).a();
    }

    public f0.e.d d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f28912a.getResources().getConfiguration().orientation;
        return f0.e.d.a().g(str).f(j10).b(j(i12, dd.e.a(th2, this.f28915d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public xc.f0 e(String str, long j10) {
        return b().l(t(str, j10)).a();
    }
}
