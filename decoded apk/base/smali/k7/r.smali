.class public abstract Lk7/r;
.super Lt6/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/r$a;,
        Lk7/r$c;,
        Lk7/r$b;
    }
.end annotation


# static fields
.field private static final N0:[B


# instance fields
.field private final A:Z

.field private A0:Z

.field private final B:F

.field private B0:Z

.field private final C:Lw6/g;

.field private C0:J

.field private final D:Lw6/g;

.field private D0:J

.field private final E:Lw6/g;

.field private E0:Z

.field private final F:Lk7/h;

.field private F0:Z

.field private final G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private G0:Z

.field private final H:Landroid/media/MediaCodec$BufferInfo;

.field private H0:Z

.field private final I:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lk7/r$c;",
            ">;"
        }
    .end annotation
.end field

.field private I0:Lt6/x;

.field private J:Lt6/u1;

.field protected J0:Lw6/e;

.field private K:Lt6/u1;

.field private K0:Lk7/r$c;

.field private L:Lx6/n;

.field private L0:J

.field private M:Lx6/n;

.field private M0:Z

.field private N:Landroid/media/MediaCrypto;

.field private O:Z

.field private P:J

.field private Q:F

.field private R:F

.field private S:Lk7/l;

.field private T:Lt6/u1;

.field private U:Landroid/media/MediaFormat;

.field private V:Z

.field private W:F

.field private X:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lk7/p;",
            ">;"
        }
    .end annotation
.end field

.field private Y:Lk7/r$b;

.field private Z:Lk7/p;

.field private a0:I

.field private b0:Z

.field private c0:Z

.field private d0:Z

.field private e0:Z

.field private f0:Z

.field private g0:Z

.field private h0:Z

.field private i0:Z

.field private j0:Z

.field private k0:Z

.field private l0:Lk7/i;

.field private m0:J

.field private n0:I

.field private o0:I

.field private p0:Ljava/nio/ByteBuffer;

.field private q0:Z

.field private r0:Z

.field private s0:Z

.field private t0:Z

.field private u0:Z

.field private v0:Z

.field private w0:I

.field private x0:I

.field private final y:Lk7/l$b;

.field private y0:I

.field private final z:Lk7/t;

