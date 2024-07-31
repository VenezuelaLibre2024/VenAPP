package p419wb;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: wb.j */
/* loaded from: classes2.dex */
public interface InterfaceC12138j<T> {

    /* renamed from: wb.j$a */
    /* loaded from: classes2.dex */
    public static class a implements InterfaceC12138j<Cipher> {
        @Override // p419wb.InterfaceC12138j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cipher mo38890a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: wb.j$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC12138j<KeyAgreement> {
        @Override // p419wb.InterfaceC12138j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyAgreement mo38890a(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    /* renamed from: wb.j$c */
    /* loaded from: classes2.dex */
    public static class c implements InterfaceC12138j<KeyFactory> {
        @Override // p419wb.InterfaceC12138j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyFactory mo38890a(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: wb.j$d */
    /* loaded from: classes2.dex */
    public static class d implements InterfaceC12138j<KeyPairGenerator> {
        @Override // p419wb.InterfaceC12138j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyPairGenerator mo38890a(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: wb.j$e */
    /* loaded from: classes2.dex */
    public static class e implements InterfaceC12138j<Mac> {
        @Override // p419wb.InterfaceC12138j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mac mo38890a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* renamed from: wb.j$f */
    /* loaded from: classes2.dex */
    public static class f implements InterfaceC12138j<MessageDigest> {
        @Override // p419wb.InterfaceC12138j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageDigest mo38890a(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: wb.j$g */
    /* loaded from: classes2.dex */
    public static class g implements InterfaceC12138j<Signature> {
        @Override // p419wb.InterfaceC12138j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Signature mo38890a(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    T mo38890a(String str, Provider provider);
}
