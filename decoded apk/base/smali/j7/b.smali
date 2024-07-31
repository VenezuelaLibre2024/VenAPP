.class public final Lj7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj7/b$a;,
        Lj7/b$c;,
        Lj7/b$b;
    }
.end annotation


# static fields
.field public static final h:Ly6/p;


# instance fields
.field private a:Ly6/m;

.field private b:Ly6/b0;

.field private c:I

.field private d:J

.field private e:Lj7/b$b;

.field private f:I

.field private g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj7/a;

    invoke-direct {v0}, Lj7/a;-><init>()V

    sput-object v0, Lj7/b;->h:Ly6/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj7/b;->c:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lj7/b;->d:J

    const/4 v2, -0x1

    iput v2, p0, Lj7/b;->f:I

    iput-wide v0, p0, Lj7/b;->g:J

    return-void
.end method

.method public static synthetic c()[Ly6/k;
    .locals 1

    invoke-static {}, Lj7/b;->g()[Ly6/k;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 1

    iget-object v0, p0, Lj7/b;->b:Ly6/b0;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lj7/b;->a:Ly6/m;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static synthetic g()[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    new-instance v1, Lj7/b;

    invoke-direct {v1}, Lj7/b;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private h(Ly6/l;)V
    .locals 6

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget v0, p0, Lj7/b;->f:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    invoke-interface {p1, v0}, Ly6/l;->n(I)V

    const/4 p1, 0x4

    iput p1, p0, Lj7/b;->c:I

    return-void

    :cond_1
    invoke-static {p1}, Lj7/d;->a(Ly6/l;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v2

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v0, v2

    invoke-interface {p1, v0}, Ly6/l;->n(I)V

    iput v1, p0, Lj7/b;->c:I

    return-void

    :cond_2
    const-string p1, "Unsupported or unrecognized wav file type."

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object p1

    throw p1
.end method

.method private i(Ly6/l;)V
    .locals 6

    invoke-static {p1}, Lj7/d;->b(Ly6/l;)Lj7/c;

    move-result-object v3

    iget p1, v3, Lj7/c;->a:I

    const/16 v0, 0x11

    if-ne p1, v0, :cond_0

    new-instance p1, Lj7/b$a;

    iget-object v0, p0, Lj7/b;->a:Ly6/m;

    iget-object v1, p0, Lj7/b;->b:Ly6/b0;

    invoke-direct {p1, v0, v1, v3}, Lj7/b$a;-><init>(Ly6/m;Ly6/b0;Lj7/c;)V

    :goto_0
    iput-object p1, p0, Lj7/b;->e:Lj7/b$b;

    goto :goto_1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    new-instance p1, Lj7/b$c;

    iget-object v1, p0, Lj7/b;->a:Ly6/m;

    iget-object v2, p0, Lj7/b;->b:Ly6/b0;

    const-string v4, "audio/g711-alaw"

    const/4 v5, -0x1

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lj7/b$c;-><init>(Ly6/m;Ly6/b0;Lj7/c;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x7

    if-ne p1, v0, :cond_2

    new-instance p1, Lj7/b$c;

    iget-object v1, p0, Lj7/b;->a:Ly6/m;

    iget-object v2, p0, Lj7/b;->b:Ly6/b0;

    const-string v4, "audio/g711-mlaw"

    const/4 v5, -0x1

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lj7/b$c;-><init>(Ly6/m;Ly6/b0;Lj7/c;Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    iget v0, v3, Lj7/c;->f:I

    invoke-static {p1, v0}, Lv6/z0;->a(II)I

    move-result v5

    if-eqz v5, :cond_3

    new-instance p1, Lj7/b$c;

    iget-object v1, p0, Lj7/b;->a:Ly6/m;

    iget-object v2, p0, Lj7/b;->b:Ly6/b0;

    const-string v4, "audio/raw"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lj7/b$c;-><init>(Ly6/m;Ly6/b0;Lj7/c;Ljava/lang/String;I)V

    goto :goto_0

    :goto_1
    const/4 p1, 0x3

    iput p1, p0, Lj7/b;->c:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported WAV format type: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v3, Lj7/c;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lt6/b3;->e(Ljava/lang/String;)Lt6/b3;

    move-result-object p1

    throw p1
.end method

.method private j(Ly6/l;)V
    .locals 2

    invoke-static {p1}, Lj7/d;->c(Ly6/l;)J

    move-result-wide v0

    iput-wide v0, p0, Lj7/b;->d:J

    const/4 p1, 0x2

    iput p1, p0, Lj7/b;->c:I

    return-void
.end method

.method private k(Ly6/l;)I
    .locals 6

    iget-wide v0, p0, Lj7/b;->g:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-wide v2, p0, Lj7/b;->g:J

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v0, p0, Lj7/b;->e:Lj7/b$b;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj7/b$b;

    invoke-interface {v0, p1, v2, v3}, Lj7/b$b;->a(Ly6/l;J)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, -0x1

    :cond_1
    return v1
.end method

.method private l(Ly6/l;)V
    .locals 8

    invoke-static {p1}, Lj7/d;->e(Ly6/l;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    iput v1, p0, Lj7/b;->f:I

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-wide v2, p0, Lj7/b;->d:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide v6, 0xffffffffL

    cmp-long v6, v0, v6

    if-nez v6, :cond_0

    move-wide v0, v2

    :cond_0
    iget v2, p0, Lj7/b;->f:I

    int-to-long v2, v2

    add-long/2addr v2, v0

    iput-wide v2, p0, Lj7/b;->g:J

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v0

    cmp-long p1, v0, v4

    if-eqz p1, :cond_1

    iget-wide v2, p0, Lj7/b;->g:J

    cmp-long p1, v2, v0

    if-lez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Data exceeds input length: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lj7/b;->g:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "WavExtractor"

    invoke-static {v2, p1}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    iput-wide v0, p0, Lj7/b;->g:J

    :cond_1
    iget-object p1, p0, Lj7/b;->e:Lj7/b$b;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj7/b$b;

    iget v0, p0, Lj7/b;->f:I

    iget-wide v1, p0, Lj7/b;->g:J

    invoke-interface {p1, v0, v1, v2}, Lj7/b$b;->b(IJ)V

    const/4 p1, 0x4

    iput p1, p0, Lj7/b;->c:I

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iput p1, p0, Lj7/b;->c:I

    iget-object p1, p0, Lj7/b;->e:Lj7/b$b;

    if-eqz p1, :cond_1

    invoke-interface {p1, p3, p4}, Lj7/b$b;->c(J)V

    :cond_1
    return-void
.end method

.method public b(Ly6/m;)V
    .locals 2

    iput-object p1, p0, Lj7/b;->a:Ly6/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v0

    iput-object v0, p0, Lj7/b;->b:Ly6/b0;

    invoke-interface {p1}, Ly6/m;->q()V

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 0

    invoke-static {p1}, Lj7/d;->a(Ly6/l;)Z

    move-result p1

    return p1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 2

    invoke-direct {p0}, Lj7/b;->d()V

    iget p2, p0, Lj7/b;->c:I

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    const/4 v1, 0x1

    if-eq p2, v1, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_2

    const/4 v1, 0x3

    if-eq p2, v1, :cond_1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-direct {p0, p1}, Lj7/b;->k(Ly6/l;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1}, Lj7/b;->l(Ly6/l;)V

    return v0

    :cond_2
    invoke-direct {p0, p1}, Lj7/b;->i(Ly6/l;)V

    return v0

    :cond_3
    invoke-direct {p0, p1}, Lj7/b;->j(Ly6/l;)V

    return v0

    :cond_4
    invoke-direct {p0, p1}, Lj7/b;->h(Ly6/l;)V

    return v0
.end method

.method public release()V
    .locals 0

    return-void
.end method
