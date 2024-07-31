package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new y1();

    /* renamed from: a, reason: collision with root package name */
    private final qa.a f23853a;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    o(qa.a aVar) {
        this.f23853a = (qa.a) com.google.android.gms.common.internal.s.j(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(int i10) {
        b0 b0Var;
        if (i10 == b0.LEGACY_RS1.b()) {
            b0Var = b0.RS1;
        } else {
            b0[] values = b0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (b0 b0Var2 : p.values()) {
                        if (b0Var2.b() == i10) {
                            b0Var = b0Var2;
                        }
                    }
                    throw new a(i10);
                }
                b0 b0Var3 = values[i11];
                if (b0Var3.b() == i10) {
                    b0Var = b0Var3;
                    break;
                }
                i11++;
            }
        }
        return new o(b0Var);
    }

    public int b() {
        return this.f23853a.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && this.f23853a.b() == ((o) obj).f23853a.b();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23853a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23853a.b());
    }
}
