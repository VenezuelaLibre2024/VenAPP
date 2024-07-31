package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f564a;

    /* renamed from: b, reason: collision with root package name */
    public int f565b;

    /* renamed from: c, reason: collision with root package name */
    public int f566c;

    /* renamed from: d, reason: collision with root package name */
    public int f567d;

    /* renamed from: e, reason: collision with root package name */
    public int f568e;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f564a = parcel.readInt();
        this.f566c = parcel.readInt();
        this.f567d = parcel.readInt();
        this.f568e = parcel.readInt();
        this.f565b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f564a);
        parcel.writeInt(this.f566c);
        parcel.writeInt(this.f567d);
        parcel.writeInt(this.f568e);
        parcel.writeInt(this.f565b);
    }
}
