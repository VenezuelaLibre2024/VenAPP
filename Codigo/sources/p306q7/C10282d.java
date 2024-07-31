package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p363t8.C11172r0;

/* renamed from: q7.d */
/* loaded from: classes.dex */
public final class C10282d extends AbstractC10287i {
    public static final Parcelable.Creator<C10282d> CREATOR = new a();

    /* renamed from: b */
    public final String f25534b;

    /* renamed from: c */
    public final boolean f25535c;

    /* renamed from: d */
    public final boolean f25536d;

    /* renamed from: e */
    public final String[] f25537e;

    /* renamed from: f */
    private final AbstractC10287i[] f25538f;

    /* renamed from: q7.d$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10282d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10282d createFromParcel(Parcel parcel) {
            return new C10282d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10282d[] newArray(int i10) {
            return new C10282d[i10];
        }
    }

    C10282d(Parcel parcel) {
        super("CTOC");
        this.f25534b = (String) C11172r0.m34928j(parcel.readString());
        this.f25535c = parcel.readByte() != 0;
        this.f25536d = parcel.readByte() != 0;
        this.f25537e = (String[]) C11172r0.m34928j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f25538f = new AbstractC10287i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f25538f[i10] = (AbstractC10287i) parcel.readParcelable(AbstractC10287i.class.getClassLoader());
        }
    }

    public C10282d(String str, boolean z10, boolean z11, String[] strArr, AbstractC10287i[] abstractC10287iArr) {
        super("CTOC");
        this.f25534b = str;
        this.f25535c = z10;
        this.f25536d = z11;
        this.f25537e = strArr;
        this.f25538f = abstractC10287iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10282d.class != obj.getClass()) {
            return false;
        }
        C10282d c10282d = (C10282d) obj;
        return this.f25535c == c10282d.f25535c && this.f25536d == c10282d.f25536d && C11172r0.m34914c(this.f25534b, c10282d.f25534b) && Arrays.equals(this.f25537e, c10282d.f25537e) && Arrays.equals(this.f25538f, c10282d.f25538f);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f25535c ? 1 : 0)) * 31) + (this.f25536d ? 1 : 0)) * 31;
        String str = this.f25534b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25534b);
        parcel.writeByte(this.f25535c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25536d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f25537e);
        parcel.writeInt(this.f25538f.length);
        for (AbstractC10287i abstractC10287i : this.f25538f) {
            parcel.writeParcelable(abstractC10287i, 0);
        }
    }
}
