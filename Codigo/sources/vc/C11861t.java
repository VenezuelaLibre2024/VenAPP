package vc;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import cd.InterfaceC1952i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p064dd.C6887e;
import p064dd.InterfaceC6886d;
import p442xc.AbstractC12426f0;
import sc.C10891i;

/* renamed from: vc.t */
/* loaded from: classes.dex */
public class C11861t {

    /* renamed from: g */
    private static final Map<String, Integer> f31344g;

    /* renamed from: h */
    static final String f31345h;

    /* renamed from: a */
    private final Context f31346a;

    /* renamed from: b */
    private final C11826b0 f31347b;

    /* renamed from: c */
    private final C11823a f31348c;

    /* renamed from: d */
    private final InterfaceC6886d f31349d;

    /* renamed from: e */
    private final InterfaceC1952i f31350e;

    /* renamed from: f */
    private final C10891i f31351f = C10891i.f27594a;

    static {
        HashMap hashMap = new HashMap();
        f31344g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f31345h = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.6.0");
    }

    public C11861t(Context context, C11826b0 c11826b0, C11823a c11823a, InterfaceC6886d interfaceC6886d, InterfaceC1952i interfaceC1952i) {
        this.f31346a = context;
        this.f31347b = c11826b0;
        this.f31348c = c11823a;
        this.f31349d = interfaceC6886d;
        this.f31350e = interfaceC1952i;
    }

    /* renamed from: A */
    private AbstractC12426f0.e.d.a.c m37899A(AbstractC12426f0.a aVar) {
        return this.f31351f.m33229a(aVar.mo40131e(), aVar.mo40130d(), aVar.mo40129c());
    }

