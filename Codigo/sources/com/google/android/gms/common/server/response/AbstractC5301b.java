package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.server.response.AbstractC5300a;
import p081ea.InterfaceC7141d;

/* renamed from: com.google.android.gms.common.server.response.b */
/* loaded from: classes.dex */
public abstract class AbstractC5301b extends AbstractC5300a implements InterfaceC7141d {
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
        AbstractC5300a abstractC5300a = (AbstractC5300a) obj;
        for (AbstractC5300a.a<?, ?> aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                if (!abstractC5300a.isFieldSet(aVar) || !C5270q.m13304b(getFieldValue(aVar), abstractC5300a.getFieldValue(aVar))) {
                    return false;
                }
            } else if (abstractC5300a.isFieldSet(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i10 = 0;
        for (AbstractC5300a.a<?, ?> aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                i10 = (i10 * 31) + C5276s.m13324j(getFieldValue(aVar)).hashCode();
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
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
