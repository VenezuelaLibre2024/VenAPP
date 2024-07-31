package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
class C1412l {

    /* renamed from: a */
    final b f6253a;

    /* renamed from: b */
    a f6254b = new a();

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        int f6255a = 0;

        /* renamed from: b */
        int f6256b;

        /* renamed from: c */
        int f6257c;

        /* renamed from: d */
        int f6258d;

        /* renamed from: e */
        int f6259e;

        a() {
        }

        /* renamed from: a */
        void m8092a(int i10) {
            this.f6255a = i10 | this.f6255a;
        }

        /* renamed from: b */
        boolean m8093b() {
            int i10 = this.f6255a;
            if ((i10 & 7) != 0 && (i10 & (m8094c(this.f6258d, this.f6256b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f6255a;
            if ((i11 & 112) != 0 && (i11 & (m8094c(this.f6258d, this.f6257c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f6255a;
            if ((i12 & 1792) != 0 && (i12 & (m8094c(this.f6259e, this.f6256b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f6255a;
            return (i13 & 28672) == 0 || (i13 & (m8094c(this.f6259e, this.f6257c) << 12)) != 0;
        }

        /* renamed from: c */
        int m8094c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* renamed from: d */
        void m8095d() {
            this.f6255a = 0;
        }

        /* renamed from: e */
        void m8096e(int i10, int i11, int i12, int i13) {
            this.f6256b = i10;
            this.f6257c = i11;
            this.f6258d = i12;
            this.f6259e = i13;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: classes.dex */
    interface b {
        /* renamed from: a */
        View mo7867a(int i10);

        /* renamed from: b */
        int mo7868b(View view);

        /* renamed from: c */
        int mo7869c();

        /* renamed from: d */
        int mo7870d();

        /* renamed from: e */
        int mo7871e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1412l(b bVar) {
        this.f6253a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m8091a(int i10, int i11, int i12, int i13) {
        int mo7869c = this.f6253a.mo7869c();
        int mo7870d = this.f6253a.mo7870d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View mo7867a = this.f6253a.mo7867a(i10);
            this.f6254b.m8096e(mo7869c, mo7870d, this.f6253a.mo7868b(mo7867a), this.f6253a.mo7871e(mo7867a));
            if (i12 != 0) {
                this.f6254b.m8095d();
                this.f6254b.m8092a(i12);
                if (this.f6254b.m8093b()) {
                    return mo7867a;
                }
            }
            if (i13 != 0) {
                this.f6254b.m8095d();
                this.f6254b.m8092a(i13);
                if (this.f6254b.m8093b()) {
                    view = mo7867a;
                }
            }
            i10 += i14;
        }
        return view;
    }
}