    /* renamed from: a */
    private AbstractC12426f0.a m37900a(AbstractC12426f0.a aVar) {
        List<AbstractC12426f0.a.AbstractC13271a> list;
        if (!this.f31350e.mo10188b().f7999b.f8008c || this.f31348c.f31208c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C11833f c11833f : this.f31348c.f31208c) {
                arrayList.add(AbstractC12426f0.a.AbstractC13271a.m40191a().mo40159d(c11833f.m37703c()).mo40157b(c11833f.m37701a()).mo40158c(c11833f.m37702b()).mo40156a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return AbstractC12426f0.a.m40190a().mo40139c(aVar.mo40129c()).mo40141e(aVar.mo40131e()).mo40143g(aVar.mo40133g()).mo40145i(aVar.mo40135i()).mo40140d(aVar.mo40130d()).mo40142f(aVar.mo40132f()).mo40144h(aVar.mo40134h()).mo40146j(aVar.mo40136j()).mo40138b(list).mo40137a();
    }

    /* renamed from: b */
    private AbstractC12426f0.b m37901b() {
        return AbstractC12426f0.m40183b().mo40123k("18.6.0").mo40119g(this.f31348c.f31206a).mo40120h(this.f31347b.mo37682a().mo37689c()).mo40118f(this.f31347b.mo37682a().mo37690d()).mo40116d(this.f31348c.f31211f).mo40117e(this.f31348c.f31212g).mo40122j(4);
    }

    /* renamed from: f */
    private static long m37902f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    /* renamed from: g */
    private static int m37903g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f31344g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: h */
    private AbstractC12426f0.e.d.a.b.AbstractC13275a m37904h() {
        return AbstractC12426f0.e.d.a.b.AbstractC13275a.m40299a().mo40306b(0L).mo40308d(0L).mo40307c(this.f31348c.f31210e).mo40309e(this.f31348c.f31207b).mo40305a();
    }

    /* renamed from: i */
    private List<AbstractC12426f0.e.d.a.b.AbstractC13275a> m37905i() {
        return Collections.singletonList(m37904h());
    }

    /* renamed from: j */
    private AbstractC12426f0.e.d.a m37906j(int i10, C6887e c6887e, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        AbstractC12426f0.e.d.a.c m33232e = this.f31351f.m33232e(this.f31346a);
        if (m33232e.mo40358b() > 0) {
            bool = Boolean.valueOf(m33232e.mo40358b() != 100);
        } else {
            bool = null;
        }
        return AbstractC12426f0.e.d.a.m40276a().mo40287c(bool).mo40288d(m33232e).mo40286b(this.f31351f.m33231d(this.f31346a)).mo40292h(i10).mo40290f(m37911o(c6887e, thread, i11, i12, z10)).mo40285a();
    }

    /* renamed from: k */
    private AbstractC12426f0.e.d.a m37907k(int i10, AbstractC12426f0.a aVar) {
        return AbstractC12426f0.e.d.a.m40276a().mo40287c(Boolean.valueOf(aVar.mo40129c() != 100)).mo40288d(m37899A(aVar)).mo40292h(i10).mo40290f(m37912p(aVar)).mo40285a();
    }

    /* renamed from: l */
    private AbstractC12426f0.e.d.c m37908l(int i10) {
        C11831e m37696a = C11831e.m37696a(this.f31346a);
        Float m37699b = m37696a.m37699b();
        Double valueOf = m37699b != null ? Double.valueOf(m37699b.doubleValue()) : null;
        int m37700c = m37696a.m37700c();
        boolean m37733n = C11839i.m37733n(this.f31346a);
        return AbstractC12426f0.e.d.c.m40374a().mo40382b(valueOf).mo40383c(m37700c).mo40386f(m37733n).mo40385e(i10).mo40387g(m37902f(C11839i.m37721b(this.f31346a) - C11839i.m37720a(this.f31346a))).mo40384d(C11839i.m37722c(Environment.getDataDirectory().getPath())).mo40381a();
    }

    /* renamed from: m */
    private AbstractC12426f0.e.d.a.b.c m37909m(C6887e c6887e, int i10, int i11) {
        return m37910n(c6887e, i10, i11, 0);
    }

    /* renamed from: n */
    private AbstractC12426f0.e.d.a.b.c m37910n(C6887e c6887e, int i10, int i11, int i12) {
        String str = c6887e.f15237b;
        String str2 = c6887e.f15236a;
        StackTraceElement[] stackTraceElementArr = c6887e.f15238c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C6887e c6887e2 = c6887e.f15239d;
        if (i12 >= i11) {
            C6887e c6887e3 = c6887e2;
            while (c6887e3 != null) {
                c6887e3 = c6887e3.f15239d;
                i13++;
            }
        }
        AbstractC12426f0.e.d.a.b.c.AbstractC13278a mo40326d = AbstractC12426f0.e.d.a.b.c.m40317a().mo40328f(str).mo40327e(str2).mo40325c(m37914r(stackTraceElementArr, i10)).mo40326d(i13);
        if (c6887e2 != null && i13 == 0) {
            mo40326d.mo40324b(m37910n(c6887e2, i10, i11, i12 + 1));
        }
        return mo40326d.mo40323a();
    }

    /* renamed from: o */
    private AbstractC12426f0.e.d.a.b m37911o(C6887e c6887e, Thread thread, int i10, int i11, boolean z10) {
        return AbstractC12426f0.e.d.a.b.m40293a().mo40316f(m37922z(c6887e, thread, i10, z10)).mo40314d(m37909m(c6887e, i10, i11)).mo40315e(m37919w()).mo40313c(m37905i()).mo40311a();
    }

    /* renamed from: p */
    private AbstractC12426f0.e.d.a.b m37912p(AbstractC12426f0.a aVar) {
        return AbstractC12426f0.e.d.a.b.m40293a().mo40312b(aVar).mo40315e(m37919w()).mo40313c(m37905i()).mo40311a();
    }

    /* renamed from: q */
    private AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b m37913q(StackTraceElement stackTraceElement, AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.AbstractC13284a abstractC13284a) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = stackTraceElement.getLineNumber();
        }
        return abstractC13284a.mo40355e(max).mo40356f(str).mo40352b(fileName).mo40354d(j10).mo40351a();
    }

