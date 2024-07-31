package com.google.firebase.remoteconfig.internal;

/* loaded from: classes2.dex */
public class w implements ze.n {

    /* renamed from: a */
    private final String f12556a;

    /* renamed from: b */
    private final int f12557b;

    public w(String str, int i10) {
        this.f12556a = str;
        this.f12557b = i10;
    }

    private String f() {
        return b().trim();
    }

    private void g() {
        if (this.f12556a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // ze.n
    public int a() {
        return this.f12557b;
    }

    @Override // ze.n
    public String b() {
        if (this.f12557b == 0) {
            return "";
        }
        g();
        return this.f12556a;
    }

    @Override // ze.n
    public long c() {
        if (this.f12557b == 0) {
            return 0L;
        }
        String f10 = f();
        try {
            return Long.valueOf(f10).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "long"), e10);
        }
    }

    @Override // ze.n
    public double d() {
        if (this.f12557b == 0) {
            return 0.0d;
        }
        String f10 = f();
        try {
            return Double.valueOf(f10).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "double"), e10);
        }
    }

    @Override // ze.n
    public boolean e() {
        if (this.f12557b == 0) {
            return false;
        }
        String f10 = f();
        if (o.f12496f.matcher(f10).matches()) {
            return true;
        }
        if (o.f12497g.matcher(f10).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "boolean"));
    }
}
