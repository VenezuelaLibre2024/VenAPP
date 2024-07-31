package t9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i extends zzbz {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: s, reason: collision with root package name */
    private static final HashMap f26840s;

    /* renamed from: a, reason: collision with root package name */
    final Set f26841a;

    /* renamed from: b, reason: collision with root package name */
    final int f26842b;

    /* renamed from: c, reason: collision with root package name */
    private String f26843c;

    /* renamed from: d, reason: collision with root package name */
    private int f26844d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f26845e;

    /* renamed from: f, reason: collision with root package name */
    private PendingIntent f26846f;

    /* renamed from: r, reason: collision with root package name */
    private a f26847r;

    static {
        HashMap hashMap = new HashMap();
        f26840s = hashMap;
        hashMap.put("accountType", a.C0150a.y1("accountType", 2));
        hashMap.put("status", a.C0150a.x1("status", 3));
        hashMap.put("transferBytes", a.C0150a.u1("transferBytes", 4));
    }

    public i() {
        this.f26841a = new androidx.collection.b(3);
        this.f26842b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Set set, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f26841a = set;
        this.f26842b = i10;
        this.f26843c = str;
        this.f26844d = i11;
        this.f26845e = bArr;
        this.f26846f = pendingIntent;
        this.f26847r = aVar;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f26840s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final Object getFieldValue(a.C0150a c0150a) {
        int i10;
        int A1 = c0150a.A1();
        if (A1 == 1) {
            i10 = this.f26842b;
        } else {
            if (A1 == 2) {
                return this.f26843c;
            }
            if (A1 != 3) {
                if (A1 == 4) {
                    return this.f26845e;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0150a.A1());
            }
            i10 = this.f26844d;
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.a
    public final boolean isFieldSet(a.C0150a c0150a) {
        return this.f26841a.contains(Integer.valueOf(c0150a.A1()));
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setDecodedBytesInternal(a.C0150a c0150a, String str, byte[] bArr) {
        int A1 = c0150a.A1();
        if (A1 == 4) {
            this.f26845e = bArr;
            this.f26841a.add(Integer.valueOf(A1));
        } else {
            throw new IllegalArgumentException("Field with id=" + A1 + " is not known to be an byte array.");
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setIntegerInternal(a.C0150a c0150a, String str, int i10) {
        int A1 = c0150a.A1();
        if (A1 == 3) {
            this.f26844d = i10;
            this.f26841a.add(Integer.valueOf(A1));
        } else {
            throw new IllegalArgumentException("Field with id=" + A1 + " is not known to be an int.");
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0150a c0150a, String str, String str2) {
        int A1 = c0150a.A1();
        if (A1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(A1)));
        }
        this.f26843c = str2;
        this.f26841a.add(Integer.valueOf(A1));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        Set set = this.f26841a;
        if (set.contains(1)) {
            ea.c.u(parcel, 1, this.f26842b);
        }
        if (set.contains(2)) {
            ea.c.G(parcel, 2, this.f26843c, true);
        }
        if (set.contains(3)) {
            ea.c.u(parcel, 3, this.f26844d);
        }
        if (set.contains(4)) {
            ea.c.l(parcel, 4, this.f26845e, true);
        }
        if (set.contains(5)) {
            ea.c.E(parcel, 5, this.f26846f, i10, true);
        }
        if (set.contains(6)) {
            ea.c.E(parcel, 6, this.f26847r, i10, true);
        }
        ea.c.b(parcel, a10);
    }
}
