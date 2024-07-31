.class final Lv7/z0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field final synthetic c:Lv7/z0;


# direct methods
.method private constructor <init>(Lv7/z0;)V
    .locals 0

    iput-object p1, p0, Lv7/z0$b;->c:Lv7/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lv7/z0;Lv7/z0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lv7/z0$b;-><init>(Lv7/z0;)V

    return-void
.end method

.method private b()V
    .locals 8

    iget-boolean v0, p0, Lv7/z0$b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lv7/z0$b;->c:Lv7/z0;

    invoke-static {v0}, Lv7/z0;->a(Lv7/z0;)Lv7/h0$a;

    move-result-object v1

    iget-object v0, p0, Lv7/z0$b;->c:Lv7/z0;

    iget-object v0, v0, Lv7/z0;->u:Lt6/u1;

    iget-object v0, v0, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v0}, Lt8/w;->k(Ljava/lang/String;)I

    move-result v2

    iget-object v0, p0, Lv7/z0$b;->c:Lv7/z0;

    iget-object v3, v0, Lv7/z0;->u:Lt6/u1;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v1 .. v7}, Lv7/h0$a;->i(ILt6/u1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv7/z0$b;->b:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lv7/z0$b;->c:Lv7/z0;

    iget-boolean v1, v0, Lv7/z0;->v:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Lv7/z0;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->a()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget v0, p0, Lv7/z0$b;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lv7/z0$b;->a:I

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lv7/z0$b;->c:Lv7/z0;

    iget-boolean v0, v0, Lv7/z0;->w:Z

    return v0
.end method

.method public p(J)I
    .locals 2

    invoke-direct {p0}, Lv7/z0$b;->b()V

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    iget p1, p0, Lv7/z0$b;->a:I

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    iput p2, p0, Lv7/z0$b;->a:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 7

    invoke-direct {p0}, Lv7/z0$b;->b()V

    iget-object v0, p0, Lv7/z0$b;->c:Lv7/z0;

    iget-boolean v1, v0, Lv7/z0;->w:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    iget-object v3, v0, Lv7/z0;->x:[B

    if-nez v3, :cond_0

    iput v2, p0, Lv7/z0$b;->a:I

    :cond_0
    iget v3, p0, Lv7/z0$b;->a:I

    const/4 v4, -0x4

    if-ne v3, v2, :cond_1

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, Lw6/a;->m(I)V

    return v4

    :cond_1
    and-int/lit8 v5, p3, 0x2

    const/4 v6, 0x1

    if-nez v5, :cond_6

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    const/4 p1, -0x3

    return p1

    :cond_3
    iget-object p1, v0, Lv7/z0;->x:[B

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v6}, Lw6/a;->m(I)V

    const-wide/16 v0, 0x0

    iput-wide v0, p2, Lw6/g;->e:J

    and-int/lit8 p1, p3, 0x4

    if-nez p1, :cond_4

    iget-object p1, p0, Lv7/z0$b;->c:Lv7/z0;

    iget p1, p1, Lv7/z0;->y:I

    invoke-virtual {p2, p1}, Lw6/g;->y(I)V

    iget-object p1, p2, Lw6/g;->c:Ljava/nio/ByteBuffer;

    iget-object p2, p0, Lv7/z0$b;->c:Lv7/z0;

    iget-object v0, p2, Lv7/z0;->x:[B

    const/4 v1, 0x0

    iget p2, p2, Lv7/z0;->y:I

    invoke-virtual {p1, v0, v1, p2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    :cond_4
    and-int/lit8 p1, p3, 0x1

    if-nez p1, :cond_5

    iput v2, p0, Lv7/z0$b;->a:I

    :cond_5
    return v4

    :cond_6
    :goto_0
    iget-object p2, v0, Lv7/z0;->u:Lt6/u1;

    iput-object p2, p1, Lt6/v1;->b:Lt6/u1;

    iput v6, p0, Lv7/z0$b;->a:I

    const/4 p1, -0x5

    return p1
.end method
