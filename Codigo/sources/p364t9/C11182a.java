package p364t9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: t9.a */
/* loaded from: classes.dex */
public class C11182a extends AbstractC7138a {
    public static final Parcelable.Creator<C11182a> CREATOR = new C11192k();

    /* renamed from: a */
    final int f29112a;

    /* renamed from: b */
    private boolean f29113b;

    /* renamed from: c */
    private long f29114c;

    /* renamed from: d */
    private final boolean f29115d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11182a(int i10, boolean z10, long j10, boolean z11) {
        this.f29112a = i10;
        this.f29113b = z10;
        this.f29114c = j10;
        this.f29115d = z11;
    }

    /* renamed from: u1 */
    public long m35043u1() {
        return this.f29114c;
    }

    /* renamed from: v1 */
    public boolean m35044v1() {
        return this.f29115d;
    }

    /* renamed from: w1 */
    public boolean m35045w1() {
        return this.f29113b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f29112a);
        C7140c.m21215g(parcel, 2, m35045w1());
        C7140c.m21234z(parcel, 3, m35043u1());
        C7140c.m21215g(parcel, 4, m35044v1());
        C7140c.m21210b(parcel, m21209a);
    }
}
