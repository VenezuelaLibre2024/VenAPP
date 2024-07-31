package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f12961a;

    public f(String str) {
        this.f12961a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.f12961a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f12961a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f12961a;
        String str2 = ((f) obj).f12961a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f12961a);
    }

    public int hashCode() {
        return this.f12961a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f12961a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f12961a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f12961a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f12961a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f12961a).longValue();
        }
    }

    public String toString() {
        return this.f12961a;
    }
}
