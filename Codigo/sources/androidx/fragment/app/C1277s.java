package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public final class C1277s implements Parcelable {
    public static final Parcelable.Creator<C1277s> CREATOR = new a();

    /* renamed from: a */
    final String f5501a;

    /* renamed from: b */
    final String f5502b;

    /* renamed from: c */
    final boolean f5503c;

    /* renamed from: d */
    final int f5504d;

    /* renamed from: e */
    final int f5505e;

    /* renamed from: f */
    final String f5506f;

    /* renamed from: r */
    final boolean f5507r;

    /* renamed from: s */
    final boolean f5508s;

    /* renamed from: t */
    final boolean f5509t;

    /* renamed from: u */
    final Bundle f5510u;

    /* renamed from: v */
    final boolean f5511v;

    /* renamed from: w */
    final int f5512w;

    /* renamed from: x */
    Bundle f5513x;

    /* renamed from: androidx.fragment.app.s$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C1277s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1277s createFromParcel(Parcel parcel) {
            return new C1277s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1277s[] newArray(int i10) {
            return new C1277s[i10];
        }
    }

    C1277s(Parcel parcel) {
        this.f5501a = parcel.readString();
        this.f5502b = parcel.readString();
        this.f5503c = parcel.readInt() != 0;
        this.f5504d = parcel.readInt();
        this.f5505e = parcel.readInt();
        this.f5506f = parcel.readString();
        this.f5507r = parcel.readInt() != 0;
        this.f5508s = parcel.readInt() != 0;
        this.f5509t = parcel.readInt() != 0;
        this.f5510u = parcel.readBundle();
        this.f5511v = parcel.readInt() != 0;
        this.f5513x = parcel.readBundle();
        this.f5512w = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1277s(Fragment fragment) {
        this.f5501a = fragment.getClass().getName();
        this.f5502b = fragment.mWho;
        this.f5503c = fragment.mFromLayout;
        this.f5504d = fragment.mFragmentId;
        this.f5505e = fragment.mContainerId;
        this.f5506f = fragment.mTag;
        this.f5507r = fragment.mRetainInstance;
        this.f5508s = fragment.mRemoving;
        this.f5509t = fragment.mDetached;
        this.f5510u = fragment.mArguments;
        this.f5511v = fragment.mHidden;
        this.f5512w = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("FragmentState{");
        sb2.append(this.f5501a);
        sb2.append(" (");
        sb2.append(this.f5502b);
        sb2.append(")}:");
        if (this.f5503c) {
            sb2.append(" fromLayout");
        }
        if (this.f5505e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f5505e));
        }
        String str = this.f5506f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f5506f);
        }
        if (this.f5507r) {
            sb2.append(" retainInstance");
        }
        if (this.f5508s) {
            sb2.append(" removing");
        }
        if (this.f5509t) {
            sb2.append(" detached");
        }
        if (this.f5511v) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5501a);
        parcel.writeString(this.f5502b);
        parcel.writeInt(this.f5503c ? 1 : 0);
        parcel.writeInt(this.f5504d);
        parcel.writeInt(this.f5505e);
        parcel.writeString(this.f5506f);
        parcel.writeInt(this.f5507r ? 1 : 0);
        parcel.writeInt(this.f5508s ? 1 : 0);
        parcel.writeInt(this.f5509t ? 1 : 0);
        parcel.writeBundle(this.f5510u);
        parcel.writeInt(this.f5511v ? 1 : 0);
        parcel.writeBundle(this.f5513x);
        parcel.writeInt(this.f5512w);
    }
}
