package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t8.r0;

/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23561c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23562d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23563e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23564f;

    /* renamed from: r, reason: collision with root package name */
    private final i[] f23565r;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f23560b = (String) r0.j(parcel.readString());
        this.f23561c = parcel.readInt();
        this.f23562d = parcel.readInt();
        this.f23563e = parcel.readLong();
        this.f23564f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f23565r = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f23565r[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f23560b = str;
        this.f23561c = i10;
        this.f23562d = i11;
        this.f23563e = j10;
        this.f23564f = j11;
        this.f23565r = iVarArr;
    }

    @Override // q7.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23561c == cVar.f23561c && this.f23562d == cVar.f23562d && this.f23563e == cVar.f23563e && this.f23564f == cVar.f23564f && r0.c(this.f23560b, cVar.f23560b) && Arrays.equals(this.f23565r, cVar.f23565r);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f23561c) * 31) + this.f23562d) * 31) + ((int) this.f23563e)) * 31) + ((int) this.f23564f)) * 31;
        String str = this.f23560b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23560b);
        parcel.writeInt(this.f23561c);
        parcel.writeInt(this.f23562d);
        parcel.writeLong(this.f23563e);
        parcel.writeLong(this.f23564f);
        parcel.writeInt(this.f23565r.length);
        for (i iVar : this.f23565r) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
