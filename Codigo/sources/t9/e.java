package t9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: r, reason: collision with root package name */
    private static final androidx.collection.a f26826r;

    /* renamed from: a, reason: collision with root package name */
    final int f26827a;

    /* renamed from: b, reason: collision with root package name */
    private List f26828b;

    /* renamed from: c, reason: collision with root package name */
    private List f26829c;

    /* renamed from: d, reason: collision with root package name */
    private List f26830d;

    /* renamed from: e, reason: collision with root package name */
    private List f26831e;

    /* renamed from: f, reason: collision with root package name */
    private List f26832f;

    static {
        androidx.collection.a aVar = new androidx.collection.a();
        f26826r = aVar;
        aVar.put("registered", a.C0150a.z1("registered", 2));
        aVar.put("in_progress", a.C0150a.z1("in_progress", 3));
        aVar.put("success", a.C0150a.z1("success", 4));
        aVar.put("failed", a.C0150a.z1("failed", 5));
        aVar.put("escrowed", a.C0150a.z1("escrowed", 6));
    }

    public e() {
        this.f26827a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i10, List list, List list2, List list3, List list4, List list5) {
        this.f26827a = i10;
        this.f26828b = list;
        this.f26829c = list2;
        this.f26830d = list3;
        this.f26831e = list4;
        this.f26832f = list5;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Map getFieldMappings() {
        return f26826r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final Object getFieldValue(a.C0150a c0150a) {
        switch (c0150a.A1()) {
            case 1:
                return Integer.valueOf(this.f26827a);
            case 2:
                return this.f26828b;
            case 3:
                return this.f26829c;
            case 4:
                return this.f26830d;
            case 5:
                return this.f26831e;
            case 6:
                return this.f26832f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0150a.A1());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final boolean isFieldSet(a.C0150a c0150a) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringsInternal(a.C0150a c0150a, String str, ArrayList arrayList) {
        int A1 = c0150a.A1();
        if (A1 == 2) {
            this.f26828b = arrayList;
            return;
        }
        if (A1 == 3) {
            this.f26829c = arrayList;
            return;
        }
        if (A1 == 4) {
            this.f26830d = arrayList;
        } else if (A1 == 5) {
            this.f26831e = arrayList;
        } else {
            if (A1 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(A1)));
            }
            this.f26832f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f26827a);
        ea.c.I(parcel, 2, this.f26828b, false);
        ea.c.I(parcel, 3, this.f26829c, false);
        ea.c.I(parcel, 4, this.f26830d, false);
        ea.c.I(parcel, 5, this.f26831e, false);
        ea.c.I(parcel, 6, this.f26832f, false);
        ea.c.b(parcel, a10);
    }
}
