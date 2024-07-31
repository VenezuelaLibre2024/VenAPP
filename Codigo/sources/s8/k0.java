package s8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import s8.k0;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f25266h = new Comparator() { // from class: s8.i0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g10;
            g10 = k0.g((k0.b) obj, (k0.b) obj2);
            return g10;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f25267i = new Comparator() { // from class: s8.j0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h10;
            h10 = k0.h((k0.b) obj, (k0.b) obj2);
            return h10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f25268a;

    /* renamed from: e, reason: collision with root package name */
    private int f25272e;

    /* renamed from: f, reason: collision with root package name */
    private int f25273f;

    /* renamed from: g, reason: collision with root package name */
    private int f25274g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f25270c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f25269b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f25271d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f25275a;

        /* renamed from: b, reason: collision with root package name */
        public int f25276b;

        /* renamed from: c, reason: collision with root package name */
        public float f25277c;

        private b() {
        }
    }

    public k0(int i10) {
        this.f25268a = i10;
    }

    private void d() {
        if (this.f25271d != 1) {
            Collections.sort(this.f25269b, f25266h);
            this.f25271d = 1;
        }
    }

    private void e() {
        if (this.f25271d != 0) {
            Collections.sort(this.f25269b, f25267i);
            this.f25271d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f25275a - bVar2.f25275a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f25277c, bVar2.f25277c);
    }

    public void c(int i10, float f10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        d();
        int i13 = this.f25274g;
        if (i13 > 0) {
            b[] bVarArr = this.f25270c;
            int i14 = i13 - 1;
            this.f25274g = i14;
            bVar = bVarArr[i14];
        } else {
            bVar = new b();
        }
        int i15 = this.f25272e;
        this.f25272e = i15 + 1;
        bVar.f25275a = i15;
        bVar.f25276b = i10;
        bVar.f25277c = f10;
        this.f25269b.add(bVar);
        int i16 = this.f25273f + i10;
        while (true) {
            this.f25273f = i16;
            while (true) {
                int i17 = this.f25273f;
                int i18 = this.f25268a;
                if (i17 <= i18) {
                    return;
                }
                i11 = i17 - i18;
                bVar2 = this.f25269b.get(0);
                i12 = bVar2.f25276b;
                if (i12 <= i11) {
                    this.f25273f -= i12;
                    this.f25269b.remove(0);
                    int i19 = this.f25274g;
                    if (i19 < 5) {
                        b[] bVarArr2 = this.f25270c;
                        this.f25274g = i19 + 1;
                        bVarArr2[i19] = bVar2;
                    }
                }
            }
            bVar2.f25276b = i12 - i11;
            i16 = this.f25273f - i11;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f25273f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25269b.size(); i11++) {
            b bVar = this.f25269b.get(i11);
            i10 += bVar.f25276b;
            if (i10 >= f11) {
                return bVar.f25277c;
            }
        }
        if (this.f25269b.isEmpty()) {
            return Float.NaN;
        }
        return this.f25269b.get(r5.size() - 1).f25277c;
    }

    public void i() {
        this.f25269b.clear();
        this.f25271d = -1;
        this.f25272e = 0;
        this.f25273f = 0;
    }
}
