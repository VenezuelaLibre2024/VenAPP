package k3;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class o implements l {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f20310d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f20311e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f20312f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f20313g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f20314h;

    /* renamed from: a, reason: collision with root package name */
    private final c f20315a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g<b, Bitmap> f20316b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f20317c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20318a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f20318a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20318a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20318a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20318a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final c f20319a;

        /* renamed from: b, reason: collision with root package name */
        int f20320b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f20321c;

        public b(c cVar) {
            this.f20319a = cVar;
        }

        @Override // k3.m
        public void a() {
            this.f20319a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f20320b = i10;
            this.f20321c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20320b == bVar.f20320b && c4.l.d(this.f20321c, bVar.f20321c);
        }

        public int hashCode() {
            int i10 = this.f20320b * 31;
            Bitmap.Config config = this.f20321c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f20320b, this.f20321c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends k3.c<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // k3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b b10 = b();
            b10.b(i10, config);
            return b10;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f20310d = configArr;
        f20311e = configArr;
        f20312f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f20313g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f20314h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j10 = j(bitmap.getConfig());
        Integer num2 = j10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j10.remove(num);
                return;
            } else {
                j10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b e10 = this.f20315a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i10));
            if (ceilingKey != null && ceilingKey.intValue() <= i10 * 8) {
                if (ceilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return e10;
                        }
                    } else if (config2.equals(config)) {
                        return e10;
                    }
                }
                this.f20315a.c(e10);
                return this.f20315a.e(ceilingKey.intValue(), config2);
            }
        }
        return e10;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f20311e;
            }
        }
        int i10 = a.f20318a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f20314h : f20313g : f20312f : f20310d;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f20317c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f20317c.put(config, treeMap);
        return treeMap;
    }

    @Override // k3.l
    public String a(Bitmap bitmap) {
        return h(c4.l.h(bitmap), bitmap.getConfig());
    }

    @Override // k3.l
    public String b(int i10, int i11, Bitmap.Config config) {
        return h(c4.l.g(i10, i11, config), config);
    }

    @Override // k3.l
    public void c(Bitmap bitmap) {
        b e10 = this.f20315a.e(c4.l.h(bitmap), bitmap.getConfig());
        this.f20316b.d(e10, bitmap);
        NavigableMap<Integer, Integer> j10 = j(bitmap.getConfig());
        Integer num = j10.get(Integer.valueOf(e10.f20320b));
        j10.put(Integer.valueOf(e10.f20320b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // k3.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b g10 = g(c4.l.g(i10, i11, config), config);
        Bitmap a10 = this.f20316b.a(g10);
        if (a10 != null) {
            f(Integer.valueOf(g10.f20320b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    @Override // k3.l
    public int e(Bitmap bitmap) {
        return c4.l.h(bitmap);
    }

    @Override // k3.l
    public Bitmap removeLast() {
        Bitmap f10 = this.f20316b.f();
        if (f10 != null) {
            f(Integer.valueOf(c4.l.h(f10)), f10);
        }
        return f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f20316b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f20317c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f20317c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
