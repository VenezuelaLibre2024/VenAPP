.class public Lq8/m;
.super Lq8/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/m$f;,
        Lq8/m$c;,
        Lq8/m$g;,
        Lq8/m$b;,
        Lq8/m$i;,
        Lq8/m$h;,
        Lq8/m$e;,
        Lq8/m$d;
    }
.end annotation


# static fields
.field private static final k:Lcom/google/common/collect/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/r0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lcom/google/common/collect/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/r0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:Ljava/lang/Object;

.field public final e:Landroid/content/Context;

.field private final f:Lq8/r$b;

.field private final g:Z

.field private h:Lq8/m$d;

.field private i:Lq8/m$f;

.field private j:Lv6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/f;

    invoke-direct {v0}, Lq8/f;-><init>()V

    invoke-static {v0}, Lcom/google/common/collect/r0;->a(Ljava/util/Comparator;)Lcom/google/common/collect/r0;

    move-result-object v0

    sput-object v0, Lq8/m;->k:Lcom/google/common/collect/r0;

    new-instance v0, Lq8/g;

    invoke-direct {v0}, Lq8/g;-><init>()V

    invoke-static {v0}, Lcom/google/common/collect/r0;->a(Ljava/util/Comparator;)Lcom/google/common/collect/r0;

    move-result-object v0

    sput-object v0, Lq8/m;->l:Lcom/google/common/collect/r0;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lq8/a$b;

    invoke-direct {v0}, Lq8/a$b;-><init>()V

    invoke-direct {p0, p1, v0}, Lq8/m;-><init>(Landroid/content/Context;Lq8/r$b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq8/r$b;)V
    .locals 1

    invoke-static {p1}, Lq8/m$d;->J(Landroid/content/Context;)Lq8/m$d;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lq8/m;-><init>(Landroid/content/Context;Lq8/y;Lq8/r$b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq8/y;Lq8/r$b;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Lq8/m;-><init>(Lq8/y;Lq8/r$b;Landroid/content/Context;)V

    return-void
.end method

.method private constructor <init>(Lq8/y;Lq8/r$b;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lq8/t;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lq8/m;->d:Ljava/lang/Object;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lq8/m;->e:Landroid/content/Context;

    iput-object p2, p0, Lq8/m;->f:Lq8/r$b;

    instance-of p2, p1, Lq8/m$d;

    if-eqz p2, :cond_1

    check-cast p1, Lq8/m$d;

    :goto_1
    iput-object p1, p0, Lq8/m;->h:Lq8/m$d;

    goto :goto_3

    :cond_1
    if-nez p3, :cond_2

    sget-object p2, Lq8/m$d;->D0:Lq8/m$d;

    goto :goto_2

    :cond_2
    invoke-static {p3}, Lq8/m$d;->J(Landroid/content/Context;)Lq8/m$d;

    move-result-object p2

    :goto_2
    invoke-virtual {p2}, Lq8/m$d;->I()Lq8/m$d$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lq8/m$d$a;->b0(Lq8/y;)Lq8/m$d$a;

    move-result-object p1

    invoke-virtual {p1}, Lq8/m$d$a;->X()Lq8/m$d;

    move-result-object p1

    goto :goto_1

    :goto_3
    sget-object p1, Lv6/e;->r:Lv6/e;

    iput-object p1, p0, Lq8/m;->j:Lv6/e;

    if-eqz p3, :cond_3

    invoke-static {p3}, Lt8/r0;->x0(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_4

    :cond_3
    const/4 p1, 0x0

    :goto_4
    iput-boolean p1, p0, Lq8/m;->g:Z

    if-nez p1, :cond_4

    if-eqz p3, :cond_4

    sget p1, Lt8/r0;->a:I

    const/16 p2, 0x20

    if-lt p1, p2, :cond_4

    invoke-static {p3}, Lq8/m$f;->g(Landroid/content/Context;)Lq8/m$f;

    move-result-object p1

    iput-object p1, p0, Lq8/m;->i:Lq8/m$f;

    :cond_4
    iget-object p1, p0, Lq8/m;->h:Lq8/m$d;

    iget-boolean p1, p1, Lq8/m$d;->x0:Z

    if-eqz p1, :cond_5

    if-nez p3, :cond_5

    const-string p1, "DefaultTrackSelector"

    const-string p2, "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."

    invoke-static {p1, p2}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method private static A(Lv7/f1;Lq8/y;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/f1;",
            "Lq8/y;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lq8/w;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lv7/f1;->a:I

    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v0}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v1

    iget-object v2, p1, Lq8/y;->J:Lcom/google/common/collect/y;

    invoke-virtual {v2, v1}, Lcom/google/common/collect/y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq8/w;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lq8/w;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq8/w;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lq8/w;->b:Lcom/google/common/collect/w;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v1, Lq8/w;->b:Lcom/google/common/collect/w;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-virtual {v1}, Lq8/w;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method protected static B(Lt6/u1;Ljava/lang/String;Z)I
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt6/u1;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x4

    return p0

    :cond_0
    invoke-static {p1}, Lq8/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lt6/u1;->c:Ljava/lang/String;

    invoke-static {p0}, Lq8/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    const-string p2, "-"

    invoke-static {p0, p2}, Lt8/r0;->S0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    aget-object p0, p0, v0

    invoke-static {p1, p2}, Lt8/r0;->S0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x2

    return p0

    :cond_3
    return v0

    :cond_4
    :goto_0
    const/4 p0, 0x3

    return p0

    :cond_5
    :goto_1
    if-eqz p2, :cond_6

    if-nez p0, :cond_6

    const/4 v0, 0x1

    :cond_6
    return v0
.end method

.method private static C(Lv7/d1;IIZ)I
    .locals 8

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_2

    if-ne p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lv7/d1;->a:I

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v2

    iget v3, v2, Lt6/u1;->B:I

    if-lez v3, :cond_1

    iget v4, v2, Lt6/u1;->C:I

    if-lez v4, :cond_1

    invoke-static {p3, p1, p2, v3, v4}, Lq8/m;->D(ZIIII)Landroid/graphics/Point;

    move-result-object v3

    iget v4, v2, Lt6/u1;->B:I

    iget v2, v2, Lt6/u1;->C:I

    mul-int v5, v4, v2

    iget v6, v3, Landroid/graphics/Point;->x:I

    int-to-float v6, v6

    const v7, 0x3f7ae148    # 0.98f

    mul-float/2addr v6, v7

    float-to-int v6, v6

    if-lt v4, v6, :cond_1

    iget v3, v3, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    mul-float/2addr v3, v7

    float-to-int v3, v3

    if-lt v2, v3, :cond_1

    if-ge v5, v0, :cond_1

    move v0, v5

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method private static D(ZIIII)Landroid/graphics/Point;
    .locals 3

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    const/4 v0, 0x0

    if-le p3, p4, :cond_0

    move v1, p0

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-le p1, p2, :cond_1

    goto :goto_1

    :cond_1
    move p0, v0

    :goto_1
    if-eq v1, p0, :cond_2

    goto :goto_2

    :cond_2
    move v2, p2

    move p2, p1

    move p1, v2

    :goto_2
    mul-int p0, p3, p1

    mul-int v0, p4, p2

    if-lt p0, v0, :cond_3

    new-instance p0, Landroid/graphics/Point;

    invoke-static {v0, p3}, Lt8/r0;->l(II)I

    move-result p1

    invoke-direct {p0, p2, p1}, Landroid/graphics/Point;-><init>(II)V

    return-object p0

    :cond_3
    new-instance p2, Landroid/graphics/Point;

    invoke-static {p0, p4}, Lt8/r0;->l(II)I

    move-result p0

    invoke-direct {p2, p0, p1}, Landroid/graphics/Point;-><init>(II)V

    return-object p2
.end method

.method private static E(II)I
    .locals 0

    if-eqz p0, :cond_0

    if-ne p0, p1, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    and-int/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Integer;->bitCount(I)I

    move-result p0

    return p0
.end method

.method private static F(Ljava/lang/String;)I
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "video/x-vnd.on2.vp9"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    move v6, v2

    goto :goto_0

    :sswitch_1
    const-string v1, "video/avc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    move v6, v3

    goto :goto_0

    :sswitch_2
    const-string v1, "video/hevc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    move v6, v4

    goto :goto_0

    :sswitch_3
    const-string v1, "video/av01"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    move v6, v5

    goto :goto_0

    :sswitch_4
    const-string v1, "video/dolby-vision"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    move v6, v0

    :goto_0
    packed-switch v6, :pswitch_data_0

    return v0

    :pswitch_0
    return v4

    :pswitch_1
    return v5

    :pswitch_2
    return v3

    :pswitch_3
    return v2

    :pswitch_4
    const/4 p0, 0x5

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private G(Lt6/u1;)Z
    .locals 3

    iget-object v0, p0, Lq8/m;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq8/m;->h:Lq8/m$d;

    iget-boolean v1, v1, Lq8/m$d;->x0:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lq8/m;->g:Z

    if-nez v1, :cond_2

    iget v1, p1, Lt6/u1;->J:I

    const/4 v2, 0x2

    if-le v1, v2, :cond_2

    invoke-static {p1}, Lq8/m;->H(Lt6/u1;)Z

    move-result v1

    const/16 v2, 0x20

    if-eqz v1, :cond_0

    sget v1, Lt8/r0;->a:I

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lq8/m;->i:Lq8/m$f;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lq8/m$f;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    sget v1, Lt8/r0;->a:I

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lq8/m;->i:Lq8/m$f;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lq8/m$f;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lq8/m;->i:Lq8/m$f;

    invoke-virtual {v1}, Lq8/m$f;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lq8/m;->i:Lq8/m$f;

    invoke-virtual {v1}, Lq8/m$f;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lq8/m;->i:Lq8/m$f;

    iget-object v2, p0, Lq8/m;->j:Lv6/e;

    invoke-virtual {v1, v2, p1}, Lq8/m$f;->a(Lv6/e;Lt6/u1;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static H(Lt6/u1;)Z
    .locals 4

    iget-object p0, p0, Lt6/u1;->w:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "audio/eac3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "audio/ac4"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "audio/ac3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    move v3, v2

    goto :goto_0

    :sswitch_3
    const-string v1, "audio/eac3-joc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    move v3, v0

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v0

    :pswitch_0
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_3
        0xb269698 -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59ae0c65 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected static I(IZ)Z
    .locals 1

    invoke-static {p0}, Lt6/r3;->F(I)I

    move-result p0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private synthetic J(Lq8/m$d;ZILv7/d1;[I)Ljava/util/List;
    .locals 6

    new-instance v5, Lq8/l;

    invoke-direct {v5, p0}, Lq8/l;-><init>(Lq8/m;)V

    move v0, p3

    move-object v1, p4

    move-object v2, p1

    move-object v3, p5

    move v4, p2

    invoke-static/range {v0 .. v5}, Lq8/m$b;->m(ILv7/d1;Lq8/m$d;[IZLeb/p;)Lcom/google/common/collect/w;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic K(Lq8/m$d;Ljava/lang/String;ILv7/d1;[I)Ljava/util/List;
    .locals 0

    invoke-static {p2, p3, p0, p4, p1}, Lq8/m$g;->m(ILv7/d1;Lq8/m$d;[ILjava/lang/String;)Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic L(Lq8/m$d;[IILv7/d1;[I)Ljava/util/List;
    .locals 0

    aget p1, p1, p2

    invoke-static {p2, p3, p0, p4, p1}, Lq8/m$i;->p(ILv7/d1;Lq8/m$d;[II)Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic M(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-ne p0, v1, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int v1, p0, p1

    :cond_2
    :goto_0
    return v1
.end method

.method private static synthetic N(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method private static O(Lq8/t$a;[[[I[Lt6/s3;[Lq8/r;)V
    .locals 10

    const/4 v0, -0x1

    const/4 v1, 0x0

    move v3, v0

    move v4, v3

    move v2, v1

    :goto_0
    invoke-virtual {p0}, Lq8/t$a;->d()I

    move-result v5

    const/4 v6, 0x1

    if-ge v2, v5, :cond_5

    invoke-virtual {p0, v2}, Lq8/t$a;->e(I)I

    move-result v5

    aget-object v7, p3, v2

    if-eq v5, v6, :cond_0

    const/4 v8, 0x2

    if-ne v5, v8, :cond_4

    :cond_0
    if-eqz v7, :cond_4

    aget-object v8, p1, v2

    invoke-virtual {p0, v2}, Lq8/t$a;->f(I)Lv7/f1;

    move-result-object v9

    invoke-static {v8, v9, v7}, Lq8/m;->R([[ILv7/f1;Lq8/r;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-ne v5, v6, :cond_2

    if-eq v4, v0, :cond_1

    goto :goto_1

    :cond_1
    move v4, v2

    goto :goto_2

    :cond_2
    if-eq v3, v0, :cond_3

    :goto_1
    move p0, v1

    goto :goto_3

    :cond_3
    move v3, v2

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    move p0, v6

    :goto_3
    if-eq v4, v0, :cond_6

    if-eq v3, v0, :cond_6

    move v1, v6

    :cond_6
    and-int/2addr p0, v1

    if-eqz p0, :cond_7

    new-instance p0, Lt6/s3;

    invoke-direct {p0, v6}, Lt6/s3;-><init>(Z)V

    aput-object p0, p2, v4

    aput-object p0, p2, v3

    :cond_7
    return-void
.end method

.method private P()V
    .locals 3

    iget-object v0, p0, Lq8/m;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq8/m;->h:Lq8/m$d;

    iget-boolean v1, v1, Lq8/m$d;->x0:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lq8/m;->g:Z

    if-nez v1, :cond_0

    sget v1, Lt8/r0;->a:I

    const/16 v2, 0x20

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lq8/m;->i:Lq8/m$f;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lq8/m$f;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lq8/a0;->c()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method protected static Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "und"

    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 p0, 0x0

    :cond_1
    return-object p0
.end method

.method private static R([[ILv7/f1;Lq8/r;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-interface {p2}, Lq8/u;->d()Lv7/d1;

    move-result-object v1

    invoke-virtual {p1, v1}, Lv7/f1;->d(Lv7/d1;)I

    move-result p1

    move v1, v0

    :goto_0
    invoke-interface {p2}, Lq8/u;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    aget-object v2, p0, p1

    invoke-interface {p2, v1}, Lq8/u;->b(I)I

    move-result v3

    aget v2, v2, v3

    invoke-static {v2}, Lt6/r3;->m(I)I

    move-result v2

    const/16 v3, 0x20

    if-eq v2, v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private W(ILq8/t$a;[[[ILq8/m$h$a;Ljava/util/Comparator;)Landroid/util/Pair;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lq8/m$h<",
            "TT;>;>(I",
            "Lq8/t$a;",
            "[[[I",
            "Lq8/m$h$a<",
            "TT;>;",
            "Ljava/util/Comparator<",
            "Ljava/util/List<",
            "TT;>;>;)",
            "Landroid/util/Pair<",
            "Lq8/r$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lq8/t$a;->d()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_7

    invoke-virtual {v0, v4}, Lq8/t$a;->e(I)I

    move-result v5

    move/from16 v6, p1

    if-ne v6, v5, :cond_6

    invoke-virtual {v0, v4}, Lq8/t$a;->f(I)Lv7/f1;

    move-result-object v5

    const/4 v7, 0x0

    :goto_1
    iget v8, v5, Lv7/f1;->a:I

    if-ge v7, v8, :cond_6

    invoke-virtual {v5, v7}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v8

    aget-object v9, p3, v4

    aget-object v9, v9, v7

    move-object/from16 v10, p4

    invoke-interface {v10, v4, v8, v9}, Lq8/m$h$a;->a(ILv7/d1;[I)Ljava/util/List;

    move-result-object v9

    iget v11, v8, Lv7/d1;->a:I

    new-array v11, v11, [Z

    const/4 v12, 0x0

    :goto_2
    iget v13, v8, Lv7/d1;->a:I

    if-ge v12, v13, :cond_5

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lq8/m$h;

    invoke-virtual {v13}, Lq8/m$h;->b()I

    move-result v14

    aget-boolean v15, v11, v12

    if-nez v15, :cond_4

    if-nez v14, :cond_0

    goto :goto_6

    :cond_0
    const/4 v15, 0x1

    if-ne v14, v15, :cond_1

    invoke-static {v13}, Lcom/google/common/collect/w;->w(Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object v13

    move/from16 v17, v2

    goto :goto_5

    :cond_1
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v16, v12, 0x1

    move/from16 v3, v16

    :goto_3
    iget v15, v8, Lv7/d1;->a:I

    if-ge v3, v15, :cond_3

    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lq8/m$h;

    invoke-virtual {v15}, Lq8/m$h;->b()I

    move-result v0

    move/from16 v17, v2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    invoke-virtual {v13, v15}, Lq8/m$h;->h(Lq8/m$h;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    aput-boolean v0, v11, v3

    goto :goto_4

    :cond_2
    const/4 v0, 0x1

    :goto_4
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p2

    move/from16 v2, v17

    goto :goto_3

    :cond_3
    move/from16 v17, v2

    move-object v13, v14

    :goto_5
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_4
    :goto_6
    move/from16 v17, v2

    :goto_7
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p2

    move/from16 v2, v17

    goto :goto_2

    :cond_5
    move/from16 v17, v2

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p2

    goto/16 :goto_1

    :cond_6
    move-object/from16 v10, p4

    move/from16 v17, v2

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p2

    move/from16 v2, v17

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    return-object v0

    :cond_8
    move-object/from16 v0, p5

    invoke-static {v1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    const/4 v2, 0x0

    :goto_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq8/m$h;

    iget v3, v3, Lq8/m$h;->c:I

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_9
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq8/m$h;

    new-instance v2, Lq8/r$a;

    iget-object v3, v0, Lq8/m$h;->b:Lv7/d1;

    invoke-direct {v2, v3, v1}, Lq8/r$a;-><init>(Lv7/d1;[I)V

    iget v0, v0, Lq8/m$h;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 0

    invoke-static {p0, p1}, Lq8/m;->N(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p0

    return p0
.end method

.method public static synthetic n(Lq8/m;Lt6/u1;)Z
    .locals 0

    invoke-direct {p0, p1}, Lq8/m;->G(Lt6/u1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic o(Lq8/m$d;[IILv7/d1;[I)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lq8/m;->L(Lq8/m$d;[IILv7/d1;[I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lq8/m$d;Ljava/lang/String;ILv7/d1;[I)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lq8/m;->K(Lq8/m$d;Ljava/lang/String;ILv7/d1;[I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lq8/m;Lq8/m$d;ZILv7/d1;[I)Ljava/util/List;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lq8/m;->J(Lq8/m$d;ZILv7/d1;[I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 0

    invoke-static {p0, p1}, Lq8/m;->M(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p0

    return p0
.end method

.method static synthetic s(Lv7/d1;IIZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq8/m;->C(Lv7/d1;IIZ)I

    move-result p0

    return p0
.end method

.method static synthetic t(II)I
    .locals 0

    invoke-static {p0, p1}, Lq8/m;->E(II)I

    move-result p0

    return p0
.end method

.method static synthetic u(Ljava/lang/String;)I
    .locals 0

    invoke-static {p0}, Lq8/m;->F(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static synthetic v()Lcom/google/common/collect/r0;
    .locals 1

    sget-object v0, Lq8/m;->k:Lcom/google/common/collect/r0;

    return-object v0
.end method

.method static synthetic w()Lcom/google/common/collect/r0;
    .locals 1

    sget-object v0, Lq8/m;->l:Lcom/google/common/collect/r0;

    return-object v0
.end method

.method static synthetic x(Lq8/m;)V
    .locals 0

    invoke-direct {p0}, Lq8/m;->P()V

    return-void
.end method

.method private static y(Lq8/t$a;Lq8/m$d;[Lq8/r$a;)V
    .locals 6

    invoke-virtual {p0}, Lq8/t$a;->d()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lq8/t$a;->f(I)Lv7/f1;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lq8/m$d;->N(ILv7/f1;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1, v1, v2}, Lq8/m$d;->M(ILv7/f1;)Lq8/m$e;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, v3, Lq8/m$e;->b:[I

    array-length v4, v4

    if-eqz v4, :cond_1

    new-instance v4, Lq8/r$a;

    iget v5, v3, Lq8/m$e;->a:I

    invoke-virtual {v2, v5}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v2

    iget-object v5, v3, Lq8/m$e;->b:[I

    iget v3, v3, Lq8/m$e;->d:I

    invoke-direct {v4, v2, v5, v3}, Lq8/r$a;-><init>(Lv7/d1;[II)V

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    aput-object v4, p2, v1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static z(Lq8/t$a;Lq8/y;[Lq8/r$a;)V
    .locals 5

    invoke-virtual {p0}, Lq8/t$a;->d()I

    move-result v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    invoke-virtual {p0, v3}, Lq8/t$a;->f(I)Lv7/f1;

    move-result-object v4

    invoke-static {v4, p1, v1}, Lq8/m;->A(Lv7/f1;Lq8/y;Ljava/util/Map;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lq8/t$a;->h()Lv7/f1;

    move-result-object v3

    invoke-static {v3, p1, v1}, Lq8/m;->A(Lv7/f1;Lq8/y;Ljava/util/Map;)V

    :goto_1
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Lq8/t$a;->e(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq8/w;

    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    iget-object v3, p1, Lq8/w;->b:Lcom/google/common/collect/w;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p0, v2}, Lq8/t$a;->f(I)Lv7/f1;

    move-result-object v3

    iget-object v4, p1, Lq8/w;->a:Lv7/d1;

    invoke-virtual {v3, v4}, Lv7/f1;->d(Lv7/d1;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    new-instance v3, Lq8/r$a;

    iget-object v4, p1, Lq8/w;->a:Lv7/d1;

    iget-object p1, p1, Lq8/w;->b:Lcom/google/common/collect/w;

    invoke-static {p1}, Lhb/e;->l(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-direct {v3, v4, p1}, Lq8/r$a;-><init>(Lv7/d1;[I)V

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    aput-object v3, p2, v2

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method protected S(Lq8/t$a;[[[I[ILq8/m$d;)[Lq8/r$a;
    .locals 5

    invoke-virtual {p1}, Lq8/t$a;->d()I

    move-result v0

    new-array v1, v0, [Lq8/r$a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lq8/m;->X(Lq8/t$a;[[[I[ILq8/m$d;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lq8/r$a;

    aput-object v2, v1, v3

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lq8/m;->T(Lq8/t$a;[[[I[ILq8/m$d;)Landroid/util/Pair;

    move-result-object p3

    if-eqz p3, :cond_1

    iget-object v2, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lq8/r$a;

    aput-object v3, v1, v2

    :cond_1
    const/4 v2, 0x0

    if-nez p3, :cond_2

    const/4 p3, 0x0

    goto :goto_0

    :cond_2
    iget-object p3, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v3, p3

    check-cast v3, Lq8/r$a;

    iget-object v3, v3, Lq8/r$a;->a:Lv7/d1;

    check-cast p3, Lq8/r$a;

    iget-object p3, p3, Lq8/r$a;->b:[I

    aget p3, p3, v2

    invoke-virtual {v3, p3}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object p3

    iget-object p3, p3, Lt6/u1;->c:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, p1, p2, p4, p3}, Lq8/m;->V(Lq8/t$a;[[[ILq8/m$d;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p3

    if-eqz p3, :cond_3

    iget-object v3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object p3, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p3, Lq8/r$a;

    aput-object p3, v1, v3

    :cond_3
    :goto_1
    if-ge v2, v0, :cond_5

    invoke-virtual {p1, v2}, Lq8/t$a;->e(I)I

    move-result p3

    const/4 v3, 0x2

    if-eq p3, v3, :cond_4

    const/4 v3, 0x1

    if-eq p3, v3, :cond_4

    const/4 v3, 0x3

    if-eq p3, v3, :cond_4

    invoke-virtual {p1, v2}, Lq8/t$a;->f(I)Lv7/f1;

    move-result-object v3

    aget-object v4, p2, v2

    invoke-virtual {p0, p3, v3, v4, p4}, Lq8/m;->U(ILv7/f1;[[ILq8/m$d;)Lq8/r$a;

    move-result-object p3

    aput-object p3, v1, v2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-object v1
.end method

.method protected T(Lq8/t$a;[[[I[ILq8/m$d;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq8/t$a;",
            "[[[I[I",
            "Lq8/m$d;",
            ")",
            "Landroid/util/Pair<",
            "Lq8/r$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 p3, 0x0

    move v0, p3

    :goto_0
    invoke-virtual {p1}, Lq8/t$a;->d()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v1, 0x2

    invoke-virtual {p1, v0}, Lq8/t$a;->e(I)I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1, v0}, Lq8/t$a;->f(I)Lv7/f1;

    move-result-object v1

    iget v1, v1, Lv7/f1;->a:I

    if-lez v1, :cond_0

    const/4 p3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v1, 0x1

    new-instance v4, Lq8/j;

    invoke-direct {v4, p0, p4, p3}, Lq8/j;-><init>(Lq8/m;Lq8/m$d;Z)V

    new-instance v5, Lq8/k;

    invoke-direct {v5}, Lq8/k;-><init>()V

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lq8/m;->W(ILq8/t$a;[[[ILq8/m$h$a;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method protected U(ILv7/f1;[[ILq8/m$d;)Lq8/r$a;
    .locals 11

    const/4 p1, 0x0

    const/4 v0, 0x0

    move-object v2, p1

    move-object v4, v2

    move v1, v0

    move v3, v1

    :goto_0
    iget v5, p2, Lv7/f1;->a:I

    if-ge v1, v5, :cond_3

    invoke-virtual {p2, v1}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v5

    aget-object v6, p3, v1

    move v7, v0

    :goto_1
    iget v8, v5, Lv7/d1;->a:I

    if-ge v7, v8, :cond_2

    aget v8, v6, v7

    iget-boolean v9, p4, Lq8/m$d;->y0:Z

    invoke-static {v8, v9}, Lq8/m;->I(IZ)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v5, v7}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v8

    new-instance v9, Lq8/m$c;

    aget v10, v6, v7

    invoke-direct {v9, v8, v10}, Lq8/m$c;-><init>(Lt6/u1;I)V

    if-eqz v4, :cond_0

    invoke-virtual {v9, v4}, Lq8/m$c;->b(Lq8/m$c;)I

    move-result v8

    if-lez v8, :cond_1

    :cond_0
    move-object v2, v5

    move v3, v7

    move-object v4, v9

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Lq8/r$a;

    const/4 p2, 0x1

    new-array p2, p2, [I

    aput v3, p2, v0

    invoke-direct {p1, v2, p2}, Lq8/r$a;-><init>(Lv7/d1;[I)V

    :goto_2
    return-object p1
.end method

.method protected V(Lq8/t$a;[[[ILq8/m$d;Ljava/lang/String;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq8/t$a;",
            "[[[I",
            "Lq8/m$d;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lq8/r$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x3

    new-instance v4, Lq8/d;

    invoke-direct {v4, p3, p4}, Lq8/d;-><init>(Lq8/m$d;Ljava/lang/String;)V

    new-instance v5, Lq8/e;

    invoke-direct {v5}, Lq8/e;-><init>()V

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lq8/m;->W(ILq8/t$a;[[[ILq8/m$h$a;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method protected X(Lq8/t$a;[[[I[ILq8/m$d;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq8/t$a;",
            "[[[I[I",
            "Lq8/m$d;",
            ")",
            "Landroid/util/Pair<",
            "Lq8/r$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x2

    new-instance v4, Lq8/h;

    invoke-direct {v4, p4, p3}, Lq8/h;-><init>(Lq8/m$d;[I)V

    new-instance v5, Lq8/i;

    invoke-direct {v5}, Lq8/i;-><init>()V

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lq8/m;->W(ILq8/t$a;[[[ILq8/m$h$a;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lq8/m;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, Lt8/r0;->a:I

    const/16 v2, 0x20

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lq8/m;->i:Lq8/m$f;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lq8/m$f;->f()V

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Lq8/a0;->f()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public h(Lv6/e;)V
    .locals 2

    iget-object v0, p0, Lq8/m;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq8/m;->j:Lv6/e;

    invoke-virtual {v1, p1}, Lv6/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object p1, p0, Lq8/m;->j:Lv6/e;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lq8/m;->P()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected final l(Lq8/t$a;[[[I[ILv7/a0$b;Lt6/d4;)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq8/t$a;",
            "[[[I[I",
            "Lv7/a0$b;",
            "Lt6/d4;",
            ")",
            "Landroid/util/Pair<",
            "[",
            "Lt6/s3;",
            "[",
            "Lq8/r;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq8/m;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq8/m;->h:Lq8/m$d;

    iget-boolean v2, v1, Lq8/m$d;->x0:Z

    if-eqz v2, :cond_0

    sget v2, Lt8/r0;->a:I

    const/16 v3, 0x20

    if-lt v2, v3, :cond_0

    iget-object v2, p0, Lq8/m;->i:Lq8/m$f;

    if-eqz v2, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v3}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Looper;

    invoke-virtual {v2, p0, v3}, Lq8/m$f;->b(Lq8/m;Landroid/os/Looper;)V

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lq8/t$a;->d()I

    move-result v0

    invoke-virtual {p0, p1, p2, p3, v1}, Lq8/m;->S(Lq8/t$a;[[[I[ILq8/m$d;)[Lq8/r$a;

    move-result-object p3

    invoke-static {p1, v1, p3}, Lq8/m;->z(Lq8/t$a;Lq8/y;[Lq8/r$a;)V

    invoke-static {p1, v1, p3}, Lq8/m;->y(Lq8/t$a;Lq8/m$d;[Lq8/r$a;)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v0, :cond_3

    invoke-virtual {p1, v3}, Lq8/t$a;->e(I)I

    move-result v5

    invoke-virtual {v1, v3}, Lq8/m$d;->L(I)Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v1, Lq8/y;->K:Lcom/google/common/collect/a0;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/google/common/collect/u;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    aput-object v4, p3, v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object v3, p0, Lq8/m;->f:Lq8/r$b;

    invoke-virtual {p0}, Lq8/a0;->a()Ls8/e;

    move-result-object v5

    invoke-interface {v3, p3, v5, p4, p5}, Lq8/r$b;->a([Lq8/r$a;Ls8/e;Lv7/a0$b;Lt6/d4;)[Lq8/r;

    move-result-object p3

    new-array p4, v0, [Lt6/s3;

    move p5, v2

    :goto_1
    if-ge p5, v0, :cond_9

    invoke-virtual {p1, p5}, Lq8/t$a;->e(I)I

    move-result v3

    invoke-virtual {v1, p5}, Lq8/m$d;->L(I)Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_5

    iget-object v5, v1, Lq8/y;->K:Lcom/google/common/collect/a0;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/google/common/collect/u;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v2

    goto :goto_3

    :cond_5
    :goto_2
    move v3, v6

    :goto_3
    if-nez v3, :cond_6

    invoke-virtual {p1, p5}, Lq8/t$a;->e(I)I

    move-result v3

    const/4 v5, -0x2

    if-eq v3, v5, :cond_7

    aget-object v3, p3, p5

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    move v6, v2

    :cond_7
    :goto_4
    if-eqz v6, :cond_8

    sget-object v3, Lt6/s3;->b:Lt6/s3;

    goto :goto_5

    :cond_8
    move-object v3, v4

    :goto_5
    aput-object v3, p4, p5

    add-int/lit8 p5, p5, 0x1

    goto :goto_1

    :cond_9
    iget-boolean p5, v1, Lq8/m$d;->z0:Z

    if-eqz p5, :cond_a

    invoke-static {p1, p2, p4, p3}, Lq8/m;->O(Lq8/t$a;[[[I[Lt6/s3;[Lq8/r;)V

    :cond_a
    invoke-static {p4, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method