    /* renamed from: r */
    private List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> m37914r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m37913q(stackTraceElement, AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.m40345a().mo40353c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: s */
    private AbstractC12426f0.e.a m37915s() {
        return AbstractC12426f0.e.a.m40218a().mo40230e(this.f31347b.m37684f()).mo40232g(this.f31348c.f31211f).mo40229d(this.f31348c.f31212g).mo40231f(this.f31347b.mo37682a().mo37689c()).mo40227b(this.f31348c.f31213h.m33211d()).mo40228c(this.f31348c.f31213h.m33212e()).mo40226a();
    }

    /* renamed from: t */
    private AbstractC12426f0.e m37916t(String str, long j10) {
        return AbstractC12426f0.e.m40200a().mo40246m(j10).mo40243j(str).mo40241h(f31345h).mo40235b(m37915s()).mo40245l(m37918v()).mo40238e(m37917u()).mo40242i(3).mo40234a();
    }

    /* renamed from: u */
    private AbstractC12426f0.e.c m37917u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m37903g = m37903g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m37721b = C11839i.m37721b(this.f31346a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m37742w = C11839i.m37742w();
        int m37731l = C11839i.m37731l();
        return AbstractC12426f0.e.c.m40248a().mo40259b(m37903g).mo40263f(Build.MODEL).mo40260c(availableProcessors).mo40265h(m37721b).mo40261d(blockCount).mo40266i(m37742w).mo40267j(m37731l).mo40262e(Build.MANUFACTURER).mo40264g(Build.PRODUCT).mo40258a();
    }

    /* renamed from: v */
    private AbstractC12426f0.e.AbstractC13288e m37918v() {
        return AbstractC12426f0.e.AbstractC13288e.m40412a().mo40420d(3).mo40421e(Build.VERSION.RELEASE).mo40418b(Build.VERSION.CODENAME).mo40419c(C11839i.m37743x()).mo40417a();
    }

    /* renamed from: w */
    private AbstractC12426f0.e.d.a.b.AbstractC13279d m37919w() {
        return AbstractC12426f0.e.d.a.b.AbstractC13279d.m40329a().mo40336d("0").mo40335c("0").mo40334b(0L).mo40333a();
    }

    /* renamed from: x */
    private AbstractC12426f0.e.d.a.b.AbstractC13281e m37920x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m37921y(thread, stackTraceElementArr, 0);
    }

    /* renamed from: y */
    private AbstractC12426f0.e.d.a.b.AbstractC13281e m37921y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return AbstractC12426f0.e.d.a.b.AbstractC13281e.m40337a().mo40344d(thread.getName()).mo40343c(i10).mo40342b(m37914r(stackTraceElementArr, i10)).mo40341a();
    }

    /* renamed from: z */
    private List<AbstractC12426f0.e.d.a.b.AbstractC13281e> m37922z(C6887e c6887e, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m37921y(thread, c6887e.f15238c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m37920x(key, this.f31349d.mo19866a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    public AbstractC12426f0.e.d m37923c(AbstractC12426f0.a aVar) {
        int i10 = this.f31346a.getResources().getConfiguration().orientation;
        return AbstractC12426f0.e.d.m40268a().mo40373g("anr").mo40372f(aVar.mo40135i()).mo40368b(m37907k(i10, m37900a(aVar))).mo40369c(m37908l(i10)).mo40367a();
    }

    /* renamed from: d */
    public AbstractC12426f0.e.d m37924d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f31346a.getResources().getConfiguration().orientation;
        return AbstractC12426f0.e.d.m40268a().mo40373g(str).mo40372f(j10).mo40368b(m37906j(i12, C6887e.m19869a(th2, this.f31349d), thread, i10, i11, z10)).mo40369c(m37908l(i12)).mo40367a();
    }

    /* renamed from: e */
    public AbstractC12426f0 m37925e(String str, long j10) {
        return m37901b().mo40124l(m37916t(str, j10)).mo40113a();
    }
}
