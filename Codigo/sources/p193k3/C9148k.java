package p193k3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: k3.k */
/* loaded from: classes.dex */
public class C9148k implements InterfaceC9141d {

    /* renamed from: k */
    private static final Bitmap.Config f22081k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final InterfaceC9149l f22082a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f22083b;

    /* renamed from: c */
    private final long f22084c;

    /* renamed from: d */
    private final a f22085d;

    /* renamed from: e */
    private long f22086e;

    /* renamed from: f */
    private long f22087f;

    /* renamed from: g */
    private int f22088g;

    /* renamed from: h */
    private int f22089h;

    /* renamed from: i */
    private int f22090i;

    /* renamed from: j */
    private int f22091j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3.k$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo26995a(Bitmap bitmap);

        /* renamed from: b */
        void mo26996b(Bitmap bitmap);
    }

    /* renamed from: k3.k$b */
    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // p193k3.C9148k.a
        /* renamed from: a */
        public void mo26995a(Bitmap bitmap) {
        }

        @Override // p193k3.C9148k.a
        /* renamed from: b */
        public void mo26996b(Bitmap bitmap) {
        }
    }

    public C9148k(long j10) {
        this(j10, m26989l(), m26988k());
    }

    C9148k(long j10, InterfaceC9149l interfaceC9149l, Set<Bitmap.Config> set) {
        this.f22084c = j10;
        this.f22086e = j10;
        this.f22082a = interfaceC9149l;
        this.f22083b = set;
        this.f22085d = new b();
    }

    /* renamed from: f */
    private static void m26983f(Bitmap.Config config) {
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

    /* renamed from: g */
    private static Bitmap m26984g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f22081k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    /* renamed from: h */
    private void m26985h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m26986i();
        }
    }

    /* renamed from: i */
    private void m26986i() {
        Log.v("LruBitmapPool", "Hits=" + this.f22088g + ", misses=" + this.f22089h + ", puts=" + this.f22090i + ", evictions=" + this.f22091j + ", currentSize=" + this.f22087f + ", maxSize=" + this.f22086e + "\nStrategy=" + this.f22082a);
    }

    /* renamed from: j */
    private void m26987j() {
        m26993q(this.f22086e);
    }

    /* renamed from: k */
    private static Set<Bitmap.Config> m26988k() {
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

    /* renamed from: l */
    private static InterfaceC9149l m26989l() {
        return new C9152o();
    }

    /* renamed from: m */
    private synchronized Bitmap m26990m(int i10, int i11, Bitmap.Config config) {
        Bitmap mo27000d;
        m26983f(config);
        mo27000d = this.f22082a.mo27000d(i10, i11, config != null ? config : f22081k);
        if (mo27000d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f22082a.mo26998b(i10, i11, config));
            }
            this.f22089h++;
        } else {
            this.f22088g++;
            this.f22087f -= this.f22082a.mo27001e(mo27000d);
            this.f22085d.mo26995a(mo27000d);
            m26992p(mo27000d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f22082a.mo26998b(i10, i11, config));
        }
        m26985h();
        return mo27000d;
    }

    /* renamed from: o */
    private static void m26991o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    private static void m26992p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m26991o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m26993q(long j10) {
        while (this.f22087f > j10) {
            Bitmap removeLast = this.f22082a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m26986i();
                }
                this.f22087f = 0L;
                return;
            }
            this.f22085d.mo26995a(removeLast);
            this.f22087f -= this.f22082a.mo27001e(removeLast);
            this.f22091j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f22082a.mo26997a(removeLast));
            }
            m26985h();
            removeLast.recycle();
        }
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: a */
    public void mo26948a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            mo26949b();
        } else if (i10 >= 20 || i10 == 15) {
            m26993q(m26994n() / 2);
        }
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: b */
    public void mo26949b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m26993q(0L);
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: c */
    public synchronized void mo26950c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f22082a.mo27001e(bitmap) <= this.f22086e && this.f22083b.contains(bitmap.getConfig())) {
                int mo27001e = this.f22082a.mo27001e(bitmap);
                this.f22082a.mo26999c(bitmap);
                this.f22085d.mo26996b(bitmap);
                this.f22090i++;
                this.f22087f += mo27001e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f22082a.mo26997a(bitmap));
                }
                m26985h();
                m26987j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f22082a.mo26997a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f22083b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: d */
    public Bitmap mo26951d(int i10, int i11, Bitmap.Config config) {
        Bitmap m26990m = m26990m(i10, i11, config);
        if (m26990m == null) {
            return m26984g(i10, i11, config);
        }
        m26990m.eraseColor(0);
        return m26990m;
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: e */
    public Bitmap mo26952e(int i10, int i11, Bitmap.Config config) {
        Bitmap m26990m = m26990m(i10, i11, config);
        return m26990m == null ? m26984g(i10, i11, config) : m26990m;
    }

    /* renamed from: n */
    public long m26994n() {
        return this.f22086e;
    }
}
