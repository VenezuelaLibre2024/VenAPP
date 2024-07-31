package p290p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p216l7.C9400a;
import p361t6.C11040h2;
import p363t8.C11137a;

/* renamed from: p7.c */
/* loaded from: classes.dex */
public final class C10110c implements C9400a.b {
    public static final Parcelable.Creator<C10110c> CREATOR = new a();

    /* renamed from: a */
    public final byte[] f24800a;

    /* renamed from: b */
    public final String f24801b;

    /* renamed from: c */
    public final String f24802c;

    /* renamed from: p7.c$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10110c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10110c createFromParcel(Parcel parcel) {
            return new C10110c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10110c[] newArray(int i10) {
            return new C10110c[i10];
        }
    }

    C10110c(Parcel parcel) {
        this.f24800a = (byte[]) C11137a.m34603e(parcel.createByteArray());
        this.f24801b = parcel.readString();
        this.f24802c = parcel.readString();
    }

    public C10110c(byte[] bArr, String str, String str2) {
        this.f24800a = bArr;
        this.f24801b = str;
        this.f24802c = str2;
    }

    @Override // p216l7.C9400a.b
    /* renamed from: O */
    public void mo28003O(C11040h2.b bVar) {
        String str = this.f24801b;
        if (str != null) {
            bVar.m34126m0(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10110c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f24800a, ((C10110c) obj).f24800a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24800a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f24801b, this.f24802c, Integer.valueOf(this.f24800a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f24800a);
        parcel.writeString(this.f24801b);
        parcel.writeString(this.f24802c);
    }
}
