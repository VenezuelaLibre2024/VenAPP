package k3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f20299k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final l f20300a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f20301b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20302c;

    /* renamed from: d, reason: collision with root package name */
    private final a f20303d;

    /* renamed from: e, reason: collision with root package name */
    private long f20304e;

    /* renamed from: f, reason: collision with root package name */
    private long f20305f;

    /* renamed from: g, reason: collision with root package name */
    private int f20306g;

    /* renamed from: h, reason: collision with root package name */
    private int f20307h;

    /* renamed from: i, reason: collision with root package name */
    private int f20308i;

    /* renamed from: j, reason: collision with root package name */
    private int f20309j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // k3.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // k3.k.a
        public void b(Bitmap bitmap) {
        }
    }

    public k(long j10) {
        this(j10, l(), k());
    }

    k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f20302c = j10;
        this.f20304e = j10;
        this.f20300a = lVar;
        this.f20301b = set;
        this.f20303d = new b();
    }

    private static void f(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f20299k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f20306g + ", misses=" + this.f20307h + ", puts=" + this.f20308i + ", evictions=" + this.f20309j + ", currentSize=" + this.f20305f + ", maxSize=" + this.f20304e + "\nStrategy=" + this.f20300a);
    }

    private void j() {
        q(this.f20304e);
    }

    private static Set<Bitmap.Config> k() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        return new o();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap d10;
        f(config);
        d10 = this.f20300a.d(i10, i11, config != null ? config : f20299k);
        if (d10 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f20300a.b(i10, i11, config));
            }
            this.f20307h++;
        } else {
            this.f20306g++;
            this.f20305f -= this.f20300a.e(d10);
            this.f20303d.a(d10);
            p(d10);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f20300a.b(i10, i11, config));
        }
        h();
        return d10;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f20305f > j10) {
            Bitmap removeLast = this.f20300a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.f20305f = 0L;
                return;
            }
            this.f20303d.a(removeLast);
            this.f20305f -= this.f20300a.e(removeLast);
            this.f20309j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f20300a.a(removeLast));
            }
            h();
            removeLast.recycle();
        }
    }

    @Override // k3.d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // k3.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // k3.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f20300a.e(bitmap) <= this.f20304e && this.f20301b.contains(bitmap.getConfig())) {
                int e10 = this.f20300a.e(bitmap);
                this.f20300a.c(bitmap);
                this.f20303d.b(bitmap);
                this.f20308i++;
                this.f20305f += e10;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f20300a.a(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f20300a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f20301b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // k3.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 == null) {
            return g(i10, i11, config);
        }
        m10.eraseColor(0);
        return m10;
    }

    @Override // k3.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        return m10 == null ? g(i10, i11, config) : m10;
    }

    public long n() {
        return this.f20304e;
    }
}
