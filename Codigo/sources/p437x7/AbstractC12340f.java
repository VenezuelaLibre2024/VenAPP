package p437x7;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p351s8.C10818e0;
import p351s8.C10832l0;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p363t8.C11137a;
import p397v7.C11731u;

/* renamed from: x7.f */
/* loaded from: classes.dex */
public abstract class AbstractC12340f implements C10818e0.e {

    /* renamed from: a */
    public final long f33113a = C11731u.m37025a();

    /* renamed from: b */
    public final C10835n f33114b;

    /* renamed from: c */
    public final int f33115c;

    /* renamed from: d */
    public final C11108u1 f33116d;

    /* renamed from: e */
    public final int f33117e;

    /* renamed from: f */
    public final Object f33118f;

    /* renamed from: g */
    public final long f33119g;

    /* renamed from: h */
    public final long f33120h;

    /* renamed from: i */
    protected final C10832l0 f33121i;

    public AbstractC12340f(InterfaceC10827j interfaceC10827j, C10835n c10835n, int i10, C11108u1 c11108u1, int i11, Object obj, long j10, long j11) {
        this.f33121i = new C10832l0(interfaceC10827j);
        this.f33114b = (C10835n) C11137a.m34603e(c10835n);
        this.f33115c = i10;
        this.f33116d = c11108u1;
        this.f33117e = i11;
        this.f33118f = obj;
        this.f33119g = j10;
        this.f33120h = j11;
    }

    /* renamed from: a */
    public final long m39901a() {
        return this.f33121i.m33015h();
    }

    /* renamed from: d */
    public final long m39902d() {
        return this.f33120h - this.f33119g;
    }

    /* renamed from: e */
    public final Map<String, List<String>> m39903e() {
        return this.f33121i.m33017s();
    }

    /* renamed from: f */
    public final Uri m39904f() {
        return this.f33121i.m33016r();
    }
}
