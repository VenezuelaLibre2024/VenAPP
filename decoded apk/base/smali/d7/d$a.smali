.class Ld7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld7/d;->p(Ly6/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly6/z;

.field final synthetic b:Ld7/d;


# direct methods
.method constructor <init>(Ld7/d;Ly6/z;)V
    .locals 0

    iput-object p1, p0, Ld7/d$a;->b:Ld7/d;

    iput-object p2, p0, Ld7/d$a;->a:Ly6/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(J)Ly6/z$a;
    .locals 8

    iget-object v0, p0, Ld7/d$a;->a:Ly6/z;

    invoke-interface {v0, p1, p2}, Ly6/z;->d(J)Ly6/z$a;

    move-result-object p1

    new-instance p2, Ly6/z$a;

    new-instance v0, Ly6/a0;

    iget-object v1, p1, Ly6/z$a;->a:Ly6/a0;

    iget-wide v2, v1, Ly6/a0;->a:J

    iget-wide v4, v1, Ly6/a0;->b:J

    iget-object v1, p0, Ld7/d$a;->b:Ld7/d;

    invoke-static {v1}, Ld7/d;->a(Ld7/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Ly6/a0;-><init>(JJ)V

    new-instance v1, Ly6/a0;

    iget-object p1, p1, Ly6/z$a;->b:Ly6/a0;

    iget-wide v2, p1, Ly6/a0;->a:J

    iget-wide v4, p1, Ly6/a0;->b:J

    iget-object p1, p0, Ld7/d$a;->b:Ld7/d;

    invoke-static {p1}, Ld7/d;->a(Ld7/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Ly6/a0;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Ly6/z$a;-><init>(Ly6/a0;Ly6/a0;)V

    return-object p2
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Ld7/d$a;->a:Ly6/z;

    invoke-interface {v0}, Ly6/z;->h()Z

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Ld7/d$a;->a:Ly6/z;

    invoke-interface {v0}, Ly6/z;->i()J

    move-result-wide v0

    return-wide v0
.end method
