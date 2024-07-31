.class final Lh7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:Ly6/t;

.field private b:Ly6/t$a;

.field private c:J

.field private d:J


# direct methods
.method public constructor <init>(Ly6/t;Ly6/t$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/b$a;->a:Ly6/t;

    iput-object p2, p0, Lh7/b$a;->b:Ly6/t$a;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lh7/b$a;->c:J

    iput-wide p1, p0, Lh7/b$a;->d:J

    return-void
.end method


# virtual methods
.method public a(Ly6/l;)J
    .locals 6

    iget-wide v0, p0, Lh7/b$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    const-wide/16 v2, -0x1

    if-ltz p1, :cond_0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    neg-long v0, v0

    iput-wide v2, p0, Lh7/b$a;->d:J

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public b()Ly6/z;
    .locals 4

    iget-wide v0, p0, Lh7/b$a;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    new-instance v0, Ly6/s;

    iget-object v1, p0, Lh7/b$a;->a:Ly6/t;

    iget-wide v2, p0, Lh7/b$a;->c:J

    invoke-direct {v0, v1, v2, v3}, Ly6/s;-><init>(Ly6/t;J)V

    return-object v0
.end method

.method public c(J)V
    .locals 2

    iget-object v0, p0, Lh7/b$a;->b:Ly6/t$a;

    iget-object v0, v0, Ly6/t$a;->a:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lt8/r0;->i([JJZZ)I

    move-result p1

    aget-wide p1, v0, p1

    iput-wide p1, p0, Lh7/b$a;->d:J

    return-void
.end method

.method public d(J)V
    .locals 0

    iput-wide p1, p0, Lh7/b$a;->c:J

    return-void
.end method