.field private z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lk7/r;->N0:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILk7/l$b;Lk7/t;ZF)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/l;-><init>(I)V

    iput-object p2, p0, Lk7/r;->y:Lk7/l$b;

    invoke-static {p3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk7/t;

    iput-object p1, p0, Lk7/r;->z:Lk7/t;

    iput-boolean p4, p0, Lk7/r;->A:Z

    iput p5, p0, Lk7/r;->B:F

    invoke-static {}, Lw6/g;->B()Lw6/g;

    move-result-object p1

    iput-object p1, p0, Lk7/r;->C:Lw6/g;

    new-instance p1, Lw6/g;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lw6/g;-><init>(I)V

    iput-object p1, p0, Lk7/r;->D:Lw6/g;

    new-instance p1, Lw6/g;

    const/4 p3, 0x2

    invoke-direct {p1, p3}, Lw6/g;-><init>(I)V

    iput-object p1, p0, Lk7/r;->E:Lw6/g;

    new-instance p1, Lk7/h;

    invoke-direct {p1}, Lk7/h;-><init>()V

    iput-object p1, p0, Lk7/r;->F:Lk7/h;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lk7/r;->G:Ljava/util/ArrayList;

    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lk7/r;->Q:F

    iput p3, p0, Lk7/r;->R:F

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p3, p0, Lk7/r;->P:J

    new-instance p5, Ljava/util/ArrayDeque;

    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p5, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    sget-object p5, Lk7/r$c;->e:Lk7/r$c;

    invoke-direct {p0, p5}, Lk7/r;->l1(Lk7/r$c;)V

    invoke-virtual {p1, p2}, Lw6/g;->y(I)V

    iget-object p1, p1, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lk7/r;->W:F

    iput p2, p0, Lk7/r;->a0:I

    iput p2, p0, Lk7/r;->w0:I

    const/4 p1, -0x1

    iput p1, p0, Lk7/r;->n0:I

    iput p1, p0, Lk7/r;->o0:I

    iput-wide p3, p0, Lk7/r;->m0:J

    iput-wide p3, p0, Lk7/r;->C0:J

    iput-wide p3, p0, Lk7/r;->D0:J

    iput-wide p3, p0, Lk7/r;->L0:J

    iput p2, p0, Lk7/r;->x0:I

    iput p2, p0, Lk7/r;->y0:I

    return-void
.end method

.method private C0(Lx6/n;)Lx6/c0;
    .locals 3

    invoke-interface {p1}, Lx6/n;->f()Lw6/b;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of v0, p1, Lx6/c0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting FrameworkCryptoConfig but found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lk7/r;->J:Lt6/u1;

    const/16 v1, 0x1771

    invoke-virtual {p0, v0, p1, v1}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    check-cast p1, Lx6/c0;

    return-object p1
.end method

.method private H0()Z
    .locals 1

    iget v0, p0, Lk7/r;->o0:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private I0(Lt6/u1;)V
    .locals 2

    invoke-direct {p0}, Lk7/r;->l0()V

    iget-object p1, p1, Lt6/u1;->w:Ljava/lang/String;

    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const-string v0, "audio/mpeg"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "audio/opus"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lk7/r;->F:Lk7/h;

    invoke-virtual {p1, v1}, Lk7/h;->J(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lk7/r;->F:Lk7/h;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Lk7/h;->J(I)V

    :goto_0
    iput-boolean v1, p0, Lk7/r;->s0:Z

    return-void
.end method

.method private J0(Lk7/p;Landroid/media/MediaCrypto;)V
    .locals 12

    iget-object v1, p1, Lk7/p;->a:Ljava/lang/String;

    sget v0, Lt8/r0;->a:I

    const/16 v2, 0x17

    const/high16 v3, -0x40800000    # -1.0f

    if-ge v0, v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget v2, p0, Lk7/r;->R:F

    iget-object v4, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {p0}, Lt6/l;->M()[Lt6/u1;

    move-result-object v5

    invoke-virtual {p0, v2, v4, v5}, Lk7/r;->z0(FLt6/u1;[Lt6/u1;)F

    move-result v2

    :goto_0
    iget v4, p0, Lk7/r;->B:F

    cmpg-float v4, v2, v4

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-object v2, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {p0, p1, v2, p2, v3}, Lk7/r;->D0(Lk7/p;Lt6/u1;Landroid/media/MediaCrypto;F)Lk7/l$a;

    move-result-object v2

    const/16 p2, 0x1f

    if-lt v0, p2, :cond_2

    invoke-virtual {p0}, Lt6/l;->L()Lu6/m3;

    move-result-object p2

    invoke-static {v2, p2}, Lk7/r$a;->a(Lk7/l$a;Lu6/m3;)V

    :cond_2
    :try_start_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "createCodec:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lt8/o0;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lk7/r;->y:Lk7/l$b;

    invoke-interface {p2, v2}, Lk7/l$b;->a(Lk7/l$a;)Lk7/l;

    move-result-object p2

    iput-object p2, p0, Lk7/r;->S:Lk7/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lt8/o0;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object p2, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {p1, p2}, Lk7/p;->o(Lt6/u1;)Z

    move-result p2

    const/4 v0, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez p2, :cond_3

    new-array p2, v0, [Ljava/lang/Object;

    iget-object v10, p0, Lk7/r;->J:Lt6/u1;

    invoke-static {v10}, Lt6/u1;->k(Lt6/u1;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, p2, v8

    aput-object v1, p2, v9

    const-string v10, "Format exceeds selected codec\'s capabilities [%s, %s]"

    invoke-static {v10, p2}, Lt8/r0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v10, "MediaCodecRenderer"

    invoke-static {v10, p2}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iput-object p1, p0, Lk7/r;->Z:Lk7/p;

    iput v3, p0, Lk7/r;->W:F

    iget-object p2, p0, Lk7/r;->J:Lt6/u1;

    iput-object p2, p0, Lk7/r;->T:Lt6/u1;

    invoke-direct {p0, v1}, Lk7/r;->b0(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lk7/r;->a0:I

    iget-object p2, p0, Lk7/r;->T:Lt6/u1;

    invoke-static {v1, p2}, Lk7/r;->c0(Ljava/lang/String;Lt6/u1;)Z

    move-result p2

    iput-boolean p2, p0, Lk7/r;->b0:Z

    invoke-static {v1}, Lk7/r;->h0(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lk7/r;->c0:Z

    invoke-static {v1}, Lk7/r;->j0(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lk7/r;->d0:Z

    invoke-static {v1}, Lk7/r;->e0(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lk7/r;->e0:Z

    invoke-static {v1}, Lk7/r;->f0(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lk7/r;->f0:Z

    invoke-static {v1}, Lk7/r;->d0(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lk7/r;->g0:Z

    iget-object p2, p0, Lk7/r;->T:Lt6/u1;

    invoke-static {v1, p2}, Lk7/r;->i0(Ljava/lang/String;Lt6/u1;)Z

    move-result p2

    iput-boolean p2, p0, Lk7/r;->h0:Z

    invoke-static {p1}, Lk7/r;->g0(Lk7/p;)Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p0}, Lk7/r;->y0()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    move p2, v8

    goto :goto_3

    :cond_5
    :goto_2
    move p2, v9

    :goto_3
    iput-boolean p2, p0, Lk7/r;->k0:Z

    iget-object p2, p0, Lk7/r;->S:Lk7/l;

    invoke-interface {p2}, Lk7/l;->g()Z

    move-result p2

    if-eqz p2, :cond_7

    iput-boolean v9, p0, Lk7/r;->v0:Z

    iput v9, p0, Lk7/r;->w0:I

    iget p2, p0, Lk7/r;->a0:I

    if-eqz p2, :cond_6

    move v8, v9

    :cond_6
    iput-boolean v8, p0, Lk7/r;->i0:Z

    :cond_7
    const-string p2, "c2.android.mp3.decoder"

    iget-object p1, p1, Lk7/p;->a:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Lk7/i;

    invoke-direct {p1}, Lk7/i;-><init>()V

    iput-object p1, p0, Lk7/r;->l0:Lk7/i;

    :cond_8
    invoke-virtual {p0}, Lt6/l;->getState()I

    move-result p1

    if-ne p1, v0, :cond_9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 v10, 0x3e8

    add-long/2addr p1, v10

    iput-wide p1, p0, Lk7/r;->m0:J

    :cond_9
    iget-object p1, p0, Lk7/r;->J0:Lw6/e;

    iget p2, p1, Lw6/e;->a:I

    add-int/2addr p2, v9

    iput p2, p1, Lw6/e;->a:I

    sub-long p1, v6, v4

    move-object v0, p0

    move-wide v3, v6

    move-wide v5, p1

    invoke-virtual/range {v0 .. v6}, Lk7/r;->R0(Ljava/lang/String;Lk7/l$a;JJ)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lt8/o0;->c()V

    throw p1
.end method

.method private K0(J)Z
    .locals 5

    iget-object v0, p0, Lk7/r;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lk7/r;->G:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v3, v3, p1

    if-nez v3, :cond_0

    iget-object p1, p0, Lk7/r;->G:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static L0(Ljava/lang/IllegalStateException;)Z
    .locals 3

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x15

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lk7/r;->M0(Ljava/lang/IllegalStateException;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    aget-object p0, p0, v1

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "android.media.MediaCodec"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    return v2
.end method

.method private static M0(Ljava/lang/IllegalStateException;)Z
    .locals 0

    instance-of p0, p0, Landroid/media/MediaCodec$CodecException;

    return p0
.end method

.method private static N0(Ljava/lang/IllegalStateException;)Z
    .locals 1

    instance-of v0, p0, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {p0}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private P0(Landroid/media/MediaCrypto;Z)V
    .locals 7

    iget-object v0, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    :try_start_0
    invoke-direct {p0, p2}, Lk7/r;->v0(Z)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v2, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    iget-boolean v3, p0, Lk7/r;->A:Z

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7/p;

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iput-object v1, p0, Lk7/r;->Y:Lk7/r$b;
    :try_end_0
    .catch Lk7/c0$c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Lk7/r$b;

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    const v2, -0xc34e

    invoke-direct {v0, v1, p1, p2, v2}, Lk7/r$b;-><init>(Lt6/u1;Ljava/lang/Throwable;ZI)V

    throw v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7/p;

    :goto_2
    iget-object v2, p0, Lk7/r;->S:Lk7/l;

    if-nez v2, :cond_7

    iget-object v2, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk7/p;

    invoke-virtual {p0, v2}, Lk7/r;->q1(Lk7/p;)Z

    move-result v3

    if-nez v3, :cond_3

    return-void

    :cond_3
    :try_start_1
    invoke-direct {p0, v2, p1}, Lk7/r;->J0(Lk7/p;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v3

    const-string v4, "MediaCodecRenderer"

    if-ne v2, v0, :cond_4

    :try_start_2
    const-string v3, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    invoke-static {v4, v3}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v5, 0x32

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    invoke-direct {p0, v2, p1}, Lk7/r;->J0(Lk7/p;Landroid/media/MediaCrypto;)V

    goto :goto_2

    :cond_4
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Failed to initialize decoder: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v3}, Lt8/s;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v4, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v4, Lk7/r$b;

    iget-object v5, p0, Lk7/r;->J:Lt6/u1;

    invoke-direct {v4, v5, v3, p2, v2}, Lk7/r$b;-><init>(Lt6/u1;Ljava/lang/Throwable;ZLk7/p;)V

    invoke-virtual {p0, v4}, Lk7/r;->Q0(Ljava/lang/Exception;)V

    iget-object v2, p0, Lk7/r;->Y:Lk7/r$b;

    if-nez v2, :cond_5

    iput-object v4, p0, Lk7/r;->Y:Lk7/r$b;

    goto :goto_3

    :cond_5
    invoke-static {v2, v4}, Lk7/r$b;->a(Lk7/r$b;Lk7/r$b;)Lk7/r$b;

    move-result-object v2

    iput-object v2, p0, Lk7/r;->Y:Lk7/r$b;

    :goto_3
    iget-object v2, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lk7/r;->Y:Lk7/r$b;

    throw p1

    :cond_7
    iput-object v1, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    return-void

    :cond_8
    new-instance p1, Lk7/r$b;

    iget-object v0, p0, Lk7/r;->J:Lt6/u1;

    const v2, -0xc34f

    invoke-direct {p1, v0, v1, p2, v2}, Lk7/r$b;-><init>(Lt6/u1;Ljava/lang/Throwable;ZI)V

    throw p1
.end method

.method private Y()V
    .locals 5

    iget-boolean v0, p0, Lk7/r;->E0:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->g(Z)V

    invoke-virtual {p0}, Lt6/l;->J()Lt6/v1;

    move-result-object v0

    iget-object v2, p0, Lk7/r;->E:Lw6/g;

    invoke-virtual {v2}, Lw6/g;->n()V

    :cond_0
    iget-object v2, p0, Lk7/r;->E:Lw6/g;

    invoke-virtual {v2}, Lw6/g;->n()V

    iget-object v2, p0, Lk7/r;->E:Lw6/g;

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lt6/l;->V(Lt6/v1;Lw6/g;I)I

    move-result v2

    const/4 v4, -0x5

    if-eq v2, v4, :cond_5

    const/4 v4, -0x4

    if-eq v2, v4, :cond_2

    const/4 v0, -0x3

    if-ne v2, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_2
    iget-object v2, p0, Lk7/r;->E:Lw6/g;

    invoke-virtual {v2}, Lw6/a;->s()Z

    move-result v2

    if-eqz v2, :cond_3

    iput-boolean v1, p0, Lk7/r;->E0:Z

    return-void

    :cond_3
    iget-boolean v2, p0, Lk7/r;->G0:Z

    if-eqz v2, :cond_4

    iget-object v2, p0, Lk7/r;->J:Lt6/u1;

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt6/u1;

    iput-object v2, p0, Lk7/r;->K:Lt6/u1;

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v4}, Lk7/r;->U0(Lt6/u1;Landroid/media/MediaFormat;)V

    iput-boolean v3, p0, Lk7/r;->G0:Z

    :cond_4
    iget-object v2, p0, Lk7/r;->E:Lw6/g;

    invoke-virtual {v2}, Lw6/g;->z()V

    iget-object v2, p0, Lk7/r;->F:Lk7/h;

    iget-object v3, p0, Lk7/r;->E:Lw6/g;

    invoke-virtual {v2, v3}, Lk7/h;->D(Lw6/g;)Z

    move-result v2

    if-nez v2, :cond_0

    iput-boolean v1, p0, Lk7/r;->t0:Z

    return-void

    :cond_5
    invoke-virtual {p0, v0}, Lk7/r;->T0(Lt6/v1;)Lw6/i;

    return-void
.end method

.method private Z(JJ)Z
    .locals 18

    move-object/from16 v15, p0

    iget-boolean v0, v15, Lk7/r;->F0:Z

    const/4 v14, 0x1

    xor-int/2addr v0, v14

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v0}, Lk7/h;->I()Z

    move-result v0

    const/4 v13, 0x0

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    iget-object v0, v15, Lk7/r;->F:Lk7/h;

    iget-object v6, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    iget v7, v15, Lk7/r;->o0:I

    const/4 v8, 0x0

    invoke-virtual {v0}, Lk7/h;->H()I

    move-result v9

    iget-object v0, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v0}, Lk7/h;->F()J

    move-result-wide v10

    iget-object v0, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v0}, Lw6/a;->r()Z

    move-result v12

    iget-object v0, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v0}, Lw6/a;->s()Z

    move-result v16

    iget-object v3, v15, Lk7/r;->K:Lt6/u1;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    move/from16 v13, v16

    move-object/from16 v14, v17

    invoke-virtual/range {v0 .. v14}, Lk7/r;->a1(JJLk7/l;Ljava/nio/ByteBuffer;IIIJZZLt6/u1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v0}, Lk7/h;->G()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lk7/r;->W0(J)V

    iget-object v0, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v0}, Lk7/h;->n()V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    move v0, v13

    :goto_0
    iget-boolean v1, v15, Lk7/r;->E0:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, v15, Lk7/r;->F0:Z

    return v0

    :cond_2
    const/4 v1, 0x1

    iget-boolean v2, v15, Lk7/r;->t0:Z

    if-eqz v2, :cond_3

    iget-object v2, v15, Lk7/r;->F:Lk7/h;

    iget-object v3, v15, Lk7/r;->E:Lw6/g;

    invoke-virtual {v2, v3}, Lk7/h;->D(Lw6/g;)Z

    move-result v2

    invoke-static {v2}, Lt8/a;->g(Z)V

    iput-boolean v0, v15, Lk7/r;->t0:Z

    :cond_3
    iget-boolean v2, v15, Lk7/r;->u0:Z

    if-eqz v2, :cond_5

    iget-object v2, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v2}, Lk7/h;->I()Z

    move-result v2

    if-eqz v2, :cond_4

    return v1

    :cond_4
    invoke-direct/range {p0 .. p0}, Lk7/r;->l0()V

    iput-boolean v0, v15, Lk7/r;->u0:Z

    invoke-virtual/range {p0 .. p0}, Lk7/r;->O0()V

    iget-boolean v2, v15, Lk7/r;->s0:Z

    if-nez v2, :cond_5

    return v0

    :cond_5
    invoke-direct/range {p0 .. p0}, Lk7/r;->Y()V

    iget-object v2, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v2}, Lk7/h;->I()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v2}, Lw6/g;->z()V

    :cond_6
    iget-object v2, v15, Lk7/r;->F:Lk7/h;

    invoke-virtual {v2}, Lk7/h;->I()Z

    move-result v2

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lk7/r;->E0:Z

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lk7/r;->u0:Z

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    move v14, v0

    goto :goto_2

    :cond_8
    :goto_1
    move v14, v1

    :goto_2
    return v14
.end method

.method private Z0()V
    .locals 3

    iget v0, p0, Lk7/r;->y0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lk7/r;->F0:Z

    invoke-virtual {p0}, Lk7/r;->f1()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lk7/r;->d1()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lk7/r;->s0()V

    invoke-direct {p0}, Lk7/r;->w1()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lk7/r;->s0()V

    :goto_0
    return-void
.end method

.method private b0(Ljava/lang/String;)I
    .locals 3

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    const-string v1, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lt8/r0;->d:Ljava/lang/String;

    const-string v2, "SM-T585"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A510"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A520"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-J700"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 p1, 0x2

    return p1

    :cond_1
    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v0, "OMX.Nvidia.h264.decode"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_2
    sget-object p1, Lt8/r0;->b:Ljava/lang/String;

    const-string v0, "flounder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "flounder_lte"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "grouper"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "tilapia"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private b1()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk7/r;->B0:Z

    iget-object v1, p0, Lk7/r;->S:Lk7/l;

    invoke-interface {v1}, Lk7/l;->a()Landroid/media/MediaFormat;

    move-result-object v1

    iget v2, p0, Lk7/r;->a0:I

    if-eqz v2, :cond_0

    const-string v2, "width"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_0

    const-string v2, "height"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v3, :cond_0

    iput-boolean v0, p0, Lk7/r;->j0:Z

    return-void

    :cond_0
    iget-boolean v2, p0, Lk7/r;->h0:Z

    if-eqz v2, :cond_1

    const-string v2, "channel-count"

    invoke-virtual {v1, v2, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    iput-object v1, p0, Lk7/r;->U:Landroid/media/MediaFormat;

    iput-boolean v0, p0, Lk7/r;->V:Z

    return-void
.end method

.method private static c0(Ljava/lang/String;Lt6/u1;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object p1, p1, Lt6/u1;->y:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "OMX.MTK.VIDEO.DECODER.AVC"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private c1(I)Z
    .locals 3

    invoke-virtual {p0}, Lt6/l;->J()Lt6/v1;

    move-result-object v0

    iget-object v1, p0, Lk7/r;->C:Lw6/g;

    invoke-virtual {v1}, Lw6/g;->n()V

    iget-object v1, p0, Lk7/r;->C:Lw6/g;

    or-int/lit8 p1, p1, 0x4

    invoke-virtual {p0, v0, v1, p1}, Lt6/l;->V(Lt6/v1;Lw6/g;I)I

    move-result p1

    const/4 v1, -0x5

    const/4 v2, 0x1

    if-ne p1, v1, :cond_0

    invoke-virtual {p0, v0}, Lk7/r;->T0(Lt6/v1;)Lw6/i;

    return v2

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lk7/r;->C:Lw6/g;

    invoke-virtual {p1}, Lw6/a;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v2, p0, Lk7/r;->E0:Z

    invoke-direct {p0}, Lk7/r;->Z0()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static d0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.mp3.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "samsung"

    sget-object v0, Lt8/r0;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lt8/r0;->b:Ljava/lang/String;

    const-string v0, "baffin"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "grand"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fortuna"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "gprimelte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "j2y18lte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ms01"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private d1()V
    .locals 0

    invoke-virtual {p0}, Lk7/r;->e1()V

    invoke-virtual {p0}, Lk7/r;->O0()V

    return-void
.end method

.method private static e0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    const-string v1, "OMX.google.vorbis.decoder"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-gt v0, v1, :cond_3

    sget-object v0, Lt8/r0;->b:Ljava/lang/String;

    const-string v1, "hb2000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "stvm8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string v0, "OMX.amlogic.avc.decoder.awesome"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.amlogic.avc.decoder.awesome.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static f0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_0

    const-string v0, "OMX.google.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static g0(Lk7/p;)Z
    .locals 3

    iget-object v0, p0, Lk7/p;->a:Ljava/lang/String;

    sget v1, Lt8/r0;->a:I

    const/16 v2, 0x19

    if-gt v1, v2, :cond_0

    const-string v2, "OMX.rk.video_decoder.avc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_0
    const/16 v2, 0x11

    if-gt v1, v2, :cond_1

    const-string v2, "OMX.allwinner.video.decoder.avc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_1
    const/16 v2, 0x1d

    if-gt v1, v2, :cond_2

    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "Amazon"

    sget-object v1, Lt8/r0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "AFTS"

    sget-object v1, Lt8/r0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean p0, p0, Lk7/p;->g:Z

    if-eqz p0, :cond_4

    :cond_3
    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static h0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    if-ne v0, v1, :cond_0

    const-string v1, "OMX.SEC.avc.dec"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "OMX.SEC.avc.dec.secure"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    sget-object v0, Lt8/r0;->d:Ljava/lang/String;

    const-string v1, "SM-G800"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "OMX.Exynos.avc.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static i0(Ljava/lang/String;Lt6/u1;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x12

    if-gt v0, v1, :cond_0

    iget p1, p1, Lt6/u1;->J:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "OMX.MTK.AUDIO.DECODER.MP3"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private i1()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lk7/r;->n0:I

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    const/4 v1, 0x0

    iput-object v1, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private static j0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    const-string v0, "c2.android.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private j1()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lk7/r;->o0:I

    const/4 v0, 0x0

    iput-object v0, p0, Lk7/r;->p0:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private k1(Lx6/n;)V
    .locals 1

    iget-object v0, p0, Lk7/r;->L:Lx6/n;

    invoke-static {v0, p1}, Lx6/n;->b(Lx6/n;Lx6/n;)V

    iput-object p1, p0, Lk7/r;->L:Lx6/n;

    return-void
.end method

.method private l0()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk7/r;->u0:Z

    iget-object v1, p0, Lk7/r;->F:Lk7/h;

    invoke-virtual {v1}, Lk7/h;->n()V

    iget-object v1, p0, Lk7/r;->E:Lw6/g;

    invoke-virtual {v1}, Lw6/g;->n()V

    iput-boolean v0, p0, Lk7/r;->t0:Z

    iput-boolean v0, p0, Lk7/r;->s0:Z

    return-void
.end method

.method private l1(Lk7/r$c;)V
    .locals 4

    iput-object p1, p0, Lk7/r;->K0:Lk7/r$c;

    iget-wide v0, p1, Lk7/r$c;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lk7/r;->M0:Z

    invoke-virtual {p0, v0, v1}, Lk7/r;->V0(J)V

    :cond_0
    return-void
.end method

.method private m0()Z
    .locals 2

    iget-boolean v0, p0, Lk7/r;->z0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lk7/r;->x0:I

    iget-boolean v0, p0, Lk7/r;->c0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lk7/r;->e0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput v1, p0, Lk7/r;->y0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lk7/r;->y0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method private n0()V
    .locals 1

    iget-boolean v0, p0, Lk7/r;->z0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lk7/r;->x0:I

    const/4 v0, 0x3

    iput v0, p0, Lk7/r;->y0:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lk7/r;->d1()V

    :goto_0
    return-void
.end method

.method private o0()Z
    .locals 2

    iget-boolean v0, p0, Lk7/r;->z0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lk7/r;->x0:I

    iget-boolean v0, p0, Lk7/r;->c0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lk7/r;->e0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lk7/r;->y0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lk7/r;->y0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-direct {p0}, Lk7/r;->w1()V

    :goto_1
    return v1
.end method

.method private o1(Lx6/n;)V
    .locals 1

    iget-object v0, p0, Lk7/r;->M:Lx6/n;

    invoke-static {v0, p1}, Lx6/n;->b(Lx6/n;Lx6/n;)V

    iput-object p1, p0, Lk7/r;->M:Lx6/n;

    return-void
.end method

.method private p0(JJ)Z
    .locals 19

    move-object/from16 v15, p0

    invoke-direct/range {p0 .. p0}, Lk7/r;->H0()Z

    move-result v0

    const/16 v16, 0x1

    const/4 v14, 0x0

    if-nez v0, :cond_b

    iget-boolean v0, v15, Lk7/r;->f0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, v15, Lk7/r;->A0:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, v15, Lk7/r;->S:Lk7/l;

    iget-object v1, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lk7/l;->l(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-direct/range {p0 .. p0}, Lk7/r;->Z0()V

    iget-boolean v0, v15, Lk7/r;->F0:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lk7/r;->e1()V

    :cond_0
    return v14

    :cond_1
    iget-object v0, v15, Lk7/r;->S:Lk7/l;

    iget-object v1, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lk7/l;->l(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0

    :goto_0
    if-gez v0, :cond_5

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    invoke-direct/range {p0 .. p0}, Lk7/r;->b1()V

    return v16

    :cond_2
    iget-boolean v0, v15, Lk7/r;->k0:Z

    if-eqz v0, :cond_4

    iget-boolean v0, v15, Lk7/r;->E0:Z

    if-nez v0, :cond_3

    iget v0, v15, Lk7/r;->x0:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    :cond_3
    invoke-direct/range {p0 .. p0}, Lk7/r;->Z0()V

    :cond_4
    return v14

    :cond_5
    iget-boolean v1, v15, Lk7/r;->j0:Z

    if-eqz v1, :cond_6

    iput-boolean v14, v15, Lk7/r;->j0:Z

    iget-object v1, v15, Lk7/r;->S:Lk7/l;

    invoke-interface {v1, v0, v14}, Lk7/l;->m(IZ)V

    return v16

    :cond_6
    iget-object v1, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_7

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_7

    invoke-direct/range {p0 .. p0}, Lk7/r;->Z0()V

    return v14

    :cond_7
    iput v0, v15, Lk7/r;->o0:I

    iget-object v1, v15, Lk7/r;->S:Lk7/l;

    invoke-interface {v1, v0}, Lk7/l;->n(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v15, Lk7/r;->p0:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_8

    iget-object v1, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v15, Lk7/r;->p0:Ljava/nio/ByteBuffer;

    iget-object v1, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_8
    iget-boolean v0, v15, Lk7/r;->g0:Z

    if-eqz v0, :cond_9

    iget-object v0, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_9

    iget v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_9

    iget-wide v1, v15, Lk7/r;->C0:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_9

    iput-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_9
    iget-object v0, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-direct {v15, v0, v1}, Lk7/r;->K0(J)Z

    move-result v0

    iput-boolean v0, v15, Lk7/r;->q0:Z

    iget-wide v0, v15, Lk7/r;->D0:J

    iget-object v2, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_a

    move/from16 v0, v16

    goto :goto_1

    :cond_a
    move v0, v14

    :goto_1
    iput-boolean v0, v15, Lk7/r;->r0:Z

    invoke-virtual {v15, v2, v3}, Lk7/r;->x1(J)V

    :cond_b
    iget-boolean v0, v15, Lk7/r;->f0:Z

    if-eqz v0, :cond_d

    iget-boolean v0, v15, Lk7/r;->A0:Z

    if-eqz v0, :cond_d

    :try_start_1
    iget-object v5, v15, Lk7/r;->S:Lk7/l;

    iget-object v6, v15, Lk7/r;->p0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lk7/r;->o0:I

    iget-object v0, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lk7/r;->q0:Z

    iget-boolean v13, v15, Lk7/r;->r0:Z

    iget-object v3, v15, Lk7/r;->K:Lt6/u1;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    move/from16 v18, v14

    move-object/from16 v14, v17

    :try_start_2
    invoke-virtual/range {v0 .. v14}, Lk7/r;->a1(JJLk7/l;Ljava/nio/ByteBuffer;IIIJZZLt6/u1;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_1
    move/from16 v18, v14

    :catch_2
    invoke-direct/range {p0 .. p0}, Lk7/r;->Z0()V

    iget-boolean v0, v15, Lk7/r;->F0:Z

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, Lk7/r;->e1()V

    :cond_c
    return v18

    :cond_d
    move/from16 v18, v14

    iget-object v5, v15, Lk7/r;->S:Lk7/l;

    iget-object v6, v15, Lk7/r;->p0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lk7/r;->o0:I

    iget-object v0, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lk7/r;->q0:Z

    iget-boolean v13, v15, Lk7/r;->r0:Z

    iget-object v14, v15, Lk7/r;->K:Lt6/u1;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual/range {v0 .. v14}, Lk7/r;->a1(JJLk7/l;Ljava/nio/ByteBuffer;IIIJZZLt6/u1;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_10

    iget-object v0, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v15, v0, v1}, Lk7/r;->W0(J)V

    iget-object v0, v15, Lk7/r;->H:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_e

    move/from16 v14, v16

    goto :goto_3

    :cond_e
    move/from16 v14, v18

    :goto_3
    invoke-direct/range {p0 .. p0}, Lk7/r;->j1()V

    if-nez v14, :cond_f

    return v16

    :cond_f
    invoke-direct/range {p0 .. p0}, Lk7/r;->Z0()V

    :cond_10
    return v18
.end method

.method private p1(J)Z
    .locals 4

    iget-wide v0, p0, Lk7/r;->P:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iget-wide p1, p0, Lk7/r;->P:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private q0(Lk7/p;Lt6/u1;Lx6/n;Lx6/n;)Z
    .locals 4

    const/4 v0, 0x0

    if-ne p3, p4, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p4, :cond_8

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p4}, Lx6/n;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-interface {p3}, Lx6/n;->c()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    sget v2, Lt8/r0;->a:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_3

    return v1

    :cond_3
    sget-object v2, Lt6/p;->e:Ljava/util/UUID;

    invoke-interface {p3}, Lx6/n;->c()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    invoke-interface {p4}, Lx6/n;->c()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_1

    :cond_4
    invoke-direct {p0, p4}, Lk7/r;->C0(Lx6/n;)Lx6/c0;

    move-result-object p3

    if-nez p3, :cond_5

    return v1

    :cond_5
    iget-boolean p3, p3, Lx6/c0;->c:Z

    if-eqz p3, :cond_6

    move p2, v0

    goto :goto_0

    :cond_6
    iget-object p2, p2, Lt6/u1;->w:Ljava/lang/String;

    invoke-interface {p4, p2}, Lx6/n;->i(Ljava/lang/String;)Z

    move-result p2

    :goto_0
    iget-boolean p1, p1, Lk7/p;->g:Z

    if-nez p1, :cond_7

    if-eqz p2, :cond_7

    return v1

    :cond_7
    return v0

    :cond_8
    :goto_1
    return v1
.end method

.method private r0()Z
    .locals 15

    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_1d

    iget v0, p0, Lk7/r;->x0:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1d

    iget-boolean v3, p0, Lk7/r;->E0:Z

    if-eqz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lk7/r;->r1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lk7/r;->n0()V

    :cond_1
    iget v0, p0, Lk7/r;->n0:I

    if-gez v0, :cond_3

    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    invoke-interface {v0}, Lk7/l;->k()I

    move-result v0

    iput v0, p0, Lk7/r;->n0:I

    if-gez v0, :cond_2

    return v1

    :cond_2
    iget-object v3, p0, Lk7/r;->D:Lw6/g;

    iget-object v4, p0, Lk7/r;->S:Lk7/l;

    invoke-interface {v4, v0}, Lk7/l;->c(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v3, Lw6/g;->c:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v0}, Lw6/g;->n()V

    :cond_3
    iget v0, p0, Lk7/r;->x0:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_5

    iget-boolean v0, p0, Lk7/r;->k0:Z

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    iput-boolean v3, p0, Lk7/r;->A0:Z

    iget-object v4, p0, Lk7/r;->S:Lk7/l;

    iget v5, p0, Lk7/r;->n0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lk7/l;->e(IIIJI)V

    invoke-direct {p0}, Lk7/r;->i1()V

    :goto_0
    iput v2, p0, Lk7/r;->x0:I

    return v1

    :cond_5
    iget-boolean v0, p0, Lk7/r;->i0:Z

    if-eqz v0, :cond_6

    iput-boolean v1, p0, Lk7/r;->i0:Z

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    iget-object v0, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    sget-object v1, Lk7/r;->N0:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lk7/r;->S:Lk7/l;

    iget v5, p0, Lk7/r;->n0:I

    const/4 v6, 0x0

    array-length v7, v1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lk7/l;->e(IIIJI)V

    invoke-direct {p0}, Lk7/r;->i1()V

    iput-boolean v3, p0, Lk7/r;->z0:Z

    return v3

    :cond_6
    iget v0, p0, Lk7/r;->w0:I

    if-ne v0, v3, :cond_8

    move v0, v1

    :goto_1
    iget-object v4, p0, Lk7/r;->T:Lt6/u1;

    iget-object v4, v4, Lt6/u1;->y:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_7

    iget-object v4, p0, Lk7/r;->T:Lt6/u1;

    iget-object v4, v4, Lt6/u1;->y:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    iget-object v5, p0, Lk7/r;->D:Lw6/g;

    iget-object v5, v5, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    iput v2, p0, Lk7/r;->w0:I

    :cond_8
    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    iget-object v0, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p0}, Lt6/l;->J()Lt6/v1;

    move-result-object v4

    :try_start_0
    iget-object v5, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {p0, v4, v5, v1}, Lt6/l;->V(Lt6/v1;Lw6/g;I)I

    move-result v5
    :try_end_0
    .catch Lw6/g$a; {:try_start_0 .. :try_end_0} :catch_2

    invoke-virtual {p0}, Lt6/l;->i()Z

    move-result v6

    if-nez v6, :cond_9

    iget-object v6, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v6}, Lw6/a;->v()Z

    move-result v6

    if-eqz v6, :cond_a

    :cond_9
    iget-wide v6, p0, Lk7/r;->C0:J

    iput-wide v6, p0, Lk7/r;->D0:J

    :cond_a
    const/4 v6, -0x3

    if-ne v5, v6, :cond_b

    return v1

    :cond_b
    const/4 v6, -0x5

    if-ne v5, v6, :cond_d

    iget v0, p0, Lk7/r;->w0:I

    if-ne v0, v2, :cond_c

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v0}, Lw6/g;->n()V

    iput v3, p0, Lk7/r;->w0:I

    :cond_c
    invoke-virtual {p0, v4}, Lk7/r;->T0(Lt6/v1;)Lw6/i;

    return v3

    :cond_d
    iget-object v4, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v4}, Lw6/a;->s()Z

    move-result v4

    if-eqz v4, :cond_11

    iget v0, p0, Lk7/r;->w0:I

    if-ne v0, v2, :cond_e

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v0}, Lw6/g;->n()V

    iput v3, p0, Lk7/r;->w0:I

    :cond_e
    iput-boolean v3, p0, Lk7/r;->E0:Z

    iget-boolean v0, p0, Lk7/r;->z0:Z

    if-nez v0, :cond_f

    invoke-direct {p0}, Lk7/r;->Z0()V

    return v1

    :cond_f
    :try_start_1
    iget-boolean v0, p0, Lk7/r;->k0:Z

    if-eqz v0, :cond_10

    goto :goto_2

    :cond_10
    iput-boolean v3, p0, Lk7/r;->A0:Z

    iget-object v4, p0, Lk7/r;->S:Lk7/l;

    iget v5, p0, Lk7/r;->n0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lk7/l;->e(IIIJI)V

    invoke-direct {p0}, Lk7/r;->i1()V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    return v1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lt8/r0;->V(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object v0

    throw v0

    :cond_11
    iget-boolean v4, p0, Lk7/r;->z0:Z

    if-nez v4, :cond_13

    iget-object v4, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v4}, Lw6/a;->u()Z

    move-result v4

    if-nez v4, :cond_13

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v0}, Lw6/g;->n()V

    iget v0, p0, Lk7/r;->w0:I

    if-ne v0, v2, :cond_12

    iput v3, p0, Lk7/r;->w0:I

    :cond_12
    return v3

    :cond_13
    iget-object v2, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v2}, Lw6/g;->A()Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v4, p0, Lk7/r;->D:Lw6/g;

    iget-object v4, v4, Lw6/g;->b:Lw6/c;

    invoke-virtual {v4, v0}, Lw6/c;->b(I)V

    :cond_14
    iget-boolean v0, p0, Lk7/r;->b0:Z

    if-eqz v0, :cond_16

    if-nez v2, :cond_16

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    iget-object v0, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lt8/x;->b(Ljava/nio/ByteBuffer;)V

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    iget-object v0, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    if-nez v0, :cond_15

    return v3

    :cond_15
    iput-boolean v1, p0, Lk7/r;->b0:Z

    :cond_16
    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    iget-wide v4, v0, Lw6/g;->e:J

    iget-object v6, p0, Lk7/r;->l0:Lk7/i;

    if-eqz v6, :cond_17

    iget-object v4, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {v6, v4, v0}, Lk7/i;->d(Lt6/u1;Lw6/g;)J

    move-result-wide v4

    iget-wide v6, p0, Lk7/r;->C0:J

    iget-object v0, p0, Lk7/r;->l0:Lk7/i;

    iget-object v8, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {v0, v8}, Lk7/i;->b(Lt6/u1;)J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iput-wide v6, p0, Lk7/r;->C0:J

    :cond_17
    move-wide v12, v4

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v0}, Lw6/a;->r()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lk7/r;->G:Ljava/util/ArrayList;

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    iget-boolean v0, p0, Lk7/r;->G0:Z

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7/r$c;

    goto :goto_3

    :cond_19
    iget-object v0, p0, Lk7/r;->K0:Lk7/r$c;

    :goto_3
    iget-object v0, v0, Lk7/r$c;->d:Lt8/m0;

    iget-object v4, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {v0, v12, v13, v4}, Lt8/m0;->a(JLjava/lang/Object;)V

    iput-boolean v1, p0, Lk7/r;->G0:Z

    :cond_1a
    iget-wide v4, p0, Lk7/r;->C0:J

    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lk7/r;->C0:J

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v0}, Lw6/g;->z()V

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {v0}, Lw6/a;->q()Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {p0, v0}, Lk7/r;->G0(Lw6/g;)V

    :cond_1b
    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    invoke-virtual {p0, v0}, Lk7/r;->Y0(Lw6/g;)V

    if-eqz v2, :cond_1c

    :try_start_2
    iget-object v8, p0, Lk7/r;->S:Lk7/l;

    iget v9, p0, Lk7/r;->n0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    iget-object v11, v0, Lw6/g;->b:Lw6/c;

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lk7/l;->f(IILw6/c;JI)V

    goto :goto_4

    :cond_1c
    iget-object v8, p0, Lk7/r;->S:Lk7/l;

    iget v9, p0, Lk7/r;->n0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lk7/r;->D:Lw6/g;

    iget-object v0, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v11

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lk7/l;->e(IIIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_4
    invoke-direct {p0}, Lk7/r;->i1()V

    iput-boolean v3, p0, Lk7/r;->z0:Z

    iput v1, p0, Lk7/r;->w0:I

    iget-object v0, p0, Lk7/r;->J0:Lw6/e;

    iget v1, v0, Lw6/e;->c:I

    add-int/2addr v1, v3

    iput v1, v0, Lw6/e;->c:I

    return v3

    :catch_1
    move-exception v0

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lt8/r0;->V(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    invoke-virtual {p0, v0}, Lk7/r;->Q0(Ljava/lang/Exception;)V

    invoke-direct {p0, v1}, Lk7/r;->c1(I)Z

    invoke-direct {p0}, Lk7/r;->s0()V

    return v3

    :cond_1d
    :goto_5
    return v1
.end method

.method private s0()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    invoke-interface {v0}, Lk7/l;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lk7/r;->g1()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lk7/r;->g1()V

    throw v0
.end method

.method protected static u1(Lt6/u1;)Z
    .locals 1

    iget p0, p0, Lt6/u1;->R:I

    if-eqz p0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private v0(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lk7/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk7/r;->z:Lk7/t;

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    invoke-virtual {p0, v0, v1, p1}, Lk7/r;->B0(Lk7/t;Lt6/u1;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lk7/r;->z:Lk7/t;

    iget-object v0, p0, Lk7/r;->J:Lt6/u1;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lk7/r;->B0(Lk7/t;Lt6/u1;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Drm session requires secure decoder for "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    iget-object v1, v1, Lt6/u1;->w:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", but no secure decoder available. Trying to proceed with "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "MediaCodecRenderer"

    invoke-static {v1, p1}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private v1(Lt6/u1;)Z
    .locals 4

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x17

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    if-eqz v0, :cond_6

    iget v0, p0, Lk7/r;->y0:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    invoke-virtual {p0}, Lt6/l;->getState()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lk7/r;->R:F

    invoke-virtual {p0}, Lt6/l;->M()[Lt6/u1;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lk7/r;->z0(FLt6/u1;[Lt6/u1;)F

    move-result p1

    iget v0, p0, Lk7/r;->W:F

    cmpl-float v1, v0, p1

    if-nez v1, :cond_2

    return v2

    :cond_2
    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v3, p1, v1

    if-nez v3, :cond_3

    invoke-direct {p0}, Lk7/r;->n0()V

    const/4 p1, 0x0

    return p1

    :cond_3
    cmpl-float v0, v0, v1

    if-nez v0, :cond_5

    iget v0, p0, Lk7/r;->B:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_4

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "operating-rate"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lk7/r;->S:Lk7/l;

    invoke-interface {v1, v0}, Lk7/l;->i(Landroid/os/Bundle;)V

    iput p1, p0, Lk7/r;->W:F

    :cond_6
    :goto_1
    return v2
.end method

.method private w1()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    iget-object v1, p0, Lk7/r;->M:Lx6/n;

    invoke-direct {p0, v1}, Lk7/r;->C0(Lx6/n;)Lx6/c0;

    move-result-object v1

    iget-object v1, v1, Lx6/c0;->b:[B

    invoke-virtual {v0, v1}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lk7/r;->M:Lx6/n;

    invoke-direct {p0, v0}, Lk7/r;->k1(Lx6/n;)V

    const/4 v0, 0x0

    iput v0, p0, Lk7/r;->x0:I

    iput v0, p0, Lk7/r;->y0:I

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    const/16 v2, 0x1776

    invoke-virtual {p0, v0, v1, v2}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method protected final A0()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lk7/r;->U:Landroid/media/MediaFormat;

    return-object v0
.end method

.method protected abstract B0(Lk7/t;Lt6/u1;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/t;",
            "Lt6/u1;",
            "Z)",
            "Ljava/util/List<",
            "Lk7/p;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract D0(Lk7/p;Lt6/u1;Landroid/media/MediaCrypto;F)Lk7/l$a;
.end method

.method protected final E0()J
    .locals 2

    iget-object v0, p0, Lk7/r;->K0:Lk7/r$c;

    iget-wide v0, v0, Lk7/r$c;->c:J

    return-wide v0
.end method

.method protected F0()F
    .locals 1

    iget v0, p0, Lk7/r;->Q:F

    return v0
.end method

.method protected G0(Lw6/g;)V
    .locals 0

    return-void
.end method

.method protected O()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lk7/r;->J:Lt6/u1;

    sget-object v0, Lk7/r$c;->e:Lk7/r$c;

    invoke-direct {p0, v0}, Lk7/r;->l1(Lk7/r$c;)V

    iget-object v0, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Lk7/r;->u0()Z

    return-void
.end method

.method protected final O0()V
    .locals 6

    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lk7/r;->s0:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lk7/r;->J:Lt6/u1;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lk7/r;->M:Lx6/n;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lk7/r;->s1(Lt6/u1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk7/r;->J:Lt6/u1;

    invoke-direct {p0, v0}, Lk7/r;->I0(Lt6/u1;)V

    return-void

    :cond_1
    iget-object v0, p0, Lk7/r;->M:Lx6/n;

    invoke-direct {p0, v0}, Lk7/r;->k1(Lx6/n;)V

    iget-object v0, p0, Lk7/r;->J:Lt6/u1;

    iget-object v0, v0, Lt6/u1;->w:Ljava/lang/String;

    iget-object v1, p0, Lk7/r;->L:Lx6/n;

    if-eqz v1, :cond_7

    iget-object v2, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    const/4 v3, 0x1

    if-nez v2, :cond_5

    invoke-direct {p0, v1}, Lk7/r;->C0(Lx6/n;)Lx6/c0;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lk7/r;->L:Lx6/n;

    invoke-interface {v0}, Lx6/n;->a()Lx6/n$a;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    iget-object v4, v1, Lx6/c0;->a:Ljava/util/UUID;

    iget-object v5, v1, Lx6/c0;->b:[B

    invoke-direct {v2, v4, v5}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    iput-object v2, p0, Lk7/r;->N:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean v1, v1, Lx6/c0;->c:Z

    if-nez v1, :cond_4

    invoke-virtual {v2, v0}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v3

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lk7/r;->O:Z

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    const/16 v2, 0x1776

    invoke-virtual {p0, v0, v1, v2}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object v0

    throw v0

    :cond_5
    :goto_1
    sget-boolean v0, Lx6/c0;->d:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lk7/r;->L:Lx6/n;

    invoke-interface {v0}, Lx6/n;->getState()I

    move-result v0

    if-eq v0, v3, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    return-void

    :cond_6
    iget-object v0, p0, Lk7/r;->L:Lx6/n;

    invoke-interface {v0}, Lx6/n;->a()Lx6/n$a;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/n$a;

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    iget v2, v0, Lx6/n$a;->a:I

    invoke-virtual {p0, v0, v1, v2}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object v0

    throw v0

    :cond_7
    :try_start_1
    iget-object v0, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    iget-boolean v1, p0, Lk7/r;->O:Z

    invoke-direct {p0, v0, v1}, Lk7/r;->P0(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Lk7/r$b; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    iget-object v1, p0, Lk7/r;->J:Lt6/u1;

    const/16 v2, 0xfa1

    invoke-virtual {p0, v0, v1, v2}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object v0

    throw v0

    :cond_8
    :goto_2
    return-void
.end method

.method protected P(ZZ)V
    .locals 0

    new-instance p1, Lw6/e;

    invoke-direct {p1}, Lw6/e;-><init>()V

    iput-object p1, p0, Lk7/r;->J0:Lw6/e;

    return-void
.end method

.method protected Q(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk7/r;->E0:Z

    iput-boolean p1, p0, Lk7/r;->F0:Z

    iput-boolean p1, p0, Lk7/r;->H0:Z

    iget-boolean p2, p0, Lk7/r;->s0:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lk7/r;->F:Lk7/h;

    invoke-virtual {p2}, Lk7/h;->n()V

    iget-object p2, p0, Lk7/r;->E:Lw6/g;

    invoke-virtual {p2}, Lw6/g;->n()V

    iput-boolean p1, p0, Lk7/r;->t0:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lk7/r;->t0()Z

    :goto_0
    iget-object p1, p0, Lk7/r;->K0:Lk7/r$c;

    iget-object p1, p1, Lk7/r$c;->d:Lt8/m0;

    invoke-virtual {p1}, Lt8/m0;->l()I

    move-result p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lk7/r;->G0:Z

    :cond_1
    iget-object p1, p0, Lk7/r;->K0:Lk7/r$c;

    iget-object p1, p1, Lk7/r$c;->d:Lt8/m0;

    invoke-virtual {p1}, Lt8/m0;->c()V

    iget-object p1, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method protected abstract Q0(Ljava/lang/Exception;)V
.end method

.method protected R()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lk7/r;->l0()V

    invoke-virtual {p0}, Lk7/r;->e1()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, v0}, Lk7/r;->o1(Lx6/n;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-direct {p0, v0}, Lk7/r;->o1(Lx6/n;)V

    throw v1
.end method

.method protected abstract R0(Ljava/lang/String;Lk7/l$a;JJ)V
.end method

.method protected S()V
    .locals 0

    return-void
.end method

.method protected abstract S0(Ljava/lang/String;)V
.end method

.method protected T()V
    .locals 0

    return-void
.end method

.method protected T0(Lt6/v1;)Lw6/i;
    .locals 11

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk7/r;->G0:Z

    iget-object v1, p1, Lt6/v1;->b:Lt6/u1;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lt6/u1;

    iget-object v1, v5, Lt6/u1;->w:Ljava/lang/String;

    if-eqz v1, :cond_13

    iget-object p1, p1, Lt6/v1;->a:Lx6/n;

    invoke-direct {p0, p1}, Lk7/r;->o1(Lx6/n;)V

    iput-object v5, p0, Lk7/r;->J:Lt6/u1;

    iget-boolean p1, p0, Lk7/r;->s0:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lk7/r;->u0:Z

    return-object v1

    :cond_0
    iget-object p1, p0, Lk7/r;->S:Lk7/l;

    if-nez p1, :cond_1

    iput-object v1, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Lk7/r;->O0()V

    return-object v1

    :cond_1
    iget-object v1, p0, Lk7/r;->Z:Lk7/p;

    iget-object v4, p0, Lk7/r;->T:Lt6/u1;

    iget-object v2, p0, Lk7/r;->L:Lx6/n;

    iget-object v3, p0, Lk7/r;->M:Lx6/n;

    invoke-direct {p0, v1, v5, v2, v3}, Lk7/r;->q0(Lk7/p;Lt6/u1;Lx6/n;Lx6/n;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0}, Lk7/r;->n0()V

    new-instance p1, Lw6/i;

    iget-object v3, v1, Lk7/p;->a:Ljava/lang/String;

    const/4 v6, 0x0

    const/16 v7, 0x80

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lw6/i;-><init>(Ljava/lang/String;Lt6/u1;Lt6/u1;II)V

    return-object p1

    :cond_2
    iget-object v2, p0, Lk7/r;->M:Lx6/n;

    iget-object v3, p0, Lk7/r;->L:Lx6/n;

    const/4 v6, 0x0

    if-eq v2, v3, :cond_3

    move v2, v0

    goto :goto_0

    :cond_3
    move v2, v6

    :goto_0
    if-eqz v2, :cond_5

    sget v3, Lt8/r0;->a:I

    const/16 v7, 0x17

    if-lt v3, v7, :cond_4

    goto :goto_1

    :cond_4
    move v3, v6

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v0

    :goto_2
    invoke-static {v3}, Lt8/a;->g(Z)V

    invoke-virtual {p0, v1, v4, v5}, Lk7/r;->a0(Lk7/p;Lt6/u1;Lt6/u1;)Lw6/i;

    move-result-object v3

    iget v7, v3, Lw6/i;->d:I

    const/4 v8, 0x3

    if-eqz v7, :cond_f

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eq v7, v0, :cond_c

    if-eq v7, v10, :cond_8

    if-ne v7, v8, :cond_7

    invoke-direct {p0, v5}, Lk7/r;->v1(Lt6/u1;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    iput-object v5, p0, Lk7/r;->T:Lt6/u1;

    if-eqz v2, :cond_10

    invoke-direct {p0}, Lk7/r;->o0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_8
    invoke-direct {p0, v5}, Lk7/r;->v1(Lt6/u1;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_4

    :cond_9
    iput-boolean v0, p0, Lk7/r;->v0:Z

    iput v0, p0, Lk7/r;->w0:I

    iget v7, p0, Lk7/r;->a0:I

    if-eq v7, v10, :cond_b

    if-ne v7, v0, :cond_a

    iget v7, v5, Lt6/u1;->B:I

    iget v9, v4, Lt6/u1;->B:I

    if-ne v7, v9, :cond_a

    iget v7, v5, Lt6/u1;->C:I

    iget v9, v4, Lt6/u1;->C:I

    if-ne v7, v9, :cond_a

    goto :goto_3

    :cond_a
    move v0, v6

    :cond_b
    :goto_3
    iput-boolean v0, p0, Lk7/r;->i0:Z

    iput-object v5, p0, Lk7/r;->T:Lt6/u1;

    if-eqz v2, :cond_10

    invoke-direct {p0}, Lk7/r;->o0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_c
    invoke-direct {p0, v5}, Lk7/r;->v1(Lt6/u1;)Z

    move-result v0

    if-nez v0, :cond_d

    :goto_4
    move v7, v9

    goto :goto_6

    :cond_d
    iput-object v5, p0, Lk7/r;->T:Lt6/u1;

    if-eqz v2, :cond_e

    invoke-direct {p0}, Lk7/r;->o0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_e
    invoke-direct {p0}, Lk7/r;->m0()Z

    move-result v0

    if-nez v0, :cond_10

    :goto_5
    move v7, v10

    goto :goto_6

    :cond_f
    invoke-direct {p0}, Lk7/r;->n0()V

    :cond_10
    move v7, v6

    :goto_6
    iget v0, v3, Lw6/i;->d:I

    if-eqz v0, :cond_12

    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    if-ne v0, p1, :cond_11

    iget p1, p0, Lk7/r;->y0:I

    if-ne p1, v8, :cond_12

    :cond_11
    new-instance p1, Lw6/i;

    iget-object v3, v1, Lk7/p;->a:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lw6/i;-><init>(Ljava/lang/String;Lt6/u1;Lt6/u1;II)V

    return-object p1

    :cond_12
    return-object v3

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    const/16 v0, 0xfa5

    invoke-virtual {p0, p1, v5, v0}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object p1

    throw p1
.end method

.method protected U([Lt6/u1;JJ)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Lk7/r;->K0:Lk7/r$c;

    iget-wide v1, v1, Lk7/r$c;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    new-instance v1, Lk7/r$c;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lk7/r$c;-><init>(JJJ)V

    invoke-direct {p0, v1}, Lk7/r;->l1(Lk7/r$c;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-wide v1, v0, Lk7/r;->C0:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lk7/r;->L0:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_2

    cmp-long v1, v5, v1

    if-ltz v1, :cond_2

    :cond_1
    new-instance v1, Lk7/r$c;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lk7/r$c;-><init>(JJJ)V

    invoke-direct {p0, v1}, Lk7/r;->l1(Lk7/r$c;)V

    iget-object v1, v0, Lk7/r;->K0:Lk7/r$c;

    iget-wide v1, v1, Lk7/r$c;->c:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lk7/r;->X0()V

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lk7/r;->I:Ljava/util/ArrayDeque;

    new-instance v9, Lk7/r$c;

    iget-wide v3, v0, Lk7/r;->C0:J

    move-object v2, v9

    move-wide v5, p2

    move-wide/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lk7/r$c;-><init>(JJJ)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method protected abstract U0(Lt6/u1;Landroid/media/MediaFormat;)V
.end method

.method protected V0(J)V
    .locals 0

    return-void
.end method

.method protected W0(J)V
    .locals 2

    iput-wide p1, p0, Lk7/r;->L0:J

    :goto_0
    iget-object v0, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7/r$c;

    iget-wide v0, v0, Lk7/r$c;->a:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lk7/r;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7/r$c;

    invoke-direct {p0, v0}, Lk7/r;->l1(Lk7/r$c;)V

    invoke-virtual {p0}, Lk7/r;->X0()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected X0()V
    .locals 0

    return-void
.end method

.method protected abstract Y0(Lw6/g;)V
.end method

.method public final a(Lt6/u1;)I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lk7/r;->z:Lk7/t;

    invoke-virtual {p0, v0, p1}, Lk7/r;->t1(Lk7/t;Lt6/u1;)I

    move-result p1
    :try_end_0
    .catch Lk7/c0$c; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/16 v1, 0xfa2

    invoke-virtual {p0, v0, p1, v1}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object p1

    throw p1
.end method

.method protected abstract a0(Lk7/p;Lt6/u1;Lt6/u1;)Lw6/i;
.end method

.method protected abstract a1(JJLk7/l;Ljava/nio/ByteBuffer;IIIJZZLt6/u1;)Z
.end method

.method public d()Z
    .locals 4

    iget-object v0, p0, Lk7/r;->J:Lt6/u1;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lt6/l;->N()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lk7/r;->H0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lk7/r;->m0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lk7/r;->m0:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lk7/r;->F0:Z

    return v0
.end method

.method protected e1()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lk7/r;->S:Lk7/l;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lk7/l;->release()V

    iget-object v1, p0, Lk7/r;->J0:Lw6/e;

    iget v2, v1, Lw6/e;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lw6/e;->b:I

    iget-object v1, p0, Lk7/r;->Z:Lk7/p;

    iget-object v1, v1, Lk7/p;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lk7/r;->S0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    iput-object v0, p0, Lk7/r;->S:Lk7/l;

    :try_start_1
    iget-object v1, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iput-object v0, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lk7/r;->k1(Lx6/n;)V

    invoke-virtual {p0}, Lk7/r;->h1()V

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lk7/r;->k1(Lx6/n;)V

    invoke-virtual {p0}, Lk7/r;->h1()V

    throw v1

    :catchall_1
    move-exception v1

    iput-object v0, p0, Lk7/r;->S:Lk7/l;

    :try_start_2
    iget-object v2, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_2
    iput-object v0, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lk7/r;->k1(Lx6/n;)V

    invoke-virtual {p0}, Lk7/r;->h1()V

    throw v1

    :catchall_2
    move-exception v1

    iput-object v0, p0, Lk7/r;->N:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lk7/r;->k1(Lx6/n;)V

    invoke-virtual {p0}, Lk7/r;->h1()V

    throw v1
.end method

.method protected f1()V
    .locals 0

    return-void
.end method

.method protected g1()V
    .locals 4

    invoke-direct {p0}, Lk7/r;->i1()V

    invoke-direct {p0}, Lk7/r;->j1()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lk7/r;->m0:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lk7/r;->A0:Z

    iput-boolean v2, p0, Lk7/r;->z0:Z

    iput-boolean v2, p0, Lk7/r;->i0:Z

    iput-boolean v2, p0, Lk7/r;->j0:Z

    iput-boolean v2, p0, Lk7/r;->q0:Z

    iput-boolean v2, p0, Lk7/r;->r0:Z

    iget-object v3, p0, Lk7/r;->G:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-wide v0, p0, Lk7/r;->C0:J

    iput-wide v0, p0, Lk7/r;->D0:J

    iput-wide v0, p0, Lk7/r;->L0:J

    iget-object v0, p0, Lk7/r;->l0:Lk7/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk7/i;->c()V

    :cond_0
    iput v2, p0, Lk7/r;->x0:I

    iput v2, p0, Lk7/r;->y0:I

    iget-boolean v0, p0, Lk7/r;->v0:Z

    iput v0, p0, Lk7/r;->w0:I

    return-void
.end method

.method protected h1()V
    .locals 2

    invoke-virtual {p0}, Lk7/r;->g1()V

    const/4 v0, 0x0

    iput-object v0, p0, Lk7/r;->I0:Lt6/x;

    iput-object v0, p0, Lk7/r;->l0:Lk7/i;

    iput-object v0, p0, Lk7/r;->X:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lk7/r;->Z:Lk7/p;

    iput-object v0, p0, Lk7/r;->T:Lt6/u1;

    iput-object v0, p0, Lk7/r;->U:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk7/r;->V:Z

    iput-boolean v0, p0, Lk7/r;->B0:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lk7/r;->W:F

    iput v0, p0, Lk7/r;->a0:I

    iput-boolean v0, p0, Lk7/r;->b0:Z

    iput-boolean v0, p0, Lk7/r;->c0:Z

    iput-boolean v0, p0, Lk7/r;->d0:Z

    iput-boolean v0, p0, Lk7/r;->e0:Z

    iput-boolean v0, p0, Lk7/r;->f0:Z

    iput-boolean v0, p0, Lk7/r;->g0:Z

    iput-boolean v0, p0, Lk7/r;->h0:Z

    iput-boolean v0, p0, Lk7/r;->k0:Z

    iput-boolean v0, p0, Lk7/r;->v0:Z

    iput v0, p0, Lk7/r;->w0:I

    iput-boolean v0, p0, Lk7/r;->O:Z

    return-void
.end method

.method protected k0(Ljava/lang/Throwable;Lk7/p;)Lk7/m;
    .locals 1

    new-instance v0, Lk7/m;

    invoke-direct {v0, p1, p2}, Lk7/m;-><init>(Ljava/lang/Throwable;Lk7/p;)V

    return-object v0
.end method

.method protected final m1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk7/r;->H0:Z

    return-void
.end method

.method protected final n1(Lt6/x;)V
    .locals 0

    iput-object p1, p0, Lk7/r;->I0:Lt6/x;

    return-void
.end method

.method protected q1(Lk7/p;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method protected r1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected s1(Lt6/u1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected final t0()Z
    .locals 1

    invoke-virtual {p0}, Lk7/r;->u0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk7/r;->O0()V

    :cond_0
    return v0
.end method

.method protected abstract t1(Lk7/t;Lt6/u1;)I
.end method

.method protected u0()Z
    .locals 5

    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lk7/r;->y0:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lk7/r;->c0:Z

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lk7/r;->d0:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lk7/r;->B0:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lk7/r;->e0:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lk7/r;->A0:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lt8/r0;->a:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    move v4, v3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    invoke-static {v4}, Lt8/a;->g(Z)V

    if-lt v0, v2, :cond_4

    :try_start_0
    invoke-direct {p0}, Lk7/r;->w1()V
    :try_end_0
    .catch Lt6/x; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    invoke-static {v1, v2, v0}, Lt8/s;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lk7/r;->e1()V

    return v3

    :cond_4
    :goto_1
    invoke-direct {p0}, Lk7/r;->s0()V

    return v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Lk7/r;->e1()V

    return v3
.end method

.method protected final w0()Lk7/l;
    .locals 1

    iget-object v0, p0, Lk7/r;->S:Lk7/l;

    return-object v0
.end method

.method public x(FF)V
    .locals 0

    iput p1, p0, Lk7/r;->Q:F

    iput p2, p0, Lk7/r;->R:F

    iget-object p1, p0, Lk7/r;->T:Lt6/u1;

    invoke-direct {p0, p1}, Lk7/r;->v1(Lt6/u1;)Z

    return-void
.end method

.method protected final x0()Lk7/p;
    .locals 1

    iget-object v0, p0, Lk7/r;->Z:Lk7/p;

    return-object v0
.end method

.method protected final x1(J)V
    .locals 1

    iget-object v0, p0, Lk7/r;->K0:Lk7/r$c;

    iget-object v0, v0, Lk7/r$c;->d:Lt8/m0;

    invoke-virtual {v0, p1, p2}, Lt8/m0;->j(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/u1;

    if-nez p1, :cond_0

    iget-boolean p2, p0, Lk7/r;->M0:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lk7/r;->U:Landroid/media/MediaFormat;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lk7/r;->K0:Lk7/r$c;

    iget-object p1, p1, Lk7/r$c;->d:Lt8/m0;

    invoke-virtual {p1}, Lt8/m0;->i()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/u1;

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iput-object p1, p0, Lk7/r;->K:Lt6/u1;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    if-nez p1, :cond_2

    iget-boolean p1, p0, Lk7/r;->V:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lk7/r;->K:Lt6/u1;

    if-eqz p1, :cond_3

    :cond_2
    iget-object p1, p0, Lk7/r;->K:Lt6/u1;

    iget-object v0, p0, Lk7/r;->U:Landroid/media/MediaFormat;

    invoke-virtual {p0, p1, v0}, Lk7/r;->U0(Lt6/u1;Landroid/media/MediaFormat;)V

    iput-boolean p2, p0, Lk7/r;->V:Z

    iput-boolean p2, p0, Lk7/r;->M0:Z

    :cond_3
    return-void
.end method

.method public final y()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method protected y0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public z(JJ)V
    .locals 5

    iget-boolean v0, p0, Lk7/r;->H0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lk7/r;->H0:Z

    invoke-direct {p0}, Lk7/r;->Z0()V

    :cond_0
    iget-object v0, p0, Lk7/r;->I0:Lt6/x;

    if-nez v0, :cond_a

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v2, p0, Lk7/r;->F0:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lk7/r;->f1()V

    return-void

    :cond_1
    iget-object v2, p0, Lk7/r;->J:Lt6/u1;

    if-nez v2, :cond_2

    const/4 v2, 0x2

    invoke-direct {p0, v2}, Lk7/r;->c1(I)Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lk7/r;->O0()V

    iget-boolean v2, p0, Lk7/r;->s0:Z

    if-eqz v2, :cond_4

    const-string v2, "bypassRender"

    invoke-static {v2}, Lt8/o0;->a(Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lk7/r;->Z(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lt8/o0;->c()V

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lk7/r;->S:Lk7/l;

    if-eqz v2, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v4, "drainAndFeed"

    invoke-static {v4}, Lt8/o0;->a(Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0, p1, p2, p3, p4}, Lk7/r;->p0(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-direct {p0, v2, v3}, Lk7/r;->p1(J)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    invoke-direct {p0}, Lk7/r;->r0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0, v2, v3}, Lk7/r;->p1(J)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_6
    iget-object p3, p0, Lk7/r;->J0:Lw6/e;

    iget p4, p3, Lw6/e;->d:I

    invoke-virtual {p0, p1, p2}, Lt6/l;->X(J)I

    move-result p1

    add-int/2addr p4, p1

    iput p4, p3, Lw6/e;->d:I

    invoke-direct {p0, v0}, Lk7/r;->c1(I)Z

    :goto_3
    iget-object p1, p0, Lk7/r;->J0:Lw6/e;

    invoke-virtual {p1}, Lw6/e;->c()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lk7/r;->L0(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p0, p1}, Lk7/r;->Q0(Ljava/lang/Exception;)V

    sget p2, Lt8/r0;->a:I

    const/16 p3, 0x15

    if-lt p2, p3, :cond_7

    invoke-static {p1}, Lk7/r;->N0(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_7

    move v1, v0

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lk7/r;->e1()V

    :cond_8
    invoke-virtual {p0}, Lk7/r;->x0()Lk7/p;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lk7/r;->k0(Ljava/lang/Throwable;Lk7/p;)Lk7/m;

    move-result-object p1

    iget-object p2, p0, Lk7/r;->J:Lt6/u1;

    const/16 p3, 0xfa3

    invoke-virtual {p0, p1, p2, v1, p3}, Lt6/l;->H(Ljava/lang/Throwable;Lt6/u1;ZI)Lt6/x;

    move-result-object p1

    throw p1

    :cond_9
    throw p1

    :cond_a
    const/4 p1, 0x0

    iput-object p1, p0, Lk7/r;->I0:Lt6/x;

    throw v0
.end method

.method protected abstract z0(FLt6/u1;[Lt6/u1;)F
.end method
