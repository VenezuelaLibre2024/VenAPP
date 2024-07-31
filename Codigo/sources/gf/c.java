package gf;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import java.util.Random;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static final Random f16239f = new Random();

    /* renamed from: g, reason: collision with root package name */
    static e f16240g = new f();

    /* renamed from: h, reason: collision with root package name */
    static la.f f16241h = la.i.d();

    /* renamed from: a, reason: collision with root package name */
    private final Context f16242a;

    /* renamed from: b, reason: collision with root package name */
    private final oc.b f16243b;

    /* renamed from: c, reason: collision with root package name */
    private final jc.b f16244c;

    /* renamed from: d, reason: collision with root package name */
    private long f16245d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f16246e;

    public c(Context context, oc.b bVar, jc.b bVar2, long j10) {
        this.f16242a = context;
        this.f16243b = bVar;
        this.f16244c = bVar2;
        this.f16245d = j10;
    }

    public void a() {
        this.f16246e = true;
    }

    public boolean b(int i10) {
        return (i10 >= 500 && i10 < 600) || i10 == -2 || i10 == 429 || i10 == 408;
    }

    public void c() {
        this.f16246e = false;
    }

    public void d(hf.e eVar) {
        e(eVar, true);
    }

    public void e(hf.e eVar, boolean z10) {
        s.j(eVar);
        long b10 = f16241h.b() + this.f16245d;
        String c10 = i.c(this.f16243b);
        String b11 = i.b(this.f16244c);
        if (z10) {
            eVar.B(c10, b11, this.f16242a);
        } else {
            eVar.D(c10, b11);
        }
        int i10 = 1000;
        while (f16241h.b() + i10 <= b10 && !eVar.v() && b(eVar.o())) {
            try {
                f16240g.a(f16239f.nextInt(250) + i10);
                if (i10 < 30000) {
                    if (eVar.o() != -2) {
                        i10 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i10 = 1000;
                    }
                }
                if (this.f16246e) {
                    return;
                }
                eVar.F();
                String c11 = i.c(this.f16243b);
                String b12 = i.b(this.f16244c);
                if (z10) {
                    eVar.B(c11, b12, this.f16242a);
                } else {
                    eVar.D(c11, b12);
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
