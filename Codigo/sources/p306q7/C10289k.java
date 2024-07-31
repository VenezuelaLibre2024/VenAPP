package p306q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p363t8.C11172r0;

/* renamed from: q7.k */
/* loaded from: classes.dex */
public final class C10289k extends AbstractC10287i {
    public static final Parcelable.Creator<C10289k> CREATOR = new a();

    /* renamed from: b */
    public final int f25555b;

    /* renamed from: c */
    public final int f25556c;

    /* renamed from: d */
    public final int f25557d;

    /* renamed from: e */
    public final int[] f25558e;

    /* renamed from: f */
    public final int[] f25559f;

    /* renamed from: q7.k$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10289k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10289k createFromParcel(Parcel parcel) {
            return new C10289k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10289k[] newArray(int i10) {
            return new C10289k[i10];
        }
    }

    public C10289k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f25555b = i10;
        this.f25556c = i11;
        this.f25557d = i12;
        this.f25558e = iArr;
        this.f25559f = iArr2;
    }

    C10289k(Parcel parcel) {
        super("MLLT");
        this.f25555b = parcel.readInt();
        this.f25556c = parcel.readInt();
        this.f25557d = parcel.readInt();
        this.f25558e = (int[]) C11172r0.m34928j(parcel.createIntArray());
        this.f25559f = (int[]) C11172r0.m34928j(parcel.createIntArray());
    }

    @Override // p306q7.AbstractC10287i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10289k.class != obj.getClass()) {
            return false;
        }
        C10289k c10289k = (C10289k) obj;
        return this.f25555b == c10289k.f25555b && this.f25556c == c10289k.f25556c && this.f25557d == c10289k.f25557d && Arrays.equals(this.f25558e, c10289k.f25558e) && Arrays.equals(this.f25559f, c10289k.f25559f);
    }

    public int hashCode() {
        return ((((((((527 + this.f25555b) * 31) + this.f25556c) * 31) + this.f25557d) * 31) + Arrays.hashCode(this.f25558e)) * 31) + Arrays.hashCode(this.f25559f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25555b);
        parcel.writeInt(this.f25556c);
        parcel.writeInt(this.f25557d);
        parcel.writeIntArray(this.f25558e);
        parcel.writeIntArray(this.f25559f);
    }
}
