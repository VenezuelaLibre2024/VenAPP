package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    final b f5428a;

    /* renamed from: b, reason: collision with root package name */
    a f5429b = new a();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f5430a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f5431b;

        /* renamed from: c, reason: collision with root package name */
        int f5432c;

        /* renamed from: d, reason: collision with root package name */
        int f5433d;

        /* renamed from: e, reason: collision with root package name */
        int f5434e;

        a() {
        }

        void a(int i10) {
            this.f5430a = i10 | this.f5430a;
        }

        boolean b() {
            int i10 = this.f5430a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f5433d, this.f5431b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f5430a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f5433d, this.f5432c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f5430a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f5434e, this.f5431b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f5430a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f5434e, this.f5432c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f5430a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f5431b = i10;
            this.f5432c = i11;
            this.f5433d = i12;
            this.f5434e = i13;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(b bVar) {
        this.f5428a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f5428a.c();
        int d10 = this.f5428a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f5428a.a(i10);
            this.f5429b.e(c10, d10, this.f5428a.b(a10), this.f5428a.e(a10));
            if (i12 != 0) {
                this.f5429b.d();
                this.f5429b.a(i12);
                if (this.f5429b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f5429b.d();
                this.f5429b.a(i13);
                if (this.f5429b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }
}
