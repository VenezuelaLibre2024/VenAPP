.class public final Lyl/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ldm/d;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Ldm/d;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl/h$b;->a:Ldm/d;

    return-void
.end method

.method private final b()V
    .locals 9

    iget v0, p0, Lyl/h$b;->d:I

    iget-object v1, p0, Lyl/h$b;->a:Ldm/d;

    invoke-static {v1}, Lrl/d;->J(Ldm/d;)I

    move-result v1

    iput v1, p0, Lyl/h$b;->e:I

    iput v1, p0, Lyl/h$b;->b:I

    iget-object v1, p0, Lyl/h$b;->a:Ldm/d;

    invoke-interface {v1}, Ldm/d;->readByte()B

    move-result v1

    const/16 v2, 0xff

    invoke-static {v1, v2}, Lrl/d;->d(BI)I

    move-result v1

    iget-object v3, p0, Lyl/h$b;->a:Ldm/d;

    invoke-interface {v3}, Ldm/d;->readByte()B

    move-result v3

    invoke-static {v3, v2}, Lrl/d;->d(BI)I

    move-result v2

    iput v2, p0, Lyl/h$b;->c:I

    sget-object v2, Lyl/h;->e:Lyl/h$a;

    invoke-virtual {v2}, Lyl/h$a;->a()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lyl/h$a;->a()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Lyl/e;->a:Lyl/e;

    const/4 v4, 0x1

    iget v5, p0, Lyl/h$b;->d:I

    iget v6, p0, Lyl/h$b;->b:I

    iget v8, p0, Lyl/h$b;->c:I

    move v7, v1

    invoke-virtual/range {v3 .. v8}, Lyl/e;->c(ZIIII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lyl/h$b;->a:Ldm/d;

    invoke-interface {v2}, Ldm/d;->readInt()I

    move-result v2

    const v3, 0x7fffffff

    and-int/2addr v2, v3

    iput v2, p0, Lyl/h$b;->d:I

    const/16 v3, 0x9

    if-ne v1, v3, :cond_2

    if-ne v2, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "TYPE_CONTINUATION streamId changed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " != TYPE_CONTINUATION"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lyl/h$b;->e:I

    return v0
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Lyl/h$b;->c:I

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Lyl/h$b;->e:I

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lyl/h$b;->b:I

    return-void
.end method

.method public final i(I)V
    .locals 0

    iput p1, p0, Lyl/h$b;->f:I

    return-void
.end method

.method public final j(I)V
    .locals 0

    iput p1, p0, Lyl/h$b;->d:I

    return-void
.end method

.method public m()Ldm/y;
    .locals 1

    iget-object v0, p0, Lyl/h$b;->a:Ldm/d;

    invoke-interface {v0}, Ldm/x;->m()Ldm/y;

    move-result-object v0

    return-object v0
.end method

.method public s1(Ldm/b;J)J
    .locals 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget v0, p0, Lyl/h$b;->e:I

    const-wide/16 v1, -0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lyl/h$b;->a:Ldm/d;

    iget v3, p0, Lyl/h$b;->f:I

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, Ldm/d;->skip(J)V

    const/4 v0, 0x0

    iput v0, p0, Lyl/h$b;->f:I

    iget v0, p0, Lyl/h$b;->c:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-direct {p0}, Lyl/h$b;->b()V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lyl/h$b;->a:Ldm/d;

    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Ldm/x;->s1(Ldm/b;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_2

    return-wide v1

    :cond_2
    iget p3, p0, Lyl/h$b;->e:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, Lyl/h$b;->e:I

    return-wide p1
.end method