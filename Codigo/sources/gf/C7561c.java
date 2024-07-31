package gf;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import java.util.Random;
import la.C9464i;
import la.InterfaceC9461f;
import p141hf.AbstractC7722e;
import p180jc.InterfaceC9036b;
import p272oc.InterfaceC9835b;

/* renamed from: gf.c */
/* loaded from: classes2.dex */
public class C7561c {

    /* renamed from: f */
    private static final Random f17876f = new Random();

    /* renamed from: g */
    static InterfaceC7563e f17877g = new C7564f();

    /* renamed from: h */
    static InterfaceC9461f f17878h = C9464i.m28142d();

    /* renamed from: a */
    private final Context f17879a;

    /* renamed from: b */
    private final InterfaceC9835b f17880b;

    /* renamed from: c */
    private final InterfaceC9036b f17881c;

    /* renamed from: d */
    private long f17882d;

    /* renamed from: e */
    private volatile boolean f17883e;

    public C7561c(Context context, InterfaceC9835b interfaceC9835b, InterfaceC9036b interfaceC9036b, long j10) {
        this.f17879a = context;
        this.f17880b = interfaceC9835b;
        this.f17881c = interfaceC9036b;
        this.f17882d = j10;
    }

    /* renamed from: a */
    public void m22956a() {
        this.f17883e = true;
    }

    /* renamed from: b */
    public boolean m22957b(int i10) {
        return (i10 >= 500 && i10 < 600) || i10 == -2 || i10 == 429 || i10 == 408;
    }

    /* renamed from: c */
    public void m22958c() {
        this.f17883e = false;
    }

    /* renamed from: d */
    public void m22959d(AbstractC7722e abstractC7722e) {
        m22960e(abstractC7722e, true);
    }

    /* renamed from: e */
    public void m22960e(AbstractC7722e abstractC7722e, boolean z10) {
        C5276s.m13324j(abstractC7722e);
        long mo28131b = f17878h.mo28131b() + this.f17882d;
        String m22971c = C7567i.m22971c(this.f17880b);
        String m22970b = C7567i.m22970b(this.f17881c);
        if (z10) {
            abstractC7722e.m23549B(m22971c, m22970b, this.f17879a);
        } else {
            abstractC7722e.m23551D(m22971c, m22970b);
        }
        int i10 = 1000;
        while (f17878h.mo28131b() + i10 <= mo28131b && !abstractC7722e.m23568v() && m22957b(abstractC7722e.m23562o())) {
            try {
                f17877g.mo22964a(f17876f.nextInt(250) + i10);
                if (i10 < 30000) {
                    if (abstractC7722e.m23562o() != -2) {
                        i10 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i10 = 1000;
                    }
                }
                if (this.f17883e) {
                    return;
                }
                abstractC7722e.m23552F();
                String m22971c2 = C7567i.m22971c(this.f17880b);
                String m22970b2 = C7567i.m22970b(this.f17881c);
                if (z10) {
                    abstractC7722e.m23549B(m22971c2, m22970b2, this.f17879a);
                } else {
                    abstractC7722e.m23551D(m22971c2, m22970b2);
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
