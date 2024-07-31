package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.d2;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class w2 {

    /* renamed from: g, reason: collision with root package name */
    private final String f2319g;

    /* renamed from: h, reason: collision with root package name */
    private final f f2320h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.camera.camera2.internal.compat.d0 f2321i;

    /* renamed from: j, reason: collision with root package name */
    private final t.f f2322j;

    /* renamed from: k, reason: collision with root package name */
    private final int f2323k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2324l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2325m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f2326n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2327o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2328p;

    /* renamed from: q, reason: collision with root package name */
    androidx.camera.core.impl.e2 f2329q;

    /* renamed from: s, reason: collision with root package name */
    private final c2 f2331s;

    /* renamed from: v, reason: collision with root package name */
    private final d2 f2334v;

    /* renamed from: a, reason: collision with root package name */
    private final List<androidx.camera.core.impl.c2> f2313a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<androidx.camera.core.impl.c2> f2314b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<androidx.camera.core.impl.c2> f2315c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map<b, List<androidx.camera.core.impl.c2>> f2316d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<androidx.camera.core.impl.c2> f2317e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<androidx.camera.core.impl.c2> f2318f = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    List<Integer> f2330r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final t.t f2332t = new t.t();

    /* renamed from: u, reason: collision with root package name */
    private final t.q f2333u = new t.q();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b {
        static b c(int i10, int i11) {
            return new e(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2(Context context, String str, androidx.camera.camera2.internal.compat.r0 r0Var, f fVar) {
        this.f2324l = false;
        this.f2325m = false;
        this.f2326n = false;
        this.f2327o = false;
        this.f2328p = false;
        String str2 = (String) androidx.core.util.h.k(str);
        this.f2319g = str2;
        this.f2320h = (f) androidx.core.util.h.k(fVar);
        this.f2322j = new t.f();
        this.f2331s = c2.c(context);
        try {
            androidx.camera.camera2.internal.compat.d0 c10 = r0Var.c(str2);
            this.f2321i = c10;
            Integer num = (Integer) c10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f2323k = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f2324l = true;
                    } else if (i10 == 6) {
                        this.f2325m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f2328p = true;
                    }
                }
            }
            d2 d2Var = new d2(this.f2321i);
            this.f2334v = d2Var;
            j();
            if (this.f2328p) {
                l();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f2326n = hasSystemFeature;
            if (hasSystemFeature) {
                h();
            }
            if (d2Var.d()) {
                g();
            }
            boolean h10 = u2.h(this.f2321i);
            this.f2327o = h10;
            if (h10) {
                i();
            }
            k();
            b();
        } catch (androidx.camera.camera2.internal.compat.h e10) {
            throw q1.a(e10);
        }
    }

    private Pair<List<androidx.camera.core.impl.d2>, Integer> A(int i10, List<androidx.camera.core.impl.a> list, List<Size> list2, List<androidx.camera.core.impl.k2<?>> list3, List<Integer> list4, int i11, Map<Integer, androidx.camera.core.impl.a> map, Map<Integer, androidx.camera.core.impl.k2<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.a aVar : list) {
            arrayList.add(aVar.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), aVar);
            }
        }
        for (int i12 = 0; i12 < list2.size(); i12++) {
            Size size = list2.get(i12);
            androidx.camera.core.impl.k2<?> k2Var = list3.get(list4.get(i12).intValue());
            int n10 = k2Var.n();
            arrayList.add(androidx.camera.core.impl.d2.h(i10, n10, size, D(n10)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), k2Var);
            }
            i11 = C(i11, k2Var.n(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i11));
    }

    private Range<Integer> B(List<androidx.camera.core.impl.a> list, List<androidx.camera.core.impl.k2<?>> list2, List<Integer> list3) {
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        Range<Integer> range = null;
        while (it.hasNext()) {
            range = E(it.next().h(), range);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            range = E(list2.get(it2.next().intValue()).x(null), range);
        }
        return range;
    }

    private int C(int i10, int i11, Size size) {
        return Math.min(i10, o(this.f2321i, i11, size));
    }

    private Range<Integer> E(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private List<Integer> F(List<androidx.camera.core.impl.k2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<androidx.camera.core.impl.k2<?>> it = list.iterator();
        while (it.hasNext()) {
            int A = it.next().A(0);
            if (!arrayList2.contains(Integer.valueOf(A))) {
                arrayList2.add(Integer.valueOf(A));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            for (androidx.camera.core.impl.k2<?> k2Var : list) {
                if (intValue == k2Var.A(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(k2Var)));
                }
            }
        }
        return arrayList;
    }

    private boolean G(b bVar, List<androidx.camera.core.impl.a> list, Map<androidx.camera.core.impl.k2<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        androidx.camera.core.impl.utils.d dVar = new androidx.camera.core.impl.utils.d();
        for (androidx.camera.core.impl.k2<?> k2Var : map.keySet()) {
            List<Size> list2 = map.get(k2Var);
            androidx.core.util.h.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + k2Var + ".");
            Size size = (Size) Collections.min(list2, dVar);
            int n10 = k2Var.n();
            arrayList.add(androidx.camera.core.impl.d2.h(bVar.a(), n10, size, D(n10)));
        }
        return c(bVar, arrayList);
    }

    private void H() {
        this.f2331s.g();
        if (this.f2329q == null) {
            k();
        } else {
            this.f2329q = androidx.camera.core.impl.e2.a(this.f2329q.b(), this.f2329q.j(), this.f2331s.f(), this.f2329q.h(), this.f2329q.f(), this.f2329q.d(), this.f2329q.l());
        }
    }

    private void J(Map<Integer, Size> map, int i10) {
        Size p10 = p(this.f2321i.b().c(), i10, true);
        if (p10 != null) {
            map.put(Integer.valueOf(i10), p10);
        }
    }

    private void K(Map<Integer, Size> map, Size size, int i10) {
        if (this.f2326n) {
            Size p10 = p(this.f2321i.b().c(), i10, false);
            Integer valueOf = Integer.valueOf(i10);
            if (p10 != null) {
                size = (Size) Collections.min(Arrays.asList(size, p10), new androidx.camera.core.impl.utils.d());
            }
            map.put(valueOf, size);
        }
    }

    private void L(Map<Integer, Size> map, int i10) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 31 || !this.f2328p) {
            return;
        }
        androidx.camera.camera2.internal.compat.d0 d0Var = this.f2321i;
        key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) d0Var.a(key);
        if (streamConfigurationMap == null) {
            return;
        }
        map.put(Integer.valueOf(i10), p(streamConfigurationMap, i10, true));
    }

    private void b() {
    }

    private static Range<Integer> d(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double t10 = t(range2.intersect(range));
        double t11 = t(range3.intersect(range));
        double t12 = t11 / t(range3);
        double t13 = t10 / t(range2);
        if (t11 > t10) {
            if (t12 >= 0.5d || t12 >= t13) {
                return range3;
            }
        } else if (t11 == t10) {
            if (t12 > t13) {
                return range3;
            }
            if (t12 == t13 && range3.getLower().intValue() > range2.getLower().intValue()) {
                return range3;
            }
        } else if (t13 < 0.5d && t12 > t13) {
            return range3;
        }
        return range2;
    }

    private b e(int i10, Map<androidx.camera.core.impl.k2<?>, w.y> map) {
        int x10 = x(map);
        if (i10 == 0 || x10 != 10) {
            return b.c(i10, x10);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f2319g, androidx.camera.core.impl.d0.a(i10)));
    }

    private Map<androidx.camera.core.impl.k2<?>, List<Size>> f(Map<androidx.camera.core.impl.k2<?>, List<Size>> map, b bVar, Range<Integer> range) {
        HashMap hashMap = new HashMap();
        for (androidx.camera.core.impl.k2<?> k2Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : map.get(k2Var)) {
                int n10 = k2Var.n();
                d2.a c10 = androidx.camera.core.impl.d2.h(bVar.a(), n10, size, D(n10)).c();
                int o10 = range != null ? o(this.f2321i, n10, size) : a.e.API_PRIORITY_OTHER;
                Set set = (Set) hashMap2.get(c10);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(c10, set);
                }
                if (!set.contains(Integer.valueOf(o10))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(o10));
                }
            }
            hashMap.put(k2Var, arrayList);
        }
        return hashMap;
    }

    private void g() {
        this.f2317e.addAll(i2.b());
    }

    private void h() {
        this.f2315c.addAll(i2.d());
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f2318f.addAll(i2.j());
        }
    }

    private void j() {
        this.f2313a.addAll(i2.a(this.f2323k, this.f2324l, this.f2325m));
        this.f2313a.addAll(this.f2322j.a(this.f2319g, this.f2323k));
    }

    private void k() {
        this.f2329q = androidx.camera.core.impl.e2.a(f0.d.f14850c, new HashMap(), this.f2331s.f(), new HashMap(), u(), new HashMap(), new HashMap());
    }

    private void l() {
        this.f2314b.addAll(i2.k());
    }

    private List<List<Size>> m(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            i10 *= it.next().size();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new ArrayList());
        }
        int size = i10 / list.get(0).size();
        int i12 = i10;
        for (int i13 = 0; i13 < list.size(); i13++) {
            List<Size> list2 = list.get(i13);
            for (int i14 = 0; i14 < i10; i14++) {
                ((List) arrayList.get(i14)).add(list2.get((i14 % i12) / size));
            }
            if (i13 < list.size() - 1) {
                i12 = size;
                size /= list.get(i13 + 1).size();
            }
        }
        return arrayList;
    }

    private Range<Integer> n(Range<Integer> range, int i10) {
        Range<Integer>[] rangeArr;
        if (range != null && (rangeArr = (Range[]) this.f2321i.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) != null) {
            Range<Integer> range2 = new Range<>(Integer.valueOf(Math.min(range.getLower().intValue(), i10)), Integer.valueOf(Math.min(range.getUpper().intValue(), i10)));
            Range<Integer> range3 = androidx.camera.core.impl.b2.f2445a;
            int i11 = 0;
            for (Range<Integer> range4 : rangeArr) {
                if (i10 >= range4.getLower().intValue()) {
                    if (range3.equals(androidx.camera.core.impl.b2.f2445a)) {
                        range3 = range4;
                    }
                    if (range4.equals(range2)) {
                        return range4;
                    }
                    try {
                        int t10 = t(range4.intersect(range2));
                        if (i11 == 0) {
                            i11 = t10;
                        } else {
                            if (t10 >= i11) {
                                range3 = d(range2, range3, range4);
                                i11 = t(range2.intersect(range3));
                            }
                            range4 = range3;
                        }
                    } catch (IllegalArgumentException unused) {
                        if (i11 == 0) {
                            if (s(range4, range2) >= s(range3, range2)) {
                                if (s(range4, range2) == s(range3, range2)) {
                                    if (range4.getLower().intValue() <= range3.getUpper().intValue() && t(range4) >= t(range3)) {
                                    }
                                }
                            }
                        }
                    }
                    range3 = range4;
                }
            }
            return range3;
        }
        return androidx.camera.core.impl.b2.f2445a;
    }

    static int o(androidx.camera.camera2.internal.compat.d0 d0Var, int i10, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) d0Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i10, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private Size p(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10) {
        Size[] a10;
        Size[] outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        androidx.camera.core.impl.utils.d dVar = new androidx.camera.core.impl.utils.d();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), dVar);
        Size size2 = f0.d.f14848a;
        if (z10 && (a10 = a.a(streamConfigurationMap, i10)) != null && a10.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(a10), dVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), dVar);
    }

    private int q(List<androidx.camera.core.impl.a> list) {
        int i10 = a.e.API_PRIORITY_OTHER;
        for (androidx.camera.core.impl.a aVar : list) {
            i10 = C(i10, aVar.d(), aVar.f());
        }
        return i10;
    }

    private static int s(Range<Integer> range, Range<Integer> range2) {
        androidx.core.util.h.n((range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    private static int t(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    private Size u() {
        try {
            int parseInt = Integer.parseInt(this.f2319g);
            CamcorderProfile a10 = this.f2320h.b(parseInt, 1) ? this.f2320h.a(parseInt, 1) : null;
            return a10 != null ? new Size(a10.videoFrameWidth, a10.videoFrameHeight) : v(parseInt);
        } catch (NumberFormatException unused) {
            return w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.util.Size v(int r4) {
        /*
            r3 = this;
            android.util.Size r0 = f0.d.f14851d
            androidx.camera.camera2.internal.f r1 = r3.f2320h
            r2 = 10
            boolean r1 = r1.b(r4, r2)
            if (r1 == 0) goto L13
        Lc:
            androidx.camera.camera2.internal.f r1 = r3.f2320h
            android.media.CamcorderProfile r4 = r1.a(r4, r2)
            goto L48
        L13:
            androidx.camera.camera2.internal.f r1 = r3.f2320h
            r2 = 8
            boolean r1 = r1.b(r4, r2)
            if (r1 == 0) goto L1e
            goto Lc
        L1e:
            androidx.camera.camera2.internal.f r1 = r3.f2320h
            r2 = 12
            boolean r1 = r1.b(r4, r2)
            if (r1 == 0) goto L29
            goto Lc
        L29:
            androidx.camera.camera2.internal.f r1 = r3.f2320h
            r2 = 6
            boolean r1 = r1.b(r4, r2)
            if (r1 == 0) goto L33
            goto Lc
        L33:
            androidx.camera.camera2.internal.f r1 = r3.f2320h
            r2 = 5
            boolean r1 = r1.b(r4, r2)
            if (r1 == 0) goto L3d
            goto Lc
        L3d:
            androidx.camera.camera2.internal.f r1 = r3.f2320h
            r2 = 4
            boolean r1 = r1.b(r4, r2)
            if (r1 == 0) goto L47
            goto Lc
        L47:
            r4 = 0
        L48:
            if (r4 == 0) goto L53
            android.util.Size r0 = new android.util.Size
            int r1 = r4.videoFrameWidth
            int r4 = r4.videoFrameHeight
            r0.<init>(r1, r4)
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.w2.v(int):android.util.Size");
    }

    private Size w() {
        Size[] outputSizes = this.f2321i.b().c().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return f0.d.f14851d;
        }
        Arrays.sort(outputSizes, new androidx.camera.core.impl.utils.d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = f0.d.f14853f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return f0.d.f14851d;
    }

    private static int x(Map<androidx.camera.core.impl.k2<?>, w.y> map) {
        Iterator<w.y> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private List<androidx.camera.core.impl.c2> z(b bVar) {
        List<androidx.camera.core.impl.c2> list;
        if (this.f2316d.containsKey(bVar)) {
            return this.f2316d.get(bVar);
        }
        List<androidx.camera.core.impl.c2> arrayList = new ArrayList<>();
        if (bVar.b() != 8) {
            if (bVar.b() == 10 && bVar.a() == 0) {
                list = this.f2317e;
                arrayList.addAll(list);
            }
            this.f2316d.put(bVar, arrayList);
            return arrayList;
        }
        int a10 = bVar.a();
        if (a10 == 1) {
            arrayList = this.f2315c;
            this.f2316d.put(bVar, arrayList);
            return arrayList;
        }
        if (a10 == 2) {
            arrayList.addAll(this.f2314b);
        }
        list = this.f2313a;
        arrayList.addAll(list);
        this.f2316d.put(bVar, arrayList);
        return arrayList;
    }

    androidx.camera.core.impl.e2 D(int i10) {
        if (!this.f2330r.contains(Integer.valueOf(i10))) {
            K(this.f2329q.j(), f0.d.f14852e, i10);
            K(this.f2329q.h(), f0.d.f14854g, i10);
            J(this.f2329q.d(), i10);
            L(this.f2329q.l(), i10);
            this.f2330r.add(Integer.valueOf(i10));
        }
        return this.f2329q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.camera.core.impl.d2 I(int i10, int i11, Size size) {
        return androidx.camera.core.impl.d2.h(i10, i11, size, D(i11));
    }

    List<Size> a(List<Size> list, int i10) {
        Rational rational;
        int a10 = this.f2332t.a(this.f2319g, this.f2321i);
        if (a10 == 0) {
            rational = androidx.camera.core.impl.utils.a.f2594a;
        } else if (a10 == 1) {
            rational = androidx.camera.core.impl.utils.a.f2596c;
        } else if (a10 != 2) {
            rational = null;
        } else {
            Size c10 = D(RecognitionOptions.QR_CODE).c(RecognitionOptions.QR_CODE);
            rational = new Rational(c10.getWidth(), c10.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (androidx.camera.core.impl.utils.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f2333u.a(androidx.camera.core.impl.d2.e(i10), list);
    }

    boolean c(b bVar, List<androidx.camera.core.impl.d2> list) {
        Iterator<androidx.camera.core.impl.c2> it = z(bVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = it.next().d(list) != null;
            if (z10) {
                break;
            }
        }
        return z10;
    }

    List<androidx.camera.core.impl.d2> r(b bVar, List<androidx.camera.core.impl.d2> list) {
        if (!u2.n(bVar)) {
            return null;
        }
        Iterator<androidx.camera.core.impl.c2> it = this.f2318f.iterator();
        while (it.hasNext()) {
            List<androidx.camera.core.impl.d2> d10 = it.next().d(list);
            if (d10 != null) {
                return d10;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Pair<Map<androidx.camera.core.impl.k2<?>, androidx.camera.core.impl.b2>, Map<androidx.camera.core.impl.a, androidx.camera.core.impl.b2>> y(int i10, List<androidx.camera.core.impl.a> list, Map<androidx.camera.core.impl.k2<?>, List<Size>> map) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        Range<Integer> range;
        List<Integer> list2;
        Map<androidx.camera.core.impl.k2<?>, w.y> map2;
        int i11;
        String str;
        String str2;
        HashMap hashMap4;
        List<androidx.camera.core.impl.d2> list3;
        String str3;
        String str4;
        HashMap hashMap5;
        HashMap hashMap6;
        List<Size> list4;
        List<Size> list5;
        HashMap hashMap7;
        int i12;
        int i13;
        String str5;
        H();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> F = F(arrayList);
        Map<androidx.camera.core.impl.k2<?>, w.y> g10 = this.f2334v.g(list, arrayList, F);
        b e10 = e(i10, g10);
        boolean G = G(e10, list, map);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!G) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f2319g + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> B = B(list, arrayList, F);
        Map<androidx.camera.core.impl.k2<?>, List<Size>> f10 = f(map, e10, B);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = F.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.k2<?> k2Var = arrayList.get(it.next().intValue());
            arrayList2.add(a(f10.get(k2Var), k2Var.n()));
        }
        List<List<Size>> m10 = m(arrayList2);
        HashMap hashMap8 = new HashMap();
        HashMap hashMap9 = new HashMap();
        HashMap hashMap10 = new HashMap();
        HashMap hashMap11 = new HashMap();
        boolean d10 = u2.d(list, arrayList);
        int q10 = q(list);
        HashMap hashMap12 = hashMap11;
        if (!this.f2327o || d10) {
            hashMap = hashMap10;
            hashMap2 = hashMap9;
            hashMap3 = hashMap8;
            range = B;
            list2 = F;
            map2 = g10;
            i11 = q10;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            hashMap4 = hashMap12;
            list3 = null;
        } else {
            Iterator<List<Size>> it2 = m10.iterator();
            List<androidx.camera.core.impl.d2> list6 = null;
            while (true) {
                if (!it2.hasNext()) {
                    hashMap2 = hashMap9;
                    hashMap3 = hashMap8;
                    range = B;
                    list2 = F;
                    map2 = g10;
                    i11 = q10;
                    str = str8;
                    str2 = str7;
                    str5 = str6;
                    hashMap4 = hashMap12;
                    hashMap = hashMap10;
                    break;
                }
                HashMap hashMap13 = hashMap12;
                HashMap hashMap14 = hashMap10;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                map2 = g10;
                Range<Integer> range2 = B;
                List<Integer> list7 = F;
                range = range2;
                str = str8;
                int i14 = q10;
                i11 = q10;
                str2 = str7;
                list2 = F;
                str5 = str6;
                list6 = r(e10, (List) A(i10, list, it2.next(), arrayList, list7, i14, hashMap14, hashMap13).first);
                hashMap = hashMap14;
                hashMap4 = hashMap13;
                if (list6 != null && !u2.a(hashMap, hashMap4, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (u2.c(this.f2321i, list6)) {
                        break;
                    }
                    list6 = null;
                }
                hashMap.clear();
                hashMap4.clear();
                hashMap12 = hashMap4;
                hashMap10 = hashMap;
                str6 = str5;
                str8 = str;
                str7 = str2;
                g10 = map2;
                hashMap9 = hashMap2;
                hashMap8 = hashMap3;
                B = range;
                q10 = i11;
                F = list2;
            }
            if (list6 == null && !G) {
                throw new IllegalArgumentException(str + this.f2319g + str5 + list + str2 + arrayList);
            }
            list3 = list6;
        }
        Iterator<List<Size>> it3 = m10.iterator();
        boolean z10 = false;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MAX_VALUE;
        boolean z11 = false;
        boolean z12 = false;
        List<Size> list8 = null;
        List<Size> list9 = null;
        while (true) {
            if (!it3.hasNext()) {
                str3 = str;
                str4 = str2;
                hashMap5 = hashMap4;
                hashMap6 = hashMap;
                list4 = list8;
                list5 = list9;
                break;
            }
            List<Size> next = it3.next();
            int i17 = i15;
            int i18 = i16;
            str4 = str2;
            hashMap5 = hashMap4;
            str3 = str;
            hashMap6 = hashMap;
            Pair<List<androidx.camera.core.impl.d2>, Integer> A = A(i10, list, next, arrayList, list2, i11, null, null);
            List<androidx.camera.core.impl.d2> list10 = (List) A.first;
            i16 = ((Integer) A.second).intValue();
            int i19 = i11;
            boolean z13 = range == null || i19 <= i16 || i16 >= range.getLower().intValue();
            if (z11 || !c(e10, list10)) {
                i12 = i18;
                i13 = a.e.API_PRIORITY_OTHER;
            } else {
                i12 = i18;
                i13 = a.e.API_PRIORITY_OTHER;
                if (i12 == Integer.MAX_VALUE || i12 < i16) {
                    i12 = i16;
                    list8 = next;
                }
                if (z13) {
                    if (z12) {
                        list5 = list9;
                        list4 = next;
                        i15 = i17;
                        break;
                    }
                    i12 = i16;
                    z11 = true;
                    list8 = next;
                }
            }
            if (list3 == null || z12 || r(e10, list10) == null) {
                i15 = i17;
            } else {
                if (i17 != i13 && i17 >= i16) {
                    i15 = i17;
                } else {
                    i15 = i16;
                    list9 = next;
                }
                if (z13) {
                    i15 = i16;
                    if (z11) {
                        i16 = i12;
                        list4 = list8;
                        list5 = next;
                        break;
                    }
                    z12 = true;
                    list9 = next;
                } else {
                    continue;
                }
            }
            i11 = i19;
            i16 = i12;
            hashMap = hashMap6;
            hashMap4 = hashMap5;
            str = str3;
            str2 = str4;
        }
        if (list4 == null) {
            throw new IllegalArgumentException(str3 + this.f2319g + " and Hardware level: " + this.f2323k + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        Range<Integer> n10 = range != null ? n(range, i16) : null;
        Iterator<androidx.camera.core.impl.k2<?>> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            androidx.camera.core.impl.k2<?> next2 = it4.next();
            List<Integer> list11 = list2;
            Map<androidx.camera.core.impl.k2<?>, w.y> map3 = map2;
            Iterator<androidx.camera.core.impl.k2<?>> it5 = it4;
            b2.a d11 = androidx.camera.core.impl.b2.a(list4.get(list11.indexOf(Integer.valueOf(arrayList.indexOf(next2))))).b((w.y) androidx.core.util.h.k(map3.get(next2))).d(u2.e(next2));
            if (n10 != null) {
                d11.c(n10);
            }
            hashMap2.put(next2, d11.a());
            it4 = it5;
            list2 = list11;
            map2 = map3;
        }
        HashMap hashMap15 = hashMap2;
        if (list3 != null && i16 == i15 && list4.size() == list5.size()) {
            int i20 = 0;
            while (true) {
                if (i20 >= list4.size()) {
                    break;
                }
                if (!list4.get(i20).equals(list5.get(i20))) {
                    z10 = true;
                    break;
                }
                i20++;
            }
            if (!z10) {
                hashMap7 = hashMap3;
                if (!u2.k(this.f2321i, list, hashMap15, hashMap7)) {
                    u2.l(hashMap15, hashMap7, hashMap6, hashMap5, list3);
                }
                return new Pair<>(hashMap15, hashMap7);
            }
        }
        hashMap7 = hashMap3;
        return new Pair<>(hashMap15, hashMap7);
    }
}
