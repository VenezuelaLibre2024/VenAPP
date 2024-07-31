package p105fd;

import android.net.Uri;
import android.os.Bundle;
import gd.C7545a;
import gd.C7547c;
import la.C9464i;

/* renamed from: fd.c */
/* loaded from: classes.dex */
public class C7330c {

    /* renamed from: a */
    private final C7547c f16527a;

    /* renamed from: b */
    private final C7545a f16528b;

    public C7330c(C7545a c7545a) {
        if (c7545a == null) {
            this.f16528b = null;
            this.f16527a = null;
        } else {
            if (c7545a.m22904u1() == 0) {
                c7545a.m22903A1(C9464i.m28142d().mo28130a());
            }
            this.f16528b = c7545a;
            this.f16527a = new C7547c(c7545a);
        }
    }

    /* renamed from: a */
    public long m22026a() {
        C7545a c7545a = this.f16528b;
        if (c7545a == null) {
            return 0L;
        }
        return c7545a.m22904u1();
    }

    /* renamed from: b */
    public Uri m22027b() {
        String m22905v1;
        C7545a c7545a = this.f16528b;
        if (c7545a == null || (m22905v1 = c7545a.m22905v1()) == null) {
            return null;
        }
        return Uri.parse(m22905v1);
    }

    /* renamed from: c */
    public int m22028c() {
        C7545a c7545a = this.f16528b;
        if (c7545a == null) {
            return 0;
        }
        return c7545a.m22908y1();
    }

    /* renamed from: d */
    public Bundle m22029d() {
        C7547c c7547c = this.f16527a;
        return c7547c == null ? new Bundle() : c7547c.m22915a();
    }
}
