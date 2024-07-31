package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes.dex */
public abstract class b extends a implements ea.d {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0150a<?, ?> c0150a : getFieldMappings().values()) {
            if (isFieldSet(c0150a)) {
                if (!aVar.isFieldSet(c0150a) || !q.b(getFieldValue(c0150a), aVar.getFieldValue(c0150a))) {
                    return false;
                }
            } else if (aVar.isFieldSet(c0150a)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i10 = 0;
        for (a.C0150a<?, ?> c0150a : getFieldMappings().values()) {
            if (isFieldSet(c0150a)) {
                i10 = (i10 * 31) + s.j(getFieldValue(c0150a)).hashCode();
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.common.server.response.a
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
