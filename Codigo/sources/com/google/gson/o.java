package com.google.gson;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class o extends j {

    /* renamed from: a */
    private final Object f13008a;

    public o(Boolean bool) {
        this.f13008a = com.google.gson.internal.a.b(bool);
    }

    public o(Number number) {
        this.f13008a = com.google.gson.internal.a.b(number);
    }

    public o(String str) {
        this.f13008a = com.google.gson.internal.a.b(str);
    }

    private static boolean u(o oVar) {
        Object obj = oVar.f13008a;
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
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f13008a == null) {
            return oVar.f13008a == null;
        }
        if (u(this) && u(oVar)) {
            return s().longValue() == oVar.s().longValue();
        }
        Object obj2 = this.f13008a;
        if (!(obj2 instanceof Number) || !(oVar.f13008a instanceof Number)) {
            return obj2.equals(oVar.f13008a);
        }
        double doubleValue = s().doubleValue();
        double doubleValue2 = oVar.s().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.j
    public long h() {
        return v() ? s().longValue() : Long.parseLong(k());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f13008a == null) {
            return 31;
        }
        if (u(this)) {
            doubleToLongBits = s().longValue();
        } else {
            Object obj = this.f13008a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(s().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.j
    public String k() {
        return v() ? s().toString() : t() ? ((Boolean) this.f13008a).toString() : (String) this.f13008a;
    }

    public boolean p() {
        return t() ? ((Boolean) this.f13008a).booleanValue() : Boolean.parseBoolean(k());
    }

    public double q() {
        return v() ? s().doubleValue() : Double.parseDouble(k());
    }

    public int r() {
        return v() ? s().intValue() : Integer.parseInt(k());
    }

    public Number s() {
        Object obj = this.f13008a;
        return obj instanceof String ? new com.google.gson.internal.f((String) obj) : (Number) obj;
    }

    public boolean t() {
        return this.f13008a instanceof Boolean;
    }

    public boolean v() {
        return this.f13008a instanceof Number;
    }

    public boolean w() {
        return this.f13008a instanceof String;
    }
}
