package com.google.gson;

import com.google.gson.internal.C6428a;
import com.google.gson.internal.C6483f;
import java.math.BigInteger;

/* renamed from: com.google.gson.o */
/* loaded from: classes2.dex */
public final class C6499o extends AbstractC6494j {

    /* renamed from: a */
    private final Object f14282a;

    public C6499o(Boolean bool) {
        this.f14282a = C6428a.m18075b(bool);
    }

    public C6499o(Number number) {
        this.f14282a = C6428a.m18075b(number);
    }

    public C6499o(String str) {
        this.f14282a = C6428a.m18075b(str);
    }

    /* renamed from: u */
    private static boolean m18288u(C6499o c6499o) {
        Object obj = c6499o.f14282a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6499o.class != obj.getClass()) {
            return false;
        }
        C6499o c6499o = (C6499o) obj;
        if (this.f14282a == null) {
            return c6499o.f14282a == null;
        }
        if (m18288u(this) && m18288u(c6499o)) {
            return m18292s().longValue() == c6499o.m18292s().longValue();
        }
        Object obj2 = this.f14282a;
        if (!(obj2 instanceof Number) || !(c6499o.f14282a instanceof Number)) {
            return obj2.equals(c6499o.f14282a);
        }
        double doubleValue = m18292s().doubleValue();
        double doubleValue2 = c6499o.m18292s().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.AbstractC6494j
    /* renamed from: h */
    public long mo18058h() {
        return m18294v() ? m18292s().longValue() : Long.parseLong(mo18059k());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f14282a == null) {
            return 31;
        }
        if (m18288u(this)) {
            doubleToLongBits = m18292s().longValue();
        } else {
            Object obj = this.f14282a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m18292s().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.AbstractC6494j
    /* renamed from: k */
    public String mo18059k() {
        return m18294v() ? m18292s().toString() : m18293t() ? ((Boolean) this.f14282a).toString() : (String) this.f14282a;
    }

    /* renamed from: p */
    public boolean m18289p() {
        return m18293t() ? ((Boolean) this.f14282a).booleanValue() : Boolean.parseBoolean(mo18059k());
    }

    /* renamed from: q */
    public double m18290q() {
        return m18294v() ? m18292s().doubleValue() : Double.parseDouble(mo18059k());
    }

    /* renamed from: r */
    public int m18291r() {
        return m18294v() ? m18292s().intValue() : Integer.parseInt(mo18059k());
    }

    /* renamed from: s */
    public Number m18292s() {
        Object obj = this.f14282a;
        return obj instanceof String ? new C6483f((String) obj) : (Number) obj;
    }

    /* renamed from: t */
    public boolean m18293t() {
        return this.f14282a instanceof Boolean;
    }

    /* renamed from: v */
    public boolean m18294v() {
        return this.f14282a instanceof Number;
    }

    /* renamed from: w */
    public boolean m18295w() {
        return this.f14282a instanceof String;
    }
}
