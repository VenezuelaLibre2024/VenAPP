package p267o7;

import android.os.Parcel;
import android.os.Parcelable;
import p216l7.C9400a;
import p361t6.C11040h2;
import p363t8.C11172r0;

@Deprecated
/* renamed from: o7.b */
/* loaded from: classes.dex */
public class C9818b implements C9400a.b {
    public static final Parcelable.Creator<C9818b> CREATOR = new a();

    /* renamed from: a */
    public final String f24250a;

    /* renamed from: b */
    public final String f24251b;

    /* renamed from: o7.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C9818b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9818b createFromParcel(Parcel parcel) {
            return new C9818b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9818b[] newArray(int i10) {
            return new C9818b[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C9818b(Parcel parcel) {
        this.f24250a = (String) C11172r0.m34928j(parcel.readString());
        this.f24251b = (String) C11172r0.m34928j(parcel.readString());
    }

    public C9818b(String str, String str2) {
        this.f24250a = str;
        this.f24251b = str2;
    }

    @Override // p216l7.C9400a.b
    /* renamed from: O */
    public void mo28003O(C11040h2.b bVar) {
        String str = this.f24250a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.m34101N(this.f24251b);
                return;
            case 1:
                bVar.m34126m0(this.f24251b);
                return;
            case 2:
                bVar.m34108U(this.f24251b);
                return;
            case 3:
                bVar.m34100M(this.f24251b);
                return;
            case 4:
                bVar.m34102O(this.f24251b);
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9818b c9818b = (C9818b) obj;
        return this.f24250a.equals(c9818b.f24250a) && this.f24251b.equals(c9818b.f24251b);
    }

    public int hashCode() {
        return ((527 + this.f24250a.hashCode()) * 31) + this.f24251b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f24250a + "=" + this.f24251b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24250a);
        parcel.writeString(this.f24251b);
    }
}
