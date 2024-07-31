.class public final Lwb/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/a;


# static fields
.field public static final d:Lob/b$b;


# instance fields
.field private final a:Ljavax/crypto/SecretKey;

.field private b:[B

.field private c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lob/b$b;->ALGORITHM_NOT_FIPS:Lob/b$b;

    sput-object v0, Lwb/m;->d:Lob/b$b;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    invoke-static {v0}, Lwb/r;->a(I)V

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lwb/m;->a:Ljavax/crypto/SecretKey;

    invoke-direct {p0}, Lwb/m;->b()V

    return-void
.end method

.method private b()V
    .locals 3

    invoke-static {}, Lwb/m;->c()Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lwb/m;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    const/16 v1, 0x10

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-static {v0}, Lsb/a;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lwb/m;->b:[B

    invoke-static {v0}, Lsb/a;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lwb/m;->c:[B

    return-void
.end method

.method private static c()Ljavax/crypto/Cipher;
    .locals 2

    sget-object v0, Lwb/m;->d:Lob/b$b;

    invoke-virtual {v0}, Lob/b$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lwb/i;->b:Lwb/i;

    const-string v1, "AES/ECB/NoPadding"

    invoke-virtual {v0, v1}, Lwb/i;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a([BI)[B
    .locals 9

    const/16 v0, 0x10

    if-gt p2, v0, :cond_3

    invoke-static {}, Lwb/m;->c()Ljavax/crypto/Cipher;

    move-result-object v1

    iget-object v2, p0, Lwb/m;->a:Ljavax/crypto/SecretKey;

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    array-length v2, p1

    int-to-double v4, v2

    const-wide/high16 v6, 0x4030000000000000L    # 16.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v2, v4

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    mul-int/lit8 v4, v2, 0x10

    array-length v5, p1

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    if-eqz v4, :cond_1

    add-int/lit8 v4, v2, -0x1

    mul-int/2addr v4, v0

    iget-object v5, p0, Lwb/m;->b:[B

    invoke-static {p1, v4, v5, v6, v0}, Lwb/f;->d([BI[BII)[B

    move-result-object v4

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v2, -0x1

    mul-int/2addr v4, v0

    array-length v5, p1

    invoke-static {p1, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    invoke-static {v4}, Lsb/a;->a([B)[B

    move-result-object v4

    iget-object v5, p0, Lwb/m;->c:[B

    invoke-static {v4, v5}, Lwb/f;->e([B[B)[B

    move-result-object v4

    :goto_1
    new-array v5, v0, [B

    move v7, v6

    :goto_2
    add-int/lit8 v8, v2, -0x1

    if-ge v7, v8, :cond_2

    mul-int/lit8 v8, v7, 0x10

    invoke-static {v5, v6, p1, v8, v0}, Lwb/f;->d([BI[BII)[B

    move-result-object v5

    invoke-virtual {v1, v5}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v5

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    invoke-static {v4, v5}, Lwb/f;->e([B[B)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "outputLength too large, max is 16 bytes"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
