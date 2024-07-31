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
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.camera2.internal.compat.C0434h;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.camera.core.impl.AbstractC0597a;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0612d2;
import androidx.camera.core.impl.AbstractC0616e2;
import androidx.camera.core.impl.C0608c2;
import androidx.camera.core.impl.C0610d0;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.utils.C0672a;
import androidx.camera.core.impl.utils.C0675d;
import androidx.core.util.C0984h;
import com.google.android.gms.common.api.C5101a;
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
import p092f0.C7264d;
import p354t.C10941f;
import p354t.C10952q;
import p354t.C10955t;
import p407w.C12048y;

/* renamed from: androidx.camera.camera2.internal.w2 */
/* loaded from: classes.dex */
final class C0570w2 {

    /* renamed from: g */
    private final String f2640g;

    /* renamed from: h */
    private final InterfaceC0482f f2641h;

    /* renamed from: i */
    private final C0427d0 f2642i;

    /* renamed from: j */
    private final C10941f f2643j;

    /* renamed from: k */
    private final int f2644k;

    /* renamed from: l */
    private boolean f2645l;

    /* renamed from: m */
    private boolean f2646m;

    /* renamed from: n */
    private boolean f2647n;

    /* renamed from: o */
    private boolean f2648o;

    /* renamed from: p */
    private boolean f2649p;

    /* renamed from: q */
    AbstractC0616e2 f2650q;

    /* renamed from: s */
    private final C0416c2 f2652s;

    /* renamed from: v */
    private final C0475d2 f2655v;

    /* renamed from: a */
    private final List<C0608c2> f2634a = new ArrayList();

    /* renamed from: b */
    private final List<C0608c2> f2635b = new ArrayList();

    /* renamed from: c */
    private final List<C0608c2> f2636c = new ArrayList();

    /* renamed from: d */
    private final Map<b, List<C0608c2>> f2637d = new HashMap();

    /* renamed from: e */
    private final List<C0608c2> f2638e = new ArrayList();

    /* renamed from: f */
    private final List<C0608c2> f2639f = new ArrayList();

    /* renamed from: r */
    List<Integer> f2651r = new ArrayList();

    /* renamed from: t */
    private final C10955t f2653t = new C10955t();

