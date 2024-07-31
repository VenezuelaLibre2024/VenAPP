.class final Lv7/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/h0;
.implements Lx6/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Lv7/h0$a;

.field private c:Lx6/u$a;

.field final synthetic d:Lv7/g;


# direct methods
.method public constructor <init>(Lv7/g;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lv7/g$a;->d:Lv7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lv7/a;->w(Lv7/a0$b;)Lv7/h0$a;

    move-result-object v1

    iput-object v1, p0, Lv7/g$a;->b:Lv7/h0$a;

    invoke-virtual {p1, v0}, Lv7/a;->u(Lv7/a0$b;)Lx6/u$a;

    move-result-object p1

    iput-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    iput-object p2, p0, Lv7/g$a;->a:Ljava/lang/Object;

    return-void
.end method

.method private K(Lv7/x;)Lv7/x;
    .locals 14

    iget-object v0, p0, Lv7/g$a;->d:Lv7/g;

    iget-object v1, p0, Lv7/g$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lv7/x;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lv7/g;->H(Ljava/lang/Object;J)J

    move-result-wide v10

    iget-object v0, p0, Lv7/g$a;->d:Lv7/g;

    iget-object v1, p0, Lv7/g$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lv7/x;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lv7/g;->H(Ljava/lang/Object;J)J

    move-result-wide v12

    iget-wide v0, p1, Lv7/x;->f:J

    cmp-long v0, v10, v0

    if-nez v0, :cond_0

    iget-wide v0, p1, Lv7/x;->g:J

    cmp-long v0, v12, v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lv7/x;

    iget v5, p1, Lv7/x;->a:I

    iget v6, p1, Lv7/x;->b:I

    iget-object v7, p1, Lv7/x;->c:Lt6/u1;

    iget v8, p1, Lv7/x;->d:I

    iget-object v9, p1, Lv7/x;->e:Ljava/lang/Object;

    move-object v4, v0

    invoke-direct/range {v4 .. v13}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    return-object v0
.end method

.method private s(ILv7/a0$b;)Z
    .locals 3

    if-eqz p2, :cond_0

    iget-object v0, p0, Lv7/g$a;->d:Lv7/g;

    iget-object v1, p0, Lv7/g$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lv7/g;->G(Ljava/lang/Object;Lv7/a0$b;)Lv7/a0$b;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    :cond_1
    iget-object v0, p0, Lv7/g$a;->d:Lv7/g;

    iget-object v1, p0, Lv7/g$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lv7/g;->I(Ljava/lang/Object;I)I

    move-result p1

    iget-object v0, p0, Lv7/g$a;->b:Lv7/h0$a;

    iget v1, v0, Lv7/h0$a;->a:I

    if-ne v1, p1, :cond_2

    iget-object v0, v0, Lv7/h0$a;->b:Lv7/a0$b;

    invoke-static {v0, p2}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lv7/g$a;->d:Lv7/g;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lv7/a;->v(ILv7/a0$b;J)Lv7/h0$a;

    move-result-object v0

    iput-object v0, p0, Lv7/g$a;->b:Lv7/h0$a;

    :cond_3
    iget-object v0, p0, Lv7/g$a;->c:Lx6/u$a;

    iget v1, v0, Lx6/u$a;->a:I

    if-ne v1, p1, :cond_4

    iget-object v0, v0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-static {v0, p2}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, Lv7/g$a;->d:Lv7/g;

    invoke-virtual {v0, p1, p2}, Lv7/a;->t(ILv7/a0$b;)Lx6/u$a;

    move-result-object p1

    iput-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public B(ILv7/a0$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    invoke-virtual {p1}, Lx6/u$a;->i()V

    :cond_0
    return-void
.end method

.method public C(ILv7/a0$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    invoke-virtual {p1}, Lx6/u$a;->j()V

    :cond_0
    return-void
.end method

.method public D(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->b:Lv7/h0$a;

    invoke-direct {p0, p4}, Lv7/g$a;->K(Lv7/x;)Lv7/x;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lv7/h0$a;->s(Lv7/u;Lv7/x;)V

    :cond_0
    return-void
.end method

.method public F(ILv7/a0$b;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->b:Lv7/h0$a;

    invoke-direct {p0, p4}, Lv7/g$a;->K(Lv7/x;)Lv7/x;

    move-result-object p2

    invoke-virtual {p1, p3, p2, p5, p6}, Lv7/h0$a;->y(Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public G(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->b:Lv7/h0$a;

    invoke-direct {p0, p4}, Lv7/g$a;->K(Lv7/x;)Lv7/x;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lv7/h0$a;->B(Lv7/u;Lv7/x;)V

    :cond_0
    return-void
.end method

.method public I(ILv7/a0$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    invoke-virtual {p1, p3}, Lx6/u$a;->l(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public J(ILv7/a0$b;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    invoke-virtual {p1, p3}, Lx6/u$a;->k(I)V

    :cond_0
    return-void
.end method

.method public u(ILv7/a0$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    invoke-virtual {p1}, Lx6/u$a;->h()V

    :cond_0
    return-void
.end method

.method public v(ILv7/a0$b;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->b:Lv7/h0$a;

    invoke-direct {p0, p3}, Lv7/g$a;->K(Lv7/x;)Lv7/x;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv7/h0$a;->j(Lv7/x;)V

    :cond_0
    return-void
.end method

.method public w(ILv7/a0$b;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->b:Lv7/h0$a;

    invoke-direct {p0, p3}, Lv7/g$a;->K(Lv7/x;)Lv7/x;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv7/h0$a;->E(Lv7/x;)V

    :cond_0
    return-void
.end method

.method public x(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->b:Lv7/h0$a;

    invoke-direct {p0, p4}, Lv7/g$a;->K(Lv7/x;)Lv7/x;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lv7/h0$a;->v(Lv7/u;Lv7/x;)V

    :cond_0
    return-void
.end method

.method public y(ILv7/a0$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/g$a;->s(ILv7/a0$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/g$a;->c:Lx6/u$a;

    invoke-virtual {p1}, Lx6/u$a;->m()V

    :cond_0
    return-void
.end method
