package ja;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends ea.a implements a.b<String, Integer> {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    final int f19822a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f19823b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f19824c;

    public a() {
        this.f19822a = 1;
        this.f19823b = new HashMap();
        this.f19824c = new SparseArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, ArrayList arrayList) {
        this.f19822a = i10;
        this.f19823b = new HashMap();
        this.f19824c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            u1(dVar.f19828b, dVar.f19829c);
        }
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final /* bridge */ /* synthetic */ Object D0(Object obj) {
        String str = (String) this.f19824c.get(((Integer) obj).intValue());
        return (str == null && this.f19823b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final /* bridge */ /* synthetic */ Object I0(Object obj) {
        Integer num = (Integer) this.f19823b.get((String) obj);
        return num == null ? (Integer) this.f19823b.get("gms_unknown") : num;
    }

    public a u1(String str, int i10) {
        this.f19823b.put(str, Integer.valueOf(i10));
        this.f19824c.put(i10, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f19822a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f19823b.keySet()) {
            arrayList.add(new d(str, ((Integer) this.f19823b.get(str)).intValue()));
        }
        ea.c.K(parcel, 2, arrayList, false);
        ea.c.b(parcel, a10);
    }
}
