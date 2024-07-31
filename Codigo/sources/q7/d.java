package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t8.r0;

/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23566b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23567c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23568d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f23569e;

    /* renamed from: f, reason: collision with root package name */
    private final i[] f23570f;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f23566b = (String) r0.j(parcel.readString());
        this.f23567c = parcel.readByte() != 0;
        this.f23568d = parcel.readByte() != 0;
        this.f23569e = (String[]) r0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f23570f = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f23570f[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f23566b = str;
        this.f23567c = z10;
        this.f23568d = z11;
        this.f23569e = strArr;
        this.f23570f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23567c == dVar.f23567c && this.f23568d == dVar.f23568d && r0.c(this.f23566b, dVar.f23566b) && Arrays.equals(this.f23569e, dVar.f23569e) && Arrays.equals(this.f23570f, dVar.f23570f);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f23567c ? 1 : 0)) * 31) + (this.f23568d ? 1 : 0)) * 31;
        String str = this.f23566b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23566b);
        parcel.writeByte(this.f23567c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23568d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f23569e);
        parcel.writeInt(this.f23570f.length);
        for (i iVar : this.f23570f) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
