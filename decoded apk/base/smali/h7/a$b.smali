.class final Lh7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lh7/a;


# direct methods
.method private constructor <init>(Lh7/a;)V
    .locals 0

    iput-object p1, p0, Lh7/a$b;->a:Lh7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lh7/a;Lh7/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lh7/a$b;-><init>(Lh7/a;)V

    return-void
.end method


# virtual methods
.method public d(J)Ly6/z$a;
    .locals 10

    iget-object v0, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v0}, Lh7/a;->d(Lh7/a;)Lh7/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh7/i;->c(J)J

    move-result-wide v0

    iget-object v2, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v2}, Lh7/a;->e(Lh7/a;)J

    move-result-wide v2

    iget-object v4, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v4}, Lh7/a;->f(Lh7/a;)J

    move-result-wide v4

    iget-object v6, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v6}, Lh7/a;->e(Lh7/a;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    mul-long/2addr v0, v4

    iget-object v4, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v4}, Lh7/a;->g(Lh7/a;)J

    move-result-wide v4

    div-long/2addr v0, v4

    add-long/2addr v2, v0

    const-wide/16 v0, 0x7530

    sub-long v4, v2, v0

    iget-object v0, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v0}, Lh7/a;->e(Lh7/a;)J

    move-result-wide v6

    iget-object v0, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v0}, Lh7/a;->f(Lh7/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    invoke-static/range {v4 .. v9}, Lt8/r0;->r(JJJ)J

    move-result-wide v0

    new-instance v2, Ly6/z$a;

    new-instance v3, Ly6/a0;

    invoke-direct {v3, p1, p2, v0, v1}, Ly6/a0;-><init>(JJ)V

    invoke-direct {v2, v3}, Ly6/z$a;-><init>(Ly6/a0;)V

    return-object v2
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i()J
    .locals 3

    iget-object v0, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v0}, Lh7/a;->d(Lh7/a;)Lh7/i;

    move-result-object v0

    iget-object v1, p0, Lh7/a$b;->a:Lh7/a;

    invoke-static {v1}, Lh7/a;->g(Lh7/a;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lh7/i;->b(J)J

    move-result-wide v0

    return-wide v0
.end method
