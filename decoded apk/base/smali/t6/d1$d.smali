.class final Lt6/d1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/k;
.implements Lv8/a;
.implements Lt6/m3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private a:Lu8/k;

.field private b:Lv8/a;

.field private c:Lu8/k;

.field private d:Lv8/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lt6/d1$a;)V
    .locals 0

    invoke-direct {p0}, Lt6/d1$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJLt6/u1;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Lt6/d1$d;->c:Lu8/k;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lu8/k;->a(JJLt6/u1;Landroid/media/MediaFormat;)V

    :cond_0
    iget-object v1, p0, Lt6/d1$d;->a:Lu8/k;

    if-eqz v1, :cond_1

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lu8/k;->a(JJLt6/u1;Landroid/media/MediaFormat;)V

    :cond_1
    return-void
.end method

.method public b(J[F)V
    .locals 1

    iget-object v0, p0, Lt6/d1$d;->d:Lv8/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lv8/a;->b(J[F)V

    :cond_0
    iget-object v0, p0, Lt6/d1$d;->b:Lv8/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lv8/a;->b(J[F)V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lt6/d1$d;->d:Lv8/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv8/a;->c()V

    :cond_0
    iget-object v0, p0, Lt6/d1$d;->b:Lv8/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lv8/a;->c()V

    :cond_1
    return-void
.end method

.method public p(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, Lv8/l;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lt6/d1$d;->c:Lu8/k;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lv8/l;->getVideoFrameMetadataListener()Lu8/k;

    move-result-object p1

    iput-object p1, p0, Lt6/d1$d;->c:Lu8/k;

    invoke-virtual {p2}, Lv8/l;->getCameraMotionListener()Lv8/a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lt6/d1$d;->d:Lv8/a;

    goto :goto_1

    :cond_2
    check-cast p2, Lv8/a;

    iput-object p2, p0, Lt6/d1$d;->b:Lv8/a;

    goto :goto_1

    :cond_3
    check-cast p2, Lu8/k;

    iput-object p2, p0, Lt6/d1$d;->a:Lu8/k;

    :goto_1
    return-void
.end method
