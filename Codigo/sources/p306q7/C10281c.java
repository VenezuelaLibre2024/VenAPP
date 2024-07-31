package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p363t8.C11172r0;

/* renamed from: q7.c */
/* loaded from: classes.dex */
public final class C10281c extends AbstractC10287i {
    public static final Parcelable.Creator<C10281c> CREATOR = new a();

    /* renamed from: b */
    public final String f25528b;

    /* renamed from: c */
    public final int f25529c;

    /* renamed from: d */
    public final int f25530d;

    /* renamed from: e */
    public final long f25531e;

    /* renamed from: f */
    public final long f25532f;

    /* renamed from: r */
    private final AbstractC10287i[] f25533r;

    /* renamed from: q7.c$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10281c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10281c createFromParcel(Parcel parcel) {
            return new C10281c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10281c[] newArray(int i10) {
            return new C10281c[i10];
        }
    }

    C10281c(Parcel parcel) {
        super("CHAP");
        this.f25528b = (String) C11172r0.m34928j(parcel.readString());
        this.f25529c = parcel.readInt();
        this.f25530d = parcel.readInt();
        this.f25531e = parcel.readLong();
        this.f25532f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f25533r = new AbstractC10287i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f25533r[i10] = (AbstractC10287i) parcel.readParcelable(AbstractC10287i.class.getClassLoader());
        }
    }

    public C10281c(String str, int i10, int i11, long j10, long j11, AbstractC10287i[] abstractC10287iArr) {
        super("CHAP");
        this.f25528b = str;
        this.f25529c = i10;
        this.f25530d = i11;
        this.f25531e = j10;
        this.f25532f = j11;
        this.f25533r = abstractC10287iArr;
    }

    @Override // p306q7.AbstractC10287i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10281c.class != obj.getClass()) {
            return false;
        }
        C10281c c10281c = (C10281c) obj;
        return this.f25529c == c10281c.f25529c && this.f25530d == c10281c.f25530d && this.f25531e == c10281c.f25531e && this.f25532f == c10281c.f25532f && C11172r0.m34914c(this.f25528b, c10281c.f25528b) && Arrays.equals(this.f25533r, c10281c.f25533r);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f25529c) * 31) + this.f25530d) * 31) + ((int) this.f25531e)) * 31) + ((int) this.f25532f)) * 31;
        String str = this.f25528b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25528b);
        parcel.writeInt(this.f25529c);
        parcel.writeInt(this.f25530d);
        parcel.writeLong(this.f25531e);
        parcel.writeLong(this.f25532f);
        parcel.writeInt(this.f25533r.length);
        for (AbstractC10287i abstractC10287i : this.f25533r) {
            parcel.writeParcelable(abstractC10287i, 0);
        }
    }
}
