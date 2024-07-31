package p364t9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C0732b;
import com.google.android.gms.common.server.response.AbstractC5300a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p081ea.C7140c;

/* renamed from: t9.i */
/* loaded from: classes.dex */
public final class C11190i extends zzbz {
    public static final Parcelable.Creator<C11190i> CREATOR = new C11191j();

    /* renamed from: s */
    private static final HashMap f29136s;

    /* renamed from: a */
    final Set f29137a;

    /* renamed from: b */
    final int f29138b;

    /* renamed from: c */
    private String f29139c;

    /* renamed from: d */
    private int f29140d;

    /* renamed from: e */
    private byte[] f29141e;

    /* renamed from: f */
    private PendingIntent f29142f;

    /* renamed from: r */
    private C11182a f29143r;

    static {
        HashMap hashMap = new HashMap();
        f29136s = hashMap;
        hashMap.put("accountType", AbstractC5300a.a.m13375y1("accountType", 2));
        hashMap.put("status", AbstractC5300a.a.m13374x1("status", 3));
        hashMap.put("transferBytes", AbstractC5300a.a.m13371u1("transferBytes", 4));
    }

    public C11190i() {
        this.f29137a = new C0732b(3);
        this.f29138b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11190i(Set set, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, C11182a c11182a) {
        this.f29137a = set;
        this.f29138b = i10;
        this.f29139c = str;
        this.f29140d = i11;
        this.f29141e = bArr;
        this.f29142f = pendingIntent;
        this.f29143r = c11182a;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final /* synthetic */ Map getFieldMappings() {
        return f29136s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final Object getFieldValue(AbstractC5300a.a aVar) {
        int i10;
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 == 1) {
            i10 = this.f29138b;
        } else {
            if (m13377A1 == 2) {
                return this.f29139c;
            }
            if (m13377A1 != 3) {
                if (m13377A1 == 4) {
                    return this.f29141e;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13377A1());
            }
            i10 = this.f29140d;
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final boolean isFieldSet(AbstractC5300a.a aVar) {
        return this.f29137a.contains(Integer.valueOf(aVar.m13377A1()));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setDecodedBytesInternal(AbstractC5300a.a aVar, String str, byte[] bArr) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 == 4) {
            this.f29141e = bArr;
            this.f29137a.add(Integer.valueOf(m13377A1));
        } else {
            throw new IllegalArgumentException("Field with id=" + m13377A1 + " is not known to be an byte array.");
        }
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setIntegerInternal(AbstractC5300a.a aVar, String str, int i10) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 == 3) {
            this.f29140d = i10;
            this.f29137a.add(Integer.valueOf(m13377A1));
        } else {
            throw new IllegalArgumentException("Field with id=" + m13377A1 + " is not known to be an int.");
        }
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setStringInternal(AbstractC5300a.a aVar, String str, String str2) {
        int m13377A1 = aVar.m13377A1();
        if (m13377A1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m13377A1)));
        }
        this.f29139c = str2;
        this.f29137a.add(Integer.valueOf(m13377A1));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        Set set = this.f29137a;
        if (set.contains(1)) {
            C7140c.m21229u(parcel, 1, this.f29138b);
        }
        if (set.contains(2)) {
            C7140c.m21200G(parcel, 2, this.f29139c, true);
        }
        if (set.contains(3)) {
            C7140c.m21229u(parcel, 3, this.f29140d);
        }
        if (set.contains(4)) {
            C7140c.m21220l(parcel, 4, this.f29141e, true);
        }
        if (set.contains(5)) {
            C7140c.m21198E(parcel, 5, this.f29142f, i10, true);
        }
        if (set.contains(6)) {
            C7140c.m21198E(parcel, 6, this.f29143r, i10, true);
        }
        C7140c.m21210b(parcel, m21209a);
    }
}
