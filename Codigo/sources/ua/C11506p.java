package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.p */
/* loaded from: classes2.dex */
public class C11506p extends AbstractC7138a {
    public static final Parcelable.Creator<C11506p> CREATOR = new C11521w0();

    /* renamed from: a */
    private final int f29863a;

    /* renamed from: b */
    private final int f29864b;

    /* renamed from: c */
    private final a f29865c;

    /* renamed from: ua.p$a */
    /* loaded from: classes2.dex */
    public static class a extends AbstractC7138a {
        public static final Parcelable.Creator<a> CREATOR = new C11507p0();

        /* renamed from: a */
        private String f29866a;

        /* renamed from: b */
        private C11478b f29867b;

        /* renamed from: c */
        private int f29868c;

        /* renamed from: d */
        private int f29869d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, IBinder iBinder, int i10, int i11) {
            this.f29868c = -5041134;
            this.f29869d = -16777216;
            this.f29866a = str;
            this.f29867b = iBinder == null ? null : new C11478b(InterfaceC5312b.a.m13410f2(iBinder));
            this.f29868c = i10;
            this.f29869d = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29868c != aVar.f29868c || !C11519v0.m36078a(this.f29866a, aVar.f29866a) || this.f29869d != aVar.f29869d) {
                return false;
            }
            C11478b c11478b = this.f29867b;
            if ((c11478b == null && aVar.f29867b != null) || (c11478b != null && aVar.f29867b == null)) {
                return false;
            }
            C11478b c11478b2 = aVar.f29867b;
            if (c11478b == null || c11478b2 == null) {
                return true;
            }
            return C11519v0.m36078a(BinderC5314d.m13411g2(c11478b.m35908a()), BinderC5314d.m13411g2(c11478b2.m35908a()));
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f29866a, this.f29867b, Integer.valueOf(this.f29868c)});
        }

        /* renamed from: u1 */
        public int m36010u1() {
            return this.f29868c;
        }

        /* renamed from: v1 */
        public String m36011v1() {
            return this.f29866a;
        }

        /* renamed from: w1 */
        public int m36012w1() {
            return this.f29869d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m21209a = C7140c.m21209a(parcel);
            C7140c.m21200G(parcel, 2, m36011v1(), false);
            C11478b c11478b = this.f29867b;
            C7140c.m21228t(parcel, 3, c11478b == null ? null : c11478b.m35908a().asBinder(), false);
            C7140c.m21229u(parcel, 4, m36010u1());
            C7140c.m21229u(parcel, 5, m36012w1());
            C7140c.m21210b(parcel, m21209a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11506p(int i10, int i11, a aVar) {
        this.f29863a = i10;
        this.f29864b = i11;
        this.f29865c = aVar;
    }

    /* renamed from: u1 */
    public int m36007u1() {
        return this.f29863a;
    }

    /* renamed from: v1 */
    public int m36008v1() {
        return this.f29864b;
    }

    /* renamed from: w1 */
    public a m36009w1() {
        return this.f29865c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, m36007u1());
        C7140c.m21229u(parcel, 3, m36008v1());
        C7140c.m21198E(parcel, 4, m36009w1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
