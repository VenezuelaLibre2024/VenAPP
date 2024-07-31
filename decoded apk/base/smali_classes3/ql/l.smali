.class public final Lql/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/l$a;,
        Lql/l$b;
    }
.end annotation


# static fields
.field public static final e:Lql/l$b;

.field private static final f:[Lql/i;

.field private static final g:[Lql/i;

.field public static final h:Lql/l;

.field public static final i:Lql/l;

.field public static final j:Lql/l;

.field public static final k:Lql/l;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:[Ljava/lang/String;

.field private final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lql/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/l$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/l;->e:Lql/l$b;

    const/16 v0, 0x9

    new-array v1, v0, [Lql/i;

    sget-object v2, Lql/i;->o1:Lql/i;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v4, Lql/i;->p1:Lql/i;

    const/4 v5, 0x1

    aput-object v4, v1, v5

    sget-object v6, Lql/i;->q1:Lql/i;

    const/4 v7, 0x2

    aput-object v6, v1, v7

    sget-object v8, Lql/i;->a1:Lql/i;

    const/4 v9, 0x3

    aput-object v8, v1, v9

    sget-object v10, Lql/i;->e1:Lql/i;

    const/4 v11, 0x4

    aput-object v10, v1, v11

    sget-object v12, Lql/i;->b1:Lql/i;

    const/4 v13, 0x5

    aput-object v12, v1, v13

    sget-object v14, Lql/i;->f1:Lql/i;

    const/4 v15, 0x6

    aput-object v14, v1, v15

    sget-object v16, Lql/i;->l1:Lql/i;

    const/16 v17, 0x7

    aput-object v16, v1, v17

    sget-object v18, Lql/i;->k1:Lql/i;

    const/16 v19, 0x8

    aput-object v18, v1, v19

    sput-object v1, Lql/l;->f:[Lql/i;

    const/16 v0, 0x10

    new-array v0, v0, [Lql/i;

    aput-object v2, v0, v3

    aput-object v4, v0, v5

    aput-object v6, v0, v7

    aput-object v8, v0, v9

    aput-object v10, v0, v11

    aput-object v12, v0, v13

    aput-object v14, v0, v15

    aput-object v16, v0, v17

    aput-object v18, v0, v19

    sget-object v2, Lql/i;->L0:Lql/i;

    const/16 v4, 0x9

    aput-object v2, v0, v4

    const/16 v2, 0xa

    sget-object v4, Lql/i;->M0:Lql/i;

    aput-object v4, v0, v2

    const/16 v2, 0xb

    sget-object v4, Lql/i;->j0:Lql/i;

    aput-object v4, v0, v2

    const/16 v2, 0xc

    sget-object v4, Lql/i;->k0:Lql/i;

    aput-object v4, v0, v2

    const/16 v2, 0xd

    sget-object v4, Lql/i;->H:Lql/i;

    aput-object v4, v0, v2

    const/16 v2, 0xe

    sget-object v4, Lql/i;->L:Lql/i;

    aput-object v4, v0, v2

    const/16 v2, 0xf

    sget-object v4, Lql/i;->l:Lql/i;

    aput-object v4, v0, v2

    sput-object v0, Lql/l;->g:[Lql/i;

    new-instance v2, Lql/l$a;

    invoke-direct {v2, v5}, Lql/l$a;-><init>(Z)V

    array-length v4, v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lql/i;

    invoke-virtual {v2, v1}, Lql/l$a;->c([Lql/i;)Lql/l$a;

    move-result-object v1

    new-array v2, v7, [Lql/f0;

    sget-object v4, Lql/f0;->TLS_1_3:Lql/f0;

    aput-object v4, v2, v3

    sget-object v6, Lql/f0;->TLS_1_2:Lql/f0;

    aput-object v6, v2, v5

    invoke-virtual {v1, v2}, Lql/l$a;->j([Lql/f0;)Lql/l$a;

    move-result-object v1

    invoke-virtual {v1, v5}, Lql/l$a;->h(Z)Lql/l$a;

    move-result-object v1

    invoke-virtual {v1}, Lql/l$a;->a()Lql/l;

    move-result-object v1

    sput-object v1, Lql/l;->h:Lql/l;

    new-instance v1, Lql/l$a;

    invoke-direct {v1, v5}, Lql/l$a;-><init>(Z)V

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lql/i;

    invoke-virtual {v1, v2}, Lql/l$a;->c([Lql/i;)Lql/l$a;

    move-result-object v1

    new-array v2, v7, [Lql/f0;

    aput-object v4, v2, v3

    aput-object v6, v2, v5

    invoke-virtual {v1, v2}, Lql/l$a;->j([Lql/f0;)Lql/l$a;

    move-result-object v1

    invoke-virtual {v1, v5}, Lql/l$a;->h(Z)Lql/l$a;

    move-result-object v1

    invoke-virtual {v1}, Lql/l$a;->a()Lql/l;

    move-result-object v1

    sput-object v1, Lql/l;->i:Lql/l;

    new-instance v1, Lql/l$a;

    invoke-direct {v1, v5}, Lql/l$a;-><init>(Z)V

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lql/i;

    invoke-virtual {v1, v0}, Lql/l$a;->c([Lql/i;)Lql/l$a;

    move-result-object v0

    new-array v1, v11, [Lql/f0;

    aput-object v4, v1, v3

    aput-object v6, v1, v5

    sget-object v2, Lql/f0;->TLS_1_1:Lql/f0;

    aput-object v2, v1, v7

    sget-object v2, Lql/f0;->TLS_1_0:Lql/f0;

    aput-object v2, v1, v9

    invoke-virtual {v0, v1}, Lql/l$a;->j([Lql/f0;)Lql/l$a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lql/l$a;->h(Z)Lql/l$a;

    move-result-object v0

    invoke-virtual {v0}, Lql/l$a;->a()Lql/l;

    move-result-object v0

    sput-object v0, Lql/l;->j:Lql/l;

    new-instance v0, Lql/l$a;

    invoke-direct {v0, v3}, Lql/l$a;-><init>(Z)V

    invoke-virtual {v0}, Lql/l$a;->a()Lql/l;

    move-result-object v0

    sput-object v0, Lql/l;->k:Lql/l;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lql/l;->a:Z

    iput-boolean p2, p0, Lql/l;->b:Z

    iput-object p3, p0, Lql/l;->c:[Ljava/lang/String;

    iput-object p4, p0, Lql/l;->d:[Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a(Lql/l;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lql/l;->c:[Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic b(Lql/l;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lql/l;->d:[Ljava/lang/String;

    return-object p0
.end method

.method private final g(Ljavax/net/ssl/SSLSocket;Z)Lql/l;
    .locals 4

    iget-object v0, p0, Lql/l;->c:[Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    const-string v1, "sslSocket.enabledCipherSuites"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lql/l;->c:[Ljava/lang/String;

    sget-object v2, Lql/i;->b:Lql/i$b;

    invoke-virtual {v2}, Lql/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lrl/d;->E([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lql/l;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    const-string v2, "sslSocket.enabledProtocols"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lql/l;->d:[Ljava/lang/String;

    invoke-static {}, Lfk/a;->b()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lrl/d;->E([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object p1

    const-string v2, "supportedCipherSuites"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lql/i;->b:Lql/i$b;

    invoke-virtual {v2}, Lql/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    const-string v3, "TLS_FALLBACK_SCSV"

    invoke-static {p1, v3, v2}, Lrl/d;->x([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I

    move-result v2

    const-string v3, "cipherSuitesIntersection"

    if-eqz p2, :cond_2

    const/4 p2, -0x1

    if-eq v2, p2, :cond_2

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object p1, p1, v2

    const-string p2, "supportedCipherSuites[indexOfFallbackScsv]"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lrl/d;->o([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :cond_2
    new-instance p1, Lql/l$a;

    invoke-direct {p1, p0}, Lql/l$a;-><init>(Lql/l;)V

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p2, v0

    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Lql/l$a;->b([Ljava/lang/String;)Lql/l$a;

    move-result-object p1

    const-string p2, "tlsVersionsIntersection"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p2, v1

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Lql/l$a;->i([Ljava/lang/String;)Lql/l$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/l$a;->a()Lql/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Ljavax/net/ssl/SSLSocket;Z)V
    .locals 1

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lql/l;->g(Ljavax/net/ssl/SSLSocket;Z)Lql/l;

    move-result-object p2

    invoke-virtual {p2}, Lql/l;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lql/l;->d:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p2}, Lql/l;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p2, p2, Lql/l;->c:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/l;->c:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    sget-object v5, Lql/i;->b:Lql/i$b;

    invoke-virtual {v5, v4}, Lql/i$b;->b(Ljava/lang/String;)Lql/i;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ldk/p;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final e(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    const-string v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lql/l;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lql/l;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lfk/a;->b()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lrl/d;->u([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lql/l;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lql/i;->b:Lql/i$b;

    invoke-virtual {v2}, Lql/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lrl/d;->u([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lql/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    iget-boolean v2, p0, Lql/l;->a:Z

    check-cast p1, Lql/l;

    iget-boolean v3, p1, Lql/l;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v2, p0, Lql/l;->c:[Ljava/lang/String;

    iget-object v3, p1, Lql/l;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lql/l;->d:[Ljava/lang/String;

    iget-object v3, p1, Lql/l;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Lql/l;->b:Z

    iget-boolean p1, p1, Lql/l;->b:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lql/l;->a:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lql/l;->b:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lql/l;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lql/l;->c:[Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    :goto_0
    const/16 v2, 0x20f

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lql/l;->d:[Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean v0, p0, Lql/l;->b:Z

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    goto :goto_2

    :cond_2
    const/16 v2, 0x11

    :goto_2
    return v2
.end method

.method public final i()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/f0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/l;->d:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    sget-object v5, Lql/f0;->Companion:Lql/f0$a;

    invoke-virtual {v5, v4}, Lql/f0$a;->a(Ljava/lang/String;)Lql/f0;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ldk/p;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lql/l;->a:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionSpec(cipherSuites="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lql/l;->d()Ljava/util/List;

    move-result-object v1

    const-string v2, "[all enabled]"

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tlsVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lql/l;->i()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lql/l;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
