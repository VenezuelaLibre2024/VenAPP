.class public abstract Lg8/h;
.super Lw6/j;
.source "SourceFile"

# interfaces
.implements Lg8/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw6/j<",
        "Lg8/n;",
        "Lg8/o;",
        "Lg8/k;",
        ">;",
        "Lg8/j;"
    }
.end annotation


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [Lg8/n;

    new-array v0, v0, [Lg8/o;

    invoke-direct {p0, v1, v0}, Lw6/j;-><init>([Lw6/g;[Lw6/h;)V

    iput-object p1, p0, Lg8/h;->n:Ljava/lang/String;

    const/16 p1, 0x400

    invoke-virtual {p0, p1}, Lw6/j;->u(I)V

    return-void
.end method

.method static synthetic v(Lg8/h;Lw6/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lw6/j;->r(Lw6/h;)V

    return-void
.end method


# virtual methods
.method protected final A(Lg8/n;Lg8/o;Z)Lg8/k;
    .locals 8

    :try_start_0
    iget-object v0, p1, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Lg8/h;->z([BIZ)Lg8/i;

    move-result-object v5

    iget-wide v3, p1, Lw6/g;->e:J

    iget-wide v6, p1, Lg8/n;->t:J

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Lg8/o;->y(JLg8/i;J)V

    const/high16 p1, -0x80000000

    invoke-virtual {p2, p1}, Lw6/a;->o(I)V
    :try_end_0
    .catch Lg8/k; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public a(J)V
    .locals 0

    return-void
.end method

.method protected bridge synthetic g()Lw6/g;
    .locals 1

    invoke-virtual {p0}, Lg8/h;->w()Lg8/n;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic h()Lw6/h;
    .locals 1

    invoke-virtual {p0}, Lg8/h;->x()Lg8/o;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic i(Ljava/lang/Throwable;)Lw6/f;
    .locals 0

    invoke-virtual {p0, p1}, Lg8/h;->y(Ljava/lang/Throwable;)Lg8/k;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic j(Lw6/g;Lw6/h;Z)Lw6/f;
    .locals 0

    check-cast p1, Lg8/n;

    check-cast p2, Lg8/o;

    invoke-virtual {p0, p1, p2, p3}, Lg8/h;->A(Lg8/n;Lg8/o;Z)Lg8/k;

    move-result-object p1

    return-object p1
.end method

.method protected final w()Lg8/n;
    .locals 1

    new-instance v0, Lg8/n;

    invoke-direct {v0}, Lg8/n;-><init>()V

    return-object v0
.end method

.method protected final x()Lg8/o;
    .locals 1

    new-instance v0, Lg8/h$a;

    invoke-direct {v0, p0}, Lg8/h$a;-><init>(Lg8/h;)V

    return-object v0
.end method

.method protected final y(Ljava/lang/Throwable;)Lg8/k;
    .locals 2

    new-instance v0, Lg8/k;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Lg8/k;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method protected abstract z([BIZ)Lg8/i;
.end method
