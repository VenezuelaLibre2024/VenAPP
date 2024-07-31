package p178ja;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.AbstractC5300a;
import java.util.ArrayList;
import java.util.HashMap;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ja.a */
/* loaded from: classes.dex */
public final class C9003a extends AbstractC7138a implements AbstractC5300a.b<String, Integer> {
    public static final Parcelable.Creator<C9003a> CREATOR = new C9007e();

    /* renamed from: a */
    final int f21601a;

    /* renamed from: b */
    private final HashMap f21602b;

    /* renamed from: c */
    private final SparseArray f21603c;

    public C9003a() {
        this.f21601a = 1;
        this.f21602b = new HashMap();
        this.f21603c = new SparseArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9003a(int i10, ArrayList arrayList) {
        this.f21601a = i10;
        this.f21602b = new HashMap();
        this.f21603c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C9006d c9006d = (C9006d) arrayList.get(i11);
            m26421u1(c9006d.f21607b, c9006d.f21608c);
        }
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a.b
    /* renamed from: D0 */
    public final /* bridge */ /* synthetic */ Object mo13385D0(Object obj) {
        String str = (String) this.f21603c.get(((Integer) obj).intValue());
        return (str == null && this.f21602b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a.b
    /* renamed from: I0 */
    public final /* bridge */ /* synthetic */ Object mo13386I0(Object obj) {
        Integer num = (Integer) this.f21602b.get((String) obj);
        return num == null ? (Integer) this.f21602b.get("gms_unknown") : num;
    }

    /* renamed from: u1 */
    public C9003a m26421u1(String str, int i10) {
        this.f21602b.put(str, Integer.valueOf(i10));
        this.f21603c.put(i10, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f21601a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f21602b.keySet()) {
            arrayList.add(new C9006d(str, ((Integer) this.f21602b.get(str)).intValue()));
        }
        C7140c.m21204K(parcel, 2, arrayList, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
