.class final Lv7/i0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lv7/v0;

.field private final b:J


# direct methods
.method public constructor <init>(Lv7/v0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/i0$c;->a:Lv7/v0;

    iput-wide p2, p0, Lv7/i0$c;->b:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lv7/i0$c;->a:Lv7/v0;

    invoke-interface {v0}, Lv7/v0;->a()V

    return-void
.end method

.method public b()Lv7/v0;
    .locals 1

    iget-object v0, p0, Lv7/i0$c;->a:Lv7/v0;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lv7/i0$c;->a:Lv7/v0;

    invoke-interface {v0}, Lv7/v0;->d()Z

    move-result v0

    return v0
.end method

.method public p(J)I
    .locals 3

    iget-object v0, p0, Lv7/i0$c;->a:Lv7/v0;

    iget-wide v1, p0, Lv7/i0$c;->b:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lv7/v0;->p(J)I

    move-result p1

    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 4

    iget-object v0, p0, Lv7/i0$c;->a:Lv7/v0;

    invoke-interface {v0, p1, p2, p3}, Lv7/v0;->q(Lt6/v1;Lw6/g;I)I

    move-result p1

    const/4 p3, -0x4

    if-ne p1, p3, :cond_0

    iget-wide v0, p2, Lw6/g;->e:J

    iget-wide v2, p0, Lv7/i0$c;->b:J

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p2, Lw6/g;->e:J

    :cond_0
    return p1
.end method
