package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f4747a;

    /* renamed from: b, reason: collision with root package name */
    final String f4748b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f4749c;

    /* renamed from: d, reason: collision with root package name */
    final int f4750d;

    /* renamed from: e, reason: collision with root package name */
    final int f4751e;

    /* renamed from: f, reason: collision with root package name */
    final String f4752f;

    /* renamed from: r, reason: collision with root package name */
    final boolean f4753r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f4754s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f4755t;

    /* renamed from: u, reason: collision with root package name */
    final Bundle f4756u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f4757v;

    /* renamed from: w, reason: collision with root package name */
    final int f4758w;

    /* renamed from: x, reason: collision with root package name */
    Bundle f4759x;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i10) {
            return new s[i10];
        }
    }

    s(Parcel parcel) {
        this.f4747a = parcel.readString();
        this.f4748b = parcel.readString();
        this.f4749c = parcel.readInt() != 0;
        this.f4750d = parcel.readInt();
        this.f4751e = parcel.readInt();
        this.f4752f = parcel.readString();
        this.f4753r = parcel.readInt() != 0;
        this.f4754s = parcel.readInt() != 0;
        this.f4755t = parcel.readInt() != 0;
        this.f4756u = parcel.readBundle();
        this.f4757v = parcel.readInt() != 0;
        this.f4759x = parcel.readBundle();
        this.f4758w = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Fragment fragment) {
        this.f4747a = fragment.getClass().getName();
        this.f4748b = fragment.mWho;
        this.f4749c = fragment.mFromLayout;
        this.f4750d = fragment.mFragmentId;
        this.f4751e = fragment.mContainerId;
        this.f4752f = fragment.mTag;
        this.f4753r = fragment.mRetainInstance;
        this.f4754s = fragment.mRemoving;
        this.f4755t = fragment.mDetached;
        this.f4756u = fragment.mArguments;
        this.f4757v = fragment.mHidden;
        this.f4758w = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("FragmentState{");
        sb2.append(this.f4747a);
        sb2.append(" (");
        sb2.append(this.f4748b);
        sb2.append(")}:");
        if (this.f4749c) {
            sb2.append(" fromLayout");
        }
        if (this.f4751e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f4751e));
        }
        String str = this.f4752f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f4752f);
        }
        if (this.f4753r) {
            sb2.append(" retainInstance");
        }
        if (this.f4754s) {
            sb2.append(" removing");
        }
        if (this.f4755t) {
            sb2.append(" detached");
        }
        if (this.f4757v) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4747a);
        parcel.writeString(this.f4748b);
        parcel.writeInt(this.f4749c ? 1 : 0);
        parcel.writeInt(this.f4750d);
        parcel.writeInt(this.f4751e);
        parcel.writeString(this.f4752f);
        parcel.writeInt(this.f4753r ? 1 : 0);
        parcel.writeInt(this.f4754s ? 1 : 0);
        parcel.writeInt(this.f4755t ? 1 : 0);
        parcel.writeBundle(this.f4756u);
        parcel.writeInt(this.f4757v ? 1 : 0);
        parcel.writeBundle(this.f4759x);
        parcel.writeInt(this.f4758w);
    }
}
