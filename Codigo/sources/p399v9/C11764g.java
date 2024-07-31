package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.g */
/* loaded from: classes.dex */
public class C11764g extends AbstractC7138a {
    public static final Parcelable.Creator<C11764g> CREATOR = new C11781x();

    /* renamed from: a */
    private final C11767j f31150a;

    /* renamed from: b */
    private final String f31151b;

    /* renamed from: c */
    private final int f31152c;

    /* renamed from: v9.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C11767j f31153a;

        /* renamed from: b */
        private String f31154b;

        /* renamed from: c */
        private int f31155c;

        /* renamed from: a */
        public C11764g m37230a() {
            return new C11764g(this.f31153a, this.f31154b, this.f31155c);
        }

        /* renamed from: b */
        public a m37231b(C11767j c11767j) {
            this.f31153a = c11767j;
            return this;
        }

        /* renamed from: c */
        public final a m37232c(String str) {
            this.f31154b = str;
            return this;
        }

        /* renamed from: d */
        public final a m37233d(int i10) {
            this.f31155c = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11764g(C11767j c11767j, String str, int i10) {
        this.f31150a = (C11767j) C5276s.m13324j(c11767j);
        this.f31151b = str;
        this.f31152c = i10;
    }

    /* renamed from: u1 */
    public static a m37227u1() {
        return new a();
    }

    /* renamed from: w1 */
    public static a m37228w1(C11764g c11764g) {
        C5276s.m13324j(c11764g);
        a m37227u1 = m37227u1();
        m37227u1.m37231b(c11764g.m37229v1());
        m37227u1.m37233d(c11764g.f31152c);
        String str = c11764g.f31151b;
        if (str != null) {
            m37227u1.m37232c(str);
        }
        return m37227u1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11764g)) {
            return false;
        }
        C11764g c11764g = (C11764g) obj;
        return C5270q.m13304b(this.f31150a, c11764g.f31150a) && C5270q.m13304b(this.f31151b, c11764g.f31151b) && this.f31152c == c11764g.f31152c;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31150a, this.f31151b);
    }

    /* renamed from: v1 */
    public C11767j m37229v1() {
        return this.f31150a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, m37229v1(), i10, false);
        C7140c.m21200G(parcel, 2, this.f31151b, false);
        C7140c.m21229u(parcel, 3, this.f31152c);
        C7140c.m21210b(parcel, m21209a);
    }
}