    /* renamed from: u */
    private final C10952q f2654u = new C10952q();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.w2$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Size[] m2843a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.w2$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: c */
        static b m2844c(int i10, int i11) {
            return new C0477e(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo2362a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract int mo2363b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0570w2(Context context, String str, C0455r0 c0455r0, InterfaceC0482f interfaceC0482f) {
        this.f2645l = false;
        this.f2646m = false;
        this.f2647n = false;
        this.f2648o = false;
        this.f2649p = false;
        String str2 = (String) C0984h.m4833k(str);
        this.f2640g = str2;
        this.f2641h = (InterfaceC0482f) C0984h.m4833k(interfaceC0482f);
        this.f2643j = new C10941f();
        this.f2652s = C0416c2.m2195c(context);
        try {
            C0427d0 m2276c = c0455r0.m2276c(str2);
            this.f2642i = m2276c;
            Integer num = (Integer) m2276c.m2215a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f2644k = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) m2276c.m2215a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f2645l = true;
                    } else if (i10 == 6) {
                        this.f2646m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f2649p = true;
                    }
                }
            }
            C0475d2 c0475d2 = new C0475d2(this.f2642i);
            this.f2655v = c0475d2;
            m2822j();
            if (this.f2649p) {
                m2824l();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f2647n = hasSystemFeature;
            if (hasSystemFeature) {
                m2820h();
            }
            if (c0475d2.m2323d()) {
                m2819g();
            }
            boolean m2761h = C0560u2.m2761h(this.f2642i);
            this.f2648o = m2761h;
            if (m2761h) {
                m2821i();
            }
            m2823k();
            m2815b();
        } catch (C0434h e10) {
            throw C0539q1.m2610a(e10);
        }
    }

    /* renamed from: A */
    private Pair<List<AbstractC0612d2>, Integer> m2805A(int i10, List<AbstractC0597a> list, List<Size> list2, List<InterfaceC0640k2<?>> list3, List<Integer> list4, int i11, Map<Integer, AbstractC0597a> map, Map<Integer, InterfaceC0640k2<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0597a abstractC0597a : list) {
            arrayList.add(abstractC0597a.mo2977g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC0597a);
            }
        }
        for (int i12 = 0; i12 < list2.size(); i12++) {
            Size size = list2.get(i12);
            InterfaceC0640k2<?> interfaceC0640k2 = list3.get(list4.get(i12).intValue());
            int mo3010n = interfaceC0640k2.mo3010n();
            arrayList.add(AbstractC0612d2.m3029h(i10, mo3010n, size, m2837D(mo3010n)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), interfaceC0640k2);
            }
            i11 = m2807C(i11, interfaceC0640k2.mo3010n(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i11));
    }

    /* renamed from: B */
    private Range<Integer> m2806B(List<AbstractC0597a> list, List<InterfaceC0640k2<?>> list2, List<Integer> list3) {
        Iterator<AbstractC0597a> it = list.iterator();
        Range<Integer> range = null;
        while (it.hasNext()) {
            range = m2808E(it.next().mo2978h(), range);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            range = m2808E(list2.get(it2.next().intValue()).m3147x(null), range);
        }
        return range;
    }

    /* renamed from: C */
    private int m2807C(int i10, int i11, Size size) {
        return Math.min(i10, m2827o(this.f2642i, i11, size));
    }

    /* renamed from: E */
    private Range<Integer> m2808E(Range<Integer> range, Range<Integer> range2) {
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

    /* renamed from: F */
    private List<Integer> m2809F(List<InterfaceC0640k2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<InterfaceC0640k2<?>> it = list.iterator();
        while (it.hasNext()) {
            int m3138A = it.next().m3138A(0);
            if (!arrayList2.contains(Integer.valueOf(m3138A))) {
                arrayList2.add(Integer.valueOf(m3138A));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            for (InterfaceC0640k2<?> interfaceC0640k2 : list) {
                if (intValue == interfaceC0640k2.m3138A(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(interfaceC0640k2)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    private boolean m2810G(b bVar, List<AbstractC0597a> list, Map<InterfaceC0640k2<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0597a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo2977g());
        }
        C0675d c0675d = new C0675d();
        for (InterfaceC0640k2<?> interfaceC0640k2 : map.keySet()) {
            List<Size> list2 = map.get(interfaceC0640k2);
            C0984h.m4824b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + interfaceC0640k2 + ".");
            Size size = (Size) Collections.min(list2, c0675d);
            int mo3010n = interfaceC0640k2.mo3010n();
            arrayList.add(AbstractC0612d2.m3029h(bVar.mo2362a(), mo3010n, size, m2837D(mo3010n)));
        }
        return m2840c(bVar, arrayList);
    }

    /* renamed from: H */
    private void m2811H() {
        this.f2652s.m2199g();
        if (this.f2650q == null) {
            m2823k();
        } else {
            this.f2650q = AbstractC0616e2.m3040a(this.f2650q.mo3041b(), this.f2650q.mo3049j(), this.f2652s.m2198f(), this.f2650q.mo3047h(), this.f2650q.mo3045f(), this.f2650q.mo3043d(), this.f2650q.mo3051l());
        }
    }

    /* renamed from: J */
    private void m2812J(Map<Integer, Size> map, int i10) {
        Size m2828p = m2828p(this.f2642i.m2216b().m2309c(), i10, true);
        if (m2828p != null) {
            map.put(Integer.valueOf(i10), m2828p);
        }
    }

    /* renamed from: K */
    private void m2813K(Map<Integer, Size> map, Size size, int i10) {
        if (this.f2647n) {
            Size m2828p = m2828p(this.f2642i.m2216b().m2309c(), i10, false);
            Integer valueOf = Integer.valueOf(i10);
            if (m2828p != null) {
                size = (Size) Collections.min(Arrays.asList(size, m2828p), new C0675d());
            }
            map.put(valueOf, size);
        }
    }

    /* renamed from: L */
    private void m2814L(Map<Integer, Size> map, int i10) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 31 || !this.f2649p) {
            return;
        }
        C0427d0 c0427d0 = this.f2642i;
        key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c0427d0.m2215a(key);
        if (streamConfigurationMap == null) {
            return;
        }
        map.put(Integer.valueOf(i10), m2828p(streamConfigurationMap, i10, true));
    }

    /* renamed from: b */
    private void m2815b() {
    }

    /* renamed from: d */
    private static Range<Integer> m2816d(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double m2831t = m2831t(range2.intersect(range));
        double m2831t2 = m2831t(range3.intersect(range));
        double m2831t3 = m2831t2 / m2831t(range3);
        double m2831t4 = m2831t / m2831t(range2);
        if (m2831t2 > m2831t) {
            if (m2831t3 >= 0.5d || m2831t3 >= m2831t4) {
                return range3;
            }
        } else if (m2831t2 == m2831t) {
            if (m2831t3 > m2831t4) {
                return range3;
            }
            if (m2831t3 == m2831t4 && range3.getLower().intValue() > range2.getLower().intValue()) {
                return range3;
            }
        } else if (m2831t4 < 0.5d && m2831t3 > m2831t4) {
            return range3;
        }
        return range2;
    }

    /* renamed from: e */
    private b m2817e(int i10, Map<InterfaceC0640k2<?>, C12048y> map) {
        int m2835x = m2835x(map);
        if (i10 == 0 || m2835x != 10) {
            return b.m2844c(i10, m2835x);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f2640g, C0610d0.m3018a(i10)));
    }

    /* renamed from: f */
    private Map<InterfaceC0640k2<?>, List<Size>> m2818f(Map<InterfaceC0640k2<?>, List<Size>> map, b bVar, Range<Integer> range) {
        HashMap hashMap = new HashMap();
        for (InterfaceC0640k2<?> interfaceC0640k2 : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : map.get(interfaceC0640k2)) {
                int mo3010n = interfaceC0640k2.mo3010n();
                AbstractC0612d2.a mo3030c = AbstractC0612d2.m3029h(bVar.mo2362a(), mo3010n, size, m2837D(mo3010n)).mo3030c();
                int m2827o = range != null ? m2827o(this.f2642i, mo3010n, size) : C5101a.e.API_PRIORITY_OTHER;
                Set set = (Set) hashMap2.get(mo3030c);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(mo3030c, set);
                }
                if (!set.contains(Integer.valueOf(m2827o))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(m2827o));
                }
            }
            hashMap.put(interfaceC0640k2, arrayList);
        }
        return hashMap;
    }

    /* renamed from: g */
    private void m2819g() {
        this.f2638e.addAll(C0500i2.m2417b());
    }

    /* renamed from: h */
    private void m2820h() {
        this.f2636c.addAll(C0500i2.m2419d());
    }

    /* renamed from: i */
    private void m2821i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f2639f.addAll(C0500i2.m2425j());
        }
    }

    /* renamed from: j */
    private void m2822j() {
        this.f2634a.addAll(C0500i2.m2416a(this.f2644k, this.f2645l, this.f2646m));
        this.f2634a.addAll(this.f2643j.m33413a(this.f2640g, this.f2644k));
    }

    /* renamed from: k */
    private void m2823k() {
        this.f2650q = AbstractC0616e2.m3040a(C7264d.f16273c, new HashMap(), this.f2652s.m2198f(), new HashMap(), m2832u(), new HashMap(), new HashMap());
    }

    /* renamed from: l */
    private void m2824l() {
        this.f2635b.addAll(C0500i2.m2426k());
    }

    /* renamed from: m */
    private List<List<Size>> m2825m(List<List<Size>> list) {
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

    /* renamed from: n */
    private Range<Integer> m2826n(Range<Integer> range, int i10) {
        Range<Integer>[] rangeArr;
        if (range != null && (rangeArr = (Range[]) this.f2642i.m2215a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) != null) {
            Range<Integer> range2 = new Range<>(Integer.valueOf(Math.min(range.getLower().intValue(), i10)), Integer.valueOf(Math.min(range.getUpper().intValue(), i10)));
            Range<Integer> range3 = AbstractC0604b2.f2766a;
            int i11 = 0;
            for (Range<Integer> range4 : rangeArr) {
                if (i10 >= range4.getLower().intValue()) {
                    if (range3.equals(AbstractC0604b2.f2766a)) {
                        range3 = range4;
                    }
                    if (range4.equals(range2)) {
                        return range4;
                    }
                    try {
                        int m2831t = m2831t(range4.intersect(range2));
                        if (i11 == 0) {
                            i11 = m2831t;
                        } else {
                            if (m2831t >= i11) {
                                range3 = m2816d(range2, range3, range4);
                                i11 = m2831t(range2.intersect(range3));
                            }
                            range4 = range3;
                        }
                    } catch (IllegalArgumentException unused) {
                        if (i11 == 0) {
                            if (m2830s(range4, range2) >= m2830s(range3, range2)) {
                                if (m2830s(range4, range2) == m2830s(range3, range2)) {
                                    if (range4.getLower().intValue() <= range3.getUpper().intValue() && m2831t(range4) >= m2831t(range3)) {
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
        return AbstractC0604b2.f2766a;
    }

    /* renamed from: o */
    static int m2827o(C0427d0 c0427d0, int i10, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) c0427d0.m2215a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i10, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: p */
    private Size m2828p(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10) {
        Size[] m2843a;
        Size[] outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        C0675d c0675d = new C0675d();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), c0675d);
        Size size2 = C7264d.f16271a;
        if (z10 && (m2843a = a.m2843a(streamConfigurationMap, i10)) != null && m2843a.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(m2843a), c0675d);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), c0675d);
    }

    /* renamed from: q */
    private int m2829q(List<AbstractC0597a> list) {
        int i10 = C5101a.e.API_PRIORITY_OTHER;
        for (AbstractC0597a abstractC0597a : list) {
            i10 = m2807C(i10, abstractC0597a.mo2974d(), abstractC0597a.mo2976f());
        }
        return i10;
    }

    /* renamed from: s */
    private static int m2830s(Range<Integer> range, Range<Integer> range2) {
        C0984h.m4836n((range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    /* renamed from: t */
    private static int m2831t(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    /* renamed from: u */
    private Size m2832u() {
        try {
            int parseInt = Integer.parseInt(this.f2640g);
            CamcorderProfile mo2368a = this.f2641h.mo2369b(parseInt, 1) ? this.f2641h.mo2368a(parseInt, 1) : null;
            return mo2368a != null ? new Size(mo2368a.videoFrameWidth, mo2368a.videoFrameHeight) : m2833v(parseInt);
        } catch (NumberFormatException unused) {
            return m2834w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.util.Size m2833v(int r4) {
        /*
            r3 = this;
            android.util.Size r0 = p092f0.C7264d.f16274d
            androidx.camera.camera2.internal.f r1 = r3.f2641h
            r2 = 10
            boolean r1 = r1.mo2369b(r4, r2)
            if (r1 == 0) goto L13
        Lc:
            androidx.camera.camera2.internal.f r1 = r3.f2641h
            android.media.CamcorderProfile r4 = r1.mo2368a(r4, r2)
            goto L48
        L13:
            androidx.camera.camera2.internal.f r1 = r3.f2641h
            r2 = 8
            boolean r1 = r1.mo2369b(r4, r2)
            if (r1 == 0) goto L1e
            goto Lc
        L1e:
            androidx.camera.camera2.internal.f r1 = r3.f2641h
            r2 = 12
            boolean r1 = r1.mo2369b(r4, r2)
            if (r1 == 0) goto L29
            goto Lc
        L29:
            androidx.camera.camera2.internal.f r1 = r3.f2641h
            r2 = 6
            boolean r1 = r1.mo2369b(r4, r2)
            if (r1 == 0) goto L33
            goto Lc
        L33:
            androidx.camera.camera2.internal.f r1 = r3.f2641h
            r2 = 5
            boolean r1 = r1.mo2369b(r4, r2)
            if (r1 == 0) goto L3d
            goto Lc
        L3d:
            androidx.camera.camera2.internal.f r1 = r3.f2641h
            r2 = 4
            boolean r1 = r1.mo2369b(r4, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0570w2.m2833v(int):android.util.Size");
    }

    /* renamed from: w */
    private Size m2834w() {
        Size[] outputSizes = this.f2642i.m2216b().m2309c().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return C7264d.f16274d;
        }
        Arrays.sort(outputSizes, new C0675d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = C7264d.f16276f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return C7264d.f16274d;
    }

    /* renamed from: x */
    private static int m2835x(Map<InterfaceC0640k2<?>, C12048y> map) {
        Iterator<C12048y> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().m38700a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* renamed from: z */
    private List<C0608c2> m2836z(b bVar) {
        List<C0608c2> list;
        if (this.f2637d.containsKey(bVar)) {
            return this.f2637d.get(bVar);
        }
        List<C0608c2> arrayList = new ArrayList<>();
        if (bVar.mo2363b() != 8) {
            if (bVar.mo2363b() == 10 && bVar.mo2362a() == 0) {
                list = this.f2638e;
                arrayList.addAll(list);
            }
            this.f2637d.put(bVar, arrayList);
            return arrayList;
        }
        int mo2362a = bVar.mo2362a();
        if (mo2362a == 1) {
            arrayList = this.f2636c;
            this.f2637d.put(bVar, arrayList);
            return arrayList;
        }
        if (mo2362a == 2) {
            arrayList.addAll(this.f2635b);
        }
        list = this.f2634a;
        arrayList.addAll(list);
        this.f2637d.put(bVar, arrayList);
        return arrayList;
    }

    /* renamed from: D */
    AbstractC0616e2 m2837D(int i10) {
        if (!this.f2651r.contains(Integer.valueOf(i10))) {
            m2813K(this.f2650q.mo3049j(), C7264d.f16275e, i10);
            m2813K(this.f2650q.mo3047h(), C7264d.f16277g, i10);
            m2812J(this.f2650q.mo3043d(), i10);
            m2814L(this.f2650q.mo3051l(), i10);
            this.f2651r.add(Integer.valueOf(i10));
        }
        return this.f2650q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public AbstractC0612d2 m2838I(int i10, int i11, Size size) {
        return AbstractC0612d2.m3029h(i10, i11, size, m2837D(i11));
    }

    /* renamed from: a */
    List<Size> m2839a(List<Size> list, int i10) {
        Rational rational;
        int m33436a = this.f2653t.m33436a(this.f2640g, this.f2642i);
        if (m33436a == 0) {
            rational = C0672a.f2938a;
        } else if (m33436a == 1) {
            rational = C0672a.f2940c;
        } else if (m33436a != 2) {
            rational = null;
        } else {
            Size m3042c = m2837D(RecognitionOptions.QR_CODE).m3042c(RecognitionOptions.QR_CODE);
            rational = new Rational(m3042c.getWidth(), m3042c.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (C0672a.m3243a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f2654u.m33433a(AbstractC0612d2.m3028e(i10), list);
    }

    /* renamed from: c */
    boolean m2840c(b bVar, List<AbstractC0612d2> list) {
        Iterator<C0608c2> it = m2836z(bVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = it.next().m3014d(list) != null;
            if (z10) {
                break;
            }
        }
        return z10;
    }

    /* renamed from: r */
    List<AbstractC0612d2> m2841r(b bVar, List<AbstractC0612d2> list) {
        if (!C0560u2.m2767n(bVar)) {
            return null;
        }
        Iterator<C0608c2> it = this.f2639f.iterator();
        while (it.hasNext()) {
            List<AbstractC0612d2> m3014d = it.next().m3014d(list);
            if (m3014d != null) {
                return m3014d;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public Pair<Map<InterfaceC0640k2<?>, AbstractC0604b2>, Map<AbstractC0597a, AbstractC0604b2>> m2842y(int i10, List<AbstractC0597a> list, Map<InterfaceC0640k2<?>, List<Size>> map) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        Range<Integer> range;
        List<Integer> list2;
        Map<InterfaceC0640k2<?>, C12048y> map2;
        int i11;
        String str;
        String str2;
        HashMap hashMap4;
        List<AbstractC0612d2> list3;
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
        m2811H();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> m2809F = m2809F(arrayList);
        Map<InterfaceC0640k2<?>, C12048y> m2324g = this.f2655v.m2324g(list, arrayList, m2809F);
        b m2817e = m2817e(i10, m2324g);
        boolean m2810G = m2810G(m2817e, list, map);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!m2810G) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f2640g + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> m2806B = m2806B(list, arrayList, m2809F);
        Map<InterfaceC0640k2<?>, List<Size>> m2818f = m2818f(map, m2817e, m2806B);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = m2809F.iterator();
        while (it.hasNext()) {
            InterfaceC0640k2<?> interfaceC0640k2 = arrayList.get(it.next().intValue());
            arrayList2.add(m2839a(m2818f.get(interfaceC0640k2), interfaceC0640k2.mo3010n()));
        }
        List<List<Size>> m2825m = m2825m(arrayList2);
        HashMap hashMap8 = new HashMap();
        HashMap hashMap9 = new HashMap();
        HashMap hashMap10 = new HashMap();
        HashMap hashMap11 = new HashMap();
        boolean m2757d = C0560u2.m2757d(list, arrayList);
        int m2829q = m2829q(list);
        HashMap hashMap12 = hashMap11;
        if (!this.f2648o || m2757d) {
            hashMap = hashMap10;
            hashMap2 = hashMap9;
            hashMap3 = hashMap8;
            range = m2806B;
            list2 = m2809F;
            map2 = m2324g;
            i11 = m2829q;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            hashMap4 = hashMap12;
            list3 = null;
        } else {
            Iterator<List<Size>> it2 = m2825m.iterator();
            List<AbstractC0612d2> list6 = null;
            while (true) {
                if (!it2.hasNext()) {
                    hashMap2 = hashMap9;
                    hashMap3 = hashMap8;
                    range = m2806B;
                    list2 = m2809F;
                    map2 = m2324g;
                    i11 = m2829q;
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
                map2 = m2324g;
                Range<Integer> range2 = m2806B;
                List<Integer> list7 = m2809F;
                range = range2;
                str = str8;
                int i14 = m2829q;
                i11 = m2829q;
                str2 = str7;
                list2 = m2809F;
                str5 = str6;
                list6 = m2841r(m2817e, (List) m2805A(i10, list, it2.next(), arrayList, list7, i14, hashMap14, hashMap13).first);
                hashMap = hashMap14;
                hashMap4 = hashMap13;
                if (list6 != null && !C0560u2.m2754a(hashMap, hashMap4, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (C0560u2.m2756c(this.f2642i, list6)) {
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
                m2324g = map2;
                hashMap9 = hashMap2;
                hashMap8 = hashMap3;
                m2806B = range;
                m2829q = i11;
                m2809F = list2;
            }
            if (list6 == null && !m2810G) {
                throw new IllegalArgumentException(str + this.f2640g + str5 + list + str2 + arrayList);
            }
            list3 = list6;
        }
        Iterator<List<Size>> it3 = m2825m.iterator();
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
            Pair<List<AbstractC0612d2>, Integer> m2805A = m2805A(i10, list, next, arrayList, list2, i11, null, null);
            List<AbstractC0612d2> list10 = (List) m2805A.first;
            i16 = ((Integer) m2805A.second).intValue();
            int i19 = i11;
            boolean z13 = range == null || i19 <= i16 || i16 >= range.getLower().intValue();
            if (z11 || !m2840c(m2817e, list10)) {
                i12 = i18;
                i13 = C5101a.e.API_PRIORITY_OTHER;
            } else {
                i12 = i18;
                i13 = C5101a.e.API_PRIORITY_OTHER;
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
            if (list3 == null || z12 || m2841r(m2817e, list10) == null) {
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
            throw new IllegalArgumentException(str3 + this.f2640g + " and Hardware level: " + this.f2644k + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        Range<Integer> m2826n = range != null ? m2826n(range, i16) : null;
        Iterator<InterfaceC0640k2<?>> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            InterfaceC0640k2<?> next2 = it4.next();
            List<Integer> list11 = list2;
            Map<InterfaceC0640k2<?>, C12048y> map3 = map2;
            Iterator<InterfaceC0640k2<?>> it5 = it4;
            AbstractC0604b2.a mo2994d = AbstractC0604b2.m2985a(list4.get(list11.indexOf(Integer.valueOf(arrayList.indexOf(next2))))).mo2992b((C12048y) C0984h.m4833k(map3.get(next2))).mo2994d(C0560u2.m2758e(next2));
            if (m2826n != null) {
                mo2994d.mo2993c(m2826n);
            }
            hashMap2.put(next2, mo2994d.mo2991a());
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
                if (!C0560u2.m2764k(this.f2642i, list, hashMap15, hashMap7)) {
                    C0560u2.m2765l(hashMap15, hashMap7, hashMap6, hashMap5, list3);
                }
                return new Pair<>(hashMap15, hashMap7);
            }
        }
        hashMap7 = hashMap3;
        return new Pair<>(hashMap15, hashMap7);
    }
}
