package com.bumptech.glide;

import com.bumptech.glide.l;

/* loaded from: classes.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private a4.c<? super TranscodeType> f7433a = a4.a.a();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a4.c<? super TranscodeType> b() {
        return this.f7433a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return c4.l.d(this.f7433a, ((l) obj).f7433a);
        }
        return false;
    }

    public int hashCode() {
        a4.c<? super TranscodeType> cVar = this.f7433a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
