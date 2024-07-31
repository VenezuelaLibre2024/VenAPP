package ua;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.y */
/* loaded from: classes2.dex */
public final class C11524y extends AbstractC7138a {
    public static final Parcelable.Creator<C11524y> CREATOR = new C11489g0();

    /* renamed from: a */
    private final float f29896a;

    /* renamed from: b */
    private final int f29897b;

    /* renamed from: c */
    private final int f29898c;

    /* renamed from: d */
    private final boolean f29899d;

    /* renamed from: e */
    private final C11522x f29900e;

    /* renamed from: ua.y$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private float f29901a;

        /* renamed from: b */
        private int f29902b;

        /* renamed from: c */
        private int f29903c;

        /* renamed from: d */
        private boolean f29904d;

        /* renamed from: e */
        private C11522x f29905e;

        public a(C11524y c11524y) {
            this.f29901a = c11524y.m36081w1();
            Pair m36082x1 = c11524y.m36082x1();
            this.f29902b = ((Integer) m36082x1.first).intValue();
            this.f29903c = ((Integer) m36082x1.second).intValue();
            this.f29904d = c11524y.m36080v1();
            this.f29905e = c11524y.m36079u1();
        }

        /* renamed from: a */
        public C11524y m36083a() {
            return new C11524y(this.f29901a, this.f29902b, this.f29903c, this.f29904d, this.f29905e);
        }

        /* renamed from: b */
        public final a m36084b(boolean z10) {
            this.f29904d = z10;
            return this;
        }

        /* renamed from: c */
        public final a m36085c(float f10) {
            this.f29901a = f10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11524y(float f10, int i10, int i11, boolean z10, C11522x c11522x) {
        this.f29896a = f10;
        this.f29897b = i10;
        this.f29898c = i11;
        this.f29899d = z10;
        this.f29900e = c11522x;
    }

    /* renamed from: u1 */
    public C11522x m36079u1() {
        return this.f29900e;
    }

    /* renamed from: v1 */
    public boolean m36080v1() {
        return this.f29899d;
    }

    /* renamed from: w1 */
    public final float m36081w1() {
        return this.f29896a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21225q(parcel, 2, this.f29896a);
        C7140c.m21229u(parcel, 3, this.f29897b);
        C7140c.m21229u(parcel, 4, this.f29898c);
        C7140c.m21215g(parcel, 5, m36080v1());
        C7140c.m21198E(parcel, 6, m36079u1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public final Pair m36082x1() {
        return new Pair(Integer.valueOf(this.f29897b), Integer.valueOf(this.f29898c));
    }
}
