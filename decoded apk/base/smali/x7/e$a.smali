.class final Lx7/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lt6/u1;

.field private final d:Ly6/j;

.field public e:Lt6/u1;

.field private f:Ly6/b0;

.field private g:J


# direct methods
.method public constructor <init>(IILt6/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx7/e$a;->a:I

    iput p2, p0, Lx7/e$a;->b:I

    iput-object p3, p0, Lx7/e$a;->c:Lt6/u1;

    new-instance p1, Ly6/j;

    invoke-direct {p1}, Ly6/j;-><init>()V

    iput-object p1, p0, Lx7/e$a;->d:Ly6/j;

    return-void
.end method


# virtual methods
.method public b(JIIILy6/b0$a;)V
    .locals 8

    iget-wide v0, p0, Lx7/e$a;->g:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lx7/e$a;->d:Ly6/j;

    iput-object v0, p0, Lx7/e$a;->f:Ly6/b0;

    :cond_0
    iget-object v0, p0, Lx7/e$a;->f:Ly6/b0;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ly6/b0;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Ly6/b0;->b(JIIILy6/b0$a;)V

    return-void
.end method

.method public c(Lt6/u1;)V
    .locals 1

    iget-object v0, p0, Lx7/e$a;->c:Lt6/u1;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lt6/u1;->l(Lt6/u1;)Lt6/u1;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lx7/e$a;->e:Lt6/u1;

    iget-object p1, p0, Lx7/e$a;->f:Ly6/b0;

    invoke-static {p1}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly6/b0;

    iget-object v0, p0, Lx7/e$a;->e:Lt6/u1;

    invoke-interface {p1, v0}, Ly6/b0;->c(Lt6/u1;)V

    return-void
.end method

.method public d(Lt8/e0;II)V
    .locals 0

    iget-object p3, p0, Lx7/e$a;->f:Ly6/b0;

    invoke-static {p3}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly6/b0;

    invoke-interface {p3, p1, p2}, Ly6/b0;->a(Lt8/e0;I)V

    return-void
.end method

.method public e(Ls8/h;IZI)I
    .locals 0

    iget-object p4, p0, Lx7/e$a;->f:Ly6/b0;

    invoke-static {p4}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly6/b0;

    invoke-interface {p4, p1, p2, p3}, Ly6/b0;->f(Ls8/h;IZ)I

    move-result p1

    return p1
.end method

.method public g(Lx7/g$b;J)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lx7/e$a;->d:Ly6/j;

    iput-object p1, p0, Lx7/e$a;->f:Ly6/b0;

    return-void

    :cond_0
    iput-wide p2, p0, Lx7/e$a;->g:J

    iget p2, p0, Lx7/e$a;->a:I

    iget p3, p0, Lx7/e$a;->b:I

    invoke-interface {p1, p2, p3}, Lx7/g$b;->d(II)Ly6/b0;

    move-result-object p1

    iput-object p1, p0, Lx7/e$a;->f:Ly6/b0;

    iget-object p2, p0, Lx7/e$a;->e:Lt6/u1;

    if-eqz p2, :cond_1

    invoke-interface {p1, p2}, Ly6/b0;->c(Lt6/u1;)V

    :cond_1
    return-void
.end method
