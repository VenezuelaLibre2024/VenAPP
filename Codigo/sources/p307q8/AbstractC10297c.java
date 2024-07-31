package p307q8;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11694d1;
import p437x7.AbstractC12348n;

/* renamed from: q8.c */
/* loaded from: classes.dex */
public abstract class AbstractC10297c implements InterfaceC10312r {

    /* renamed from: a */
    protected final C11694d1 f25599a;

    /* renamed from: b */
    protected final int f25600b;

    /* renamed from: c */
    protected final int[] f25601c;

    /* renamed from: d */
    private final int f25602d;

    /* renamed from: e */
    private final C11108u1[] f25603e;

    /* renamed from: f */
    private final long[] f25604f;

    /* renamed from: g */
    private int f25605g;

    public AbstractC10297c(C11694d1 c11694d1, int... iArr) {
        this(c11694d1, iArr, 0);
    }

    public AbstractC10297c(C11694d1 c11694d1, int[] iArr, int i10) {
        int i11 = 0;
        C11137a.m34605g(iArr.length > 0);
        this.f25602d = i10;
        this.f25599a = (C11694d1) C11137a.m34603e(c11694d1);
        int length = iArr.length;
        this.f25600b = length;
        this.f25603e = new C11108u1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f25603e[i12] = c11694d1.m36849d(iArr[i12]);
        }
        Arrays.sort(this.f25603e, new Comparator() { // from class: q8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m30880w;
                m30880w = AbstractC10297c.m30880w((C11108u1) obj, (C11108u1) obj2);
                return m30880w;
            }
        });
        this.f25601c = new int[this.f25600b];
        while (true) {
            int i13 = this.f25600b;
            if (i11 >= i13) {
                this.f25604f = new long[i13];
                return;
            } else {
                this.f25601c[i11] = c11694d1.m36850e(this.f25603e[i11]);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ int m30880w(C11108u1 c11108u1, C11108u1 c11108u12) {
        return c11108u12.f28793s - c11108u1.f28793s;
    }

    @Override // p307q8.InterfaceC10315u
    /* renamed from: a */
    public final C11108u1 mo30881a(int i10) {
        return this.f25603e[i10];
    }

    @Override // p307q8.InterfaceC10315u
    /* renamed from: b */
    public final int mo30882b(int i10) {
        return this.f25601c[i10];
    }

    @Override // p307q8.InterfaceC10315u
    /* renamed from: c */
    public final int mo30883c(int i10) {
        for (int i11 = 0; i11 < this.f25600b; i11++) {
            if (this.f25601c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p307q8.InterfaceC10315u
    /* renamed from: d */
    public final C11694d1 mo30884d() {
        return this.f25599a;
    }

    @Override // p307q8.InterfaceC10315u
    /* renamed from: e */
    public final int mo30885e(C11108u1 c11108u1) {
        for (int i10 = 0; i10 < this.f25600b; i10++) {
            if (this.f25603e[i10] == c11108u1) {
                return i10;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC10297c abstractC10297c = (AbstractC10297c) obj;
        return this.f25599a == abstractC10297c.f25599a && Arrays.equals(this.f25601c, abstractC10297c.f25601c);
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: f */
    public void mo30860f() {
    }

    public int hashCode() {
        if (this.f25605g == 0) {
            this.f25605g = (System.identityHashCode(this.f25599a) * 31) + Arrays.hashCode(this.f25601c);
        }
        return this.f25605g;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: i */
    public boolean mo30886i(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean mo30887j = mo30887j(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f25600b && !mo30887j) {
            mo30887j = (i11 == i10 || mo30887j(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!mo30887j) {
            return false;
        }
        long[] jArr = this.f25604f;
        jArr[i10] = Math.max(jArr[i10], C11172r0.m34911b(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: j */
    public boolean mo30887j(int i10, long j10) {
        return this.f25604f[i10] > j10;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: l */
    public void mo30861l(float f10) {
    }

    @Override // p307q8.InterfaceC10315u
    public final int length() {
        return this.f25601c.length;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: p */
    public void mo30862p() {
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: q */
    public int mo30863q(long j10, List<? extends AbstractC12348n> list) {
        return list.size();
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: r */
    public final int mo30888r() {
        return this.f25601c[mo210h()];
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: s */
    public final C11108u1 mo30889s() {
        return this.f25603e[mo210h()];
    }
}
