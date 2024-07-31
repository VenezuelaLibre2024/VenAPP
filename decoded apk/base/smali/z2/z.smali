.class public Lz2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lz2/m;

.field private final b:J

.field private final c:J

.field private final d:Z


# direct methods
.method private constructor <init>(Lz2/m;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/z;->a:Lz2/m;

    iput-wide p2, p0, Lz2/z;->b:J

    iput-wide p4, p0, Lz2/z;->c:J

    iput-boolean p6, p0, Lz2/z;->d:Z

    return-void
.end method

.method public static e(Ljava/util/Map;)Lz2/z;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lz2/z;"
        }
    .end annotation

    if-nez p0, :cond_0

    new-instance p0, Lz2/z;

    sget-object v1, Lz2/m;->best:Lz2/m;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1388

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lz2/z;-><init>(Lz2/m;JJZ)V

    return-object p0

    :cond_0
    const-string v0, "accuracy"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "distanceFilter"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const-string v2, "timeInterval"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "useMSLAltitude"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    sget-object v3, Lz2/m;->best:Lz2/m;

    const/4 v4, 0x1

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_5

    if-eq v0, v4, :cond_4

    const/4 v5, 0x2

    if-eq v0, v5, :cond_3

    const/4 v5, 0x3

    if-eq v0, v5, :cond_2

    const/4 v5, 0x5

    if-eq v0, v5, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lz2/m;->bestForNavigation:Lz2/m;

    goto :goto_0

    :cond_2
    sget-object v3, Lz2/m;->high:Lz2/m;

    goto :goto_0

    :cond_3
    sget-object v3, Lz2/m;->medium:Lz2/m;

    goto :goto_0

    :cond_4
    sget-object v3, Lz2/m;->low:Lz2/m;

    goto :goto_0

    :cond_5
    sget-object v3, Lz2/m;->lowest:Lz2/m;

    :cond_6
    :goto_0
    move-object v6, v3

    new-instance v0, Lz2/z;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v7, v1

    goto :goto_1

    :cond_7
    const-wide/16 v7, 0x0

    :goto_1
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    goto :goto_2

    :cond_8
    const-wide/16 v1, 0x1388

    :goto_2
    move-wide v9, v1

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_9

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    :goto_3
    move v11, v4

    move-object v5, v0

    invoke-direct/range {v5 .. v11}, Lz2/z;-><init>(Lz2/m;JJZ)V

    return-object v0
.end method


# virtual methods
.method public a()Lz2/m;
    .locals 1

    iget-object v0, p0, Lz2/z;->a:Lz2/m;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lz2/z;->b:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lz2/z;->c:J

    return-wide v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lz2/z;->d:Z

    return v0
.end method
