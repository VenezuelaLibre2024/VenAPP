.class public final Li7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b0;


# instance fields
.field private a:Lt6/u1;

.field private b:Lt8/n0;

.field private c:Ly6/b0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt6/u1$b;

    invoke-direct {v0}, Lt6/u1$b;-><init>()V

    invoke-virtual {v0, p1}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p1

    iput-object p1, p0, Li7/v;->a:Lt6/u1;

    return-void
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Li7/v;->b:Lt8/n0;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li7/v;->c:Ly6/b0;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lt8/n0;Ly6/m;Li7/i0$d;)V
    .locals 0

    iput-object p1, p0, Li7/v;->b:Lt8/n0;

    invoke-virtual {p3}, Li7/i0$d;->a()V

    invoke-virtual {p3}, Li7/i0$d;->c()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Ly6/m;->d(II)Ly6/b0;

    move-result-object p1

    iput-object p1, p0, Li7/v;->c:Ly6/b0;

    iget-object p2, p0, Li7/v;->a:Lt6/u1;

    invoke-interface {p1, p2}, Ly6/b0;->c(Lt6/u1;)V

    return-void
.end method

.method public b(Lt8/e0;)V
    .locals 8

    invoke-direct {p0}, Li7/v;->c()V

    iget-object v0, p0, Li7/v;->b:Lt8/n0;

    invoke-virtual {v0}, Lt8/n0;->d()J

    move-result-wide v2

    iget-object v0, p0, Li7/v;->b:Lt8/n0;

    invoke-virtual {v0}, Lt8/n0;->e()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    cmp-long v4, v0, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Li7/v;->a:Lt6/u1;

    iget-wide v5, v4, Lt6/u1;->A:J

    cmp-long v5, v0, v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lt6/u1$b;->k0(J)Lt6/u1$b;

    move-result-object v0

    invoke-virtual {v0}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v0

    iput-object v0, p0, Li7/v;->a:Lt6/u1;

    iget-object v1, p0, Li7/v;->c:Ly6/b0;

    invoke-interface {v1, v0}, Ly6/b0;->c(Lt6/u1;)V

    :cond_1
    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v5

    iget-object v0, p0, Li7/v;->c:Ly6/b0;

    invoke-interface {v0, p1, v5}, Ly6/b0;->a(Lt8/e0;I)V

    iget-object v1, p0, Li7/v;->c:Ly6/b0;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Ly6/b0;->b(JIIILy6/b0$a;)V

    :cond_2
    :goto_0
    return-void
.end method
