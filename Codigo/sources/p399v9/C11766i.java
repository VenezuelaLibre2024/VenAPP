package p399v9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import qa.C10394t;

/* renamed from: v9.i */
/* loaded from: classes.dex */
public final class C11766i extends AbstractC7138a {
    public static final Parcelable.Creator<C11766i> CREATOR = new C11783z();

    /* renamed from: a */
    private final String f31157a;

    /* renamed from: b */
    private final String f31158b;

    /* renamed from: c */
    private final String f31159c;

    /* renamed from: d */
    private final String f31160d;

    /* renamed from: e */
    private final Uri f31161e;

    /* renamed from: f */
    private final String f31162f;

    /* renamed from: r */
    private final String f31163r;

    /* renamed from: s */
    private final String f31164s;

    /* renamed from: t */
    private final C10394t f31165t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11766i(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C10394t c10394t) {
        this.f31157a = C5276s.m13320f(str);
        this.f31158b = str2;
        this.f31159c = str3;
        this.f31160d = str4;
        this.f31161e = uri;
        this.f31162f = str5;
        this.f31163r = str6;
        this.f31164s = str7;
        this.f31165t = c10394t;
    }

    /* renamed from: A1 */
    public C10394t m37235A1() {
        return this.f31165t;
    }

    @Deprecated
    /* renamed from: E */
    public String m37236E() {
        return this.f31164s;
    }

    /* renamed from: R */
    public String m37237R() {
        return this.f31158b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11766i)) {
            return false;
        }
        C11766i c11766i = (C11766i) obj;
        return C5270q.m13304b(this.f31157a, c11766i.f31157a) && C5270q.m13304b(this.f31158b, c11766i.f31158b) && C5270q.m13304b(this.f31159c, c11766i.f31159c) && C5270q.m13304b(this.f31160d, c11766i.f31160d) && C5270q.m13304b(this.f31161e, c11766i.f31161e) && C5270q.m13304b(this.f31162f, c11766i.f31162f) && C5270q.m13304b(this.f31163r, c11766i.f31163r) && C5270q.m13304b(this.f31164s, c11766i.f31164s) && C5270q.m13304b(this.f31165t, c11766i.f31165t);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31157a, this.f31158b, this.f31159c, this.f31160d, this.f31161e, this.f31162f, this.f31163r, this.f31164s, this.f31165t);
    }

    /* renamed from: u1 */
    public String m37238u1() {
        return this.f31160d;
    }

    /* renamed from: v1 */
    public String m37239v1() {
        return this.f31159c;
    }

    /* renamed from: w1 */
    public String m37240w1() {
        return this.f31163r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, m37241x1(), false);
        C7140c.m21200G(parcel, 2, m37237R(), false);
        C7140c.m21200G(parcel, 3, m37239v1(), false);
        C7140c.m21200G(parcel, 4, m37238u1(), false);
        C7140c.m21198E(parcel, 5, m37243z1(), i10, false);
        C7140c.m21200G(parcel, 6, m37242y1(), false);
        C7140c.m21200G(parcel, 7, m37240w1(), false);
        C7140c.m21200G(parcel, 8, m37236E(), false);
        C7140c.m21198E(parcel, 9, m37235A1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public String m37241x1() {
        return this.f31157a;
    }

    /* renamed from: y1 */
    public String m37242y1() {
        return this.f31162f;
    }

    /* renamed from: z1 */
    public Uri m37243z1() {
        return this.f31161e;
    }
}
