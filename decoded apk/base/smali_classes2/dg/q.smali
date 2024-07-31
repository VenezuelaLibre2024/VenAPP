.class public final Ldg/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[B

.field private final c:I

.field private d:[Ldg/s;

.field private final e:Ldg/a;

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ldg/r;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;[BI[Ldg/s;Ldg/a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldg/q;->a:Ljava/lang/String;

    iput-object p2, p0, Ldg/q;->b:[B

    iput p3, p0, Ldg/q;->c:I

    iput-object p4, p0, Ldg/q;->d:[Ldg/s;

    iput-object p5, p0, Ldg/q;->e:Ldg/a;

    const/4 p1, 0x0

    iput-object p1, p0, Ldg/q;->f:Ljava/util/Map;

    iput-wide p6, p0, Ldg/q;->g:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B[Ldg/s;Ldg/a;)V
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Ldg/q;-><init>(Ljava/lang/String;[B[Ldg/s;Ldg/a;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B[Ldg/s;Ldg/a;J)V
    .locals 9

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    array-length v0, p2

    mul-int/lit8 v0, v0, 0x8

    :goto_0
    move v4, v0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    move-wide v7, p5

    invoke-direct/range {v1 .. v8}, Ldg/q;-><init>(Ljava/lang/String;[BI[Ldg/s;Ldg/a;J)V

    return-void
.end method


# virtual methods
.method public a([Ldg/s;)V
    .locals 4

    iget-object v0, p0, Ldg/q;->d:[Ldg/s;

    if-nez v0, :cond_0

    iput-object p1, p0, Ldg/q;->d:[Ldg/s;

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    array-length v1, p1

    if-lez v1, :cond_1

    array-length v1, v0

    array-length v2, p1

    add-int/2addr v1, v2

    new-array v1, v1, [Ldg/s;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v1, p0, Ldg/q;->d:[Ldg/s;

    :cond_1
    :goto_0
    return-void
.end method

.method public b()Ldg/a;
    .locals 1

    iget-object v0, p0, Ldg/q;->e:Ldg/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Ldg/q;->b:[B

    return-object v0
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ldg/r;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldg/q;->f:Ljava/util/Map;

    return-object v0
.end method

.method public e()[Ldg/s;
    .locals 1

    iget-object v0, p0, Ldg/q;->d:[Ldg/s;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldg/q;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ldg/r;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Ldg/q;->f:Ljava/util/Map;

    if-nez v0, :cond_0

    iput-object p1, p0, Ldg/q;->f:Ljava/util/Map;

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public h(Ldg/r;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ldg/q;->f:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Ldg/r;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Ldg/q;->f:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Ldg/q;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldg/q;->a:Ljava/lang/String;

    return-object v0
.end method
