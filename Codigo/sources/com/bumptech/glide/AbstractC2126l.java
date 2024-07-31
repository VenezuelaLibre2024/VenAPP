package com.bumptech.glide;

import com.bumptech.glide.AbstractC2126l;
import p006a4.C0030a;
import p006a4.InterfaceC0032c;
import p036c4.C1871l;

/* renamed from: com.bumptech.glide.l */
/* loaded from: classes.dex */
public abstract class AbstractC2126l<CHILD extends AbstractC2126l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    private InterfaceC0032c<? super TranscodeType> f8400a = C0030a.m102a();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC0032c<? super TranscodeType> m10738b() {
        return this.f8400a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2126l) {
            return C1871l.m9955d(this.f8400a, ((AbstractC2126l) obj).f8400a);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC0032c<? super TranscodeType> interfaceC0032c = this.f8400a;
        if (interfaceC0032c != null) {
            return interfaceC0032c.hashCode();
        }
        return 0;
    }
}
