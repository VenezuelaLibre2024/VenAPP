package l3;

import android.util.Log;
import f3.b;
import java.io.File;
import java.io.IOException;
import l3.a;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b */
    private final File f20891b;

    /* renamed from: c */
    private final long f20892c;

    /* renamed from: e */
    private f3.b f20894e;

    /* renamed from: d */
    private final c f20893d = new c();

    /* renamed from: a */
    private final j f20890a = new j();

    @Deprecated
    protected e(File file, long j10) {
        this.f20891b = file;
        this.f20892c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized f3.b d() {
        if (this.f20894e == null) {
            this.f20894e = f3.b.Q(this.f20891b, 1, 1, this.f20892c);
        }
        return this.f20894e;
    }

    private synchronized void e() {
        this.f20894e = null;
    }

    @Override // l3.a
    public void a(h3.f fVar, a.b bVar) {
        f3.b d10;
        String b10 = this.f20890a.b(fVar);
        this.f20893d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b10 + " for for Key: " + fVar);
            }
            try {
                d10 = d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (d10.I(b10) != null) {
                return;
            }
            b.c B = d10.B(b10);
            if (B == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + b10);
            }
            try {
                if (bVar.a(B.f(0))) {
                    B.e();
                }
                B.b();
            } catch (Throwable th2) {
                B.b();
                throw th2;
            }
        } finally {
            this.f20893d.b(b10);
        }
    }

    @Override // l3.a
    public File b(h3.f fVar) {
        String b10 = this.f20890a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b10 + " for for Key: " + fVar);
        }
        try {
            b.e I = d().I(b10);
            if (I != null) {
                return I.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // l3.a
    public synchronized void clear() {
        try {
            try {
                d().r();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
        } finally {
            e();
        }
    }
}
