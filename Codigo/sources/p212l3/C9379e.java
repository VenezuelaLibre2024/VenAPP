package p212l3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p095f3.C7291b;
import p129h3.InterfaceC7622f;
import p212l3.InterfaceC9375a;

/* renamed from: l3.e */
/* loaded from: classes.dex */
public class C9379e implements InterfaceC9375a {

    /* renamed from: b */
    private final File f22713b;

    /* renamed from: c */
    private final long f22714c;

    /* renamed from: e */
    private C7291b f22716e;

    /* renamed from: d */
    private final C9377c f22715d = new C9377c();

    /* renamed from: a */
    private final C9384j f22712a = new C9384j();

    @Deprecated
    protected C9379e(File file, long j10) {
        this.f22713b = file;
        this.f22714c = j10;
    }

    /* renamed from: c */
    public static InterfaceC9375a m27899c(File file, long j10) {
        return new C9379e(file, j10);
    }

    /* renamed from: d */
    private synchronized C7291b m27900d() {
        if (this.f22716e == null) {
            this.f22716e = C7291b.m21819Q(this.f22713b, 1, 1, this.f22714c);
        }
        return this.f22716e;
    }

    /* renamed from: e */
    private synchronized void m27901e() {
        this.f22716e = null;
    }

    @Override // p212l3.InterfaceC9375a
    /* renamed from: a */
    public void mo27892a(InterfaceC7622f interfaceC7622f, InterfaceC9375a.b bVar) {
        C7291b m27900d;
        String m27919b = this.f22712a.m27919b(interfaceC7622f);
        this.f22715d.m27894a(m27919b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m27919b + " for for Key: " + interfaceC7622f);
            }
            try {
                m27900d = m27900d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (m27900d.m21839I(m27919b) != null) {
                return;
            }
            C7291b.c m21838B = m27900d.m21838B(m27919b);
            if (m21838B == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + m27919b);
            }
            try {
                if (bVar.mo26189a(m21838B.m21848f(0))) {
                    m21838B.m21847e();
                }
                m21838B.m21846b();
            } catch (Throwable th2) {
                m21838B.m21846b();
                throw th2;
            }
        } finally {
            this.f22715d.m27895b(m27919b);
        }
    }

    @Override // p212l3.InterfaceC9375a
    /* renamed from: b */
    public File mo27893b(InterfaceC7622f interfaceC7622f) {
        String m27919b = this.f22712a.m27919b(interfaceC7622f);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m27919b + " for for Key: " + interfaceC7622f);
        }
        try {
            C7291b.e m21839I = m27900d().m21839I(m27919b);
            if (m21839I != null) {
                return m21839I.m21863a(0);
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

    @Override // p212l3.InterfaceC9375a
    public synchronized void clear() {
        try {
            try {
                m27900d().m21841r();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
        } finally {
            m27901e();
        }
    }
}
