package p350s7;

import p216l7.C9400a;

/* renamed from: s7.b */
/* loaded from: classes.dex */
public abstract class AbstractC10803b implements C9400a.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
