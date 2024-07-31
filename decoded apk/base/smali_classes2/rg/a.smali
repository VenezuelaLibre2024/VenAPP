.class public final Lrg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/o;


# static fields
.field private static final b:[Ldg/s;


# instance fields
.field private final a:Lsg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ldg/s;

    sput-object v0, Lrg/a;->b:[Ldg/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsg/c;

    invoke-direct {v0}, Lsg/c;-><init>()V

    iput-object v0, p0, Lrg/a;->a:Lsg/c;

    return-void
.end method

.method private static c(Lkg/b;)Lkg/b;
    .locals 15

    invoke-virtual {p0}, Lkg/b;->i()[I

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    const/4 v5, 0x2

    aget v6, v0, v5

    const/4 v7, 0x3

    aget v0, v0, v7

    new-instance v7, Lkg/b;

    const/16 v8, 0x1e

    const/16 v9, 0x21

    invoke-direct {v7, v8, v9}, Lkg/b;-><init>(II)V

    move v10, v1

    :goto_0
    if-ge v10, v9, :cond_2

    mul-int v11, v10, v0

    div-int/lit8 v12, v0, 0x2

    add-int/2addr v11, v12

    div-int/2addr v11, v9

    add-int/2addr v11, v4

    add-int/lit8 v12, v0, -0x1

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    move v12, v1

    :goto_1
    if-ge v12, v8, :cond_1

    mul-int v13, v12, v6

    div-int/lit8 v14, v6, 0x2

    add-int/2addr v13, v14

    and-int/lit8 v14, v10, 0x1

    mul-int/2addr v14, v6

    div-int/2addr v14, v5

    add-int/2addr v13, v14

    div-int/2addr v13, v8

    add-int/lit8 v14, v6, -0x1

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    add-int/2addr v13, v2

    invoke-virtual {p0, v13, v11}, Lkg/b;->g(II)Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-virtual {v7, v12, v10}, Lkg/b;->r(II)V

    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    return-object v7

    :cond_3
    invoke-static {}, Ldg/m;->a()Ldg/m;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(Ldg/c;)Ldg/q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lrg/a;->b(Ldg/c;Ljava/util/Map;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldg/c;Ljava/util/Map;)Ldg/q;
    .locals 4
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

    invoke-virtual {p1}, Ldg/c;->a()Lkg/b;

    move-result-object p1

    invoke-static {p1}, Lrg/a;->c(Lkg/b;)Lkg/b;

    move-result-object p1

    iget-object v0, p0, Lrg/a;->a:Lsg/c;

    invoke-virtual {v0, p1, p2}, Lsg/c;->b(Lkg/b;Ljava/util/Map;)Lkg/e;

    move-result-object p1

    new-instance p2, Ldg/q;

    invoke-virtual {p1}, Lkg/e;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lkg/e;->e()[B

    move-result-object v1

    sget-object v2, Lrg/a;->b:[Ldg/s;

    sget-object v3, Ldg/a;->MAXICODE:Ldg/a;

    invoke-direct {p2, v0, v1, v2, v3}, Ldg/q;-><init>(Ljava/lang/String;[B[Ldg/s;Ldg/a;)V

    invoke-virtual {p1}, Lkg/e;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Ldg/r;->ERROR_CORRECTION_LEVEL:Ldg/r;

    invoke-virtual {p2, v0, p1}, Ldg/q;->h(Ldg/r;Ljava/lang/Object;)V

    :cond_0
    return-object p2
.end method

.method public reset()V
    .locals 0

    return-void
.end method
