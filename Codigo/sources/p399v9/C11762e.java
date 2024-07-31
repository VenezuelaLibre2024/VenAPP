package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.e */
/* loaded from: classes.dex */
public class C11762e extends AbstractC7138a {
    public static final Parcelable.Creator<C11762e> CREATOR = new C11775r();

    /* renamed from: a */
    private final String f31137a;

    /* renamed from: b */
    private final String f31138b;

    /* renamed from: c */
    private final String f31139c;

    /* renamed from: d */
    private final String f31140d;

    /* renamed from: e */
    private final boolean f31141e;

    /* renamed from: f */
    private final int f31142f;

    /* renamed from: v9.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f31143a;

        /* renamed from: b */
        private String f31144b;

        /* renamed from: c */
        private String f31145c;

        /* renamed from: d */
        private String f31146d;

        /* renamed from: e */
        private boolean f31147e;

        /* renamed from: f */
        private int f31148f;

        /* renamed from: a */
        public C11762e m37219a() {
            return new C11762e(this.f31143a, this.f31144b, this.f31145c, this.f31146d, this.f31147e, this.f31148f);
        }

        /* renamed from: b */
        public a m37220b(String str) {
            this.f31144b = str;
            return this;
        }

        /* renamed from: c */
        public a m37221c(String str) {
            this.f31146d = str;
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public a m37222d(boolean z10) {
            this.f31147e = z10;
            return this;
        }

        /* renamed from: e */
        public a m37223e(String str) {
            C5276s.m13324j(str);
            this.f31143a = str;
            return this;
        }

        /* renamed from: f */
        public final a m37224f(String str) {
            this.f31145c = str;
            return this;
        }

        /* renamed from: g */
        public final a m37225g(int i10) {
            this.f31148f = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11762e(String str, String str2, String str3, String str4, boolean z10, int i10) {
        C5276s.m13324j(str);
        this.f31137a = str;
        this.f31138b = str2;
        this.f31139c = str3;
        this.f31140d = str4;
        this.f31141e = z10;
        this.f31142f = i10;
    }

    /* renamed from: u1 */
    public static a m37213u1() {
        return new a();
    }

    /* renamed from: z1 */
    public static a m37214z1(C11762e c11762e) {
        C5276s.m13324j(c11762e);
        a m37213u1 = m37213u1();
        m37213u1.m37223e(c11762e.m37217x1());
        m37213u1.m37221c(c11762e.m37216w1());
        m37213u1.m37220b(c11762e.m37215v1());
        m37213u1.m37222d(c11762e.f31141e);
        m37213u1.m37225g(c11762e.f31142f);
        String str = c11762e.f31139c;
        if (str != null) {
            m37213u1.m37224f(str);
        }
        return m37213u1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11762e)) {
            return false;
        }
        C11762e c11762e = (C11762e) obj;
        return C5270q.m13304b(this.f31137a, c11762e.f31137a) && C5270q.m13304b(this.f31140d, c11762e.f31140d) && C5270q.m13304b(this.f31138b, c11762e.f31138b) && C5270q.m13304b(Boolean.valueOf(this.f31141e), Boolean.valueOf(c11762e.f31141e)) && this.f31142f == c11762e.f31142f;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31137a, this.f31138b, this.f31140d, Boolean.valueOf(this.f31141e), Integer.valueOf(this.f31142f));
    }

    /* renamed from: v1 */
    public String m37215v1() {
        return this.f31138b;
    }

    /* renamed from: w1 */
    public String m37216w1() {
        return this.f31140d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, m37217x1(), false);
        C7140c.m21200G(parcel, 2, m37215v1(), false);
        C7140c.m21200G(parcel, 3, this.f31139c, false);
        C7140c.m21200G(parcel, 4, m37216w1(), false);
        C7140c.m21215g(parcel, 5, m37218y1());
        C7140c.m21229u(parcel, 6, this.f31142f);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public String m37217x1() {
        return this.f31137a;
    }

    @Deprecated
    /* renamed from: y1 */
    public boolean m37218y1() {
        return this.f31141e;
    }
}
