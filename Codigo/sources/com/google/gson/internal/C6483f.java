package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* renamed from: com.google.gson.internal.f */
/* loaded from: classes2.dex */
public final class C6483f extends Number {

    /* renamed from: a */
    private final String f14235a;

    public C6483f(String str) {
        this.f14235a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.f14235a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f14235a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6483f)) {
            return false;
        }
        String str = this.f14235a;
        String str2 = ((C6483f) obj).f14235a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f14235a);
    }

    public int hashCode() {
        return this.f14235a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f14235a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f14235a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f14235a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f14235a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f14235a).longValue();
        }
    }

    public String toString() {
        return this.f14235a;
    }
}
