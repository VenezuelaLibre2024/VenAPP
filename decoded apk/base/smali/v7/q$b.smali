.class final Lv7/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lt6/u1;


# direct methods
.method public constructor <init>(Lt6/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/q$b;->a:Lt6/u1;

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    return-void
.end method

.method public b(Ly6/m;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-interface {p1, v0, v1}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v0

    new-instance v1, Ly6/z$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Ly6/z$b;-><init>(J)V

    invoke-interface {p1, v1}, Ly6/m;->p(Ly6/z;)V

    invoke-interface {p1}, Ly6/m;->q()V

    iget-object p1, p0, Lv7/q$b;->a:Lt6/u1;

    invoke-virtual {p1}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object p1

    const-string v1, "text/x-unknown"

    invoke-virtual {p1, v1}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p1

    iget-object v1, p0, Lv7/q$b;->a:Lt6/u1;

    iget-object v1, v1, Lt6/u1;->w:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lt6/u1$b;->K(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p1

    invoke-interface {v0, p1}, Ly6/b0;->c(Lt6/u1;)V

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 0

    const p2, 0x7fffffff

    invoke-interface {p1, p2}, Ly6/l;->a(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
