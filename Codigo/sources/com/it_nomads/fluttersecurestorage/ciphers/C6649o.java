package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.it_nomads.fluttersecurestorage.ciphers.o */
/* loaded from: classes.dex */
public class C6649o extends C6642h {
    public C6649o(Context context, InterfaceC6635a interfaceC6635a) {
        super(context, interfaceC6635a);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6642h
    /* renamed from: c */
    protected String mo19375c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6642h
    /* renamed from: d */
    protected Cipher mo19376d() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6642h
    /* renamed from: e */
    protected int mo19377e() {
        return 12;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6642h
    /* renamed from: f */
    protected AlgorithmParameterSpec mo19378f(byte[] bArr) {
        return new GCMParameterSpec(RecognitionOptions.ITF, bArr);
    }
}
