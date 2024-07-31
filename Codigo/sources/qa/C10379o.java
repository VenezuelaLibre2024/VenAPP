package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: qa.o */
/* loaded from: classes.dex */
public class C10379o implements Parcelable {
    public static final Parcelable.Creator<C10379o> CREATOR = new C10411y1();

    /* renamed from: a */
    private final InterfaceC10329a f25895a;

    /* renamed from: qa.o$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    C10379o(InterfaceC10329a interfaceC10329a) {
        this.f25895a = (InterfaceC10329a) C5276s.m13324j(interfaceC10329a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C10379o m31160a(int i10) {
        EnumC10334b0 enumC10334b0;
        if (i10 == EnumC10334b0.LEGACY_RS1.mo31114b()) {
            enumC10334b0 = EnumC10334b0.RS1;
        } else {
            EnumC10334b0[] values = EnumC10334b0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (EnumC10334b0 enumC10334b02 : EnumC10382p.values()) {
                        if (enumC10334b02.mo31114b() == i10) {
                            enumC10334b0 = enumC10334b02;
                        }
                    }
                    throw new a(i10);
                }
                EnumC10334b0 enumC10334b03 = values[i11];
                if (enumC10334b03.mo31114b() == i10) {
                    enumC10334b0 = enumC10334b03;
                    break;
                }
                i11++;
            }
        }
        return new C10379o(enumC10334b0);
    }

    /* renamed from: b */
    public int m31161b() {
        return this.f25895a.mo31114b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10379o) && this.f25895a.mo31114b() == ((C10379o) obj).f25895a.mo31114b();
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25895a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25895a.mo31114b());
    }
}
