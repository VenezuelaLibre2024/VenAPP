.class public final Lio/grpc/okhttp/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/okhttp/internal/b$b;
    }
.end annotation


# static fields
.field private static final e:[Lio/grpc/okhttp/internal/a;

.field public static final f:Lio/grpc/okhttp/internal/b;

.field public static final g:Lio/grpc/okhttp/internal/b;

.field public static final h:Lio/grpc/okhttp/internal/b;


# instance fields
.field final a:Z

.field private final b:[Ljava/lang/String;

.field private final c:[Ljava/lang/String;

.field final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x10

    new-array v0, v0, [Lio/grpc/okhttp/internal/a;

    sget-object v1, Lio/grpc/okhttp/internal/a;->TLS_AES_128_GCM_SHA256:Lio/grpc/okhttp/internal/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/grpc/okhttp/internal/a;->TLS_AES_256_GCM_SHA384:Lio/grpc/okhttp/internal/a;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lio/grpc/okhttp/internal/a;->TLS_CHACHA20_POLY1305_SHA256:Lio/grpc/okhttp/internal/a;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    sget-object v1, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256:Lio/grpc/okhttp/internal/a;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    sget-object v1, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256:Lio/grpc/okhttp/internal/a;

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const/4 v1, 0x5

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/4 v1, 0x6

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/4 v1, 0x7

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0x8

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0x9

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0xa

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0xb

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_RSA_WITH_AES_128_GCM_SHA256:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0xc

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_RSA_WITH_AES_256_GCM_SHA384:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0xd

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_RSA_WITH_AES_128_CBC_SHA:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0xe

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_RSA_WITH_AES_256_CBC_SHA:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    const/16 v1, 0xf

    sget-object v7, Lio/grpc/okhttp/internal/a;->TLS_RSA_WITH_3DES_EDE_CBC_SHA:Lio/grpc/okhttp/internal/a;

    aput-object v7, v0, v1

    sput-object v0, Lio/grpc/okhttp/internal/b;->e:[Lio/grpc/okhttp/internal/a;

    new-instance v1, Lio/grpc/okhttp/internal/b$b;

    invoke-direct {v1, v3}, Lio/grpc/okhttp/internal/b$b;-><init>(Z)V

    invoke-virtual {v1, v0}, Lio/grpc/okhttp/internal/b$b;->f([Lio/grpc/okhttp/internal/a;)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    new-array v1, v4, [Lio/grpc/okhttp/internal/k;

    sget-object v7, Lio/grpc/okhttp/internal/k;->TLS_1_3:Lio/grpc/okhttp/internal/k;

    aput-object v7, v1, v2

    sget-object v8, Lio/grpc/okhttp/internal/k;->TLS_1_2:Lio/grpc/okhttp/internal/k;

    aput-object v8, v1, v3

    invoke-virtual {v0, v1}, Lio/grpc/okhttp/internal/b$b;->i([Lio/grpc/okhttp/internal/k;)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lio/grpc/okhttp/internal/b$b;->h(Z)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/okhttp/internal/b$b;->e()Lio/grpc/okhttp/internal/b;

    move-result-object v0

    sput-object v0, Lio/grpc/okhttp/internal/b;->f:Lio/grpc/okhttp/internal/b;

    new-instance v1, Lio/grpc/okhttp/internal/b$b;

    invoke-direct {v1, v0}, Lio/grpc/okhttp/internal/b$b;-><init>(Lio/grpc/okhttp/internal/b;)V

    new-array v0, v6, [Lio/grpc/okhttp/internal/k;

    aput-object v7, v0, v2

    aput-object v8, v0, v3

    sget-object v6, Lio/grpc/okhttp/internal/k;->TLS_1_1:Lio/grpc/okhttp/internal/k;

    aput-object v6, v0, v4

    sget-object v4, Lio/grpc/okhttp/internal/k;->TLS_1_0:Lio/grpc/okhttp/internal/k;

    aput-object v4, v0, v5

    invoke-virtual {v1, v0}, Lio/grpc/okhttp/internal/b$b;->i([Lio/grpc/okhttp/internal/k;)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lio/grpc/okhttp/internal/b$b;->h(Z)Lio/grpc/okhttp/internal/b$b;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/okhttp/internal/b$b;->e()Lio/grpc/okhttp/internal/b;

    move-result-object v0

    sput-object v0, Lio/grpc/okhttp/internal/b;->g:Lio/grpc/okhttp/internal/b;

    new-instance v0, Lio/grpc/okhttp/internal/b$b;

    invoke-direct {v0, v2}, Lio/grpc/okhttp/internal/b$b;-><init>(Z)V

    invoke-virtual {v0}, Lio/grpc/okhttp/internal/b$b;->e()Lio/grpc/okhttp/internal/b;

    move-result-object v0

    sput-object v0, Lio/grpc/okhttp/internal/b;->h:Lio/grpc/okhttp/internal/b;

    return-void
.end method

.method private constructor <init>(Lio/grpc/okhttp/internal/b$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lio/grpc/okhttp/internal/b$b;->a(Lio/grpc/okhttp/internal/b$b;)Z

    move-result v0

    iput-boolean v0, p0, Lio/grpc/okhttp/internal/b;->a:Z

    invoke-static {p1}, Lio/grpc/okhttp/internal/b$b;->b(Lio/grpc/okhttp/internal/b$b;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    invoke-static {p1}, Lio/grpc/okhttp/internal/b$b;->c(Lio/grpc/okhttp/internal/b$b;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    invoke-static {p1}, Lio/grpc/okhttp/internal/b$b;->d(Lio/grpc/okhttp/internal/b$b;)Z

    move-result p1

    iput-boolean p1, p0, Lio/grpc/okhttp/internal/b;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/okhttp/internal/b$b;Lio/grpc/okhttp/internal/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/okhttp/internal/b;-><init>(Lio/grpc/okhttp/internal/b$b;)V

    return-void
.end method

.method static synthetic a(Lio/grpc/okhttp/internal/b;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lio/grpc/okhttp/internal/b;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    return-object p0
.end method

.method private e(Ljavax/net/ssl/SSLSocket;Z)Lio/grpc/okhttp/internal/b;
    .locals 6

    iget-object v0, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lio/grpc/okhttp/internal/l;->c(Ljava/lang/Class;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const-string v2, "TLS_FALLBACK_SCSV"

    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    :goto_1
    array-length p2, v0

    add-int/lit8 p2, p2, 0x1

    new-array v3, p2, [Ljava/lang/String;

    array-length v4, v0

    const/4 v5, 0x0

    invoke-static {v0, v5, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p2, p2, -0x1

    aput-object v2, v3, p2

    move-object v0, v3

    :cond_2
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    invoke-static {v1, p2, p1}, Lio/grpc/okhttp/internal/l;->c(Ljava/lang/Class;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    new-instance p2, Lio/grpc/okhttp/internal/b$b;

    invoke-direct {p2, p0}, Lio/grpc/okhttp/internal/b$b;-><init>(Lio/grpc/okhttp/internal/b;)V

    invoke-virtual {p2, v0}, Lio/grpc/okhttp/internal/b$b;->g([Ljava/lang/String;)Lio/grpc/okhttp/internal/b$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/grpc/okhttp/internal/b$b;->j([Ljava/lang/String;)Lio/grpc/okhttp/internal/b$b;

    move-result-object p1

    invoke-virtual {p1}, Lio/grpc/okhttp/internal/b$b;->e()Lio/grpc/okhttp/internal/b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c(Ljavax/net/ssl/SSLSocket;Z)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lio/grpc/okhttp/internal/b;->e(Ljavax/net/ssl/SSLSocket;Z)Lio/grpc/okhttp/internal/b;

    move-result-object p2

    iget-object v0, p2, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    iget-object p2, p2, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/grpc/okhttp/internal/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v0, v0

    new-array v0, v0, [Lio/grpc/okhttp/internal/a;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    invoke-static {v2}, Lio/grpc/okhttp/internal/a;->b(Ljava/lang/String;)Lio/grpc/okhttp/internal/a;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lio/grpc/okhttp/internal/l;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lio/grpc/okhttp/internal/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Lio/grpc/okhttp/internal/b;

    iget-boolean v2, p0, Lio/grpc/okhttp/internal/b;->a:Z

    iget-boolean v3, p1, Lio/grpc/okhttp/internal/b;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v2, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    iget-object v3, p1, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    iget-object v3, p1, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Lio/grpc/okhttp/internal/b;->d:Z

    iget-boolean p1, p1, Lio/grpc/okhttp/internal/b;->d:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lio/grpc/okhttp/internal/b;->d:Z

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/grpc/okhttp/internal/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Lio/grpc/okhttp/internal/k;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-static {v2}, Lio/grpc/okhttp/internal/k;->b(Ljava/lang/String;)Lio/grpc/okhttp/internal/k;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lio/grpc/okhttp/internal/l;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lio/grpc/okhttp/internal/b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/okhttp/internal/b;->b:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/grpc/okhttp/internal/b;->c:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lio/grpc/okhttp/internal/b;->d:Z

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v0

    goto :goto_0

    :cond_0
    const/16 v1, 0x11

    :goto_0
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lio/grpc/okhttp/internal/b;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/grpc/okhttp/internal/b;->d()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "[use default]"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ConnectionSpec(cipherSuites="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tlsVersions="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/grpc/okhttp/internal/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", supportsTlsExtensions="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lio/grpc/okhttp/internal/b;->d:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "ConnectionSpec()"

    return-object v0
.end method
