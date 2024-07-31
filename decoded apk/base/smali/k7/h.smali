.class final Lk7/h;
.super Lw6/g;
.source "SourceFile"


# instance fields
.field private t:J

.field private u:I

.field private v:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lw6/g;-><init>(I)V

    const/16 v0, 0x20

    iput v0, p0, Lk7/h;->v:I

    return-void
.end method

.method private E(Lw6/g;)Z
    .locals 4

    invoke-virtual {p0}, Lk7/h;->I()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lk7/h;->u:I

    iget v2, p0, Lk7/h;->v:I

    const/4 v3, 0x0

    if-lt v0, v2, :cond_1

    return v3

    :cond_1
    invoke-virtual {p1}, Lw6/a;->r()Z

    move-result v0

    invoke-virtual {p0}, Lw6/a;->r()Z

    move-result v2

    if-eq v0, v2, :cond_2

    return v3

    :cond_2
    iget-object p1, p1, Lw6/g;->c:Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_3

    iget-object v0, p0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    add-int/2addr v0, p1

    const p1, 0x2ee000

    if-le v0, p1, :cond_3

    return v3

    :cond_3
    return v1
.end method


# virtual methods
.method public D(Lw6/g;)Z
    .locals 4

    invoke-virtual {p1}, Lw6/g;->A()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->a(Z)V

    invoke-virtual {p1}, Lw6/a;->q()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->a(Z)V

    invoke-virtual {p1}, Lw6/a;->s()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->a(Z)V

    invoke-direct {p0, p1}, Lk7/h;->E(Lw6/g;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lk7/h;->u:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lk7/h;->u:I

    if-nez v0, :cond_1

    iget-wide v2, p1, Lw6/g;->e:J

    iput-wide v2, p0, Lw6/g;->e:J

    invoke-virtual {p1}, Lw6/a;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lw6/a;->w(I)V

    :cond_1
    invoke-virtual {p1}, Lw6/a;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Lw6/a;->w(I)V

    :cond_2
    iget-object v0, p1, Lw6/g;->c:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-virtual {p0, v2}, Lw6/g;->y(I)V

    iget-object v2, p0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_3
    iget-wide v2, p1, Lw6/g;->e:J

    iput-wide v2, p0, Lk7/h;->t:J

    return v1
.end method

.method public F()J
    .locals 2

    iget-wide v0, p0, Lw6/g;->e:J

    return-wide v0
.end method

.method public G()J
    .locals 2

    iget-wide v0, p0, Lk7/h;->t:J

    return-wide v0
.end method

.method public H()I
    .locals 1

    iget v0, p0, Lk7/h;->u:I

    return v0
.end method

.method public I()Z
    .locals 1

    iget v0, p0, Lk7/h;->u:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public J(I)V
    .locals 1

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    iput p1, p0, Lk7/h;->v:I

    return-void
.end method

.method public n()V
    .locals 1

    invoke-super {p0}, Lw6/g;->n()V

    const/4 v0, 0x0

    iput v0, p0, Lk7/h;->u:I

    return-void
.end method
