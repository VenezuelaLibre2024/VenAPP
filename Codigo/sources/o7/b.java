package o7;

import android.os.Parcel;
import android.os.Parcelable;
import l7.a;
import t6.h2;
import t8.r0;

@Deprecated
/* loaded from: classes.dex */
public class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f22317a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22318b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Parcel parcel) {
        this.f22317a = (String) r0.j(parcel.readString());
        this.f22318b = (String) r0.j(parcel.readString());
    }

    public b(String str, String str2) {
        this.f22317a = str;
        this.f22318b = str2;
    }

    @Override // l7.a.b
    public void O(h2.b bVar) {
        String str = this.f22317a;
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
                bVar.N(this.f22318b);
                return;
            case 1:
                bVar.m0(this.f22318b);
                return;
            case 2:
                bVar.U(this.f22318b);
                return;
            case 3:
                bVar.M(this.f22318b);
                return;
            case 4:
                bVar.O(this.f22318b);
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
        b bVar = (b) obj;
        return this.f22317a.equals(bVar.f22317a) && this.f22318b.equals(bVar.f22318b);
    }

    public int hashCode() {
        return ((527 + this.f22317a.hashCode()) * 31) + this.f22318b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f22317a + "=" + this.f22318b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22317a);
        parcel.writeString(this.f22318b);
    }
}
