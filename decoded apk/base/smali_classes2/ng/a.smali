.class public final Lng/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/o;


# static fields
.field private static final b:[Ldg/s;


# instance fields
.field private final a:Log/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ldg/s;

    sput-object v0, Lng/a;->b:[Ldg/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Log/d;

    invoke-direct {v0}, Log/d;-><init>()V

    iput-object v0, p0, Lng/a;->a:Log/d;

    return-void
.end method

.method private static c(Lkg/b;)Lkg/b;
    .locals 11

    invoke-virtual {p0}, Lkg/b;->l()[I

    move-result-object v0

    invoke-virtual {p0}, Lkg/b;->h()[I

    move-result-object v1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    invoke-static {v0, p0}, Lng/a;->d([ILkg/b;)I

    move-result v2

    const/4 v3, 0x1

    aget v4, v0, v3

    aget v5, v1, v3

    const/4 v6, 0x0

    aget v0, v0, v6

    aget v1, v1, v6

    sub-int/2addr v1, v0

    add-int/2addr v1, v3

    div-int/2addr v1, v2

    sub-int/2addr v5, v4

    add-int/2addr v5, v3

    div-int/2addr v5, v2

    if-lez v1, :cond_3

    if-lez v5, :cond_3

    div-int/lit8 v3, v2, 0x2

    add-int/2addr v4, v3

    add-int/2addr v0, v3

    new-instance v3, Lkg/b;

    invoke-direct {v3, v1, v5}, Lkg/b;-><init>(II)V

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_2

    mul-int v8, v7, v2

    add-int/2addr v8, v4

    move v9, v6

    :goto_1
    if-ge v9, v1, :cond_1

    mul-int v10, v9, v2

    add-int/2addr v10, v0

    invoke-virtual {p0, v10, v8}, Lkg/b;->g(II)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {v3, v9, v7}, Lkg/b;->r(II)V

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    return-object v3

    :cond_3
    invoke-static {}, Ldg/m;->a()Ldg/m;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {}, Ldg/m;->a()Ldg/m;

    move-result-object p0

    throw p0
.end method

.method private static d([ILkg/b;)I
    .locals 5

    invoke-virtual {p1}, Lkg/b;->m()I

    move-result v0

    const/4 v1, 0x0

    aget v2, p0, v1

    const/4 v3, 0x1

    aget v3, p0, v3

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2, v3}, Lkg/b;->g(II)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-eq v2, v0, :cond_2

    aget p0, p0, v1

    sub-int/2addr v2, p0

    if-eqz v2, :cond_1

    return v2

    :cond_1
    invoke-static {}, Ldg/m;->a()Ldg/m;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Ldg/m;->a()Ldg/m;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(Ldg/c;)Ldg/q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lng/a;->b(Ldg/c;Ljava/util/Map;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldg/c;Ljava/util/Map;)Ldg/q;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldg/c;",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)",
            "Ldg/q;"
        }
    .end annotation

    if-eqz p2, :cond_0

    sget-object v0, Ldg/e;->PURE_BARCODE:Ldg/e;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ldg/c;->a()Lkg/b;

    move-result-object p1

    invoke-static {p1}, Lng/a;->c(Lkg/b;)Lkg/b;

    move-result-object p1

    iget-object p2, p0, Lng/a;->a:Log/d;

    invoke-virtual {p2, p1}, Log/d;->b(Lkg/b;)Lkg/e;

    move-result-object p1

    sget-object p2, Lng/a;->b:[Ldg/s;

    goto :goto_0

    :cond_0
    new-instance p2, Lpg/a;

    invoke-virtual {p1}, Ldg/c;->a()Lkg/b;

    move-result-object p1

    invoke-direct {p2, p1}, Lpg/a;-><init>(Lkg/b;)V

    invoke-virtual {p2}, Lpg/a;->b()Lkg/g;

    move-result-object p1

    iget-object p2, p0, Lng/a;->a:Log/d;

    invoke-virtual {p1}, Lkg/g;->a()Lkg/b;

    move-result-object v0

    invoke-virtual {p2, v0}, Log/d;->b(Lkg/b;)Lkg/e;

    move-result-object p2

    invoke-virtual {p1}, Lkg/g;->b()[Ldg/s;

    move-result-object p1

    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    :goto_0
    new-instance v0, Ldg/q;

    invoke-virtual {p1}, Lkg/e;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkg/e;->e()[B

    move-result-object v2

    sget-object v3, Ldg/a;->DATA_MATRIX:Ldg/a;

    invoke-direct {v0, v1, v2, p2, v3}, Ldg/q;-><init>(Ljava/lang/String;[B[Ldg/s;Ldg/a;)V

    invoke-virtual {p1}, Lkg/e;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    sget-object v1, Ldg/r;->BYTE_SEGMENTS:Ldg/r;

    invoke-virtual {v0, v1, p2}, Ldg/q;->h(Ldg/r;Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, Lkg/e;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-object v1, Ldg/r;->ERROR_CORRECTION_LEVEL:Ldg/r;

    invoke-virtual {v0, v1, p2}, Ldg/q;->h(Ldg/r;Ljava/lang/Object;)V

    :cond_2
    sget-object p2, Ldg/r;->SYMBOLOGY_IDENTIFIER:Ldg/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "]d"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkg/e;->h()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Ldg/q;->h(Ldg/r;Ljava/lang/Object;)V

    return-object v0
.end method

.method public reset()V
    .locals 0

    return-void
.end method
